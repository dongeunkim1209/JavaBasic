package Day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸����");
		String name = sc.next();
		System.out.println("���̵��");
		int age = sc.nextInt();
		System.out.println("�̸��ϵ��");
		String email = sc.next();
		System.out.println("�Է��� ����:�̸�["+name+"] ����["+age+"] �̸���["+email+"]");
		Member m = new Member();
		m.setName(name);
		m.setage(age);
		m.setEmail(email);
		System.out.println("���� ����:�̸�|n"
				+ "["+m.getName()+"] ����["+m.getAge()+"] �̸���["+m.getEmail()+"]");
	}
}
