package Day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		// ID �Է�
		// PW �Է�
		// "pass" -> �α��� ����
		// "abc" ->  �α��� ����
		System.out.println("�α���");
		Scanner sc = new Scanner(System.in);
		System.out.println("ID �Է�");
		String ID = sc.next();
		System.out.println("PW �Է�");
		String PW = sc.next();
		String result = "�α��� ����";
		if(PW.equals("pass")) {result = "�α��� ����";} 
		if(PW.equals("abc")) {result = "�α��� ����";}
		System.out.println("ID :"+ID+" "+"PW :"+PW+" => "+result);
		
				}
}
