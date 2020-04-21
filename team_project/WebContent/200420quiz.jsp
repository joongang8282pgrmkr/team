<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Random"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Iterator"%>
<%
	Random r = new Random();
	int no = 0;
	Set<Integer> set = new HashSet<>();
	while (true) {
		no = r.nextInt(45) + 1;
		set.add(no);
		if (set.size() == 6)
			break;
	}
	Iterator<Integer> iter = set.iterator();
	while (iter.hasNext()) {
%>
<%=iter.next()%>
&nbsp;&nbsp;
<%
	}
%>