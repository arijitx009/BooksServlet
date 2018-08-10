package com.book.dao;

import java.util.Collection;

import com.cg.bookservlet.Books;
import com.cg.bookservlet.Cart;

public interface BookCollectionDao {

	Collection<Books> viewAllBooks();

	void addBook(int id);

	Collection<Cart> viewCart();

	void delete(int id);
	
	int getTotalQuantity();
	
	double getTotalPrice();

}