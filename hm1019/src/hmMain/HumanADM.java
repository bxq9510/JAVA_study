package hmMain;

import java.util.ArrayList;
import java.util.Scanner;

// ������ ����, ���, ����, ����, �˻�
public class HumanADM {
	// ����1. Ŭ���� ������ ���� ��ü�� �����ɶ� ȣ��Ǵ� �޼��� �̸���? ������
	// �����ڴ� ������ �Ǿ��ִ� ���� (�� �����ڰ� ������)
	ArrayList<HumanUser> members = new ArrayList<>(); // ArrayList ��ü
	ArrayList<SubjectList> subjectList = new ArrayList<>();
//	�ڷ���			   ��������		��ü����
	Scanner in = new Scanner(System.in);
	String usrInput = null;
	HumanUser loginUser = null;

	HumanADM() { // ������
		System.out.println("�޸ձ������� ������ ���� ���α׷�");
		while (true) {
			menu();
			usrInput = in.nextLine();
			if (usrInput.equals("1")) {
				addMember();
			} else if (usrInput.equals("2")) {
				delMember();
			} else if (usrInput.equals("3")) {
				searchMember();
			} else if (usrInput.equals("4")) {
				viewMember();
			} else if (usrInput.equals("5")) {
				editMember();
			} else if (usrInput.equals("6")) {
				login();
			} else if (usrInput.equals("7")) {
				subEdit();
			} else if (usrInput.equals("8")) {
				break;
			} else {
				System.out.println("�ٽ� �����Ͽ� �ֽʽÿ�");
			}
		}
	}

	private void subEdit() {
		System.out.println("���� �����Դϴ�");
		System.out.println("1.���� ���" + "\n" + "2.���� ��ü����" + "\n" + "3.����");
		while (true) {
			String usrInput = in.nextLine();
			if (usrInput.equals("1")) {
				addSub();
			} else if (usrInput.equals("2")) {
				viewSub();
			} else if (usrInput.equals("3")) {
				System.out.println("������� ����!");
				break;
			} else {
				System.out.println("�ٽ� �����Ͽ� �ֽʽÿ�");
			}
		}
	}

	private void addSub() {
		System.out.println("���� ���");
		System.out.println("������� �Է��Ͻʽÿ�");
		SubjectList subject = new SubjectList();
		subject.subName = in.nextLine();
		System.out.println("��� �������� �Է��Ͻʽÿ�");
		subject.teacher = in.nextLine();
		System.out.println("���ǽ� ������ �Է��Ͻʽÿ�");
		subject.classroom = in.nextLine();
		subjectList.add(subject);
		System.out.println("��ϿϷ�!");
	}

	private void viewSub() {
		for (int i = 0; i < subjectList.size(); i++) {
			System.out.print((i + 1) + "��");
			subjectList.get(i).viewSub();
		}
	}

	private void login() {
		System.out.println("�α��� �Դϴ�");
		System.out.println("���̵� �Է��Ͽ� �ֽʽÿ�");
		HumanUser member = new HumanUser(subjectList);
		member.id = in.nextLine();
		System.out.println("��й�ȣ�� �Է��Ͽ� �ֽʽÿ�");
		member.pw = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).id.equals(member.id)) {
				if (members.get(i).pw.equals(member.pw)) {
					chkFlag = false;
					System.out.println("�α��� ����!");
					loginUser = members.get(i);
					loginUser.afterLogin();
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
				}
			}
		}
		if (chkFlag = true) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�");
		}
	}

	private void addMember() {
		System.out.println("������ ���");
		System.out.println("���̵� �Է��Ͻʽÿ�");
		HumanUser member = new HumanUser(subjectList);
		member.id = in.nextLine();
		System.out.println("��й�ȣ�� �Է��Ͻʽÿ�");
		member.pw = in.nextLine();
		members.add(member);
		System.out.println("��ϿϷ�!");
	}

	private void delMember() {
		System.out.println("������ ����");
		System.out.println("������ ���̵� �Է��Ͻʽÿ�");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).id.contains(usrInput)) {
				members.remove(i);
				System.out.println("�����Ϸ�!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag = true) {
			System.out.println("��� ���̵� �����ϴ�");
		}
	}

	private void searchMember() {
		System.out.println("������ �˻�");
		System.out.println("�˻��� ���̵� �Է��Ͻʽÿ�");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).id.contains(usrInput)) {
				System.out.print((i + 1) + "��");
				members.get(i).viewMem();
				System.out.println("�˻��Ϸ�!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag = true) {
			System.out.println("��� ���̵� �����ϴ�");
		}
	}

	private void editMember() {
		System.out.println("��й�ȣ ����");
		System.out.println("������ ���̵� �Է��Ͻʽÿ�");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).id.contains(usrInput)) {
				System.out.println("���ο� ��й�ȣ�� �Է��Ͻʽÿ�");
				members.get(i).pw = in.nextLine();
				System.out.println("�����Ϸ�!");
				chkFlag = false;
			}
		}
		if (chkFlag = true) {
			System.out.println("��� ���̵� �����ϴ�");
		}
	}

	private void viewMember() {
		for (int i = 0; i < members.size(); i++) {
			System.out.print((i + 1) + "��");
			members.get(i).viewMem();
		}
	}

	private void menu() {
		System.out.println("1.���" + "\n" + "2.����(id����)" + "\n" + "3.�˻�(id�˻�)" + "\n" + "4.��ü����" + "\n" + "5.��й�ȣ ����"
				+ "\n" + "6.�α���" + "\n" + "7.�������" + "\n" + "8.���α׷� ����");
	}

}
