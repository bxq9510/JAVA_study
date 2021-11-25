package Test01;

import java.util.Random;

public class Test04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번
		System.out.println("1번----------------");
		Random r1 = new Random();
		int Q1[] = new int[10];
		for (int i = 0; i < Q1.length; i++) {
			Q1[i] = r1.nextInt(31);
			if (Q1[i] % 2 != 0) {
				i--;
			}
		}
		for (int i = 0; i < Q1.length; i++) {
			System.out.print(Q1[i] + " ");
		}

		// 2번
		System.out.println("\n" + "2번----------------");
		Random r2 = new Random();
		int rdm = 0;
		int cnt[] = new int[45];
		int index[] = new int[45];
		int saveCnt = 0;
		int saveIndex = 0;
		for (int i = 0; i < 1000; i++) {		// 랜덤수 1000개 뽑기
			rdm = r2.nextInt(45) +1;
			for (int j = 0; j < cnt.length; j++) {	// 1 - 45 중복 카운트
				if (rdm == j+1) {
					cnt[j] += 1;
				}
			}
		}
		for (int i = 0; i < cnt.length; i++) {
			index[i] = i+1;					// 카운트 인덱스값 설정
			for (int j = 0; j < i; j++) {
				if (cnt[j] < cnt[i]) {		// 카운트, 인덱스 내림차순 정렬
					saveCnt = cnt[i];
					cnt[i] = cnt[j];
					cnt[j] = saveCnt;
					saveIndex = index[i];
					index[i] = index[j];
					index[j] = saveIndex;
				} else if (cnt[j] == cnt[i] && index[j] > index[i]) {	// 인덱스 조건에 따라 정렬
					saveCnt = cnt[i];
					cnt[i] = cnt[j];
					cnt[j] = saveCnt;
					saveIndex = index[i];
					index[i] = index[j];
					index[j] = saveIndex;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(index[i] + " ");
		}

		// 3-1번
		System.out.println("\n" + "3번----------------");
		Random r3 = new Random();
		int[] lotto = new int[46];
		int saveLotto = 0;
		int saveNum = 0;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i;
		}
		for (int i = 1; i < lotto.length; i++) {
			saveNum = r3.nextInt(45) + 1;
			saveLotto = lotto[i];
			lotto[i] = saveNum;
			lotto[saveNum] = saveLotto;
		}
		for (int i = 1; i < 7; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		// 3-2번
		/**
		Random r3 = new Random();
		int[] lotto = new int[46];
		int[] rdm3 = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i;
		}
		for (int i = 0; i < 6; i++) {
			rdm3[i] = r3.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if (rdm3[i] == rdm[j]) {
					i--;
				}
			}
			System.out.print(lotto[rdm[i]] + " ");
		}
		 */

		// 4번
		System.out.println("\n" + "4번----------------");
		int[] animal = { 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		int obsIndex = 0;
		int aniIndex = 0;
		for (int i = 0; i < animal.length; i++) {
			if (animal[i] == 1) {
				aniIndex = i;
				System.out.println("위치 : " + i);
			} else if (animal[i] == 2) {
				obsIndex = i;
			}
		}
		if (obsIndex > aniIndex) {
			System.out.println("왼쪽으로 탈출");
		} else {
			System.out.println("오른쪽으로 탈출");
		}

		// 5번
		System.out.println("\n" + "5번----------------");
		int[] carNum = { 1234, 1212, 1241, 1245, 1264, 4363, 2367, 3558, 2329 };
		int[] parking = new int[10];
		int parkingIndex = 0;
		for (int i = 0; i < carNum.length; i++) {
			parkingIndex = carNum[i] % 10;
			for (int j = parkingIndex; j < parking.length; j++) {
				if (parking[j] == 0) {
					parking[j] = carNum[i];
					j=10;						// break; -> for문을 종료시킨다가 아니라 현재 반복문을 종료시킨다!!!!!!!
				}
			}
		}
		for (int i = 0; i < parking.length; i++) {
			if (parking[i] == 0) {
				parking[i] = -1;
			}
			System.out.println(i + "번 주차장 : " + parking[i]);
		}

	}

}
