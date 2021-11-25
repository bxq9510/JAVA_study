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
		System.out.println(id + "님 환영합니다!");
		System.out.println("1.수강신청" + "\n" + "2.장바구니" + "\n" + "3.로그아웃");
		while (true) {
			String usrInput = in.nextLine();
			if (usrInput.equals("1")) {
				classRegist();
			} else if (usrInput.equals("2")) {
				viewClass();
			} else if (usrInput.equals("3")) {
				System.out.println("로그아웃!");
				break;
			} else {
				System.out.println("다시 선택하여 주십시오");
			}
		}
	}

	public void classRegist() {
		System.out.println("수강신청입니다");
		for (int i = 0; i < slist.size(); i++) {
			System.out.print((i+1) + "번 : ");
			slist.get(i).viewSub();
		}
		System.out.println();
		System.out.println("수강할 과목의 번호를 하나씩 입력하여 주십시오" + "\n" + "0 누르면 종료");
		while (true) {
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum <= slist.size()) {
				if (selNum == 0) {
					System.out.println("수강신청 종료!");
					break;
				}else {
					myClass.add(slist.get(selNum-1));
					System.out.println(slist.get(selNum-1).subName + " 과목 신청하였습니다");
				}
			}else {
				System.out.println("다시 선택하여 주십시오");
			}
		}
	}
	
	public void viewMem() {
		System.out.println(" / id: " + id + " / pw: " + pw);
	}

	public void viewClass() {
		System.out.println("신청과목");
		for (int i = 0; i < myClass.size(); i++) {
			myClass.get(i).viewSub();
		}
	}
}
