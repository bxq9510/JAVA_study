package Test01;

public class Test05_2 {

	public static void main(String[] args) {

		// 1번
		System.out.println("\n" + "1번----------------");
		int Q1[] = new int[5];
		for (int i = 0; i < Q1.length; i++) {
			Q1[i] = 0;
		}

		// 2번
		System.out.println("\n" + "2번----------------");
		int[] Q2 = { 3, 4, 5, 6, 8, 9, 10 };
		int cnt2 = 0;
		for (int i = 0; i < Q2.length; i++) {
			if (Q2[i] % 2 == 0) {
				cnt2++;
			}
		}
		System.out.print(cnt2);

		// 3번
		System.out.println("\n" + "3번----------------");
		int[] Q3 = { 3, 4, 5, 6, 8, 9, 10 };
		int[] Q = new int[7];
		for (int i = 0; i < Q.length; i++) {
			if (i < 4) {
				Q[i] = Q3[i];
			} else if (i == 4) {
				Q[i] = 7;
			} else {
				Q[i] = Q3[i - 1];
			}
		}
		for (int i = 0; i < Q.length; i++) {
			System.out.print(Q[i] + "\t");
		}
		
		// 4번
		System.out.println("\n" + "4번----------------");
		 int[][] Q4 = {{2,3,54,45,3},{2,3,54,45,3},{2,3,54,45,3}};
		 int cnt4 = 0;
		 for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (Q4[i][j]%2 == 0) {
					cnt4++;
				}
			}
		}
		System.out.print(cnt4);
		
		// 5번
		System.out.println("\n" + "5번----------------");
		 int[][] Q5 = {{2,3,54,45,3},{2,3,54,45,3},{2,3,54,45,3}};
		 int sum5 = 0;
		 for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (Q5[i][j]%2 == 0) {
					sum5+=Q5[i][j];
				}
			}
		}
		System.out.print(sum5);
		
		// 6번
		System.out.println("\n" + "6번----------------");
		String a ="zy";
		String b ="human progamer";
		int cnt6 = 0;
		for (int i = 0; i < b.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == b.charAt(i)) {
					cnt6++;
				}
			}
		}
		if (cnt6 == 0) {
			System.out.print("사용가능");
		}else {
			System.out.print("불가능");
		}
		
		// 7번
		System.out.println("\n" + "7번----------------");
		String[] words ={"apple","banana","mouse"};
		String searchWord ="a";
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (words[i].charAt(j) == searchWord.charAt(0)) {
					System.out.println(words[i]);
					break;
				}
			}
		}

	}

}
