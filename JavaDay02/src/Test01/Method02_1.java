package Test01;

import java.util.Scanner;

public class Method02_1 {
	static String[] fruit = new String[10];
	static Scanner in = new Scanner(System.in);
	static String specialWord = "!@#$%^&*";
	public static void addFruit() {		// 과일등록
		System.out.println("추가할 과일을 입력하시오.");
		String addName = in.nextLine();
		if (checkFruit(addName) == 1) {
			if (overlapFruit(addName) == 2) {
				for (int k = 0; k < fruit.length; k++) {
					if (fruit[k] == null) {
						fruit[k] = addName;
						break;
					}
				}
			} else {
				System.out.println("중복된 과일입니다.");
			}
		} else {
			System.out.println("과일 이름에 특수문자가 들어가야합니다.");
		}
	}
	public static int overlapFruit(String addName) {	 // 과일명 중복체크
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i] != null) {
				if (fruit[i].equals(addName)) {
					return 1;
				}
			}
		}
		return 2;
	}
	public static int checkFruit(String addName) {		// 과일명 특수기호 체크
		for (int i = 0; i < specialWord.length(); i++) {
			for (int j = 0; j < addName.length(); j++) {
				if (addName.charAt(j) == specialWord.charAt(i)) {
					return 1;
				}
			}
		}
		return 2;
	}
	public static void delFruit() {		// 과일삭제
		System.out.println("삭제할 과일을 입력하시오.");
		String delName = in.nextLine();
		if (overlapFruit(delName) == 2) {		// 해당 과일 존재여부 체크
			for (int i = 0; i < fruit.length; i++) {
				if (fruit[i] != null) {
					if (fruit[i].equals(delName)) {
						fruit[i] = null;
						System.out.println("삭제되었습니다.");
					}
				}
			}
		} else {
			System.out.println("해당 과일이 없습니다.");
		}
	}
	public static void viewFruit() {	// 과일 전체보기
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i] != null) {
				System.out.println("과일" + i + "번 : " + fruit[i]);
			} else if (i == 0) {
				System.out.println("저장된 과일이 없습니다.");
				break;
			}
		}
	}
	public static void editFruit() {	// 과일수정
		System.out.println("수정할 과일을 입력하시오.");
		String editName = in.nextLine();
		if (overlapFruit(editName) == 2) {		// 해당 과일 존재여부 체크
			for (int i = 0; i < fruit.length; i++) {
				if (fruit[i] != null) {
					if (fruit[i].equals(editName)) {
						System.out.println("새로운 과일을 입력하시오.");
						String newName = in.nextLine();
						if (checkFruit(newName) == 2) {		// 새로운 과일이름 특수기호 체크
							fruit[i] = newName;
							System.out.println("수정되었습니다.");
						}else {
							System.out.println("과일 이름에 특수문자가 들어가야 합니다.");
						}
						break;
					}
				}
			}
		} else {
			System.out.println("해당 과일이 없습니다.");
		}
	}
	public static void searchFruit() {		// 과일검색
		System.out.println("검색할 과일을 입력하시오.");
		String searchName = in.nextLine();
		if (overlapFruit(searchName) == 2) {		// 해당 과일 존재여부 체크
			for (int i = 0; i < fruit.length; i++) {
				if (fruit[i] != null) {
					if (fruit[i].equals(searchName)) {
						System.out.println(searchName + "의 번호는 " + i + "번 입니다.");
						break;
					}
				}
			}
		} else {
			System.out.println("해당 과일이 없습니다.");
		}
	}
	public static void menu() {
		System.out.println("1. 과일등록");
		System.out.println("2. 과일삭제");
		System.out.println("3. 과일수정");
		System.out.println("4. 과일전체보기");
		System.out.println("5. 과일검색");
	}
	public static void main(String[] args) {
		String menuSelect = null;
		for (;;) {
			menu();
			menuSelect = in.nextLine();
			if (menuSelect.equals("1")) {
				addFruit();
			} else if (menuSelect.equals("2")) {
				delFruit();
			} else if (menuSelect.equals("3")) {
				editFruit();
			} else if (menuSelect.equals("4")) {
				viewFruit();
			} else if (menuSelect.equals("5")) {
				searchFruit();
			} else {
				System.out.println("다시 선택하십시오.");
			}
		}
	}
}
