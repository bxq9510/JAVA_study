package Test01;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();	// Ctrl + Shift + o ��������.	>>	������ ������!
		// ������ �̷��Ը� �ؼ� -> �������� �̱����� �ڹٿ��� �����Ǵ� ���
		// int k = 0;
		int lotto[] = new int[6];
		/** value �Էº� for */
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;		// �ζ� ��ȣ 0-44 ������ �������� ���� �� ����
											// �ζ� ��ȣ�� 1-45������ �̹Ƿ� +1�� ����
		}
		
		/** value ��º� for */
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		

	}

}
