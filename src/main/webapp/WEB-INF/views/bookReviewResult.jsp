<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>작성자 이름 : ${review.reviewer }</p>
	<p>도서명 : ${review.title }</p>
	<p>저자 : ${review.writer }</p>
	<p>출판사 : ${review.publisher }</p>
	<p>리뷰 : ${review.review }</p>
</body>
</html>