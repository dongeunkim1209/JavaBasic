package Day3;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("��ȭ��ȣ�Է�");
	String ph = sc.next();
	System.out.println("�޽����Է�");
	String msg = sc.nextLine();
	System.out.println("�Է��� ����: ��ȭ��ȣ["+ph+"] ����["+msg+"]");
	Kakao k = new Kakao();
	k.setPh(ph);
	k.setMsg(msg);
	System.out.println("���� ����: ��ȭ��ȣ["+k.getPh()+"] ����["+k.getmsg()+"]");
}
}