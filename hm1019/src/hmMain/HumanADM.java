package hmMain;

import java.util.ArrayList;
import java.util.Scanner;

// 수강생 관리, 등록, 수정, 삭제, 검색
public class HumanADM {
	// 퀴즈1. 클래스 구조를 가진 객체가 생성될때 호출되는 메서드 이름은? 생성자
	// 생성자는 생략이 되어있는 상태 (빈 생성자가 생략됨)
	ArrayList<HumanUser> members = new ArrayList<>(); // ArrayList 객체
	ArrayList<SubjectList> subjectList = new ArrayList<>();
//	자료형			   참조변수		객체생성
	Scanner in = new Scanner(System.in);
	String usrInput = null;
	HumanUser loginUser = null;

	HumanADM() { // 생성자
		System.out.println("휴먼교육센터 수강생 관리 프로그램");
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
				System.out.println("다시 선택하여 주십시오");
			}
		}
	}

	private void subEdit() {
		System.out.println("과목 관리입니다");
		System.out.println("1.과목 등록" + "\n" + "2.과목 전체보기" + "\n" + "3.종료");
		while (true) {
			String usrInput = in.nextLine();
			if (usrInput.equals("1")) {
				addSub();
			} else if (usrInput.equals("2")) {
				viewSub();
			} else if (usrInput.equals("3")) {
				System.out.println("과목관리 종료!");
				break;
			} else {
				System.out.println("다시 선택하여 주십시오");
			}
		}
	}

	private void addSub() {
		System.out.println("과목 등록");
		System.out.println("과목명을 입력하십시오");
		SubjectList subject = new SubjectList();
		subject.subName = in.nextLine();
		System.out.println("담당 선생님을 입력하십시오");
		subject.teacher = in.nextLine();
		System.out.println("강의실 정보를 입력하십시오");
		subject.classroom = in.nextLine();
		subjectList.add(subject);
		System.out.println("등록완료!");
	}

	private void viewSub() {
		for (int i = 0; i < subjectList.size(); i++) {
			System.out.print((i + 1) + "번");
			subjectList.get(i).viewSub();
		}
	}

	private void login() {
		System.out.println("로그인 입니다");
		System.out.println("아이디를 입력하여 주십시오");
		HumanUser member = new HumanUser(subjectList);
		member.id = in.nextLine();
		System.out.println("비밀번호를 입력하여 주십시오");
		member.pw = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).id.equals(member.id)) {
				if (members.get(i).pw.equals(member.pw)) {
					chkFlag = false;
					System.out.println("로그인 성공!");
					loginUser = members.get(i);
					loginUser.afterLogin();
				} else {
					System.out.println("비밀번호가 틀렸습니다");
				}
			}
		}
		if (chkFlag = true) {
			System.out.println("아이디가 틀렸습니다");
		}
	}

	private void addMember() {
		System.out.println("수강생 등록");
		System.out.println("아이디를 입력하십시오");
		HumanUser member = new HumanUser(subjectList);
		member.id = in.nextLine();
		System.out.println("비밀번호를 입력하십시오");
		member.pw = in.nextLine();
		members.add(member);
		System.out.println("등록완료!");
	}

	private void delMember() {
		System.out.println("수강생 삭제");
		System.out.println("삭제할 아이디를 입력하십시오");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).id.contains(usrInput)) {
				members.remove(i);
				System.out.println("삭제완료!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag = true) {
			System.out.println("헤당 아이디가 없습니다");
		}
	}

	private void searchMember() {
		System.out.println("수강생 검색");
		System.out.println("검색할 아이디를 입력하십시오");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).id.contains(usrInput)) {
				System.out.print((i + 1) + "번");
				members.get(i).viewMem();
				System.out.println("검색완료!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag = true) {
			System.out.println("헤당 아이디가 없습니다");
		}
	}

	private void editMember() {
		System.out.println("비밀번호 수정");
		System.out.println("수정할 아이디를 입력하십시오");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).id.contains(usrInput)) {
				System.out.println("새로운 비밀번호를 입력하십시오");
				members.get(i).pw = in.nextLine();
				System.out.println("수정완료!");
				chkFlag = false;
			}
		}
		if (chkFlag = true) {
			System.out.println("헤당 아이디가 없습니다");
		}
	}

	private void viewMember() {
		for (int i = 0; i < members.size(); i++) {
			System.out.print((i + 1) + "번");
			members.get(i).viewMem();
		}
	}

	private void menu() {
		System.out.println("1.등록" + "\n" + "2.삭제(id삭제)" + "\n" + "3.검색(id검색)" + "\n" + "4.전체보기" + "\n" + "5.비밀번호 수정"
				+ "\n" + "6.로그인" + "\n" + "7.과목관리" + "\n" + "8.프로그램 종료");
	}

}
