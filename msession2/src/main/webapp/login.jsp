<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="loginProc.jsp" method="post">
		<label for="username">아이디 : </label> <input type="text"
			name="username" required="required"> <label for="password">비밀번호
			: </label> <input type="password" name="password" required="required">
		<input type="submit" value="로그인">
	</form>
</body>
</html>