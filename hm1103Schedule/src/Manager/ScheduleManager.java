package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.Schedule;

public class ScheduleManager {
	private Scanner in = new Scanner(System.in);
	private ArrayList<Schedule> scheduleList = new ArrayList<>();
	private Special special = new Special(this);
	private Bad bad = new Bad(this);
	private PartManager part = new PartManager(this);
	private FinalManager date = new FinalManager(this);

	public ScheduleManager() { // ������
		init(); // �غ�ܰ� �޼���
		runScheduleManager(); // Ŭ���� ���� �������̽�
	}

	private void runScheduleManager() {
		boolean flag = true;
		while (flag) {
			menu();
			String selnum = in.nextLine();
			switch (selnum) {
			case "1":
				addSchedule();
				break;
			case "2":
				delSchedule();
				break;
			case "3":
				modSchedule();
				break;
			case "4":
				searchSchedule();
				break;
			case "5":
				listSchedule();
				break;
			case "6":
				goSpecial();
				break;
			case "7":
				goBad();
				break;
			case "8":
				goPart();
				break;
			case "9":
				goFinal();
				break;
			default:
				flag = false;
			}
		}
	}

	private void goFinal() {
		date.runDate();
	}

	private void goPart() {
		part.runPart();
	}

	private void goBad() {
		bad.runBad();
	}

	private void goSpecial() {
		special.runSpecial();
	}

	public ArrayList<Schedule> getScheduleList() {
		return scheduleList;
	}

	private void addSchedule() {
		Schedule newSchedule = new Schedule();
		System.out.println("������ �̸� : ");
		String name = in.nextLine();
		newSchedule.setName(name);
		System.out.println("������ ���� : ");
		String content = in.nextLine();
		newSchedule.setContent(content);
		System.out.println("������ ���� : ");
		String status = in.nextLine();
		newSchedule.setStatus(status);
		scheduleList.add(newSchedule);
	}

	private void delSchedule() {
		System.out.println("<����> ������ �̸� : ");
		String name = in.nextLine();
		for (int i = 0; i < scheduleList.size(); i++) {
			if (scheduleList.get(i).getName().equals(name)) {
				scheduleList.remove(i);
				break;
			}
		}
	}

	private void modSchedule() {
		System.out.println("<����> ������ �̸� : ");
		String name = in.nextLine();
		for (int i = 0; i < scheduleList.size(); i++) {
			if (scheduleList.get(i).getName().equals(name)) {
				System.out.println("1. �̸� ����" + "\n" + "2. ���� ����" + "\n" + "3. ���� ����");
				String selnum = in.nextLine();
				switch (selnum) {
				case "1":
					System.out.println("���ο� �̸� : ");
					String newName = in.nextLine();
					scheduleList.get(i).setName(newName);
					break;
				case "2":
					System.out.println("���ο� ���� : ");
					String newContent = in.nextLine();
					scheduleList.get(i).setContent(newContent);
					break;
				case "3":
					System.out.println("���ο� ���¸� ������");
					String[] stat = scheduleList.get(i).getStat();
					for (int j = 0; j < stat.length; j++) {
						System.out.println(stat[j] + " / ");
					}
					String newStatus = in.nextLine();
					scheduleList.get(i).setStatus(newStatus);
					break;
				default:
					System.out.println("�߸��� �����Դϴ�");
				}
			}
		}
	}

	private void searchSchedule() {
		System.out.println("<�˻�> ������ �̸� : ");
		String name = in.nextLine();
		for (int i = 0; i < scheduleList.size(); i++) {
			if (scheduleList.get(i).getName().equals(name)) {
				scheduleList.get(i).prt();
				break;
			}
		}
	}

	private void listSchedule() {
		for (int i = 0; i < scheduleList.size(); i++) {
			scheduleList.get(i).prt();
		}
	}

	private void menu() {
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ ����");
		System.out.println("3. ������ ����");
		System.out.println("4. ������ �˻�");
		System.out.println("5. ��ü����");
		System.out.println("6. Ư�� ����");
		System.out.println("7. ���� ����");
		System.out.println("8. ����� ���� ����");
		System.out.println("9. �Ϸ� ��¥ ����");
	}

	private void init() {
		System.out.println("�ý����� �غ��մϴ�.");
		System.out.println("Database���� �ڷḦ �������� ���Դϴ�");
	}
}
