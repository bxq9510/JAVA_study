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
		System.out.println("<특별관리추가> 스케줄 번호를 입력하세요");
		for (int i = 0; i < bList.size(); i++) {
			System.out.println("NO." + (i+1));
			bList.get(i).prt();
		}
		int selNo = in.nextInt();
		in.nextLine();
		this.badList.add(bList.get(selNo-1));
	}

	private void delBad() {
		System.out.println("<특별관리삭제> 스케줄 이름 : ");
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
			System.out.println("해당 스케줄이 없습니다");
		}
	}

	private void listBad() {
		for (int i = 0; i < badList.size(); i++) {
			badList.get(i).prt();
		}
	}

	private void menu() {
		System.out.println("1. 나쁜관리 추가");
		System.out.println("2. 나쁜관리 삭제");
		System.out.println("3. 나쁜관리 전체보기");
	}
}
