package Sample;

import java.util.Scanner;

public class Main {
	// ����
	static Scanner in = new Scanner(System.in);
	static user[] usrInfo = new user[10]; // ȸ���� �����ϱ� ���� �ڷ��� Ÿ���� user�� �迭
	static String usrInput = null; // ������� �Է��� �ޱ����� ����

	// ȸ�� ���
	static public void addUsr() {
		System.out.print("ȸ�����");
		System.out.println("�̸��� �Է��� �ֽʽÿ�");
		user usr = new user(); // ���ο� ȸ���� �ޱ����� ��ü ����
		usr.name = in.nextLine(); // ���ο� ȸ���� �̸� �Է�
		for (int i = 0; i < usrInfo.length; i++) {
			if (usrInfo[i] != null) {
				if (usrInfo[i].name.equals(usr.name)) { // �ߺ��� ȸ���� �Ÿ��� ���� ���ǹ�
					System.out.println("�ߺ��� ȸ���Դϴ�.");
					break;
				} else if (i == usrInfo.length - 1) { // ȸ���� �� �̻� ����� �� ���� ��� ���ǹ�
					System.out.println("���̻� ����� �� �����ϴ�");
					break;
				}
			} else if (usrInfo[i] == null) { // ȸ���� ����� �� ������ ���ǹ�
				System.out.println("���̸� �Է��Ͽ� �ֽʽÿ�");
				usr.age = in.nextInt(); // ���ο� ȸ���� ���� �Է�
				in.nextLine(); // in.nextInt() ��������
				System.out.println("��ȭ��ȣ ���ڸ��� �Է��Ͽ� �ֽʽÿ�");
				usr.phone = in.nextInt(); // ���ο� ȸ���� ��ȣ �Է�
				in.nextLine(); // in.nextInt() ��������
				usrInfo[i] = usr; // ���ο� ȸ���� ��ü ����� �迭�� ����
				System.out.println("����Ϸ�!");
				break;
			}
		}
	}

	// ȸ�� ����
	static public void delUsr() {
		System.out.println("������ ȸ�� �̸��� �Է��� �ֽʽÿ�");
		usrInput = in.nextLine(); // ������ ȸ�� �̸� �Է�
		for (int i = 0; i < usrInfo.length; i++) {
			if (usrInfo[i] != null) { // .equals ���� ����
				if (usrInput.equals(usrInfo[i].name)) { // ������ ȸ���� ã������ ���ǹ�
					for (int j = i; j < usrInfo.length; j++) {
						if (j == usrInfo.length - 1) {
							usrInfo[j] = null; // ȸ���� ���� ���� ��� ������ �ڸ� ����
						} else {
							usrInfo[j] = usrInfo[j + 1]; // ������ ȸ���� �ε������� ���� �ε����� ���� �ε����� ����� (����)
						}
					}
					System.out.println("�����Ϸ�!");
					break;
				} else if (i == usrInfo.length - 1) { // ȸ�� ����� ���� ���ְ�, ������ ȸ���� ���� �� ���ǹ�
					System.out.println("�ش� ȸ���� �����ϴ�");
					break;
				}
			} else if (i == 0) { // ȸ�� ��Ͽ� ��ϵ� ȸ���� ������ ���ǹ�
				System.out.println("����� ȸ���� �����ϴ�");
				break;
			} else if (i == usrInfo.length - 1) { // ȸ�� ����� �Ϻ� ���ְ�, ������ ȸ���� ���� �� ���ǹ�
				System.out.println("�ش� ȸ���� �����ϴ�");
				break;
			}
		}
	}

	// ȸ�� �˻�
	static public void searchUsr() {
		int cnt = 0; // ȸ�� �˻��� ���� ��츦 ���� ���� ����
		System.out.println("ȸ�� �˻��Դϴ�." + "\n" + "1. �̸� �˻�" + "\n" + "2. ��ȣ �˻�");
		usrInput = in.nextLine(); // ��� ������ ����
		if (usrInput.equals("1")) { // �̸� �˻�
			System.out.println("�̸��� �Է��� �ֽʽÿ�");
			usrInput = in.nextLine(); // �˻��� ȸ���� �̸� �Է�
			for (int i = 0; i < usrInfo.length; i++) {
				if (usrInfo[i] != null) { // .equals ���� ����
					if (usrInput.equals(usrInfo[i].name)) { // �˻��� ȸ���� �̸����� ã������ ���ǹ�
						System.out.println("ȸ����ȣ : " + (i + 1) + " / �̸� : " + usrInfo[i].name + " / ���� : "
								+ usrInfo[i].age + " / ��ȭ��ȣ : " + usrInfo[i].phone);
						cnt++; // �˻��� ȸ���� ���� ��츦 ���� �ڵ�
						break; // �ߺ� ȸ���� �ȹޱ�� �����߱⿡ �ݺ��� Ż��
					}
				}
			}
			if (cnt == 0) { // �˻��� ȸ���� ���� ���
				System.out.println(usrInput + " ȸ���� �����ϴ�");
			}
		} else if (usrInput.equals("2")) { // ��ȣ �˻�
			System.out.println("��ȣ ���ڸ��� �Է��� �ֽʽÿ�");
			int phone = in.nextInt(); // ��ȣ �˻��� ���� ��ȣ�� ���� ���� ���� �� �Է�
			in.nextLine(); // in.nextInt() ��������
			for (int i = 0; i < usrInfo.length; i++) {
				if (usrInfo[i] != null) { // .equals ���� ����
					if (phone == usrInfo[i].phone) { // �˻��� ȸ���� ��ȣ�� ã������ ���ǹ�
						System.out.println("ȸ����ȣ : " + (i + 1) + " / �̸� : " + usrInfo[i].name + " / ���� : "
								+ usrInfo[i].age + " / ��ȭ��ȣ : " + usrInfo[i].phone);
						cnt++; // �˻��� ȸ���� ���� ��츦 ���� �ڵ�
								// ���� ��ȣ�� ���� �� �����Ƿ� �ݺ��� Ż�� X
					}
				}
			}
			if (cnt == 0) { // �˻��� ȸ���� ��ȣ�� ���� ���
				System.out.println(phone + " ��ȣ�� �����ϴ�");
			}
		}
	}

