package forEX;

import java.util.Random;

public class ForEX05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 3. ������ ���� ã��
		 * 	 a��� ���ڰ� ���������� � �ִ����� ã�� ����. �� ���ڿ����� a�� ���������� �ΰ� ������ ���̴� 2�̴�.
		 * 	 �̷� ������� �м��Ѵٸ� id��� ���ڿ��� a�� ���̴� �����ΰ�? (�̶� ���̰� ���� ���� ���� ���)
		 * 4. 3�� ���� ���� �� aaa�� kkk�� ����!
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
		System.out.println("���� : " + aSize);
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
		
		System.out.println("\n"+"7��----------------");
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
				System.out.print("���ʽ� " + lotto[i]);
			}else {
				System.out.print(lotto[i] + " ");
			}
		}
		
//		for (int i = 0; i < num; i++) {
//		if ('a'==id.charAt(numi-i)) {
//			id.charAt(num1-i) = 'k'; // k�� �ٲٴ� ���� �־������!
//		}
//	}
//	
		
		

	}

}
