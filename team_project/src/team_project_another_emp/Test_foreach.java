package team_project_another_emp;

import java.util.Arrays;
 
public class Test_foreach {
	public static void main(String[] args) {
		System.out.println("test foreach");
		String[] str = {"1","2","3","4"};
		for(String s : str) {
			System.out.println(s);
		}
		Arrays.asList(str).forEach(System.out::print);
	}
}
