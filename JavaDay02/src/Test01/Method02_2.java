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

	public static void game() { // 타자 게임
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
			if (userInput.equals("x")) { // x 입력 시 게임나가기
				System.out.println(userName + "님 점수는 " + point + "점 입니다.");
				menu();
				break;
			} else {
				checkWord(); // 단어 점수 체크
			}
		}
	}

	public static void checkWord() { // 단어 점수 체크
		int cnt = 0;
		if (userInput.equals(randomWord)) {
			System.out.println("perfect! " + "+" + (word[randomNum].length() + 7) + "점!");
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
				System.out.println("good! +5점!");
				point += 5;
			} else {
				System.out.println("bad! -3점!");
				point -= 3;
			}
		}
	}

	public static void saveRank() { // 랭킹 저장
		int savePoint = 0;
		String saveUser = null;
		for (int i = 0; i < userRank.length; i++) {
			if (userName.equals(userRank[i])) { // 같은 이름의 유저가 있을 시 점수 최신화
				if (pointRank[i] < point) { // 기존 값보다 작으면 기존 값 적용
					pointRank[i] = point;
					point = 0; // 저장 후 점수초기화
					break;
				} else {
					point = 0; // 저장 후 점수초기화
					break;
				}
			} else if (userRank[i] == null) { // 새로운 유저일 시 저장
				userRank[i] = userName;
				pointRank[i] = point;
				point = 0; // 저장 후 점수초기화
				break;
			}
		}
		for (int i = 0; i < pointRank.length; i++) { // 랭킹 갱신 (포인트 순)
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

	public static void addWord() { // 사용자가 원하는 단어 추가
		check: for (;;) { // check 반복문 -> 중복된 단어 입력시 무한루프 (목록에 없는 단어로 추가)
			System.out.println("추가할 단어를 입력해 주십시오");
			userInput = in.nextLine();
			for (int i = 0; i < word.length; i++) {
				if (userInput.equals(word[i])) { // 중복 여부 체크
					System.out.println("중복된 단어입니다.");
					break;
				} else if (word[i] == null) { // 중복 아닐 시 저장
					word[i] = userInput;
					break check; // 저장 후 check 반복문 탈출
				} else if (i == word.length - 1) { // 배열이 가득 차 있을 경우, 마지막 단어 변경
					word[i] = userInput;
					break check;
				}
			}
		}
		System.out.println("저장완료!");
		System.out.println("단어목록");
		for (int i = 0; i < word.length; i++) {
			if (word[i] == null) {
				break;
			} else {
				System.out.println(word[i] + "\t\t" + (word[i].length() + 7) + "점");
			}
		}
	}
	
	public static void viewRank() { // 랭킹 전체 보기
		for (int i = 0; i < userRank.length; i++) {
			if (userRank[i] != null) {
				System.out.println((i + 1) + "등 : " + userRank[i] + "\t" + pointRank[i]);
			} else if (i == 0) {
				System.out.println("저장된 유저가 없습니다.");
				break;
			}
		}
	}

	public static void delWord() {
		check: for (;;) { // check 반복문 -> 배열에 없는 단어 입력시 무한루프 
			System.out.println("삭제할 단어를 입력해 주십시오");
			userInput = in.nextLine();
			for (int i = 0; i < word.length; i++) {
				if (userInput.equals(word[i])) { // 존재 유무 체크
					for (int j = i; j < word.length; j++) {	// 동일 단어 이후부터 재배열
						if (j == word.length - 1) {
							word[j] = null;
						} else {
							word[j] = word[j + 1];
						}
					}
					break check;
				} else if (i == word.length - 1) { // 동일 단어가 없고, 끝까지 비교했을 시
					System.out.println("해당 단어가 없습니다");
					break;
				}
			}
		}
		System.out.println("삭제완료!");
		System.out.println("단어목록");
		for (int i = 0; i < word.length; i++) {
			if (word[i] == null) {
				break;
			} else {
				System.out.println(word[i] + "\t\t" + (word[i].length() + 7) + "점");
			}
		}
	}

	public static void menu() {
		System.out.println(
				"---------------" + "\n" + "게임시작: s키" + "\n" + "나가기,종료: x키" + "\n" + "랭킹보기: r키" + "\n" + "랭킹저장: save"
						+ "\n" + "사용자 변경: c키" + "\n" + "단어추가: a" + "\n" + "단어삭제: d" + "\n" + "---------------");	}

	public static void main(String[] args) {
		System.out.println("타자게임에 오신걸 환영합니다!");
		System.out.println("(시작하려면 아무 버튼 입력)");
		in.nextLine();
		System.out.println("사용자 이름을 입력하여 주십시오.");
		userName = in.nextLine();
		System.out.println(userName + "님 환영합니다!");
		menu();
		for (;;) {
			userInput = in.nextLine();
			if (userInput.equals("x")) {
				System.out.println("게임 종료");
				break;
			} else if (userInput.equals("s")) {
				System.out.println("게임시작!");
				game();
			} else if (userInput.equals("r")) {
				System.out.println("랭킹확인");
				viewRank();
			} else if (userInput.equals("save")) {
				saveRank();
				System.out.println("저장완료");
			} else if (userInput.equals("a")) {
				addWord();
			} else if (userInput.equals("d")) {
				delWord();
			} else if (userInput.equals("c")) {
				System.out.println("새로운 이름을 입력하여 주십시오.");
				userName = in.nextLine();
				point = 0;
				System.out.println("변경 성공!");
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}
	}

}
