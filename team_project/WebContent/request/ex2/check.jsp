<%@ page contentType="text/html;charset=utf-8"%>

<html>
<body>

	<%
		request.setCharacterEncoding("utf-8");

		String[] choice = request.getParameterValues("site");
		String result = "";

		for (int i = 0; i < choice.length; i++) {
			result = result + choice[i] + " ";
		}
	%>

<!-- 	<center style="color: red"> -->
<%-- 		귀하는 <font color=blue><%=result%></font> 를 좋아하시는군요. --%>
<!-- 	</center> -->
	<center>
		귀하는 <font color=blue><%=result%></font> 를 좋아하시는군요.
	</center>

</body>
</html>