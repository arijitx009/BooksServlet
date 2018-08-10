<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<a href="viewAllBooks.shop">Home</a>
<jstl:if test="${sessionScope.totalCnt > 0}"></jstl:if>
<div>
<table>
<tr>
<th>Book ID</th>
<th>Book Name</th>
<th>Price</th>
<th>Author</th>
<th>Description</th>
<th>Quantity</th>
</tr>
<tr>
<jstl:forEach var="cart" items="${sessionScope.cart}">
<tr>
<td>${cart.book.id}</td>
<td>${cart.book.name}</td>
<td>${cart.book.author}</td>
<td>${cart.book.price}</td>
<td>${cart.book.description}</td>
<td>${cart.quantity}</td>
<td><a href="delete.shop?id=${cart.book.id}">Remove From Cart</a></td>
</tr>
</jstl:forEach>
</tr>
</table>
</div>
Total Price : ${sessionScope.totalPrc}
</body>
</html>