package Test01;

public class Test04_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ���ڵ� ����

		/**
		 * 1�� A B C D E
		 * 
		 * 2�� 00000* 0000*0 000*00 00*000 0*0000
		 * 
		 * 3�� 0 00 000 0000 00000
		 * 
		 * 4��
		 ******
		 ******
		 ******
		 ******
		 ******
		 * 
		 * 5�� 30
		 * 
		 * 6�� 0 0 2 2 6 6 12 12 20 20
		 * 
		 * 7�� 20
		 * 
		 * 8�� 20 10
		 * 
		 * 9�� 36
		 * 
		 * 10�� A++
		 * 
		 * 11�� C D
		 * 
		 * 12�� C D
		 * 
		 * 13�� 0 2 4 6 8 10
		 * 
		 * 14�� 0 1 2 3 4 5 6 7 8 9 10
		 * 
		 * 15�� 0 2 2 4 4 6 6 8 8 10 10 12
		 * 
		 * 16�� 0 1 2 3 4 5 6 7 8 9 10 11
		 */

		// 2
		System.out.println("\n" + "2��----------------");
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
		System.out.println("\n" + "3��----------------");
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
		System.out.println("\n" + "4��----------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 5
		System.out.println("\n" + "5��----------------");
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
		System.out.println("\n" + "6��----------------");
		sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			System.out.print(sum);
		}

		// 7
		System.out.println("\n" + "7��----------------");
		sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.print(sum);

		// 8
		System.out.println("\n" + "8��----------------");
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
		System.out.println("\n" + "9��----------------");
		a = -1;
		for (int i = 0; i < 40; i++) {
			if (i % 4 == 0) {
				a = i;
			}
		}
		System.out.println(a);

		// 13
		System.out.println("\n" + "13��----------------");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}

		// 14
		System.out.println("\n" + "14��----------------");
		for (int i = 0; i <= 10; ) {
			System.out.print(i);
			i++;
		}
		
		// 15
		System.out.println("\n" + "15��----------------");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i);
			i++;
			System.out.print(i+1);
		}
		
		// 16
		System.out.println("\n" + "16��----------------");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i);
			i++;
			System.out.print(i);
		}

	}

}
