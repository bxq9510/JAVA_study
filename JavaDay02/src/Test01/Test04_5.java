package Test01;

public class Test04_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * �������� ȸ�������� id��ȿ���� �Ǵ��ϴ� ���α׷��� ���ϰ� �ֽ��ϴ�.
		 * �ݵ�� Ư�����ڰ� ������ �Ǿ����.
		 */
		String sign = "!@#$%^&";
		String id = "nakim2!mi!";
		int cnt = 0;
		for (int i = 0; i < id.length(); i++) {
			for (int j = 0; j < sign.length(); j++) {
				if (sign.charAt(j) == id.charAt(i)) {
					cnt++;
				}
			}
		}
		// ����1.	������ Ư�����ڰ� 1�� ���ԵǾ�� �Ѵ�. ����� �����ϸ� ����� �����մϴٶ�� ���
		
		if (cnt == 1) {
			System.out.println("��밡��");
		}else {
			System.out.println("���Ұ�");
		}
		
		// ����2.	Ư�����ڰ� 2�� �̻� ������ �Ǿ���Ѵ�. ����� �����ϸ� ����� �����մϴٶ�� ���
		
		if (cnt >= 2) {
			System.out.println("��밡��");
		}else {
			System.out.println("���Ұ�");
		}
		

	}

}
