package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.Pic;
import DTO.Schedule;

public class PartManager {
	private Scanner in = new Scanner(System.in);
	private ArrayList<Pic> picSchedule = new ArrayList<>();
	ScheduleManager plink = null;
	
	public PartManager(ScheduleManager s){
		plink = s;
	}

	public void runPart() {
		boolean flag = true;
		while (flag) {
			menu();
			String selnum = in.nextLine();
			switch (selnum) {
			case "1":
				assignPart();
				break;
			case "2":
				listPart();
				break;
			default:
				flag = false;
			}
		}
	}

	private void assignPart() {
		ArrayList<Schedule> pList = plink.getScheduleList();
		System.out.println("<����� ����> ������ ��ȣ�� �Է��ϼ���");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println("NO." + (i+1));
			pList.get(i).prt();
		}
		int selNo = in.nextInt();
		in.nextLine();
		System.out.println("����� �̸��� �Է��ϼ���");
		String name = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < picSchedule.size(); i++) {
			if (picSchedule.get(i).getName().equals(name)) {
				picSchedule.get(i).getPartList().add(pList.get(selNo-1));
				chkFlag = false;
			}
		}
		if (chkFlag) {
			Pic pic = new Pic();
			pic.setName(name);
			pic.getPartList().add(pList.get(selNo-1));
			picSchedule.add(pic);
		}
	}
	private void listPart() {
		System.out.println("<����� Ȯ��> ����� ��ȣ�� �Է��ϼ���");
		for (int i = 0; i < picSchedule.size(); i++) {
			System.out.print("NO." + (i+1) + " / ");
			picSchedule.get(i).prt();
		}
		int selNo = in.nextInt();
		in.nextLine();
		picSchedule.get(selNo-1).prt();
		picSchedule.get(selNo-1).prtSchedule();
	}
	private void menu() {
		System.out.println("1. ������ ����� ����");
		System.out.println("2. ����� �� ������ ����");
	}
}
