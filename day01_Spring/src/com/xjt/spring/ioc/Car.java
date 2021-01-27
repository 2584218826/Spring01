package com.xjt.spring.ioc;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-20:36
 */
public class Car {
	private Integer cid;
	private String cname;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Car{" +
				"cid=" + cid +
				", cname='" + cname + '\'' +
				'}';
	}
}
