<%@ page contentType = "text/html; charset=euc-kr" %>

<html>
<head><title>out 기본 객체 사용</title></head>
<body>

<%
	System.out.println("콘솔에 출력");
	System.out.println("콘솔에 출력");
    out.println("안녕하세요?<br>");
    out.println("반갑습니다.");//웹페이지상에서 자바에서처럼 println 줄바꿈기능 적용안됨, br태그 p태그 사용
%>
<br>
<%="<br>잘 부탁해요" %>
<br>

out 기본 객체를 사용하여 
<%
    out.println("출력한 결과입니다.");
%>

</body>
</html>