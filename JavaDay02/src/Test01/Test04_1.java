package Test01;

import java.util.Random;

public class Test04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1번
		System.out.println("\n"+"1번----------------");
		int a1[] = new int[10];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = i;
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");;
		}
		
		// 2번
		System.out.println("\n"+"2번----------------");
		int a2[] = new int[6];
		for (int i = 0; i < a2.length; i++) {
			a2[5-i] = i;
		}
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+" ");;
		}
		
		// 3번
		System.out.println("\n"+"3번----------------");
		int[] a3 = {32,23,12,13,44,46,48,70,4};
		System.out.print(a3.length);
		
		// 4번
		System.out.println("\n"+"4번----------------");
		int[] a = {32,23,12,13,44,46,48,70,4};
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		// 5번
		System.out.println("\n"+"5번----------------");
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 0) {
				cnt++;
			}
		}
		System.out.print(cnt);
		
		// 6번
		System.out.println("\n"+"6번----------------");
		Random r = new Random();
		int [] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
		}
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length-1) {
				System.out.print("보너스 " + lotto[i]);
			}else {
				System.out.print(lotto[i] + " ");
			}
		}
		
		// 7번
		System.out.println("\n"+"7번----------------");
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
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
		
		// 8번
		System.out.println("\n"+"8번----------------");
		int[] a8 = {31,24,12,13,44,46,48,71,4};
		int maxLength=0;
		int count=0;
		int start=0;
		int end=0;
		for (int i = 0; i < a8.length; i++) {
			if (a8[i]%2 == 0) {
				count++;
				if (count > maxLength) {
					maxLength = count;
					end = i;
					start = i-maxLength + 1;
				}
			}else {
				count=0;
			}
		}
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		
		
	}

}
