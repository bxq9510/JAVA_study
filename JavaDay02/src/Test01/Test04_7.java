package Test01;

import java.util.Random;

public class Test04_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 3, 3, 4, 5, 6, 2, 2, 4, 4, 3, 2, 1 };
		int nowInt = -1; // ���ؼ��ں���
		int cnt = 0;
		// step1. ���� ���ڸ� ������� ����Ͻÿ�. �� ���ڴ� ���� ���ڷκ��� �����Ǵ��� �Ǵ��ϴ� ����
		for (int i = 0; i < a.length; i++) {
			cnt = 1;
			nowInt = a[i];
			// step2. ���� ���ڷ� ���� ���� ���ڿ� ���ϴ� �ݺ���, �̶� cnt���ڴ� �����ȴ�.
			for (int j = i + 1; j < a.length; j++) {
				nowInt++;
				if (nowInt == a[j]) {
					cnt++;
				} else {
					break;
				}
			}
			// step3. cnt�� 3�̻����� �Ǵ��ϴ� �κ�.
			if (cnt >= 3) {
				for (int j = i; j < i + cnt; j++) {
					a[j] = -1;
				}
				i = i + cnt;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
