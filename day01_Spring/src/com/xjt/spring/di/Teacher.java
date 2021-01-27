package com.xjt.spring.di;

import java.util.List;
import java.util.Map;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/12-16:36
 */
public class Teacher {
	private Integer id;
	private String name;

	private List<String> css;

	private List<Student> students;

	private Map<String,String> map;

	@Override
	public String toString() {
		return "Teacher{" +
				"id=" + id +
				", name='" + name + '\'' +
				", css=" + css +
				", students=" + students +
				", map=" + map +
				'}';
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

//	public Teacher(Integer id, String name, List<String> css, List<Student> students) {
//		this.id = id;
//		this.name = name;
//		this.css = css;
//		this.students = students;
//	}

	public List<String> getCss() {
		return css;
	}

	public void setCss(List<String> css) {
		this.css = css;
	}

//	public Teacher(Integer id, String name, List<String> css) {
//		this.id = id;
//		this.name = name;
//		this.css = css;
//	}
//
//	public Teacher() {
//	}
//
//	public Teacher(Integer id, String name) {
//		this.id = id;
//		this.name = name;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
