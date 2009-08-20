package net.designpattern.creational.builder;

class Product {
	
	private String name;
	private float price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	
}