	// ȸ�� ����
	static public void editUsr() {
		int cnt = 0; // ������ ȸ�� �˻��� ���� ��츦 ���� ���� ����
		user usr = new user(); // ������ ȸ���� ���� ��ü ����
		System.out.println("������ ȸ���� �̸��� �Է��� �ֽʽÿ�");
		usr.name = in.nextLine(); // ������ ȸ���� �̸� �Է�
		for (int i = 0; i < usrInfo.length; i++) {
			if (usrInfo[i] != null) { // .equals ���� ����
				if (usr.name.equals(usrInfo[i].name)) { // ������ ȸ���� ã������ ���ǹ�
					cnt++; // ������ ȸ���� ���� ��츦 ���� �ڵ�
					System.out.println("�ش� ȸ���� � ������ �����Ͻðڽ��ϱ�?");
					System.err.println("1. �̸�" + "\n" + "2. ����" + "\n" + "3. ��ȭ��ȣ");
					usrInput = in.nextLine(); // ������ ���� ���� �Է�
					if (usrInput.equals("1")) { // �̸� ����
						System.out.println("������ �̸��� �Է��Ͽ� �ֽʽÿ�.");
						usr.name = in.nextLine(); // ������ �̸� �Է�
						usrInfo[i].name = usr.name; // ������ �̸� ����
						System.out.println("�����Ϸ�!");
						break;
					} else if (usrInput.equals("2")) {
						System.out.println("������ ������ �Է��Ͽ� �ֽʽÿ�.");
						usr.age = in.nextInt(); // ������ ���� �Է�
						in.nextLine(); // in.nextInt() ��������
						usrInfo[i].age = usr.age; // ������ ���� ����
						System.out.println("�����Ϸ�!");
						break;
					} else if (usrInput.equals("3")) {
						System.out.println("������ ��ȭ��ȣ�� �Է��Ͽ� �ֽʽÿ�.");
						usr.phone = in.nextInt(); // ������ ��ȣ �Է�
						in.nextLine(); // in.nextInt() ��������
						usrInfo[i].phone = usr.phone; // ������ ��ȣ ����
						System.out.println("�����Ϸ�!");
						break;
					} else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");	// �߸� �������� ���
					}
				}
			}
		}
		if (cnt == 0) {	// ������ ȸ���� ���� ���
			System.out.println("�ش� ȸ���� �����ϴ�");
		}
	}

	// ��ϵ� ȸ�� ����
	static public void viewUsr() {
		for (int i = 0; i < usrInfo.length; i++) {
			if (usrInfo[i] != null) {
				System.out.print("ȸ����ȣ : " + (i + 1));
				usrInfo[i].viewUsr();	// user Ŭ������ viewUsr�޼��� Ȱ��
			} else if (i == 0) {	// ��ϵ� ȸ���� ���� ���
				System.out.println("��ϵ� ȸ���� �����ϴ�.");
				break;
			}
		}
	}

	// �޴�
	static public void menu() {
		System.out.println("---------------" + "\n" + "1. ȸ�����" + "\n" + "2. ȸ������" + "\n" + "3. ȸ������" + "\n" + "4. ȸ���˻�"
				+ "\n" + "5. ȸ�� ��ü����" + "\n" + "6. ����" + "\n" + "---------------");
	}

	public static void main(String[] args) {
		System.out.println("ȸ�� ���� ���α׷�");
		while (true) {
			menu();
			usrInput = in.nextLine();
			if (usrInput.equals("1")) {
				addUsr();
			} else if (usrInput.equals("2")) {
				delUsr();
			} else if (usrInput.equals("3")) {
				editUsr();
			} else if (usrInput.equals("4")) {
				searchUsr();
			} else if (usrInput.equals("5")) {
				viewUsr();
			} else if (usrInput.equals("6")) {
				break;
			} else {
				System.out.println("�ٽ� �����Ͻʽÿ�");
			}
		}
	}
}