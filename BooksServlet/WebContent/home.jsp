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
<div align="center">
<jsp:include page="header.jsp"></jsp:include>
</div>
<table>
<tr>
<th>Book ID</th>
<th>Book Name</th>
<th>Price</th>
<th>Author</th>
<th>Description</th>
</tr>
<tr>
<jstl:forEach var="book" items="${sessionScope.book}">
<tr>
<td>${book.id}</td>
<td>${book.name}</td>
<td>${book.author}</td>
<td>${book.price}</td>
<td>${book.description}</td>
<td><a href="addToCart.shop?id=${book.id}">Add To Cart</a>
</tr>
</jstl:forEach>
</tr>

</table>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>