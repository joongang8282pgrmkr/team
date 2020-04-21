<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// String str[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
// // Arrays.asList(str).forEach(System.out::print);
// for(String s : str){
// 	out.print(s);
// }
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src = "http://code.jquery.com/jquery-latest.js"></script>
<script>
// 	유효성검사
	$(function() {
		$("form").submit(function() {
			if($("#stuNm").val()==""){
				alert("이름을 입력하시오");
				$("#name").focus();
				return false;
			}
		})
	})
</script>
<title>Insert title here</title>
</head>
<body>
	<form name="fnm" method="post" action="mypr2.jsp">
		이름 : <input type="text" name="stuNm" id="stuNm" autofocus="autofocus"><br>
		학번 : <input type="text" name="stuId" id="stuId"><br>
		성별 : 
			<input type="radio" name="sx" id="man" value="남자">남자
			<input type="radio" name="sx" id="wmn" value="여자">여자<br>
		전공 : 
			<select name="maj" id="maj">
				<option value="#">선택</option>
				<option value="컴퓨터공학과">컴공</option>
				<option value="행정학과">행정</option>
			</select><br>
		<input type="submit" value="제출">
		<input type="reset" value="리셋">
	</form>
</body>
</html>