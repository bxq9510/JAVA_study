package Test01;

public class Test04_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 복습 손코딩 문제

		/**
		 * 1번 A B C D E
		 * 
		 * 2번 00000* 0000*0 000*00 00*000 0*0000
		 * 
		 * 3번 0 00 000 0000 00000
		 * 
		 * 4번
		 ******
		 ******
		 ******
		 ******
		 ******
		 * 
		 * 5번 30
		 * 
		 * 6번 0 0 2 2 6 6 12 12 20 20
		 * 
		 * 7번 20
		 * 
		 * 8번 20 10
		 * 
		 * 9번 36
		 * 
		 * 10번 A++
		 * 
		 * 11번 C D
		 * 
		 * 12번 C D
		 * 
		 * 13번 0 2 4 6 8 10
		 * 
		 * 14번 0 1 2 3 4 5 6 7 8 9 10
		 * 
		 * 15번 0 2 2 4 4 6 6 8 8 10 10 12
		 * 
		 * 16번 0 1 2 3 4 5 6 7 8 9 10 11
		 */

		// 2
		System.out.println("\n" + "2번----------------");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= 0; j--) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

		// 3
		System.out.println("\n" + "3번----------------");
		sum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= 0; j--) {
				if (i < j) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

		// 4
		System.out.println("\n" + "4번----------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 5
		System.out.println("\n" + "5번----------------");
		sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			} else {
				i = i + 1;
				sum = sum + i;
			}
		}
		System.out.print(sum);

		// 6
		System.out.println("\n" + "6번----------------");
		sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			System.out.print(sum);
		}

		// 7
		System.out.println("\n" + "7번----------------");
		sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.print(sum);

		// 8
		System.out.println("\n" + "8번----------------");
		int a = 10;
		int b = 20;
		int c = 0;
		for (int i = 0; i < 20; i++) {
			if (i % 4 == 0) {
				c = a;
				a = b;
				b = c;
			}
		}
		System.out.print(a);
		System.out.print(b);

		// 9
		System.out.println("\n" + "9번----------------");
		a = -1;
		for (int i = 0; i < 40; i++) {
			if (i % 4 == 0) {
				a = i;
			}
		}
		System.out.println(a);

		// 13
		System.out.println("\n" + "13번----------------");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}

		// 14
		System.out.println("\n" + "14번----------------");
		for (int i = 0; i <= 10; ) {
			System.out.print(i);
			i++;
		}
		
		// 15
		System.out.println("\n" + "15번----------------");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i);
			i++;
			System.out.print(i+1);
		}
		
		// 16
		System.out.println("\n" + "16번----------------");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i);
			i++;
			System.out.print(i);
		}

	}

}
