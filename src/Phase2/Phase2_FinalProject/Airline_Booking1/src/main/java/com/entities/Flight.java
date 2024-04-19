package com.entities;
import java.sql.Date;
import java.util.*;

public class Flight {
	private int id;
    private String source;
    private String destination;
    private Date date;
    private double price;
    
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int id, String source, String destination, Date date, double price) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
}