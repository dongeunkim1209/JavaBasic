package Day1;

import java.util.Scanner;

public class LonginPS {
	public static void main(String[] args) {
		System.out.println("로그인");
		// 클래스 인스턴스변수 = new 클래스명();
		Scanner sc = new Scanner(System.in);
		System.out.println("ID 입력");
		String ID = sc.next(); // 맞는 아이디 kim
		System.out.println("PW 입력");
		String PW = sc.next(); // 맞는 비번 1
		final String wrong = "틀립니다";
		if (ID.equals("kim") && PW.equals("1")) {
			System.out.println("로그인 성공");
		} else if (!ID.equals("kim") && PW.equals("1")) {
			System.out.println("ID가 "+ wrong);
		} else if (ID.equals("kim") && !PW.equals("1")) {
			System.out.println("PW가 " + wrong);
		} else {
			System.out.println("ID PW" + wrong);
		}
	}
}
