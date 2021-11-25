package Test01;

import java.util.Scanner;

public class Q1 {

	static Scanner in = new Scanner(System.in);
	static String[] enWords = new String[5];
	static String userInput = null;

	public static void viewWords() {
		for (int i = 0; i < enWords.length; i++) {
			if (enWords[i] != null) {
				System.out.println((i + 1) + "번 : " + enWords[i]);
			} else if (i == 0) {
				System.out.println("저장된 단어가 없습니다.");
				break;
			}
		}
	}

	public static void addWords() {
		check: while (true) {
			System.out.println("추가할 단어를 입력해 주십시오");
			userInput = in.nextLine();
			for (int i = 0; i < enWords.length; i++) {
				if (enWords[i] != null) {
					if (userInput.equals(enWords[i])) {
						System.out.println("중복된 단어입니다.");
						break;
					}
				} else if (enWords[i] == null) {
					enWords[i] = userInput;
					break check;
				} else if (i == enWords.length - 1) {
					System.out.println("단어장이 가득 찻습니다!");
					break;
				}
			}
		}
		System.out.println("저장완료!");
	}

	public static void delWords() {
		check: while (true) {
			System.out.println("삭제할 단어를 입력해 주십시오");
			userInput = in.nextLine();
			for (int i = 0; i < enWords.length; i++) {
				if (enWords[i] != null) {
					if (userInput.equals(enWords[i])) {
						for (int j = i; j < enWords.length; j++) {
							if (j == enWords.length - 1) {
								enWords[j] = null;
							} else {
								enWords[j] = enWords[j + 1];
							}
						}
						break check;
					}
				} else if (i == enWords.length - 1) {
					System.out.println("해당 단어가 없습니다");
					break;
				}
			}
		}
		System.out.println("삭제완료!");
	}

	public static void searchWords() {
		check: while (true) {
			System.out.println("검색할 단어를 입력해 주십시오");
			userInput = in.nextLine();
			for (int i = 0; i < enWords.length; i++) {
				if (enWords[i] != null) {
					if (userInput.equals(enWords[i])) {
						System.out.println((i + 1) + "번 : " + enWords[i]);
						break check;
					}
				} else if (i == enWords.length - 1) {
					System.out.println("해당 단어가 없습니다");
					break;
				}
			}
		}
	}

	public static void menu() {
		System.out.println("---------------" + "\n" + "단어전체보기: all" + "\n" + "단어검색: s" + "\n" + "단어추가: a" + "\n"
				+ "단어삭제: d" + "\n" + "나가기,종료: x키" + "\n" + "---------------");
	}

	public static void main(String[] args) {
		System.out.println("영어단어장!");
		menu();
		while (true) {
			userInput = in.nextLine();
			if (userInput.equals("x")) {
				System.out.println("단어장 종료");
				break;
			} else if (userInput.equals("all")) {
				viewWords();
			} else if (userInput.equals("s")) {
				searchWords();
			} else if (userInput.equals("a")) {
				addWords();
			} else if (userInput.equals("d")) {
				delWords();
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}

	}

}
