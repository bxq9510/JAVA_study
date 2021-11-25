package Test01;

import java.util.Random;
import java.util.Scanner;

public class Method02_2 {

	static Scanner in = new Scanner(System.in);
	static Random r = new Random();
	static String[] userRank = new String[10];
	static int[] pointRank = new int[10];
	static String userName = null;
	static String userInput = null;
	static String randomWord = null;
	static int point = 0;
	static int randomNum = 0;
	static String[] word = { "mom", "baby", "apple", "banana", "austria", "maple", null, null, null };
	static int[] wordFlag = new int[word.length];

	public static void game() { // Ÿ�� ����
		int cnt = 0;
		for (;;) {
			randomNum = r.nextInt(word.length);
			for (;;) {
				if (word[randomNum] == null) {
					randomNum = r.nextInt(word.length);
				} else if(wordFlag[randomNum] == 0) {
					wordFlag[randomNum] = 1;
					cnt++;
					break;
				}else {
					randomNum = r.nextInt(word.length);
				}
			}
			randomWord = word[randomNum];
			System.out.println(randomWord);
			userInput = in.nextLine();
			if (userInput.equals("x")) { // x �Է� �� ���ӳ�����
				System.out.println(userName + "�� ������ " + point + "�� �Դϴ�.");
				menu();
				break;
			} else {
				checkWord(); // �ܾ� ���� üũ
			}
		}
	}

	public static void checkWord() { // �ܾ� ���� üũ
		int cnt = 0;
		if (userInput.equals(randomWord)) {
			System.out.println("perfect! " + "+" + (word[randomNum].length() + 7) + "��!");
			point += word[randomNum].length() + 7;
		} else {
			for (int i = 0; i < randomWord.length(); i++) {
				if (i == userInput.length()) {
					break;
				} else if (randomWord.charAt(i) == userInput.charAt(i)) {
					cnt++;
				}
			}
			if (cnt > randomWord.length() / 2) {
				System.out.println("good! +5��!");
				point += 5;
			} else {
				System.out.println("bad! -3��!");
				point -= 3;
			}
		}
	}

	public static void saveRank() { // ��ŷ ����
		int savePoint = 0;
		String saveUser = null;
		for (int i = 0; i < userRank.length; i++) {
			if (userName.equals(userRank[i])) { // ���� �̸��� ������ ���� �� ���� �ֽ�ȭ
				if (pointRank[i] < point) { // ���� ������ ������ ���� �� ����
					pointRank[i] = point;
					point = 0; // ���� �� �����ʱ�ȭ
					break;
				} else {
					point = 0; // ���� �� �����ʱ�ȭ
					break;
				}
			} else if (userRank[i] == null) { // ���ο� ������ �� ����
				userRank[i] = userName;
				pointRank[i] = point;
				point = 0; // ���� �� �����ʱ�ȭ
				break;
			}
		}
		for (int i = 0; i < pointRank.length; i++) { // ��ŷ ���� (����Ʈ ��)
			for (int j = 0; j < i; j++) {
				if (pointRank[j] < pointRank[i]) {
					savePoint = pointRank[j];
					pointRank[j] = pointRank[i];
					pointRank[i] = savePoint;
					saveUser = userRank[j];
					userRank[j] = userRank[i];
					userRank[i] = saveUser;
				}
			}
		}
	}

