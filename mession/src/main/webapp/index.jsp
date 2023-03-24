<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 세션을 꺼내는 방법 확인
	String username = (String)session.getAttribute("username");
	if(username == null) {
		response.sendRedirect("login.jsp");
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
	justify-content: center;
	align-items: center;
	height: 100vh;
	flex-direction: column;
}

form {
	display: flex;
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
	<h1>Welcome <%=username %></h1>
	<form action="logout.jsp">
		<input type="submit" value="logout">
	</form>

</body>
</html>