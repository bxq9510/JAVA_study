package mv;

import java.util.ArrayList;
import java.util.Scanner;

public class MvADM {
	ArrayList<MvUser> usrInfo = new ArrayList<>(); // �ڷ��� Ÿ�� MvUser�� ArrayList (ȸ������)
	ArrayList<MovieList> mvList = new ArrayList<>(); // �ڷ��� Ÿ�� MovieList�� ArrayList (��ȭ����)
	ArrayList<FoodList> fdList = new ArrayList<>(); // �ڷ��� Ÿ�� FoodList�� ArrayList (��������)
	Scanner in = new Scanner(System.in); // ���ɳ�
	String usrInput = null; // ����� �Է��� �ޱ� ���� ����
	MvUser loginUser = null; // �α��� ���� ����

	MvADM() { // ������
		System.out.println("��ȭ ���� ���α׷�");
		while (true) {
			menu();
			usrInput = in.nextLine();
			if (usrInput.equals("1")) {
				addUsr();
			} else if (usrInput.equals("2")) {
				delUsr();
			} else if (usrInput.equals("3")) {
				searchUsr();
			} else if (usrInput.equals("4")) {
				viewUsr();
			} else if (usrInput.equals("5")) {
				editUsr();
			} else if (usrInput.equals("6")) {
				login();
			} else if (usrInput.equals("7")) {
				admMv();
			} else if (usrInput.equals("8")) {
				break;
			} else {
				System.out.println("�ٽ� �����Ͽ� �ֽʽÿ�");
			}
		}
	}

