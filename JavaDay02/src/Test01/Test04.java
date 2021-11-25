package Test01;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();	// Ctrl + Shift + o 누르세요.	>>	에러가 없어짐!
		// 지금은 이렇게만 해석 -> 랜덤수를 뽑기위해 자바에서 제공되는 기능
		// int k = 0;
		int lotto[] = new int[6];
		/** value 입력부 for */
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;		// 로또 번호 0-44 까지를 렌덤으로 추출 후 저장
											// 로또 번호는 1-45번까지 이므로 +1로 보정
		}
		
		/** value 출력부 for */
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		

	}

}
