<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = java.util.Random %>

<%

	//난수발생
	//1.
	Random r =new Random();
	int r1 = r.nextInt(10); //0~9
	
	//1~45
	int r2 = r.nextInt(45)+1;
	
	//2.
	

%>

난수1 = <%=r1%><br>
난수2 = <%=r2%><br>