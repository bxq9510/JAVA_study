package Test01;

public class Test05_1 {

	public static void main(String[] args) {

		int b[][] = new int[4][5];

		// 2
		System.out.println("\n" + "2번----------------");
		int nowInt = 10;
		for (int i = 3; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				b[i][j] = nowInt;
				nowInt++;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}

		// 3
		System.out.println("\n" + "3번----------------");
		nowInt = 10;
		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					b[i][j] = nowInt;
					nowInt++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					b[i][j] = nowInt;
					nowInt++;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}

		// 4
		System.out.println("\n" + "4번----------------");
		int b4[][] = new int[4][5];
		nowInt = 10;
		int rowMin = 0, colMin = 0, rowMax = 4, colMax = 5;
		for (int k = 0; k < 7; k++) {
			switch (k % 4) {
			case 0:
				for (int j = colMin; j < colMax; j++) {
					b4[rowMin][j] = nowInt;
					nowInt++;
				}
				rowMin++;
				break;
			case 1:
				for (int i = rowMin; i < rowMax; i++) {
					b4[i][colMax - 1] = nowInt;
					nowInt++;
				}
				colMax--;
				break;
			case 2:
				for (int j = colMax - 1; j >= colMin; j--) {
					b4[rowMax - 1][j] = nowInt;
					nowInt++;
				}
				rowMax--;
				break;
			case 3:
				for (int i = rowMax - 1; i >= rowMin; i--) {
					b4[i][colMin] = nowInt;
					nowInt++;
				}
				colMin++;
				break;

			default:
				break;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b4[i][j] + "\t");
			}
			System.out.println();
		}

		// 4
		System.out.println("\n" + "4번----------------");
		int a[][] = new int[4][5];
		nowInt = 10;
		rowMin = 0;
		colMin = 0;
		rowMax = 4;
		colMax = 5;
		for (int k = 0; k < 2; k++) {
			for (int j = colMin; j < colMax; j++) {
				if (a[rowMin][j] == 0) {
					a[rowMin][j] = nowInt;
					nowInt++;
				}
			}
			rowMin++;
			for (int i = rowMin; i < rowMax; i++) {
				if (a[i][colMax - 1] == 0) {
					a[i][colMax - 1] = nowInt;
					nowInt++;
				}
			}
			colMax--;
			for (int j = colMax - 1; j >= colMin; j--) {
				if (a[rowMax - 1][j] == 0) {
					a[rowMax - 1][j] = nowInt;
					nowInt++;
				}
			}
			rowMax--;
			for (int i = rowMax - 1; i >= rowMin; i--) {
				if (a[i][colMin] == 0) {
					a[i][colMin] = nowInt;
					nowInt++;
				}
			}
			colMin++;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		// 5
		System.out.println("\n" + "5번----------------");
		nowInt = 10;
		int j = 0;
		for (int k = 0; k < 8; k++) {
			for (int i = 0; i < 4; i++) {
				j = k - i;
				if (j >= 0 && j < 5) {
					b[i][j] = nowInt;
					nowInt++;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
