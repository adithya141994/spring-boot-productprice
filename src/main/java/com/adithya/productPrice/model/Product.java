package com.adithya.productPrice.model;

public class Product {

	private int id;
	private String pname;
	private String batchno;
	private int noofproduct;

	public Product(int id, String pname, String batchno, int noofproduct) {
		super();
		this.id = id;
		this.pname = pname;
		this.batchno = batchno;
		this.noofproduct = noofproduct;
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

	public String getBatchno() {
		return batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public int getNoofproduct() {
		return noofproduct;
	}

	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}

}