	public static void addWord() { // ����ڰ� ���ϴ� �ܾ� �߰�
		check: for (;;) { // check �ݺ��� -> �ߺ��� �ܾ� �Է½� ���ѷ��� (��Ͽ� ���� �ܾ�� �߰�)
			System.out.println("�߰��� �ܾ �Է��� �ֽʽÿ�");
			userInput = in.nextLine();
			for (int i = 0; i < word.length; i++) {
				if (userInput.equals(word[i])) { // �ߺ� ���� üũ
					System.out.println("�ߺ��� �ܾ��Դϴ�.");
					break;
				} else if (word[i] == null) { // �ߺ� �ƴ� �� ����
					word[i] = userInput;
					break check; // ���� �� check �ݺ��� Ż��
				} else if (i == word.length - 1) { // �迭�� ���� �� ���� ���, ������ �ܾ� ����
					word[i] = userInput;
					break check;
				}
			}
		}
		System.out.println("����Ϸ�!");
		System.out.println("�ܾ���");
		for (int i = 0; i < word.length; i++) {
			if (word[i] == null) {
				break;
			} else {
				System.out.println(word[i] + "\t\t" + (word[i].length() + 7) + "��");
			}
		}
	}
	
	public static void viewRank() { // ��ŷ ��ü ����
		for (int i = 0; i < userRank.length; i++) {
			if (userRank[i] != null) {
				System.out.println((i + 1) + "�� : " + userRank[i] + "\t" + pointRank[i]);
			} else if (i == 0) {
				System.out.println("����� ������ �����ϴ�.");
				break;
			}
		}
	}

	public static void delWord() {
		check: for (;;) { // check �ݺ��� -> �迭�� ���� �ܾ� �Է½� ���ѷ��� 
			System.out.println("������ �ܾ �Է��� �ֽʽÿ�");
			userInput = in.nextLine();
			for (int i = 0; i < word.length; i++) {
				if (userInput.equals(word[i])) { // ���� ���� üũ
					for (int j = i; j < word.length; j++) {	// ���� �ܾ� ���ĺ��� ��迭
						if (j == word.length - 1) {
							word[j] = null;
						} else {
							word[j] = word[j + 1];
						}
					}
					break check;
				} else if (i == word.length - 1) { // ���� �ܾ ����, ������ ������ ��
					System.out.println("�ش� �ܾ �����ϴ�");
					break;
				}
			}
		}
		System.out.println("�����Ϸ�!");
		System.out.println("�ܾ���");
		for (int i = 0; i < word.length; i++) {
			if (word[i] == null) {
				break;
			} else {
				System.out.println(word[i] + "\t\t" + (word[i].length() + 7) + "��");
			}
		}
	}

	public static void menu() {
		System.out.println(
				"---------------" + "\n" + "���ӽ���: sŰ" + "\n" + "������,����: xŰ" + "\n" + "��ŷ����: rŰ" + "\n" + "��ŷ����: save"
						+ "\n" + "����� ����: cŰ" + "\n" + "�ܾ��߰�: a" + "\n" + "�ܾ����: d" + "\n" + "---------------");	}

	public static void main(String[] args) {
		System.out.println("Ÿ�ڰ��ӿ� ���Ű� ȯ���մϴ�!");
		System.out.println("(�����Ϸ��� �ƹ� ��ư �Է�)");
		in.nextLine();
		System.out.println("����� �̸��� �Է��Ͽ� �ֽʽÿ�.");
		userName = in.nextLine();
		System.out.println(userName + "�� ȯ���մϴ�!");
		menu();
		for (;;) {
			userInput = in.nextLine();
			if (userInput.equals("x")) {
				System.out.println("���� ����");
				break;
			} else if (userInput.equals("s")) {
				System.out.println("���ӽ���!");
				game();
			} else if (userInput.equals("r")) {
				System.out.println("��ŷȮ��");
				viewRank();
			} else if (userInput.equals("save")) {
				saveRank();
				System.out.println("����Ϸ�");
			} else if (userInput.equals("a")) {
				addWord();
			} else if (userInput.equals("d")) {
				delWord();
			} else if (userInput.equals("c")) {
				System.out.println("���ο� �̸��� �Է��Ͽ� �ֽʽÿ�.");
				userName = in.nextLine();
				point = 0;
				System.out.println("���� ����!");
			} else {
				System.out.println("�߸��� �����Դϴ�.");
			}
		}
	}

}
