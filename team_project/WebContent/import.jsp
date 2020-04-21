<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ page import= "java.util.*" %> --%>
<%@ page import="java.util.Date"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.text.SimpleDateFormat"%>
<%-- <%@ page import = "java.util.*, java.sql.*" %> --%>
<%
	//날짜 시간 관련 클래스
	//date(java.util), timestamp(java.sql), calendar(java.util)
	//SimpleDateFormat(java.text)클래스를 통해 원하는 형태로 날짜시간을 뽑아낼 수 있음
	//java.text > simpledateformat 자바 api문서 참고
	//1. Date클래스
	Date d = new Date();
// 	java.util.Date d = new java.util.Date();

// 	SimpleDateFormat sd = new SimpleDateFormat("yy년MM월dd일hh시mm분ss초");
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE요일");
	
	//2. Timestamp클래스
	Timestamp t = new Timestamp(System.currentTimeMillis());//Timestamp클래스의 데이터타입이 롱형이고 기본생성자가 없기 때문에 인자를 써줘야 함
	SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	//3. Calendar클래스
	
	
%>

현재시간1 :
<%=d%><br>
현재시간2 :
<%=sd.format(d)%><br>
현재시간3 :
<%=t%><br>
현재시간4 :
<%=sd2.format(t)%><br>