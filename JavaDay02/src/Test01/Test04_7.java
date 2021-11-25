package Test01;

import java.util.Random;

public class Test04_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 3, 3, 4, 5, 6, 2, 2, 4, 4, 3, 2, 1 };
		int nowInt = -1; // 기준숫자변수
		int cnt = 0;
		// step1. 기준 숫자를 순서대로 출려하시오. 이 숫자는 현재 숫자로부터 증가되는지 판단하는 기준
		for (int i = 0; i < a.length; i++) {
			cnt = 1;
			nowInt = a[i];
			// step2. 기준 숫자로 부터 다음 숫자와 비교하는 반복문, 이때 cnt숫자는 증가된다.
			for (int j = i + 1; j < a.length; j++) {
				nowInt++;
				if (nowInt == a[j]) {
					cnt++;
				} else {
					break;
				}
			}
			// step3. cnt가 3이상인지 판단하는 부분.
			if (cnt >= 3) {
				for (int j = i; j < i + cnt; j++) {
					a[j] = -1;
				}
				i = i + cnt;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
