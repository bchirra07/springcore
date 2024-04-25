package com.service;

import org.springframework.stereotype.Service;

@Service
public class Laptop {
	
	private String brand;
	private String color;
	private int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
	

}
