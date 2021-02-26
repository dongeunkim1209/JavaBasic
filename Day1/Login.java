package Day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		// ID 입력
		// PW 입력
		// "pass" -> 로그인 성공
		// "abc" ->  로그인 실패
		System.out.println("로그인");
		Scanner sc = new Scanner(System.in);
		System.out.println("ID 입력");
		String ID = sc.next();
		System.out.println("PW 입력");
		String PW = sc.next();
		String result = "로그인 실패";
		if(PW.equals("pass")) {result = "로그인 성공";} 
		if(PW.equals("abc")) {result = "로그인 실패";}
		System.out.println("ID :"+ID+" "+"PW :"+PW+" => "+result);
		
				}
}
