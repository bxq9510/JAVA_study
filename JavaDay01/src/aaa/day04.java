package aaa;

public class day04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sample ����
		// 1. aa�� 60 �̻��̸� �հ��� ���, �̸��̸� ���հ� ���
		/**
		 * 2. aa�� 80 �̻��̸� ����л�
		 * 		   70 �̻��̸� �����л�
		 * 		   60 �̻��̸� �����л��� ���
		 */
		// 3. ���� �ڵ��� ����� ���ڵ����� �ۼ��Ͻÿ�.
		
		int aa = 30;
		
		//1��
		if (aa>=60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		//2��
		if (aa>=80) {
			System.out.println("����л�");
		}else if (aa>=70) {
			System.out.println("�����л�");
		}else if (aa>=60) {
			System.out.println("�����л�");
		}
		//3�� -> if ���� �����, if ���� �������� ������� Ȯ��, �ٹٲ� �ʼ�
		int javaPoint = 70;		// �ڹ����� = 70
		if(javaPoint >= 90) {	// �ڹ������� 90�̻��� �� ��ȣ�� ����
			System.out.println("��");	// �� ���
		}
		if (javaPoint >= 80) {	// �ڹ������� 80�̻��� �� ��ȣ�� ����
			System.out.println("��");	// �� ���
		}
		if (javaPoint >= 70) {	// �ڹ������� 70�̻��� �� ��ȣ�� ����
			System.out.println("��");	// �� ���
		}
		if (javaPoint >= 60) {	// �ڹ������� 60�̻��� �� ��ȣ�� ����
			System.out.println("��");	// �� ���
		}else {		// ���� ���ǹ����� ���ǿ� ������������ �� ��ȣ�� ����
			System.out.println("��");	// �� ���
		}		// ��� -> �� �� ���

	}

}
