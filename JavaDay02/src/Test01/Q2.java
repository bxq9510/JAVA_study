package Test01;

import java.util.Scanner;

public class Q2 {

	static Scanner in = new Scanner(System.in);
	static String[] enWords = new String[5];
	static String[] koWords = new String[5];
	static String[] badWords = { "fuc", "hh", "shit" };
	static String userInput = null;

	public static void viewWords() {
		for (int i = 0; i < enWords.length; i++) {
			if (enWords[i] != null) {
				System.out.println((i + 1) + "�� : " + enWords[i] + "\t" + koWords[i]);
			} else if (i == 0) {
				System.out.println("����� �ܾ �����ϴ�.");
				break;
			}
		}
	}

	public static void addWords() {
		check: for (;;) {
			while (true) {
				System.out.println("����� �ܾ �Է��� �ֽʽÿ�");
				userInput = in.nextLine();
				if (limitWords(userInput) == 1) {
					System.out.println("������� ��� �Ұ��մϴ�.");
				} else if (limitWords(userInput) == 2) {
					System.out.println("�α��� �̻��� �ܾ ����� �� �ֽ��ϴ�.");
				} else {
					break;
				}
			}
			for (int i = 0; i < enWords.length; i++) {
				if (enWords[i] != null) {
					if (userInput.equals(enWords[i])) {
						System.out.println("�ߺ��� �ܾ��Դϴ�.");
						break;
					}
				} else if (enWords[i] == null) {
					enWords[i] = userInput;
					System.out.println("������ ���ܾ��� �ѱ� ���� �Է��Ͻʽÿ�");
					userInput = in.nextLine();
					koWords[i] = userInput;
					break check;
				} else if (i == enWords.length - 1) {
					System.out.println("�ܾ����� ���� �����ϴ�");
					break;
				}
			}
		}
		System.out.println("����Ϸ�!");
	}

	public static int limitWords(String userInput) {
		if (userInput.length() >= 2) {
			for (int i = 0; i < badWords.length; i++) {
				if (userInput.equalsIgnoreCase(badWords[i])) {
					return 1;
				}
			}
		} else {
			return 2;
		}
		return 0;
	}

	public static void delWords() {
		check: for (;;) {
			System.out.println("������ �ܾ �Է��� �ֽʽÿ�");
			userInput = in.nextLine();
			for (int i = 0; i < enWords.length; i++) {
				if (enWords[i] != null) {
					if (userInput.equals(enWords[i])) {
						for (int j = i; j < enWords.length; j++) {
							if (j == enWords.length - 1) {
								enWords[j] = null;
								koWords[j] = null;
							} else {
								enWords[j] = enWords[j + 1];
								koWords[j] = koWords[j + 1];
							}
						}
						break check;
					}
				} else if (i == enWords.length - 1) {
					System.out.println("�ش� �ܾ �����ϴ�");
					break;
				}
			}
		}
		System.out.println("�����Ϸ�!");
	}

	public static void searchWords() {
		check: for (;;) {
			int cnt = 0;
			System.out.println("�˻��� �ܾ �Է��� �ֽʽÿ�" + "\n" + "���ĺ��� �Է��ϸ� �ش� ���ĺ����� �����ϴ� �ܾ �˻��˴ϴ�");
			userInput = in.nextLine();
			if (limitWords(userInput) == 2) {
				for (int i = 0; i < enWords.length; i++) {
					if (enWords[i] != null) {
						if (enWords[i].charAt(0) == userInput.charAt(0)) {
							System.out.println((i + 1) + "�� : " + enWords[i] + "\t" + koWords[i]);
							cnt++;
						}
					}
				}
				if (cnt == 0) {
					System.out.println(userInput + "���� �����ϴ� �ܾ �����ϴ�");
				}
			}else {
				for (int i = 0; i < enWords.length; i++) {
					if (enWords[i] != null) {
						if (userInput.equals(enWords[i])) {
							System.out.println((i + 1) + "�� : " + enWords[i] + "\t" + koWords[i]);
							break check;
						}
					} else if (i == enWords.length - 1) {
						System.out.println("�ش� �ܾ �����ϴ�");
						break;
					}
				}
			}
		}
	}

	public static void menu() {
		System.out.println("---------------" + "\n" + "�ܾ���ü����: all" + "\n" + "�ܾ�˻�: s" + "\n" + "�ܾ��߰�: a" + "\n"
				+ "�ܾ����: d" + "\n" + "������,����: xŰ" + "\n" + "---------------");
	}

	public static void main(String[] args) {
		System.out.println("����ܾ���!");
		menu();
		for (;;) {
			userInput = in.nextLine();
			if (userInput.equals("x")) {
				System.out.println("�ܾ��� ����");
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
				System.out.println("�߸��� �����Դϴ�.");
			}
		}

	}

}
