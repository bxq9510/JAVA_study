package Test01;

public class Test04_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String badA = "abc"; // ���� ���ڸ� ������ ���� (���� = �ѹ���)
		String title = "hi! good day abc"; // ����ڰ� �Է��� �����̶�� ����
		// ���� �������ڸ� �� �� ����. title ������ ��밡���Ѱ��� üũ�ϴ� ���α׷�.
		int cnt = 0;
		for (int i = 0; i < title.length(); i++) {
			for (int j = 0; j < badA.length(); j++) {
				if (title.charAt(i) == badA.charAt(j)) {
					cnt++;
					break;
				}
			}
		}
		if (cnt >= 1) {
			System.out.print("���Ұ�");
		}else {
			System.out.print("��밡��");
		}

	}

}
