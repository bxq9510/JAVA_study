package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.Schedule;

public class Special {
	private Scanner in = new Scanner(System.in);
	private ArrayList<Schedule> specialList = new ArrayList<>();
	ScheduleManager slink = null;
	
	public Special(ScheduleManager s) {
		this.slink = s;
	 }

	public void runSpecial() {
		boolean flag = true;
		while (flag) {
			menu();
			String selnum = in.nextLine();
			switch (selnum) {
			case "1":
				addSpecial();
				break;
			case "2":
				delSpecial();
				break;
			case "3":
				listSpecial();
				break;
			default:
				flag = false;
			}
		}
	}

	private void addSpecial() {
		ArrayList<Schedule> sList = slink.getScheduleList();
		System.out.println("<Ư�������߰�> ������ ��ȣ�� �Է��ϼ���");
		for (int i = 0; i < sList.size(); i++) {
			System.out.println("NO." + (i+1));
			sList.get(i).prt();
		}
		int selNo = in.nextInt();
		in.nextLine();
		this.specialList.add(sList.get(selNo-1));
	}

	private void delSpecial() {
		System.out.println("<Ư����������> ������ �̸� : ");
		String name = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < specialList.size(); i++) {
			if (specialList.get(i).getName().equals(name)) {
				specialList.remove(i);
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("�ش� �������� �����ϴ�");
		}
	}

	private void listSpecial() {
		for (int i = 0; i < specialList.size(); i++) {
			specialList.get(i).prt();
		}
	}

	private void menu() {
		System.out.println("1. Ư������ �߰�");
		System.out.println("2. Ư������ ����");
		System.out.println("3. Ư������ ��ü����");
	}
}