	// �α���
	private void login() {
		System.out.println("�α��� �Դϴ�");
		System.out.println("���̵� �Է��Ͽ� �ֽʽÿ�");
		MvUser usr = new MvUser(mvList, fdList);
		usr.id = in.nextLine();
		System.out.println("��й�ȣ�� �Է��Ͽ� �ֽʽÿ�");
		usr.pw = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < usrInfo.size(); i++) {
			if (usrInfo.get(i).id.equals(usr.id)) {
				if (usrInfo.get(i).pw.equals(usr.pw)) {
					chkFlag = false;
					System.out.println("�α��� ����!");
					loginUser = usrInfo.get(i);
					loginUser.afterLogin();
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
					chkFlag = false;
				}
			}
		}
		if (chkFlag) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�");
		}
	}

	// ������������
	private void admMv() {
		System.out.println("������ �������Դϴ�");
		System.out.println("1.��ȭ ����" + "\n" + "2.���� ����");
		usrInput = in.nextLine();
		chk: while (true) {
			if (usrInput.equals("1")) {
				System.out.println("1.��ȭ ���" + "\n" + "2.��ȭ ����" + 
									"\n" + "3.��ȭ ��ü����" + "\n" + "4.����");
				while (true) {
					usrInput = in.nextLine();
					if (usrInput.equals("1")) {
						addMv();
					} else if (usrInput.equals("2")) {
						delMv();
					} else if (usrInput.equals("3")) {
						viewMv();
					} else if (usrInput.equals("4")) {
						System.out.println("��ȭ ���� ����!");
						break chk;
					} else {
						System.out.println("�ٽ� �����Ͻʽÿ�");
					}
				}
			} else if (usrInput.equals("2")) {
				System.out.println("1.���� ���" + "\n" + "2.���� ����" + 
									"\n" + "3.���� ��ü����" + "\n" + "4.����");
				while (true) {
					String usrInput = in.nextLine();
					if (usrInput.equals("1")) {
						addFd();
					} else if (usrInput.equals("2")) {
						delFd();
					} else if (usrInput.equals("3")) {
						viewFd();
					} else if (usrInput.equals("4")) {
						System.out.println("���� ���� ����!");
						break chk;
					} else {
						System.out.println("�ٽ� �����Ͻʽÿ�");
					}
				}
			} else {
				System.out.println("�ٽ� �����Ͻʽÿ�");
			}
		}
	}

	// ��ȭ ���
	private void addMv() {
		System.out.println("��ȭ ���");
		System.out.println("��ȭ �̸��� �Է��Ͻʽÿ�");
		MovieList mv = new MovieList();
		mv.movieName = in.nextLine();
		System.out.println("�󿵰��� �Է��Ͻʽÿ�");
		mv.roomName = in.nextLine();
		System.out.println("�¼� ���� �Է��Ͻʽÿ�");
		mv.seat = in.nextInt();
		in.nextLine();
		for (int i = 0; i < mv.seat; i++) {
			mv.seats.add(0);
		}
		mvList.add(mv);
		System.out.println("��ϿϷ�!");
	}
	// ��ȭ ����
	private void delMv() {
		System.out.println("��ȭ ����");
		System.out.println("������ ��ȭ���� �Է��Ͻʽÿ�");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < mvList.size(); i++) {
			if (mvList.get(i).movieName.equals(usrInput)) {
				mvList.remove(i);
				System.out.println("�����Ϸ�!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("��� ��ȭ �����ϴ�");
		}
	}
	// ��ȭ ��ü����
	private void viewMv() {
		for (int i = 0; i < mvList.size(); i++) {
			System.out.print((i + 1) + "��");
			mvList.get(i).viewMv();
		}
	}

	// ���� ���
	private void addFd() {
		System.out.println("���� ���");
		System.out.println("���� �̸��� �Է��Ͻʽÿ�");
		FoodList fd = new FoodList();
		fd.foodName = in.nextLine();
		System.out.println("������ �Է��Ͻʽÿ�");
		fd.foodPrice = in.nextInt();
		in.nextLine();
		System.out.println("������ �Է��Ͻʽÿ�");
		fd.foodQuantity = in.nextInt();
		in.nextLine();
		fdList.add(fd);
		System.out.println("��ϿϷ�!");
	}
	// ���� ����
	private void delFd() {
		System.out.println("���� ����");
		System.out.println("������ ���ĸ��� �Է��Ͻʽÿ�");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < fdList.size(); i++) {
			if (fdList.get(i).foodName.equals(usrInput)) {
				fdList.remove(i);
				System.out.println("�����Ϸ�!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("��� ������ �����ϴ�");
		}
	}
	// ���� ��ü����
	private void viewFd() {
		for (int i = 0; i < fdList.size(); i++) {
			System.out.print((i + 1) + "��");
			fdList.get(i).viewFd();
		}
	}

	// ����� ���
	private void addUsr() {
		System.out.println("����� ���");
		System.out.println("���̵� �Է��Ͻʽÿ�");
		MvUser usr = new MvUser(mvList, fdList);
		usr.id = in.nextLine();
		System.out.println("��й�ȣ�� �Է��Ͻʽÿ�");
		usr.pw = in.nextLine();
		usrInfo.add(usr);
		System.out.println("��ϿϷ�!");
	}
	// ����� ����
	private void delUsr() {
		System.out.println("����� ����");
		System.out.println("������ ���̵� �Է��Ͻʽÿ�");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < usrInfo.size(); i++) {
			if (usrInfo.get(i).id.equals(usrInput)) {
				usrInfo.remove(i);
				System.out.println("�����Ϸ�!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("��� ���̵� �����ϴ�");
		}
	}
	
	// ����� �˻�
	private void searchUsr() {
		System.out.println("����� �˻�");
		System.out.println("�˻��� ���̵� �Է��Ͻʽÿ�");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < usrInfo.size(); i++) {
			if (usrInfo.get(i).id.equals(usrInput)) {
				System.out.print((i + 1) + "��");
				usrInfo.get(i).viewMem();
				System.out.println("�˻��Ϸ�!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("��� ���̵� �����ϴ�");
		}
	}
	// ����� ����
	private void editUsr() {
		System.out.println("��й�ȣ ����");
		System.out.println("������ ���̵� �Է��Ͻʽÿ�");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < usrInfo.size(); i++) {
			if (usrInfo.get(i).id.equals(usrInput)) {
				System.out.println("���ο� ��й�ȣ�� �Է��Ͻʽÿ�");
				usrInfo.get(i).pw = in.nextLine();
				System.out.println("�����Ϸ�!");
				chkFlag = false;
			}
		}
		if (chkFlag) {
			System.out.println("��� ���̵� �����ϴ�");
		}
	}

	// ����� ��ü����
	private void viewUsr() {
		for (int i = 0; i < usrInfo.size(); i++) {
			System.out.print((i + 1) + "��");
			usrInfo.get(i).viewMem();
		}
	}

	// �޴�
	private void menu() {
		System.out.println("1. ����� ���" + "\n" + "2. ����� ����" + "\n" + "3. ����� �˻�" + "\n" + "4. ��ü����" + "\n" + "5. ��й�ȣ ����"
				+ "\n" + "6. ����� �α���" + "\n" + "7. ������ ������" + "\n" + "8. ���α׷� ����");
	}
}
