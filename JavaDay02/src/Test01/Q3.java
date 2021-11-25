package Test01;

public class Q3 {
	
	public static void main(String[] args) {
		int[][] a = { {1,4,2,4,1},{2,1,2,4,3},{2,1,3,4,3,},{4,1,4,1,3},{2,4,3,4,1} };
		int[] saveI = new int [25];
		int[] saveJ = new int [25];
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[i][j] == a[i][j+1]) {
					cnt++;
					if (cnt == 2) {
						for (int k = 0; k < saveI.length; k++) {
							if (saveI[k] == 0) {
								saveI[k] = i;
								saveI[k+1] = i;
								saveI[k+2] = i;
								saveJ[k] = j-2;
								saveJ[k+1] = j-1;
								saveJ[k+2] = j;
								break;
							}
						}
					}else if (cnt >=3) {
						for (int k = 0; k < saveI.length; k++) {
							if (saveI[k] == 0) {
								saveI[k] = i;
								saveJ[k] = j;
								break;
							}
						}
					}
				}else {
					cnt = 0;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length-1; i++) {
				if (a[i][j] == a[i+1][j]) {
					cnt++;
					if (cnt == 2) {
						for (int k = 0; k < saveI.length; k++) {
							if (saveI[k] == 0) {
								saveI[k] = i-2;
								saveI[k+1] = i-1;
								saveI[k+2] = i;
								saveJ[k] = j;
								saveJ[k+1] = j;
								saveJ[k+2] = j;
								break;
							}
						}
					}else if (cnt >=3) {
						for (int k = 0; k < saveI.length; k++) {
							if (saveI[k] == 0) {
								saveI[k] = i;
								saveJ[k] = j;
								break;
							}
						}
					}
				}else {
					cnt = 0;
				}
			}
		}
		for (int i = 0; i < saveJ.length; i++) {
			if (saveI[i] != 0) {
				a[saveI[i]][saveJ[i]] = 0;
			}else {
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
