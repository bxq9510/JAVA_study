package aaa;

public class day04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 1. Ȧ¦���� Ȯ���ϴ� ���α׷��� �ۼ��ϼ���.
		 * 	  
		 *    �߶� ����� �ؾ��մϴ� -> �˰��� ���� ���
		 *    Ȧ¦�� ����!!
		 *    if��, ������
		 *    i���� �ʿ��� ������ Ȧ¦ ���� �����ϱ� ���� if(a%2==0)
		 *    
		 * 2. a ������ 3�� ����̸鼭 5�� ����̸� �հ�, �ƴϸ� ���հ��̶�� ����ϼ���.
		 * 
		 * 3. int b = 5430;
		 * 	  b������ �Ž������̴�.
		 * 	  ����� õ��¥�� : 5��
		 * 	  ���¥�� : 4��
		 * 	  �ʿ�¥�� : 3���� ����Ͻÿ�
		 * 
		 *    ����Ʈ�� ����->  %, / : �̿뿡 ���� â���� �ϴ°� ������,, ���� �ߴ� ���� ����ϴ°��� ������
		 *    
		 * 
		 * 4. int a = 40;
		 *    int b = 60;
		 *    String sign="+";
		 *    sign ������ + �̸� : a+b
		 *    sign ������ - �̸� : a-b
		 *    sign ������ / �̸� : a/b
		 *    sign ������ * �̸� : a*b
		 */
		
		//1��
		int a = 60;
		if(a%2 == 1) {
			System.out.println("Ȧ��");
		}else {
			System.out.println("¦��");
		}
		
		//2��
		if(a%3==0 && a%5==0) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		//3��
		int b = 5430;
		if (b>1000) {
			System.out.println("õ��¥�� : " + b/1000 + "��");
			System.out.println("���¥�� : " + (b%1000)/100 + "��");
			System.out.println("���¥�� : " + ((b%1000)%100)/10 + "��");
		}
		
		if (b>1000) {
			System.out.println("õ��¥�� : " + b/1000 + "��");
			b %= 1000;
		}
		if (b>100) {
			System.out.println("���¥�� : " + b/100 + "��");
			b %= 100;
		}
		if (b>10) {
			System.out.println("�ʿ�¥�� : " + b/10 + "��");
		}
		
		//4��
		a = 40;
		b = 60;
		String sign="+";
		
		if (sign=="+") {
			System.out.println(a+b);
		}else if (sign=="-") {
			System.out.println(a-b);
		}else if (sign=="/") {
			System.out.println(a/b);
		}else if (sign=="*") {
			System.out.println(a*b);
		}
	}

}
