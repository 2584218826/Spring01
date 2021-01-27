package com.xjt.spring.life;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-14:33
 */
public class Person {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		System.out.println("two:依赖注入");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		System.out.println("one:创建开始");
	}

	public void init()
	{
		System.out.println("Three:初始化");
	}

	public void destroy()
	{
		System.out.println("four:销毁方法");
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}'
				+"fout:使用";
	}
}
