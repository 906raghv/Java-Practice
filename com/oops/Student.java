package com.oops;

public class Student extends Book {
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address + ", city=" + city + ", b=" + b
				+ "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	private int roll;
	private String address;
	private String city;
	public Book b;
	public Student(String name, int roll, String address, String city, Book b) {
		super();
		this.name = name;
		this.roll = roll;
		this.address = address;
		this.city = city;
		this.b = b;
		super.id=id;
		super.bookName=bookName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
		issue();
		
	}

}
