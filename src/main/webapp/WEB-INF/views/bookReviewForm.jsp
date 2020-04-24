<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#container{
		width: 400px;
		border: 1px solid black;
		text-align: center;
	}
	label{
		width: 120px;
		float: left;
		text-align: right;
		padding-right: 10px;
	}
	#btnAdd{
		width: 100%;
		height: 50px;
	}
</style>
</head>
<body>
	<div id="container">
		<form action="review" method="post">
			<p>
				<label>작성자이름</label>
				<input type="text" name="reviewer">
			</p>
			<p>
				<label>도서명</label>
				<input type="text" name="title">
			</p>
			<p>
				<label>저자</label>
				<input type="text" name="writer">
			</p><p>
				<label>출판사</label>
				<input type="text" name="publisher">
			</p>
			<p>
				<label>리뷰(평가)</label>
				<textarea cols="50" rows="10" name="review"></textarea>
			</p>
			<p>
				<input type="submit" value="리뷰 등록" id="btnAdd">
			</p>
		</form>
	</div>
</body>
</html>