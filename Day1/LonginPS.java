package Day1;

import java.util.Scanner;

public class LonginPS {
	public static void main(String[] args) {
		System.out.println("�α���");
		// Ŭ���� �ν��Ͻ����� = new Ŭ������();
		Scanner sc = new Scanner(System.in);
		System.out.println("ID �Է�");
		String ID = sc.next(); // �´� ���̵� kim
		System.out.println("PW �Է�");
		String PW = sc.next(); // �´� ��� 1
		final String wrong = "Ʋ���ϴ�";
		if (ID.equals("kim") && PW.equals("1")) {
			System.out.println("�α��� ����");
		} else if (!ID.equals("kim") && PW.equals("1")) {
			System.out.println("ID�� "+ wrong);
		} else if (ID.equals("kim") && !PW.equals("1")) {
			System.out.println("PW�� " + wrong);
		} else {
			System.out.println("ID PW" + wrong);
		}
	}
}
