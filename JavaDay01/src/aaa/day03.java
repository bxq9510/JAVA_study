package aaa;

public class day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ǹ�
		// ���ǹ��� ���ǿ� ���� ���� ������ ó���ϴ� ����
		// ������ ������ �ۼ��ϸ� �ݵ�� ���� �������� ����
		// ������ ���� ������ �ִ�. �������� ����� �� �ִ� ���� ���ÿ�
		
		/**
		 * �������� ����� �� �ִ°�..?
		 * 1. a>b	O
		 * 2. a+b	X
		 * 3. a<=b	O
		 * 4. a-b	X
		 * 5. a=b	X  ->  ����? java���� = ���Կ�����, == �񱳿�����
		 * 6. a>b	O
		 * 7. a=a+b X
		 */
		
		int a=10;
		int b=20;
		if(a==b) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		int point = 0;
		if(point > 30) {
			System.out.println("������");
			System.out.println("����� ��");
		}else {
			System.out.println("���� �ٿ�");
			System.out.println("����� �ٿ�");
		}
		
		int javaPoint = 70;
		if(javaPoint >= 90) {
			System.out.println("��");
		}else if (javaPoint >= 80) {
			System.out.println("��");
		}else if (javaPoint >= 70) {
			System.out.println("��");
		}else if (javaPoint >= 60) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		
		
	}

}