package TestCode;

import java.util.Scanner;

public class TrySample {
	public static void main(String[] args) {
		/** Try catch ���� �׽�Ʈ �ڵ�
		 * 1. �����ؾ��� �ܾ�,		���� vs ����
		 *    ���� : �ڵ� �ۼ��� ������, ������x
		 *    ����(Exception) : �������� �ǰ� ���α׷� ������ ��. ���α׷� ���� �߰��� �߻��ϴ� ������
		 *    	-> NullpointException : ������ ��ü�� ���µ� �����϶�� �Ѵٸ�
		 *    	   ArrayIndexOutofBoundException : �迭�� ������ ����� ��
		 *    
		 *    ���߾���� Ÿ�� ������ ->		 ������ ���	 	/		 ��������Ʈ ���
		 *    									java, C				html, javaScript, python
		 *		 						��������>��������>����			�������� > ����
		 *						   		  �ý��� �ӵ��� ����
		 *								
		 *
		 *	try (�ʼ�)
 		 * 		> ���ܸ� �����ϴ� �ڵ�, �� ����ؾ� �� ���� ���ܰ� �߻��ϸ� �Ʒ� �ڵ带 �� �̻� �������� �ʰ� catch�������� �̵�
 		 * 	catch (�ʼ�)
 		 * 		> ���ܸ� ó���ϰ� ���α׷��� ���������� ����
 		 * 		> catch ������ ������ �� �� �ִ�.. �� ������ ���� ������ ������ ���� �۰� �Ʒ��� ������ Ŀ����.
 		 * 		> ���ܸ� ��ü������ �ڵ鸵�ϰ� ������..
 		 * 	finally (����)
		 *		> ���ܰ� �߻��ϴ� �߻����� �ʴ� try������ ���������� ������ ����ȴ�
		 *
		 *	
		 *	20 30 ���α׷����� �Ϸ� ���� �ູ���Ϸ�
		 */
		Scanner in = new Scanner(System.in);
		try {
			int[] a = {10, 20, 30};
			System.out.println(a[1]);
			System.out.println(a[2]);
			String k = in.nextLine();
			if (k.equals("x")) {
				System.out.println("���α׷�����");
				System.exit(-1); // ���α׷� ��������
			}
			System.out.println("�Ϸ�");
		} catch (Exception e) { // ���ܰ� �߻��� e��� ������ ���� ��ü�� ����z
			System.out.println("���ܹ߻�");
			e.printStackTrace(); // ���� ���� ���
		} finally {
			System.out.println("����");
		}
	}
}
