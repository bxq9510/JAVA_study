package aaa;

public class day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ּ� : �����ڰ� ������ �ۼ��� ��
		// java�� �������.. java�� ������ ��Ȯ�� �������!!
		System.out.println(); // �ֿܼ� ����϶� (���ȭ��)
		// ���� ���� 10�� ����ϰ� �;��
		System.out.println(10);
		//���� �̸�(����)�� Ǯ���ϰ� �;��
		System.out.println("kkk");
		System.out.println(10+"kk");
		System.out.println("10"); // ���� 10
		System.out.println("10"+"10"); // +: ������ / 1010
		System.out.println(10+10); // +: ��Ģ���� ���ϱ� / 20
		System.out.println(10+"10"); // ū ������ ����ȯ�� �Ͼ.. ���� 10�� ���ڷ� ��ȯ��
		
		// 1. �ڷ����� �����ؾ� �Ѵ�. �ڷ����� ������ ����
		int a = 10; // int�� ������ �� �ִ� ������ �����ϰڴ�. �ʱⰪ�� 10�̴�.
		a=20; // ������ ����� ���� �ٲ� �� �ִ�. �׷��� �ڷ����� �ٲ� �� ����.
		String b = "���ڿ�";
		System.out.println("a�� ���� "+a);
		System.out.println("b�� ���� "+b);
		
		System.out.println("------------------");
		// 1. ������ ������ ����ϰڴٰ� ������. �̶� �ڷ����� �ʱⰪ�� ����.
		// 2. = ���Կ����� x = 10;  10�� ���� �ؼ� �׸��� 10�� x�� �����Ѵ�.
		//				   x = y+1; y+1�� ���� ����ǰ� ����� x�� �����Ѵ�.
		
		int bb = 30; // ���� : bb��� ������ ����, �ڷ����� ����(����), �ʱⰪ 30
		int kk = 60; // ���� : kk��� ������ ����, �ڷ����� ����(����), �ʱⰪ 60
		bb=50; // ������ : ���Կ�����.. 50�� bb��� ������ �����϶�.
		kk=bb; // ������ : ���Կ�����.. bb(50)�� kk��� ������ �����϶� kk=(50)
		bb=70; // ������ : ���Կ�����.. 70�� ��� bb�� �����϶�
		String cc = "aaa"; // ���� : cc��� ������ ����, �ڷ����� ����, �ʱⰪ aaa
		String dd = "bbb";
		dd=dd+cc; // ������ : ���Կ����� dd+cc + ���� ������ (why? dd�� �ڷ����� ���ڴϱ�)
		System.out.println(bb); // 70
		System.out.println(kk);// 50
		System.out.println(cc); // aaa
		System.out.println(dd); // aaabbb
		kk=kk+80;
		System.out.println(kk);
		kk += 20; // kk = kk + 20; 48��° ���ΰ� ���� ��������� �̷��� �ۼ��ϴ°� �ӵ��� ����
		System.out.println(kk);
		kk-=50;
		System.out.println(kk);
		
		// ö���� ����ǥ�� ���
		double java=50.12;
		double html=60.12;
		// ���� ���������� 20���� ���� ����� ����Ͻÿ�
		java += 20;
		html += 20;
		System.out.println("java ���� : "+java);
		System.out.println("html ���� : "+html);
		
		/**
		 * �ڷ��� (java)
		 * 1. ���� : ���� (���� ����, ���� ����, 0)
		 * 2. ���� : �� ����
		 * 3. �Ǽ� : �Ҽ���
		 * 4. boolean : ���� ����
		 * 5. ���ڿ� : �ѹ��� �̻�
		 */
		
		int d1 = 10;
		char d2 = 'A';
		double d3 = 78.12;
		boolean d4 = true;
		String d6 = "A";
		String d7 = "ABCE";
		
		System.out.print("A"+"\n"); // html <br> ���� ȿ��.. ���๮��
		System.out.print("B"+"\t");
		System.out.print("C");
		System.out.println();
		System.out.print("E");
		System.out.print("F");
	}

}
