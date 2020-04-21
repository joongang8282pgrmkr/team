<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<%@ page import="java.util.TreeSet" %>

<%
int n;
//Set s = new HashSet();
TreeSet<Integer> s = new TreeSet<>();//트리셋 너란 자료구조형... 정렬기능이 있음(오름차순 기본)//셋자료구조의 일종답게 중복데이터를 저장하지 않음

Random r = new Random();		

while(true){
	n = r.nextInt(45)+1; 			// 1 ~ 45 난수 발생
	s.add(n);
	if(s.size() == 6){
		out.println(s);
		break;
	}
}

%>    