package Test01;

import java.util.Scanner;

public class Q1 {

	static Scanner in = new Scanner(System.in);
	static String[] enWords = new String[5];
	static String userInput = null;

	public static void viewWords() {
		for (int i = 0; i < enWords.length; i++) {
			if (enWords[i] != null) {
				System.out.println((i + 1) + "�� : " + enWords[i]);
			} else if (i == 0) {
				System.out.println("����� �ܾ �����ϴ�.");
				break;
			}
		}
	}

	public static void addWords() {
		check: while (true) {
			System.out.println("�߰��� �ܾ �Է��� �ֽʽÿ�");
			userInput = in.nextLine();
			for (int i = 0; i < enWords.length; i++) {
				if (enWords[i] != null) {
					if (userInput.equals(enWords[i])) {
						System.out.println("�ߺ��� �ܾ��Դϴ�.");
						break;
					}
				} else if (enWords[i] == null) {
					enWords[i] = userInput;
					break check;
				} else if (i == enWords.length - 1) {
					System.out.println("�ܾ����� ���� �����ϴ�!");
					break;
				}
			}
		}
		System.out.println("����Ϸ�!");
	}

	public static void delWords() {
		check: while (true) {
			System.out.println("������ �ܾ �Է��� �ֽʽÿ�");
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
					System.out.println("�ش� �ܾ �����ϴ�");
					break;
				}
			}
		}
		System.out.println("�����Ϸ�!");
	}

	public static void searchWords() {
		check: while (true) {
			System.out.println("�˻��� �ܾ �Է��� �ֽʽÿ�");
			userInput = in.nextLine();
			for (int i = 0; i < enWords.length; i++) {
				if (enWords[i] != null) {
					if (userInput.equals(enWords[i])) {
						System.out.println((i + 1) + "�� : " + enWords[i]);
						break check;
					}
				} else if (i == enWords.length - 1) {
					System.out.println("�ش� �ܾ �����ϴ�");
					break;
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
		while (true) {
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
