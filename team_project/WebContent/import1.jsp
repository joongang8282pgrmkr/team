<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Calendar" %>

<%
	// 3. Calendar 클래스
	Calendar c = Calendar.getInstance();//캘린더클래스는 뉴 연산자로 생성할 수 없고 getInstance()같은 메서드를 통해 사용가능
	int year = c.get(Calendar.YEAR);//그냥은 못구하고 곡 우회로 구해야 구할 수 있는...//정적필드를 통해 구한 값을 get으로 구해서 캘린더변수에 저장
	int month = c.get(Calendar.MONTH)+1;//0~11 => 1~12
// 	int dayMonth = c.get(Calendar.DAY_OF_MONTH);
	int date = c.get(Calendar.DATE);
// 	int dayWeek
	int h1 = c.get(Calendar.HOUR); //12시간제
	int h2 = c.get(Calendar.HOUR_OF_DAY); //24시간제
	int minute = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);
	int dayWeek = c.get(Calendar.DAY_OF_WEEK);//일~토 1~7
	String strWeek[] = {"일","월","화","수","목","금","토"};
%>

<%-- <%=year%>-<%=month%>-<%=dayMonth%> --%>
<%=year%>-<%=month%>-<%=date%><br>
<%=h1%>:<%=minute %>:<%=sec %><br>
<%=strWeek[dayWeek-1] %>요일
<%-- <%=h2%> --%>

