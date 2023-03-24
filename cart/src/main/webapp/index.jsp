<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String sessionGetFruit = (String)session.getAttribute("fruit");
	if(sessionGetFruit == null) {
		response.sendRedirect("cart.jsp");
	}
%>
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
	<h1>장바구니</h1>
	<h2><%=sessionGetFruit %></h2>
	<form action="cart.jsp">
		<input type="submit" value="더담기">
	</form>
</body>
</html>