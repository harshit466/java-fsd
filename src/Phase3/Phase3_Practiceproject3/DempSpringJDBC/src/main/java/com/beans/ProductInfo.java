package com.beans;
/*
 * create table productinfo(prdid int auto_increment primary key, 
prdname varchar(30), price float, stock int);
 */
public class ProductInfo {

	private int prdid;
	private String prdname;
	private float price;
	private int stock;
	
	public int getPrdid() {
		return prdid;
	}
	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}
	public String getPrdname() {
		return prdname;
	}
	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}