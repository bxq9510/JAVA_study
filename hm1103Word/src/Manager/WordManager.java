package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import Object.Word;
// �ܾ���� Ŭ����
public class WordManager {
	private Scanner in = new Scanner(System.in);
	private ArrayList<Word> wordList = new ArrayList<>(); // �ܾ�����
	public WordManager() { // ������
		init();	// �غ�ܰ� �޼���
		runWordManager(); // Ŭ���� ���� �������̽�
	}

	private void runWordManager() {
		boolean flag = true; // ���α׷� �۵�üũ �÷���
		while(flag) {
			menu();
			String selnum = in.nextLine();
			switch(selnum) {
			case "1": addWord(); break;
			case "2": modWord(); break;
			case "3": delWord(); break;
			case "4": listWord(); break;
			default: flag=false;
			}
		}
	}

	private void addWord() {
		Word newWord = new Word();
		System.out.println("����ܾ��Է� : ");
		String engword = in.nextLine();
		newWord.setEng(engword);
		System.out.println("�ѱ۴ܾ��Է� : ");
		String korword = in.nextLine();
		newWord.setKor(korword);
		wordList.add(newWord);
	}

	private void modWord() {
		System.out.println("<����>����ܾ��Է� : ");
		String engword = in.nextLine();
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).getEng().equals(engword)) {
				System.out.println("�ѱ۴ܾ��Է� : ");
				String korword = in.nextLine();
				wordList.get(i).setKor(korword);
				break;
			}
		}
	}

	private void delWord() {
		System.out.println("<����>����ܾ��Է� : ");
		String engword = in.nextLine();
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).getEng().equals(engword)) {
				wordList.remove(i);
				break;
			}
		}
	}

	private void listWord() {
		for (int i = 0; i < wordList.size(); i++) {
			wordList.get(i).prt();
		}
	}

	private void menu() {
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ��ü����");
	}

	private void init() {
		System.out.println("�ý����� �غ��մϴ�.");
		System.out.println("Database���� �ڷḦ �������� ���Դϴ�");
	}
}
