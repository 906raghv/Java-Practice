package com.oops;

public class Book {
	public int id;
	public int page;
	public String bookName;
	public Book() {
		
		// TODO Auto-generated constructor stub
	}
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void issue() {
    	System.out.println("book is issued"+id+"\t"+bookName);
    }

}
