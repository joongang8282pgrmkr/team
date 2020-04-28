<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="m1ctrl.jsp">
		<div>
			<table>
				<tr>
					<td>아이디입력</td>
					<td><input type="text" id="id" name="id"></td>
				</tr>
				<tr>
					<td>비밀번호입력</td>
					<td><input type="password" id="passwd" name="passwd"></td>
				</tr>
				<tr>
					<td><input type=submit value="전송"></td>
					<td><input type="reset" value="취소"></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>