package Day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름등록");
		String name = sc.next();
		System.out.println("나이등록");
		int age = sc.nextInt();
		System.out.println("이메일등록");
		String email = sc.next();
		System.out.println("입력한 정보:이름["+name+"] 나이["+age+"] 이메일["+email+"]");
		Member m = new Member();
		m.setName(name);
		m.setage(age);
		m.setEmail(email);
		System.out.println("전송 정보:이름|n"
				+ "["+m.getName()+"] 나이["+m.getAge()+"] 이메일["+m.getEmail()+"]");
	}
}
