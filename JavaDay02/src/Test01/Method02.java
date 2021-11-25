package Test01;

import java.util.Scanner;

public class Method02 {
	/**
		 고객의 아이디를 저장하는 프로그램을 작성
		 1. 기능
		 	가. 저장,	나. 삭제,	다. 전체보는 기능
		 2. 변수 <지역변수: 메서드 안에서만 사용(영역),	전역변수: 클래스 전체에서 사용(scope)
		 	가. 배열
	 */
	
	static String[] user = new String[5];	// 선언문 : 자료형, 변수명, 초기값, 길이, scope
	static int[] user1 = new int[5];
	/**
	    자료형은 원시타입과 참조타입으로 구분
	    일반적으로 소문자가 원시타입: 처음 할당된 위치에 내가 원하는 실제 값이 있다.
	    대문자가 참조타입: 처음 할당된 위치에 실제 값이 아닌 실제값이 있는 위치가있다.
	 */
	static Scanner in = new Scanner(System.in);
	
	public static void addUser() {	// 저장 기능 메서드 정의 (선언)
		// 절차: 키보드로 입력받고, 입력받은 아이디(문자열)를 user배열 빈칸에 저장한다
		System.out.println("회원의 아이디를 입력하시오");
		String name = in.nextLine();
		// name 문자열을 배열에 저장합니다. 이때, 값이 빈공간 (user[i]==null) 이러면 빈공간
		// name 길이 조건을 만족했는지 체크
		
		// 메서드를 사용하는 이유 -> 코드의 재사용성을 높이기 위해<중복된 소스를 하나로 만들어서 공유> 
		// 코드의 재사용성을 높이면 이점 -> 유지보수나 업그레이드가 용이
		
		if (lengthTD(name) == 2) {	// 호출부 매개변수로 해석
									// lengthTD(name) == 2로 작성해도 기능의 완성 관점은 해결
			for (int i = 0; i < user.length; i++) {
				if (user[i] == null) {
					user[i] = name;
					break;
				}
			}
		}else {
			System.out.println("아이디는 8글자를 넘을 수 없습니다.");
		}
	}
	
	public static void delUser() {	// 삭제 기능 메서드 정의 (선언)
		System.out.println("회원삭제기능 <아이디로 삭제하기>");
		System.out.println("삭제할 회원의 아이디를 입력하세요");
		String deleteInputID = in.nextLine();
		// 입력받은 id와 배열의 문자열과 비교를 해야함
		for (int i = 0; i < user.length; i++) {
			if (user[i] != null) {
				if (user[i].equals(deleteInputID)) {	// .은 참조연산자인데, null은 참조할 대상이 없디
					user[i] = null;						// 때문에 예외가 발생	>>	42번 코드로 최적화
					break;
				}
			}
		}
	}
	
	public static void viewUser() {	// 전체보기 기능 메서드 정의 (선언)
		System.out.println("회원 전체보기");
		for (int i = 0; i < user.length; i++) {
			if (user[i] != null) {
				System.out.println("회원번호 : " + i + " / 회원아이디 : " + user[i]);
			}
		}
	}
	
	public static void menu() {	// 전체보기 기능 메서드 정의 (선언)
		System.out.println("1.  회원가입");
		System.out.println("2.  회원전체보기");
		System.out.println("3.  회원삭제");
	}
	
	// 아이디는 무조건 8글자 미만이어야 한다. 조건 > 메서드 처리
	public static int lengthTD(String name1) {	// 매개변수와 리턴값이 모두 있는 경우
		// void라는 것은 리턴값이 없다는 의미... 아래 코드에 리턴값이 있으므로 리턴값의 자료형을 적어준다!
		if (name1.length() >= 8) {
			return 1;	// 메서드에서 호출한 부분으로 리턴값을 줄 수 있는 경우
		}else {
			return 2;
		}
	}
	
	public static void main(String[] args) {	// 메인메서드 시작... 메인메서드가 종료되면 프로그램은 종료
		// 시작
		Scanner in = new Scanner(System.in);
		String menuSelect = null;	// 콘솔에서 키보드로 메뉴를 선택하기 위해 입력된 값을 저장하는 변수
		for ( ; ; ) {
			menu();
			menuSelect = in.nextLine();
			if (menuSelect.equals("1")) {
				addUser();	// 메뉴 선택에 따른 호출부
			}else if (menuSelect.equals("2")) {
				viewUser();	// 메뉴 선택에 따른 호출부
			}else if (menuSelect.equals("3")) {
				delUser();	// 메뉴 선택에 따른 호출부
			}else {
				
			}
		}
	}

}
