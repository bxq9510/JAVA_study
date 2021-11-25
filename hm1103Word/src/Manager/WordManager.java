package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import Object.Word;
// 단어관리 클래스
public class WordManager {
	private Scanner in = new Scanner(System.in);
	private ArrayList<Word> wordList = new ArrayList<>(); // 단어저장
	public WordManager() { // 생성자
		init();	// 준비단계 메서드
		runWordManager(); // 클래스 동작 인터페이스
	}

	private void runWordManager() {
		boolean flag = true; // 프로그램 작동체크 플러그
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
		System.out.println("영어단어입력 : ");
		String engword = in.nextLine();
		newWord.setEng(engword);
		System.out.println("한글단어입력 : ");
		String korword = in.nextLine();
		newWord.setKor(korword);
		wordList.add(newWord);
	}

	private void modWord() {
		System.out.println("<수정>영어단어입력 : ");
		String engword = in.nextLine();
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).getEng().equals(engword)) {
				System.out.println("한글단어입력 : ");
				String korword = in.nextLine();
				wordList.get(i).setKor(korword);
				break;
			}
		}
	}

	private void delWord() {
		System.out.println("<삭제>영어단어입력 : ");
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
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 전체보기");
	}

	private void init() {
		System.out.println("시스템을 준비합니다.");
		System.out.println("Database에서 자료를 가져오는 중입니다");
	}
}
