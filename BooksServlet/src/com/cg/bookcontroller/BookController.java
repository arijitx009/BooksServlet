package com.cg.bookcontroller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.book.dao.BookCollection;
import com.cg.bookservice.BookService;
import com.cg.bookservice.BookServiceInterface;
import com.cg.bookservlet.Books;
import com.cg.bookservlet.Cart;

/**
 * Servlet implementation class BookController
 */
@WebServlet("*.shop")
public class BookController extends HttpServlet {
	
	private BookServiceInterface service=new BookService();
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String action = request.getServletPath();
		System.out.println(action);
		switch(action)
		{
		case "/addToCart.shop":
			int id=Integer.parseInt(request.getParameter("id"));
			service.addBook(id);
			session.setAttribute("cart", service.viewCart());
			session.setAttribute("totalCnt", service.getTotalQuantity());
			session.setAttribute("totalPrc", service.getTotalPrice());
			
			System.out.println(service.getTotalQuantity());	
			response.sendRedirect("home.jsp");
			
			break;
			
			
			
		case "/viewCart.shop":
			
			//Collection<Cart> cart=service.viewCart();
			 session=request.getSession();
			session.setAttribute("cart",service.viewCart());
			//System.out.println(service.viewCart());
			session.setAttribute("totalCnt", service.getTotalQuantity());
			session.setAttribute("totalPrc", service.getTotalPrice());
			System.out.println(service.getTotalQuantity());
			response.sendRedirect("cart.jsp");
			break;
			
			
			
			
		case "/viewAllBooks.shop":
			System.out.println("inside viewalBOOks----------------");
			session=request.getSession();
			session.setAttribute("book",service.viewAllBooks());
			//sSystem.out.println(service.viewAllBooks());
			session.setAttribute("totalCnt", service.getTotalQuantity());
			response.sendRedirect("home.jsp");
			break;
			
			
		case "/delete.shop":
			id=Integer.parseInt(request.getParameter("id"));
			service.delete(id);
			
			//response.sendRedirect("viewCart.shop");
			response.sendRedirect("viewCart.shop");
			
			break;
			
			
			
		default:
			System.out.println("Default one");
			
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
