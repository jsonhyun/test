<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품정보</h1>
	<p>상품이름 : ${p1.name }</p>
	<p>상품가격 : <fmt:formatNumber value="${p1.price }" pattern="###,###"/>원 </p>
</body>
</html>