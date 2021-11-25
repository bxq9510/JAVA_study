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

	public ScheduleManager() { // 생성자
		init(); // 준비단계 메서드
		runScheduleManager(); // 클래스 동작 인터페이스
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
		System.out.println("스케줄 이름 : ");
		String name = in.nextLine();
		newSchedule.setName(name);
		System.out.println("스케줄 내용 : ");
		String content = in.nextLine();
		newSchedule.setContent(content);
		System.out.println("스케줄 상태 : ");
		String status = in.nextLine();
		newSchedule.setStatus(status);
		scheduleList.add(newSchedule);
	}

	private void delSchedule() {
		System.out.println("<삭제> 스케줄 이름 : ");
		String name = in.nextLine();
		for (int i = 0; i < scheduleList.size(); i++) {
			if (scheduleList.get(i).getName().equals(name)) {
				scheduleList.remove(i);
				break;
			}
		}
	}

	private void modSchedule() {
		System.out.println("<수정> 스케줄 이름 : ");
		String name = in.nextLine();
		for (int i = 0; i < scheduleList.size(); i++) {
			if (scheduleList.get(i).getName().equals(name)) {
				System.out.println("1. 이름 수정" + "\n" + "2. 내용 수정" + "\n" + "3. 상태 변경");
				String selnum = in.nextLine();
				switch (selnum) {
				case "1":
					System.out.println("새로운 이름 : ");
					String newName = in.nextLine();
					scheduleList.get(i).setName(newName);
					break;
				case "2":
					System.out.println("새로운 내용 : ");
					String newContent = in.nextLine();
					scheduleList.get(i).setContent(newContent);
					break;
				case "3":
					System.out.println("새로운 상태를 고르세요");
					String[] stat = scheduleList.get(i).getStat();
					for (int j = 0; j < stat.length; j++) {
						System.out.println(stat[j] + " / ");
					}
					String newStatus = in.nextLine();
					scheduleList.get(i).setStatus(newStatus);
					break;
				default:
					System.out.println("잘못된 선택입니다");
				}
			}
		}
	}

	private void searchSchedule() {
		System.out.println("<검색> 스케줄 이름 : ");
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
		System.out.println("1. 스케줄 입력");
		System.out.println("2. 스케줄 삭제");
		System.out.println("3. 스케줄 수정");
		System.out.println("4. 스케줄 검색");
		System.out.println("5. 전체보기");
		System.out.println("6. 특별 관리");
		System.out.println("7. 나쁜 관리");
		System.out.println("8. 담당자 지정 관리");
		System.out.println("9. 완료 날짜 설정");
	}

	private void init() {
		System.out.println("시스템을 준비합니다.");
		System.out.println("Database에서 자료를 가져오는 중입니다");
	}
}
