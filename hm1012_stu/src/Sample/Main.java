package Sample;

import java.util.Scanner;

public class Main {
	// 선언
	static Scanner in = new Scanner(System.in);
	static user[] usrInfo = new user[10]; // 회원을 저장하기 위해 자료형 타입이 user인 배열
	static String usrInput = null; // 사용자의 입력을 받기위한 변수

	// 회원 등록
	static public void addUsr() {
		System.out.print("회원등록");
		System.out.println("이름을 입력해 주십시오");
		user usr = new user(); // 새로운 회원을 받기위한 객체 선언
		usr.name = in.nextLine(); // 새로운 회원의 이름 입력
		for (int i = 0; i < usrInfo.length; i++) {
			if (usrInfo[i] != null) {
				if (usrInfo[i].name.equals(usr.name)) { // 중복된 회원을 거르기 위한 조건문
					System.out.println("중복된 회원입니다.");
					break;
				} else if (i == usrInfo.length - 1) { // 회원을 더 이상 등록할 수 없을 경우 조건문
					System.out.println("더이상 등록할 수 없습니다");
					break;
				}
			} else if (usrInfo[i] == null) { // 회원을 등록할 수 있을시 조건문
				System.out.println("나이를 입력하여 주십시오");
				usr.age = in.nextInt(); // 새로운 회원의 나이 입력
				in.nextLine(); // in.nextInt() 오류방지
				System.out.println("전화번호 뒷자리를 입력하여 주십시오");
				usr.phone = in.nextInt(); // 새로운 회원의 번호 입력
				in.nextLine(); // in.nextInt() 오류방지
				usrInfo[i] = usr; // 새로운 회원의 객체 선언된 배열에 저장
				System.out.println("저장완료!");
				break;
			}
		}
	}

	// 회원 삭제
	static public void delUsr() {
		System.out.println("삭제할 회원 이름을 입력해 주십시오");
		usrInput = in.nextLine(); // 삭제할 회원 이름 입력
		for (int i = 0; i < usrInfo.length; i++) {
			if (usrInfo[i] != null) { // .equals 오류 방지
				if (usrInput.equals(usrInfo[i].name)) { // 삭제할 회원을 찾기위한 조건문
					for (int j = i; j < usrInfo.length; j++) {
						if (j == usrInfo.length - 1) {
							usrInfo[j] = null; // 회원이 가득 찻을 경우 마지막 자리 제거
						} else {
							usrInfo[j] = usrInfo[j + 1]; // 삭제할 회원의 인덱스부터 현재 인덱스를 다음 인덱스로 덮어쓰기 (삭제)
						}
					}
					System.out.println("삭제완료!");
					break;
				} else if (i == usrInfo.length - 1) { // 회원 목록이 가득 차있고, 삭제할 회원이 없을 시 조건문
					System.out.println("해당 회원이 없습니다");
					break;
				}
			} else if (i == 0) { // 회원 목록에 등록된 회원이 없을시 조건문
				System.out.println("저장된 회원이 없습니다");
				break;
			} else if (i == usrInfo.length - 1) { // 회원 목록이 일부 차있고, 삭제할 회원이 없을 시 조건문
				System.out.println("해당 회원이 없습니다");
				break;
			}
		}
	}

	// 회원 검색
	static public void searchUsr() {
		int cnt = 0; // 회원 검색시 없을 경우를 위한 변수 선언
		System.out.println("회원 검색입니다." + "\n" + "1. 이름 검색" + "\n" + "2. 번호 검색");
		usrInput = in.nextLine(); // 겸색 종류를 선택
		if (usrInput.equals("1")) { // 이름 검색
			System.out.println("이름을 입력해 주십시오");
			usrInput = in.nextLine(); // 검색할 회원의 이름 입력
			for (int i = 0; i < usrInfo.length; i++) {
				if (usrInfo[i] != null) { // .equals 오류 방지
					if (usrInput.equals(usrInfo[i].name)) { // 검색할 회원을 이름으로 찾기위한 조건문
						System.out.println("회원번호 : " + (i + 1) + " / 이름 : " + usrInfo[i].name + " / 나이 : "
								+ usrInfo[i].age + " / 전화번호 : " + usrInfo[i].phone);
						cnt++; // 검색할 회원이 없을 경우를 위한 코드
						break; // 중복 회원은 안받기로 결정했기에 반복문 탈출
					}
				}
			}
			if (cnt == 0) { // 검색할 회원이 없을 경우
				System.out.println(usrInput + " 회원이 없습니다");
			}
		} else if (usrInput.equals("2")) { // 번호 검색
			System.out.println("번호 뒷자리를 입력해 주십시오");
			int phone = in.nextInt(); // 번호 검색을 위해 번호를 받을 변수 선언 및 입력
			in.nextLine(); // in.nextInt() 오류방지
			for (int i = 0; i < usrInfo.length; i++) {
				if (usrInfo[i] != null) { // .equals 오류 방지
					if (phone == usrInfo[i].phone) { // 검색할 회원을 번호로 찾기위한 조건문
						System.out.println("회원번호 : " + (i + 1) + " / 이름 : " + usrInfo[i].name + " / 나이 : "
								+ usrInfo[i].age + " / 전화번호 : " + usrInfo[i].phone);
						cnt++; // 검색할 회원이 없을 경우를 위한 코드
								// 동일 번호가 있을 수 있으므로 반복문 탈출 X
					}
				}
			}
			if (cnt == 0) { // 검색할 회원의 번호가 없을 경우
				System.out.println(phone + " 번호가 없습니다");
			}
		}
	}

