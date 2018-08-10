package com.cg.bookservlet;

public class Books {

	private int id;
	private String name;
	private String author;
	private double price;
	private String description;
	public Books(int id, String name, String author, double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", description="
				+ description + "]";
	}




}
