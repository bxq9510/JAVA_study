package Test01;

import java.util.Scanner;

public class Method02 {
	/**
		 ���� ���̵� �����ϴ� ���α׷��� �ۼ�
		 1. ���
		 	��. ����,	��. ����,	��. ��ü���� ���
		 2. ���� <��������: �޼��� �ȿ����� ���(����),	��������: Ŭ���� ��ü���� ���(scope)
		 	��. �迭
	 */
	
	static String[] user = new String[5];	// ���� : �ڷ���, ������, �ʱⰪ, ����, scope
	static int[] user1 = new int[5];
	/**
	    �ڷ����� ����Ÿ�԰� ����Ÿ������ ����
	    �Ϲ������� �ҹ��ڰ� ����Ÿ��: ó�� �Ҵ�� ��ġ�� ���� ���ϴ� ���� ���� �ִ�.
	    �빮�ڰ� ����Ÿ��: ó�� �Ҵ�� ��ġ�� ���� ���� �ƴ� �������� �ִ� ��ġ���ִ�.
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void addUser() {	// ���� ��� �޼��� ���� (����)
		// ����: Ű����� �Է¹ް�, �Է¹��� ���̵�(���ڿ�)�� user�迭 ��ĭ�� �����Ѵ�
		System.out.println("ȸ���� ���̵� �Է��Ͻÿ�");
		String name = in.nextLine();
		// name ���ڿ��� �迭�� �����մϴ�. �̶�, ���� ����� (user[i]==null) �̷��� �����
		// name ���� ������ �����ߴ��� üũ
		
		// �޼��带 ����ϴ� ���� -> �ڵ��� ���뼺�� ���̱� ����<�ߺ��� �ҽ��� �ϳ��� ���� ����> 
		// �ڵ��� ���뼺�� ���̸� ���� -> ���������� ���׷��̵尡 ����
		
		if (lengthTD(name) == 2) {	// ȣ��� �Ű������� �ؼ�
									// lengthTD(name) == 2�� �ۼ��ص� ����� �ϼ� ������ �ذ�
			for (int i = 0; i < user.length; i++) {
				if (user[i] == null) {
					user[i] = name;
					break;
				}
			}
		}else {
			System.out.println("���̵�� 8���ڸ� ���� �� �����ϴ�.");
		}
	}
	
	public static void delUser() {	// ���� ��� �޼��� ���� (����)
		System.out.println("ȸ��������� <���̵�� �����ϱ�>");
		System.out.println("������ ȸ���� ���̵� �Է��ϼ���");
		String deleteInputID = in.nextLine();
		// �Է¹��� id�� �迭�� ���ڿ��� �񱳸� �ؾ���
		for (int i = 0; i < user.length; i++) {
			if (user[i] != null) {
				if (user[i].equals(deleteInputID)) {	// .�� �����������ε�, null�� ������ ����� ����
					user[i] = null;						// ������ ���ܰ� �߻�	>>	42�� �ڵ�� ����ȭ
					break;
				}
			}
		}
	}
	
	public static void viewUser() {	// ��ü���� ��� �޼��� ���� (����)
		System.out.println("ȸ�� ��ü����");
		for (int i = 0; i < user.length; i++) {
			if (user[i] != null) {
				System.out.println("ȸ����ȣ : " + i + " / ȸ�����̵� : " + user[i]);
			}
		}
	}
	
	public static void menu() {	// ��ü���� ��� �޼��� ���� (����)
		System.out.println("1.  ȸ������");
		System.out.println("2.  ȸ����ü����");
		System.out.println("3.  ȸ������");
	}
	
	// ���̵�� ������ 8���� �̸��̾�� �Ѵ�. ���� > �޼��� ó��
	public static int lengthTD(String name1) {	// �Ű������� ���ϰ��� ��� �ִ� ���
		// void��� ���� ���ϰ��� ���ٴ� �ǹ�... �Ʒ� �ڵ忡 ���ϰ��� �����Ƿ� ���ϰ��� �ڷ����� �����ش�!
		if (name1.length() >= 8) {
			return 1;	// �޼��忡�� ȣ���� �κ����� ���ϰ��� �� �� �ִ� ���
		}else {
			return 2;
		}
	}
	
	public static void main(String[] args) {	// ���θ޼��� ����... ���θ޼��尡 ����Ǹ� ���α׷��� ����
		// ����
		Scanner in = new Scanner(System.in);
		String menuSelect = null;	// �ֿܼ��� Ű����� �޴��� �����ϱ� ���� �Էµ� ���� �����ϴ� ����
		for ( ; ; ) {
			menu();
			menuSelect = in.nextLine();
			if (menuSelect.equals("1")) {
				addUser();	// �޴� ���ÿ� ���� ȣ���
			}else if (menuSelect.equals("2")) {
				viewUser();	// �޴� ���ÿ� ���� ȣ���
			}else if (menuSelect.equals("3")) {
				delUser();	// �޴� ���ÿ� ���� ȣ���
			}else {
				
			}
		}
	}

}
