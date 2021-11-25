package Test01;

public class Test05 {

	public static void main(String[] args) {
		// 입력부
		int b[][] = new int[4][5];
		int nowInt = 10;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				b[j][i] = nowInt;
				nowInt ++;
			}
		}
		// 출력부
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
