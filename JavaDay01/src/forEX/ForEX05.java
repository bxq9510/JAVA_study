package forEX;

public class ForEX05 {

	public static void main(String[] args) {
		String id = "abcdaaadd";
		// id ������ a��� ���ڸ� ����Ͻÿ�
		// ���ڿ� ���ڿ��� �����ߴ�
		// ���ڴ� �ϳ��� ����,,, ���ڿ��� �ϳ� �̻��� ���ڸ� ���ڿ��̶�� �Ѵ�
		/** a��� ���ڸ� ����ϱ� ���ؼ��� ���ڿ��� �պκк��� �ϳ��� �߶� Ȯ���� �ؾ��Ѵ�
		 * a		b		c		d		a		a		a		d		d
		 * ��		��	��	��	��	��	��	��	��
		 * ���								���	���	���
		 */
		
		System.out.println(id.charAt(2));	// id��� ���ڿ����� 2��° ���ڸ� �߶󳻰� ����Ͽ���
		// System.out.println(id.charAt(i));	// ���ڱ����� �߶��
		
		for (int i = 0; i < id.length(); i++) {		// ���⼭ i�� for���� �ݺ�
			if ('a' == id.charAt(i)) {				// "" -> ���ڿ�, '' -> ����		// ���⼭ i�� ���ڿ��� ��ġ�� �ǹ�
				System.out.println(id.charAt(i));
			}
		}
		int num=0;
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i)) {
				num++;
			}
		}System.out.println(num);
		
		/**
		 * 1. �� �ҽ��� �����Ͽ� a�� b���ڸ� ����ϰ� �Ͻÿ�.
		 * 2. �� �ҽ��� �����Ͽ� a���ڿ� b���ڸ��� ���Ͽ� ������ ���ڿ��� ���� ����Ͻÿ�.
		 * 3. ������ ���� ã��
		 * 	 a��� ���ڰ� ���������� � �ִ����� ã�� ����. �� ���ڿ����� a�� ���������� �ΰ� ������ ���̴� 2�̴�.
		 * 	 �̷� ������� �м��Ѵٸ� id��� ���ڿ��� a�� ���̴� �����ΰ�? (�̶� ���̰� ���� ���� ���� ���)
		 */
		
		// 1��
		int cnt=0;
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i)) {
				System.out.println(id.charAt(i));
			}else if ('b' == id.charAt(i)) {
				System.out.println(id.charAt(i));
			}
		}

	}

}