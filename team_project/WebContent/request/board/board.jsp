<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String nm = request.getParameter("writer");
	String pw = request.getParameter("passwd");
	String sj = request.getParameter("subject");
	String ct = request.getParameter("content");
			
%>

작자 : <%=nm%><br>
비번 : <%=pw%><br>
제목 : <%=sj%><br>
내용 : <pre><%=ct%></pre><br>
