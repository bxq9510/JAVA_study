package Test01;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] saveInt = new int[10];	// ���̿� �ε���(0~) ������ �� ���! ������ �м��ؾ���... value�� ���� �� �ִ� �ڷ���
		
		// saveInt �迭�� value�� ���ʴ�� 0���� 9���� ���ڸ� ��������
		// �ε����� 0-9���� �ݺ�, value�� ���⼭ ������ �ȴ�.
		
		/** value �Էº� for */
		// int valueNumber = 0;
		for (int i = 0; i < 10; i++) {
			// ���⼭ i�� �迭�� �ε����ϱ��?, �迭�� value �ϱ��?, ���� i�� �����ϱ��?
			// -> i�� �׳� for���� �ݺ���Ű�����ؼ� ����� ����
			saveInt[i] = i;		//���⼭ i�� �迭�� �ε����� ����� ���� �˰ԵǴ°�!
			// valueNumber++;
		}
		
		/** value ��º� for */
		for (int i = 0; i < 10; i++) {
			System.out.println(saveInt[i]);
		}
		
		// 0������ 9�� ���� 9 8 7 6 5 4 3 2 1 0 ������ ��µǰ� �ϼ���... (��, 9���� index 0�� ����� value)
		for (int i = 9; i >= 0; i--) {
			System.out.println(saveInt[i]);
		}

	}

}
