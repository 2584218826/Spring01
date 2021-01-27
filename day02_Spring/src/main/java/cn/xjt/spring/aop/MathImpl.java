package cn.xjt.spring.aop;

import org.springframework.stereotype.Component;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/15-15:05
 */

@Component
public class MathImpl implements MathI{

	@Override
	public int add(int i, int j) {
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		return i-j;
	}

	@Override
	public int mul(int i, int j) {
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		return i/j;
	}
}
