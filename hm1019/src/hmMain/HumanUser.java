package hmMain;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanUser {
	static Scanner in = new Scanner(System.in);
	String id = null;
	String pw = null;
	ArrayList<SubjectList> myClass = new ArrayList<>();
	ArrayList<SubjectList> slist = new ArrayList<>();
	
	HumanUser(ArrayList<SubjectList> subjectList) {
		slist = subjectList;
	}
	
	public void afterLogin() {
		System.out.println(id + "�� ȯ���մϴ�!");
		System.out.println("1.������û" + "\n" + "2.��ٱ���" + "\n" + "3.�α׾ƿ�");
		while (true) {
			String usrInput = in.nextLine();
			if (usrInput.equals("1")) {
				classRegist();
			} else if (usrInput.equals("2")) {
				viewClass();
			} else if (usrInput.equals("3")) {
				System.out.println("�α׾ƿ�!");
				break;
			} else {
				System.out.println("�ٽ� �����Ͽ� �ֽʽÿ�");
			}
		}
	}

	public void classRegist() {
		System.out.println("������û�Դϴ�");
		for (int i = 0; i < slist.size(); i++) {
			System.out.print((i+1) + "�� : ");
			slist.get(i).viewSub();
		}
		System.out.println();
		System.out.println("������ ������ ��ȣ�� �ϳ��� �Է��Ͽ� �ֽʽÿ�" + "\n" + "0 ������ ����");
		while (true) {
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum <= slist.size()) {
				if (selNum == 0) {
					System.out.println("������û ����!");
					break;
				}else {
					myClass.add(slist.get(selNum-1));
					System.out.println(slist.get(selNum-1).subName + " ���� ��û�Ͽ����ϴ�");
				}
			}else {
				System.out.println("�ٽ� �����Ͽ� �ֽʽÿ�");
			}
		}
	}
	
	public void viewMem() {
		System.out.println(" / id: " + id + " / pw: " + pw);
	}

	public void viewClass() {
		System.out.println("��û����");
		for (int i = 0; i < myClass.size(); i++) {
			myClass.get(i).viewSub();
		}
	}
}
