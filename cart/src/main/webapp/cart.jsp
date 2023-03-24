<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	display: flex;
	justify-content: flex-start;
	align-items: center;
	height: 100vh;
	flex-direction: column;
}

input[type="submit"] {
	padding: 5px;
	border-radius: 6px;
	background-color: #39830C;
	color: #fff;
	border: none;
	cursor: pointer;
	font-family: 'Noto Sans KR', sans-serif;
}
</style>
</head>
<body>
	<h1>메뉴</h1>
	<form action="cartProc.jsp" method="post">
		<input type="checkbox" name="fruit" value="사과">사과<br> 
		<input type="checkbox" name="fruit" value="바나나">바나나<br> 
		<input type="checkbox" name="fruit" value="복숭아">복숭아<br> <br>
		<input type="submit" value="장바구니담기">
	</form>
</body>
</html>