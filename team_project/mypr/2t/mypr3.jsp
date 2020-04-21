<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="myform" method="post" action = "mypr4.jsp">
	<table border="1">
		<tr>
			<td><b>아이디</b></td>
			<td><input type="text" maxlength="20" name="id" id="id" autofocus="autofocus"></td>
		</tr>
		<tr>
			<td><b>비번</b></td>
			<td><input type="password" maxlength="20" name="pw" id="pw"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="로그인">
			<input type="reset" value="취소">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>