package com.adithya.productPrice.model;

public class ProductPrice {

	private int id;
	private String pname;
	private double price;

	public ProductPrice(int id, String pname, double price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
