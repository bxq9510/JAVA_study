package forEX;

import java.util.Random;

public class ForEX05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 3. 문자의 길이 찾기
		 * 	 a라는 문자가 연속적으로 몇개 있는지를 찾는 문제. 위 문자열에서 a가 연속적으로 두개 나오면 깊이는 2이다.
		 * 	 이런 방식으로 분석한다면 id라는 문자에서 a의 깊이는 무엇인가? (이때 깊이가 가장 깊은 것을 출력)
		 * 4. 3번 연계 가장 긴 aaa를 kkk로 변경!
		 */
		String id = "abc!!!daaadkaadda";
		int num = 0;
		int numi = 0;
		int cnt=0;
		int cutStartIndex=0;
		int cutEndIndex=0;
		int aSize=0;
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i)) {
				cnt++;
				if (cnt > aSize) {
					aSize = cnt;
					cutEndIndex = i;
					cutStartIndex = i-aSize + 1;
				}
			}else {
				cnt=0;
			}
		}
		System.out.println("깊이 : " + aSize);
		String newid = "";
		for (int i = 0; i < id.length(); i++) {
			if (i < cutStartIndex || i > cutEndIndex) {
				newid += id.charAt(i);
			} else {
				newid += "kkk";
				i = cutEndIndex;
			}
		}
		System.out.println(newid);
		
		System.out.println("\n"+"7번----------------");
		Random r = new Random();
		int [] lotto = {31,24,12,13,44,1};
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[j] == lotto[i]) {
					lotto[i]=r.nextInt(45)+1;
					i--;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length-1) {
				System.out.print("보너스 " + lotto[i]);
			}else {
				System.out.print(lotto[i] + " ");
			}
		}
		
//		for (int i = 0; i < num; i++) {
//		if ('a'==id.charAt(numi-i)) {
//			id.charAt(num1-i) = 'k'; // k로 바꾸는 식을 넣어줘야함!
//		}
//	}
//	
		
		

	}

}
