package Day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("####### ȸ������ #######");
		join( );
	
	}
	public static void join( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ������ â");
		System.out.println("id �Է�");
		String id = sc.next();
		System.out.println("pw �Է�");
		String pw = sc.next();
		User user = new User();
		user.setId(id);
		user.setPw(pw);
		System.out.println("[���� ����] ID : "+user.getId()+", PW : "+user.getPw()+"");
		login(user);
	}
	public static void login(User user) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�α��� â");
		System.out.println("id �Է�");
		System.out.println("pw �Է�");
		String id = user.getId();
		String pw = user.getPw();
		System.out.println("[���� ����] ID : "+id+", PW : "+pw+"");
	}
}
