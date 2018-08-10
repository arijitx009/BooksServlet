package com.cg.bookservice;

import java.util.Collection;

import com.cg.bookservlet.Books;
import com.cg.bookservlet.Cart;

public interface BookServiceInterface {

	Collection<Books> viewAllBooks();

	void addBook(int id);

	Collection<Cart> viewCart();

	void delete(int id);
	
	 int getTotalQuantity();
	 
	 double getTotalPrice();

}