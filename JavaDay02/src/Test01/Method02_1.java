package Test01;

import java.util.Scanner;

public class Method02_1 {
	static String[] fruit = new String[10];
	static Scanner in = new Scanner(System.in);
	static String specialWord = "!@#$%^&*";
	public static void addFruit() {		// ���ϵ��
		System.out.println("�߰��� ������ �Է��Ͻÿ�.");
		String addName = in.nextLine();
		if (checkFruit(addName) == 1) {
			if (overlapFruit(addName) == 2) {
				for (int k = 0; k < fruit.length; k++) {
					if (fruit[k] == null) {
						fruit[k] = addName;
						break;
					}
				}
			} else {
				System.out.println("�ߺ��� �����Դϴ�.");
			}
		} else {
			System.out.println("���� �̸��� Ư�����ڰ� �����մϴ�.");
		}
	}
	public static int overlapFruit(String addName) {	 // ���ϸ� �ߺ�üũ
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i] != null) {
				if (fruit[i].equals(addName)) {
					return 1;
				}
			}
		}
		return 2;
	}
	public static int checkFruit(String addName) {		// ���ϸ� Ư����ȣ üũ
		for (int i = 0; i < specialWord.length(); i++) {
			for (int j = 0; j < addName.length(); j++) {
				if (addName.charAt(j) == specialWord.charAt(i)) {
					return 1;
				}
			}
		}
		return 2;
	}
	public static void delFruit() {		// ���ϻ���
		System.out.println("������ ������ �Է��Ͻÿ�.");
		String delName = in.nextLine();
		if (overlapFruit(delName) == 2) {		// �ش� ���� ���翩�� üũ
			for (int i = 0; i < fruit.length; i++) {
				if (fruit[i] != null) {
					if (fruit[i].equals(delName)) {
						fruit[i] = null;
						System.out.println("�����Ǿ����ϴ�.");
					}
				}
			}
		} else {
			System.out.println("�ش� ������ �����ϴ�.");
		}
	}
	public static void viewFruit() {	// ���� ��ü����
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i] != null) {
				System.out.println("����" + i + "�� : " + fruit[i]);
			} else if (i == 0) {
				System.out.println("����� ������ �����ϴ�.");
				break;
			}
		}
	}
	public static void editFruit() {	// ���ϼ���
		System.out.println("������ ������ �Է��Ͻÿ�.");
		String editName = in.nextLine();
		if (overlapFruit(editName) == 2) {		// �ش� ���� ���翩�� üũ
			for (int i = 0; i < fruit.length; i++) {
				if (fruit[i] != null) {
					if (fruit[i].equals(editName)) {
						System.out.println("���ο� ������ �Է��Ͻÿ�.");
						String newName = in.nextLine();
						if (checkFruit(newName) == 2) {		// ���ο� �����̸� Ư����ȣ üũ
							fruit[i] = newName;
							System.out.println("�����Ǿ����ϴ�.");
						}else {
							System.out.println("���� �̸��� Ư�����ڰ� ���� �մϴ�.");
						}
						break;
					}
				}
			}
		} else {
			System.out.println("�ش� ������ �����ϴ�.");
		}
	}
	public static void searchFruit() {		// ���ϰ˻�
		System.out.println("�˻��� ������ �Է��Ͻÿ�.");
		String searchName = in.nextLine();
		if (overlapFruit(searchName) == 2) {		// �ش� ���� ���翩�� üũ
			for (int i = 0; i < fruit.length; i++) {
				if (fruit[i] != null) {
					if (fruit[i].equals(searchName)) {
						System.out.println(searchName + "�� ��ȣ�� " + i + "�� �Դϴ�.");
						break;
					}
				}
			}
		} else {
			System.out.println("�ش� ������ �����ϴ�.");
		}
	}
	public static void menu() {
		System.out.println("1. ���ϵ��");
		System.out.println("2. ���ϻ���");
		System.out.println("3. ���ϼ���");
		System.out.println("4. ������ü����");
		System.out.println("5. ���ϰ˻�");
	}
	public static void main(String[] args) {
		String menuSelect = null;
		for (;;) {
			menu();
			menuSelect = in.nextLine();
			if (menuSelect.equals("1")) {
				addFruit();
			} else if (menuSelect.equals("2")) {
				delFruit();
			} else if (menuSelect.equals("3")) {
				editFruit();
			} else if (menuSelect.equals("4")) {
				viewFruit();
			} else if (menuSelect.equals("5")) {
				searchFruit();
			} else {
				System.out.println("�ٽ� �����Ͻʽÿ�.");
			}
		}
	}
}
