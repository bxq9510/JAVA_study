package Test01;

import java.util.Scanner;

public class Amass04 {

	public static void main(String[] args) {
		// �ڷ����� �ҹ��� : ���� Ÿ��
		
		
		String[] username = new String[5];	// �迭�� �ڷ���? ������?
		
//		Scanner in = new Scanner(System.in);
//		String name = null;
//		System.out.println("�̸��� �Է��ϼ���");
//		name = in.nextLine();
//		System.out.println(name + "�Է��Ͽ����ϴ�");
		
		// 1��
		System.out.println("1��----------------");
		String[] user1 = new String[5];
		System.out.println("�̸��� �Է��ϼ���");
		for (int i = 0; i < user1.length; i++) {
			Scanner in1 = new Scanner(System.in);
			user1[i] = in1.nextLine();
		}
		for (int i = 0; i < user1.length; i++) {
			System.out.print(user1[i] + "\t");
		}
		
		// 2��
		System.out.println("\n" + "2��----------------");
		String[] user2 = {"kimlee", "leejin", "����ȣ", "���ϵ�"};
		int cnt = 0;
		String name2 = null;
		Scanner in2 = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�");
		name2 = in2.nextLine();
		for (int i = 0; i < user2.length; i++) {
			if (user2[i].equals(name2)) {
				System.out.println("�ߺ�");
				cnt++;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("��� ����");
		}
		
		// 3��
		System.out.println("3��----------------");
		String name3 = null;
		Scanner in = new Scanner(System.in);
		System.out.print("�̸� : ");
		name3 = in.nextLine();
		for (int i = 0; i < user2.length; i++) {
			if (user2[i].equals(name3)) {
				System.out.println(i + "��");
				break;
			}
		}
		
		// 4��
		System.out.println("4��----------------");
		String[] user4 = {"kimlee", "�ڱ�", null, "������"};
		int cnt4 = 0;
		for (int i = 0; i < user4.length; i++) {
			if (user4[i] == null) {
				cnt4++;
			}
		}
		System.out.println("Ż���� ȸ�� : " + cnt4 + "��");
		
		// 5��
		System.out.println("5��----------------");
		String[] user5 = {"������", "�ѵѵ�", "�¼¼�", "�׳׳�"};
		String[] newuser5 = new String[4];
		String name5 = null;
		Scanner in5 = new Scanner(System.in);
		System.out.println("�߰����ڿ� �Է�");
		name5 = in5.nextLine();
		for (int i = 0; i < newuser5.length; i++) {
			if (i<2) {
				newuser5[i] = user5[i];
			}else if (i == 2) {
				newuser5[i] = name5;
			}else {
				newuser5[i] = user5[i-1];
			}
		}
		for (int i = 0; i < newuser5.length; i++) {
			System.out.print(newuser5[i] + "\t");
		}
		
	}

}
