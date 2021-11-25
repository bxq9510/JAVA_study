package Test01;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		int[][] a = { {10, 11, 12, 13, 14}, {15, 16, 17, 18, 19}, {20, 21, 22, 23, 24}, {25, 26, 27, 28, 29} };
		int rowMin = 0, colMin = 0, rowMax = 4,	colMax = 5;
		int save1 = 0;
		int save2 = 0;
		for (int k = 0; k < 2; k++) {
			for (int j = colMax-1; j > colMin; j--) {
				if (j == colMax-1) {
					save1 = a[rowMin][j];
				}
				a[rowMin][j] = a[rowMin][j-1];
			}
			for (int i = rowMax-1; i > rowMin; i--) {
				if (i == rowMin+1) {
					if (k>0) {
						save2 = a[i][colMax-1];
					}
					a[i][colMax-1] = save1;
				}else if (i == rowMax-1) {
					save2 = a[i][colMax-1];
					a[i][colMax-1] = a[i-1][colMax-1];
				}else {
					a[i][colMax-1] = a[i-1][colMax-1];
				}
			}
			for (int j = colMin; j < colMax-1; j++) {
				if (j == colMax-2) {
					a[rowMax-1][j] = save2;
				}else if (j == colMin) {
					save1 = a[rowMax-1][j];
					a[rowMax-1][j] = a[rowMax-1][j+1];
				}else {
					a[rowMax-1][j] = a[rowMax-1][j+1];
				}
			}
			for (int i = rowMin; i < rowMax-1; i++) {
				if (i == rowMax-2) {
					a[i][colMin] = save1;
				}else {
					a[i][colMin] = a[i+1][colMin];
				}
			}
			rowMin++;
			colMin++;
			rowMax--;
			colMax--;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}