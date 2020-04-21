<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<%@ page import="java.util.Arrays" %>


<%
int num[] = new int[6];

Random r = new Random();

for (int i = 0; i < num.length; i++){

//	num[i] = (int) (Math.random() * 45) + 1;	// 1 ~ 45 난수 발생
	num[i] = r.nextInt(45) + 1;					// 1 ~ 45 난수 발생

	// num[0] = 10, num[1]=10;
	 for (int j = 0; j < i; j++){	
		if (num[i] == num[j]){					// 중복
			i--;	
			break;
		}// if end
	 }// for end			

}// for end

Arrays.sort(num);	// 오름차순으로 정렬		

for (int k = 0; k < num.length; k++){
	out.print(num[k] + "  ");
}


/*
난수 발생 공식
난수=(정수화)((상한값-하한값+1)* Math.random()+하한값)

*/

%>