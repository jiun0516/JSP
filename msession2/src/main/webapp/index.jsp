<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionUserName = (String)session.getAttribute("username");
	// 문제 로그인이 안되어 있으면 login.jsp 페이지로 이동 시키시오 !
	if(sessionUserName == null) {
		response.sendRedirect("login.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=sessionUserName %>반갑습니다</h1>
	<form action="login.jsp">
		<input type= "submit" value="logout">
	</form>
</body>
</html>