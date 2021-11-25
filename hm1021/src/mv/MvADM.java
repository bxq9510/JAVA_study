package mv;

import java.util.ArrayList;
import java.util.Scanner;

public class MvADM {
	ArrayList<MvUser> usrInfo = new ArrayList<>(); // 자료형 타입 MvUser인 ArrayList (회원저장)
	ArrayList<MovieList> mvList = new ArrayList<>(); // 자료형 타입 MovieList인 ArrayList (영화저장)
	ArrayList<FoodList> fdList = new ArrayList<>(); // 자료형 타입 FoodList인 ArrayList (음식저장)
	Scanner in = new Scanner(System.in); // 스케너
	String usrInput = null; // 사용자 입력을 받기 위한 변수
	MvUser loginUser = null; // 로그인 정보 저장

	MvADM() { // 생성자
		System.out.println("영화 예매 프로그램");
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
				System.out.println("다시 선택하여 주십시오");
			}
		}
	}

	// 로그인
	private void login() {
		System.out.println("로그인 입니다");
		System.out.println("아이디를 입력하여 주십시오");
		MvUser usr = new MvUser(mvList, fdList);
		usr.id = in.nextLine();
		System.out.println("비밀번호를 입력하여 주십시오");
		usr.pw = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < usrInfo.size(); i++) {
			if (usrInfo.get(i).id.equals(usr.id)) {
				if (usrInfo.get(i).pw.equals(usr.pw)) {
					chkFlag = false;
					System.out.println("로그인 성공!");
					loginUser = usrInfo.get(i);
					loginUser.afterLogin();
				} else {
					System.out.println("비밀번호가 틀렸습니다");
					chkFlag = false;
				}
			}
		}
		if (chkFlag) {
			System.out.println("아이디가 틀렸습니다");
		}
	}

	// 관리자페이지
	private void admMv() {
		System.out.println("관리자 페이지입니다");
		System.out.println("1.영화 관리" + "\n" + "2.음식 관리");
		usrInput = in.nextLine();
		chk: while (true) {
			if (usrInput.equals("1")) {
				System.out.println("1.영화 등록" + "\n" + "2.영화 삭제" + 
									"\n" + "3.영화 전체보기" + "\n" + "4.종료");
				while (true) {
					usrInput = in.nextLine();
					if (usrInput.equals("1")) {
						addMv();
					} else if (usrInput.equals("2")) {
						delMv();
					} else if (usrInput.equals("3")) {
						viewMv();
					} else if (usrInput.equals("4")) {
						System.out.println("영화 관리 종료!");
						break chk;
					} else {
						System.out.println("다시 선택하십시오");
					}
				}
			} else if (usrInput.equals("2")) {
				System.out.println("1.음식 등록" + "\n" + "2.음식 삭제" + 
									"\n" + "3.음식 전체보기" + "\n" + "4.종료");
				while (true) {
					String usrInput = in.nextLine();
					if (usrInput.equals("1")) {
						addFd();
					} else if (usrInput.equals("2")) {
						delFd();
					} else if (usrInput.equals("3")) {
						viewFd();
					} else if (usrInput.equals("4")) {
						System.out.println("음식 관리 종료!");
						break chk;
					} else {
						System.out.println("다시 선택하십시오");
					}
				}
			} else {
				System.out.println("다시 선택하십시오");
			}
		}
	}

	// 영화 등록
	private void addMv() {
		System.out.println("영화 등록");
		System.out.println("영화 이름을 입력하십시오");
		MovieList mv = new MovieList();
		mv.movieName = in.nextLine();
		System.out.println("상영관을 입력하십시오");
		mv.roomName = in.nextLine();
		System.out.println("좌석 수를 입력하십시오");
		mv.seat = in.nextInt();
		in.nextLine();
		for (int i = 0; i < mv.seat; i++) {
			mv.seats.add(0);
		}
		mvList.add(mv);
		System.out.println("등록완료!");
	}
	// 영화 삭제
	private void delMv() {
		System.out.println("영화 삭제");
		System.out.println("삭제할 영화명을 입력하십시오");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < mvList.size(); i++) {
			if (mvList.get(i).movieName.equals(usrInput)) {
				mvList.remove(i);
				System.out.println("삭제완료!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("헤당 영화 없습니다");
		}
	}
	// 영화 전체보기
	private void viewMv() {
		for (int i = 0; i < mvList.size(); i++) {
			System.out.print((i + 1) + "번");
			mvList.get(i).viewMv();
		}
	}

	// 음식 등록
	private void addFd() {
		System.out.println("음식 등록");
		System.out.println("음식 이름을 입력하십시오");
		FoodList fd = new FoodList();
		fd.foodName = in.nextLine();
		System.out.println("가격을 입력하십시오");
		fd.foodPrice = in.nextInt();
		in.nextLine();
		System.out.println("수량을 입력하십시오");
		fd.foodQuantity = in.nextInt();
		in.nextLine();
		fdList.add(fd);
		System.out.println("등록완료!");
	}
	// 음식 삭제
	private void delFd() {
		System.out.println("음식 삭제");
		System.out.println("삭제할 음식명을 입력하십시오");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < fdList.size(); i++) {
			if (fdList.get(i).foodName.equals(usrInput)) {
				fdList.remove(i);
				System.out.println("삭제완료!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("헤당 음식이 없습니다");
		}
	}
	// 음식 전체보기
	private void viewFd() {
		for (int i = 0; i < fdList.size(); i++) {
			System.out.print((i + 1) + "번");
			fdList.get(i).viewFd();
		}
	}

	// 사용자 등록
	private void addUsr() {
		System.out.println("사용자 등록");
		System.out.println("아이디를 입력하십시오");
		MvUser usr = new MvUser(mvList, fdList);
		usr.id = in.nextLine();
		System.out.println("비밀번호를 입력하십시오");
		usr.pw = in.nextLine();
		usrInfo.add(usr);
		System.out.println("등록완료!");
	}
	// 사용자 삭제
	private void delUsr() {
		System.out.println("사용자 삭제");
		System.out.println("삭제할 아이디를 입력하십시오");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < usrInfo.size(); i++) {
			if (usrInfo.get(i).id.equals(usrInput)) {
				usrInfo.remove(i);
				System.out.println("삭제완료!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("헤당 아이디가 없습니다");
		}
	}
	
	// 사용자 검색
	private void searchUsr() {
		System.out.println("사용자 검색");
		System.out.println("검색할 아이디를 입력하십시오");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < usrInfo.size(); i++) {
			if (usrInfo.get(i).id.equals(usrInput)) {
				System.out.print((i + 1) + "번");
				usrInfo.get(i).viewMem();
				System.out.println("검색완료!");
				chkFlag = false;
				break;
			}
		}
		if (chkFlag) {
			System.out.println("헤당 아이디가 없습니다");
		}
	}
	// 사용자 수정
	private void editUsr() {
		System.out.println("비밀번호 수정");
		System.out.println("수정할 아이디를 입력하십시오");
		usrInput = in.nextLine();
		boolean chkFlag = true;
		for (int i = 0; i < usrInfo.size(); i++) {
			if (usrInfo.get(i).id.equals(usrInput)) {
				System.out.println("새로운 비밀번호를 입력하십시오");
				usrInfo.get(i).pw = in.nextLine();
				System.out.println("수정완료!");
				chkFlag = false;
			}
		}
		if (chkFlag) {
			System.out.println("헤당 아이디가 없습니다");
		}
	}

	// 사용자 전체보기
	private void viewUsr() {
		for (int i = 0; i < usrInfo.size(); i++) {
			System.out.print((i + 1) + "번");
			usrInfo.get(i).viewMem();
		}
	}

	// 메뉴
	private void menu() {
		System.out.println("1. 사용자 등록" + "\n" + "2. 사용자 삭제" + "\n" + "3. 사용자 검색" + "\n" + "4. 전체보기" + "\n" + "5. 비밀번호 수정"
				+ "\n" + "6. 사용자 로그인" + "\n" + "7. 관리자 페이지" + "\n" + "8. 프로그램 종료");
	}
}
