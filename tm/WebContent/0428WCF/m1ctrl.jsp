<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <% 
    	request.setCharacterEncoding("utf-8");
    	
    %>
    <jsp:useBean id="jb" class="mypr0428.Jbdto"></jsp:useBean>
    <jsp:setProperty property="*" name="jb"/>
    <jsp:setProperty property="regdate" name="jb" value="<%=new Timestamp(System.currentTimeMillis())%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>