	// 회원 수정
	static public void editUsr() {
		int cnt = 0; // 수정할 회원 검색시 없을 경우를 위한 변수 선언
		user usr = new user(); // 수정할 회원을 위한 객체 선언
		System.out.println("수정할 회원의 이름을 입력해 주십시오");
		usr.name = in.nextLine(); // 수정할 회원의 이름 입력
		for (int i = 0; i < usrInfo.length; i++) {
			if (usrInfo[i] != null) { // .equals 오류 방지
				if (usr.name.equals(usrInfo[i].name)) { // 수정할 회원을 찾기위한 조건문
					cnt++; // 수정할 회원이 없을 경우를 위한 코드
					System.out.println("해당 회원의 어떤 정보를 수정하시겠습니까?");
					System.err.println("1. 이름" + "\n" + "2. 나이" + "\n" + "3. 전화번호");
					usrInput = in.nextLine(); // 수정할 정보 선택 입력
					if (usrInput.equals("1")) { // 이름 수정
						System.out.println("수정할 이름을 입력하여 주십시오.");
						usr.name = in.nextLine(); // 수정할 이름 입력
						usrInfo[i].name = usr.name; // 수정할 이름 저장
						System.out.println("수정완료!");
						break;
					} else if (usrInput.equals("2")) {
						System.out.println("수정할 나이을 입력하여 주십시오.");
						usr.age = in.nextInt(); // 수정할 나이 입력
						in.nextLine(); // in.nextInt() 오류방지
						usrInfo[i].age = usr.age; // 수정할 나이 저장
						System.out.println("수정완료!");
						break;
					} else if (usrInput.equals("3")) {
						System.out.println("수정할 전화번호을 입력하여 주십시오.");
						usr.phone = in.nextInt(); // 수정할 번호 입력
						in.nextLine(); // in.nextInt() 오류방지
						usrInfo[i].phone = usr.phone; // 수정할 번호 저장
						System.out.println("수정완료!");
						break;
					} else {
						System.out.println("잘못 입력하셨습니다.");	// 잘못 선택했을 경우
					}
				}
			}
		}
		if (cnt == 0) {	// 수정할 회원이 없을 경우
			System.out.println("해당 회원이 없습니다");
		}
	}

	// 등록된 회원 보기
	static public void viewUsr() {
		for (int i = 0; i < usrInfo.length; i++) {
			if (usrInfo[i] != null) {
				System.out.print("회원번호 : " + (i + 1));
				usrInfo[i].viewUsr();	// user 클래스의 viewUsr메서드 활용
			} else if (i == 0) {	// 등록된 회원이 없을 경우
				System.out.println("등록된 회원이 없습니다.");
				break;
			}
		}
	}

	// 메뉴
	static public void menu() {
		System.out.println("---------------" + "\n" + "1. 회원등록" + "\n" + "2. 회원삭제" + "\n" + "3. 회원수정" + "\n" + "4. 회원검색"
				+ "\n" + "5. 회원 전체보기" + "\n" + "6. 종료" + "\n" + "---------------");
	}

	public static void main(String[] args) {
		System.out.println("회원 관리 프로그램");
		while (true) {
			menu();
			usrInput = in.nextLine();
			if (usrInput.equals("1")) {
				addUsr();
			} else if (usrInput.equals("2")) {
				delUsr();
			} else if (usrInput.equals("3")) {
				editUsr();
			} else if (usrInput.equals("4")) {
				searchUsr();
			} else if (usrInput.equals("5")) {
				viewUsr();
			} else if (usrInput.equals("6")) {
				break;
			} else {
				System.out.println("다시 선택하십시오");
			}
		}
	}
}