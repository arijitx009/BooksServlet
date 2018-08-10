package com.cg.bookservice;

import java.util.Collection;

import com.book.dao.BookCollection;
import com.cg.bookservlet.Books;
import com.cg.bookservlet.Cart;

public class BookService implements BookServiceInterface {

	private BookCollection bookC=new BookCollection();


	@Override
	public Collection<Books> viewAllBooks()
	{
		return bookC.viewAllBooks();
	}

	@Override
	public void addBook(int id)
	{
		bookC.addBook(id);
	}

	@Override
	public Collection<Cart> viewCart()
	{
		return bookC.viewCart();
	}

	@Override
	public void delete(int id)
	{
		bookC.delete(id);
	}
	public int getTotalQuantity() {
		return bookC.getTotalQuantity();
	}
	public double getTotalPrice() 
	{
	return bookC.getTotalPrice();
	}
}
