package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.Schedule;

public class Bad {
	private Scanner in = new Scanner(System.in);
	private ArrayList<Schedule> badList = new ArrayList<>();
	ScheduleManager blink = null;
	
	public Bad(ScheduleManager s){
		blink = s;
	}

	public void runBad() {
		boolean flag = true;
		while (flag) {
			menu();
			String selnum = in.nextLine();
			switch (selnum) {
			case "1":
				addBad();
				break;
			case "2":
				delBad();
				break;
			case "3":
				listBad();
				break;
			default:
				flag = false;
			}
		}
	}

	private void addBad() {
		ArrayList<Schedule> bList = blink.getScheduleList();
		System.out.println("<Ư�������߰�> ������ ��ȣ�� �Է��ϼ���");
		for (int i = 0; i < bList.size(); i++) {
			System.out.println("NO." + (i+1));
			bList.get(i).prt();
		}
		int selNo = in.nextInt();
		in.nextLine();
		this.badList.add(bList.get(selNo-1));
	}

	private void delBad() {
		System.out.println("<Ư����������> ������ �̸� : ");
		String name = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < badList.size(); i++) {
			if (badList.get(i).getName().equals(name)) {
				badList.remove(i);
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("�ش� �������� �����ϴ�");
		}
	}

	private void listBad() {
		for (int i = 0; i < badList.size(); i++) {
			badList.get(i).prt();
		}
	}

	private void menu() {
		System.out.println("1. ���۰��� �߰�");
		System.out.println("2. ���۰��� ����");
		System.out.println("3. ���۰��� ��ü����");
	}
}
