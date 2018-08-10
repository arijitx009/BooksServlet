package com.book.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.bookservlet.Books;
import com.cg.bookservlet.Cart;

public class BookCollection implements BookCollectionDao {


	private static Map<Integer,Books> bookDB=new HashMap<Integer,Books>();

	private static Map<Integer,Cart> cart=new HashMap<Integer,Cart>();

	private static Books b1=new Books(101,"Let Us C","Yashavant Kanetkar",450.00,"Basic Concepts of C");
	private static  Books b2=new Books(102,"ICSE Mathematics","ML Aggarwal",350.00,"Class X Mathematics");
	private static  Books b3=new Books(103,"ISC Biology","R.S Rai",550.00,"Learning Biology in the easiest way");


	static {

		bookDB.put(b1.getId(),b1);
		System.out.println(b1.getId()+"********************************");
		//System.out.println(bookDB.values()+"inside static");
		bookDB.put(b2.getId(),b2);
		//System.out.println(bookDB.values()+"inside static");
		bookDB.put(b3.getId(),b3);
		//System.out.println(bookDB.values()+"inside static");

	}

	@Override
	public Collection<Books> viewAllBooks()
	{
		//System.out.println("Inside viewallbooks strtone ----");
		return bookDB.values();
	}

	@Override
	public void addBook(int id)
	{
		if(cart.get(id)==null)
		{
			for(Books book : viewAllBooks())
			{
				if(book.getId()==id)
				{
					Cart crt=new Cart(1,book);
					cart.put(id,crt);
				}
			}
		}
		else
		{
			Cart crt=cart.get(id);
			crt.setQuantity(crt.getQuantity()+1);
		}
	}

	@Override
	public Collection<Cart> viewCart()
	{
		return cart.values();
	}

	@Override
	public void delete(int id)
	{
		for(Cart crt : viewCart())
		{
			if(crt.getBook().getId()==id)
			{
				if(crt.getQuantity()>1)
				{
					crt.setQuantity(crt.getQuantity()-1);
					break;

				}
				else {
					cart.remove(id);
					break;
				}
			}
		}
	}	
	public int getTotalQuantity() {
		int totalQuantity = 0;
		for(Cart crt : viewCart()) {
			totalQuantity += crt.getQuantity();
		}
		System.out.println("The quantity is" +totalQuantity);
		return totalQuantity;
		
	}
	public double getTotalPrice() {
		double totalPrice=0.0;
		for(Cart crt : viewCart()) {
		totalPrice+=(crt.getQuantity())*(crt.getBook().getPrice());
		}
		//System.out.println(totalPrice);
		return totalPrice;
		}
}

