package cn.xjt.jdbcTemplate;

import org.springframework.stereotype.Component;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/17-19:02
 */

public class Emp {
	private Integer eid;
	private String ename;
	private int age;
	private String sex;

	public Emp(Integer eid, String ename, int age, String sex) {
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.sex = sex;
	}

	public Emp() {
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Emp{" +
				"eid=" + eid +
				", ename='" + ename + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				'}';
	}
}
