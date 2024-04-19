package com.entities;
import java.util.*;

public class Booking {
	private int id;
    private int flightId;
    private String fullName;
    private String email;
    private String phoneNumber;
    
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int id, int flightId, String fullName, String email, String phoneNumber) {
		super();
		this.id = id;
		this.flightId = flightId;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
       
}