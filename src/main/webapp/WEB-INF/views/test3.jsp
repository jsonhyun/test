<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품정보</h1>
	<c:forEach var="product" items="${list }">
		<p>${product.name } - <fmt:formatNumber pattern="###,###" value="${product.price }"/>원 </p>
	</c:forEach>
</body>
</html>