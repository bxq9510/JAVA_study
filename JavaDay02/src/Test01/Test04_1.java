package Test01;

import java.util.Random;

public class Test04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1��
		System.out.println("\n"+"1��----------------");
		int a1[] = new int[10];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = i;
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");;
		}
		
		// 2��
		System.out.println("\n"+"2��----------------");
		int a2[] = new int[6];
		for (int i = 0; i < a2.length; i++) {
			a2[5-i] = i;
		}
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+" ");;
		}
		
		// 3��
		System.out.println("\n"+"3��----------------");
		int[] a3 = {32,23,12,13,44,46,48,70,4};
		System.out.print(a3.length);
		
		// 4��
		System.out.println("\n"+"4��----------------");
		int[] a = {32,23,12,13,44,46,48,70,4};
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		// 5��
		System.out.println("\n"+"5��----------------");
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 0) {
				cnt++;
			}
		}
		System.out.print(cnt);
		
		// 6��
		System.out.println("\n"+"6��----------------");
		Random r = new Random();
		int [] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
		}
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length-1) {
				System.out.print("���ʽ� " + lotto[i]);
			}else {
				System.out.print(lotto[i] + " ");
			}
		}
		
		// 7��
		System.out.println("\n"+"7��----------------");
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
				System.out.print("���ʽ� " + lotto[i]);
			}else {
				System.out.print(lotto[i] + " ");
			}
		}
		
		// 8��
		System.out.println("\n"+"8��----------------");
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
