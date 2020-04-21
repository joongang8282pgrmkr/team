<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 선언태그Declaration tag -->
<!-- 메소드는 반드시 선언태그 안에서 만들어야 함 -->
<%!
	public int add(int a, int b) {
	return a + b;
	}
	public int subtract(int a, int b) {
	return a - b;
	}
	public int multiply(int a, int b) {
	return a * b;
	}
%>

<%
	int result1 = add(3,9);
	int result2 = subtract(3,9);
	int result3 = multiply(3,9);
%>

3+9 = <%=result1 %><br>
3-9 = <%=result2 %><br>
10*25 = <%=result3 %><br>
10*25 = <%=multiply(3,9) %><br>

<%= "---------------------" %><br>

<%=add(3,4)%>
<br>
<%=subtract(3,4)%>
<br>
<%=multiply(3,4)%>
