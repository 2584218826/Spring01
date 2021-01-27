package com.xjt.spring.factorybean;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/13-13:25
 */
public class Car {

	private String brand;

	private Double price;


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", price=" + price +
				'}';
	}
}
