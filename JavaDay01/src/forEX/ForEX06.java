package forEX;

public class ForEX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "abcdefghijklmnopqrstuvwxyz";
		// �ʿ� ������ ��ȣ ����
		String nowMemo = "iloveyouz";	// psvclfvbg
		
		// ��ȣ������ �ٲټ���
		/**
		 * ����� ���ڴ� 7�̴�
		 * i��� ���ڿ� index���� 7�� ���� index�� ġȯ�� �ȴ�
		 * 
		 * ��ȣ�� ����Ͻÿ�
		 */
		String newMemo = "";
		for (int i = 0; i < nowMemo.length(); i++) {
			for (int j = 0; j < id.length(); j++) {
				if (nowMemo.charAt(i) == id.charAt(j)) {
					if (j+7 > id.length()) {
						newMemo += id.charAt((j+7)-id.length());
					}else {
						newMemo += id.charAt(j+7);
					}
				}
			}
		}
		System.out.println(newMemo);
		
	}

}
