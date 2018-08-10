package com.cg.bookservlet;

public class Cart {
	
	int quantity;
	Books book;
	

	public Cart(int quantity, Books book) {
		super();
		this.quantity = quantity;
		this.book = book;
	}
	
	
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getQuantity() {
		return quantity;
	}


	public Books getBook() {
		return book;
	}


	

}
