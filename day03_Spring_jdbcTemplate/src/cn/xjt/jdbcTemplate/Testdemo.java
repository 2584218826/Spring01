package cn.xjt.jdbcTemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/17-19:07
 */
public class Testdemo {
	ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc.xml");
	JdbcTemplate jdbc = ac.getBean("jdbcTemplate", JdbcTemplate.class);

	//增加数据库
	@Test
	public void test()
	{

//		int upd*2ate = jdbc.update("insert into emp values (1,'张三',18,'男')");

		String sql = "insert into empl values(null,?,?,?)";
//		System.out.println(update);

//
		int row = jdbc.update(sql, "徐江涛", 18, "男");
		System.out.println(row);
	}

	//查询数据库
	@Test
	public void testtwo()
	{
//		List<Map<String, Object>> emps=null;
		Emp emp1 = null;

		try {
			emp1 = (Emp) jdbc.queryForObject("select * from empl where eid=1", new BeanPropertyRowMapper(Emp.class));
		}catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println(emp1);
	}

	//查询数据库
	@Test
	public void testQueryForList()
	{
		List s = jdbc.queryForList("select * from empl");
		for (int i =0;i<s.size();i++)
		{
			Object o = s.get(i);
			System.out.println(o);
		}
	}

	//更改数据库
	@Test
	public void update()
	{
		String sql = "update empl set ename=?,sex=? where eid=?";
		int 小红 = jdbc.update(sql, "徐江涛","男", 1);
		System.out.println("一共影响了："+小红+"行");
	}

	//移除表
	@Test
	public void remove()
	{
		String sql ="delete from empl where eid=?";
		int row = jdbc.update(sql, 1);
		System.out.println("一共影响了："+row+"行");
	}

	//批量操作数据库
	@Test
	public void BatchUpdate()
	{
		String sql ="insert into empl values(null,?,?,?)";
		List<Object[]> list = new ArrayList<>();
		list.add(new Object[]{"张三丰",40,"男"});
		list.add(new Object[]{"赵丽颖",25,"女"});
		list.add(new Object[]{"彭于晏",40,"男"});
		list.add(new Object[]{"吴彦祖",40,"男"});
		jdbc.batchUpdate(sql, list);
	}
}
