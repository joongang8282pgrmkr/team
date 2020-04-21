<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");//한글인코딩//post방식으로 한글값이 value값으로 전송될 때 한글로 인코딩 역할
%>

ID : <%=request.getParameter("id") %> <br>
비밀번호 : <%=request.getParameter("passwd") %>    
    