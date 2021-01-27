package cn.xjt.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/16-0:12
 */
@Component
@Aspect //标注当前类为切面
public class MyLoggerAspect {

	/**
	 * @Pointcut：切入点
	 */
	@Pointcut(value = "execution(* cn.xjt.spring.aop.*.*(..))")
	public void test(){

	}
	/**
	 * @Before:将方法通知为前置通知
	 * 必须设置value，其值为切入表达式
	 */
//	@Before(value = "execution(public int cn.xjt.spring.aop.MathImpl.add(int,int))")
	//before:切入表达式，通过切入点，得到切入表达式
	@Before(value = "test()")
	public void beforeMethod(JoinPoint joinPoint)
	{
		System.out.println("前置通知");
		Object[] args = joinPoint.getArgs();    //获取参数
		String name = joinPoint.getSignature().getName();       //获取方法名
		System.out.println("arguments:"+ Arrays.toString(args));
		System.out.println("methodName:"+name);
		System.out.println("方法执行之前");
	}

	/**
	 * @After：将方法标注为后置通知
	 * 后置通知：作用于方法的finally语句快，即不管有没有异常，都会执行的代码
	 */
	@After(value = "execution(* cn.xjt.spring.aop.*.*(..))")
	public void after()
	{
		System.out.println("后置通知");
		System.out.println("方法执行之后");
	}
	/**
	 * AfterReturning：出现异常时。则不执行
	 * @param joinPoint 封装了方法中的所有数据
	 * 可通过returning设置接受方法返回值的变量名
	 * 在方法中使用，需要设置同名的形参
	 */
	@AfterReturning(value = "execution(* cn.xjt.spring.aop.*.*(..))",returning = "result")
	public void aftereturning(JoinPoint joinPoint,Object result)
	{
		String name = joinPoint.getSignature().getName();
		System.out.println("方法名："+name+"返回结果："+result);
		System.out.println("最终返回通知");
	}

	/**
	 * @AfterThrowing：将方法标注为异常通知
	 * @param ex
	 */
	@AfterThrowing(value = "execution(* cn.xjt.spring.aop.*.*(..))",throwing = "ex")
	public void afterThrowingMethod(Exception ex)
	{
		System.out.println("有异常了。。。Exceotion:"+ex);
	}

	@Around(value = "test()")
	public Object aroundMethod(ProceedingJoinPoint p)
	{
		Object result=null;
		try {
			System.out.println("前置通知");
			result = p.proceed();       //执行方法
			System.out.println("后置通知");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			System.out.println("异常通知");
		}finally {
			System.out.println("最后执行的语句");
		}
		return result;
	}
}
