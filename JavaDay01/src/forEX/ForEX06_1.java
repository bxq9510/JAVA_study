package forEX;

public class ForEX06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for����? �ݺ��Ѵٴ� ��
		// ���� for����.. �������� �ݺ��Ѵٴ°�
		// �ݺ��� ������.. �ϳ��� ��Ʈ�� �Ѵٸ�, �� ��Ʈ�� �ٽ� �ݺ��ϴ� ���� ���� �ݺ���..
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "X" + i + "=" + (i*j) + " / ");
			}
			System.out.println();
		}
		
		/**
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 * 
		 * 
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 4-i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}


	}

}
