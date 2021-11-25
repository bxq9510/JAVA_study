package Test01;

public class Test04_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 2, 3, 3, 3, 4, 2, 2, 2, 2, 4, 4, 3, 2, 1, 3, 3, 3, 3, 3 };
		int start = 0;
		int end = 0;
		for (int i = 0; i < a.length; i++) {
			start = i;
			for (int j = 1; j < a.length - i; j++) {
				if (a[i] == a[i + j]) {
					end = i + j;
				} else {
					break;
				}
			}
			if (end - start > 1) {
				for (int j = start; j <= end; j++) {
					a[j] = -1;
				}
				i = end;
				end = 0;
				start = 0;
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
//		int cnt=0;
//		for (int i = 0; i < a.length; i++) {
//			cnt=1;
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i] == a[j]-1) {
//					cnt++;
//				}else {
//					break;
//				}
//			}
//			if (cnt >= 3) {
//				System.out.print(i + "/" + (i+cnt));
//				for (int j = i; j < i+cnt; j++) {
//					a[j]=-1;
//				}
//				i=i+cnt-1;
//			}
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}

	}

}
