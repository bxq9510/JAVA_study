package Test01;

public class Method03 {

	public static void main(String[] args) {
		String[] a = new String[5];		// ����Ÿ�� �迭: �迭�� value���� ���� ���� �ƴ� ���� ���� �ִ� ���� �ּ�
										// ����Ÿ�� �ڷ����� �ڹٿ��� ������ �����Ѵ�.. ������ �����ؼ� �޸𸮸� ����
		int[] b = new int [5];			// ����Ÿ�� �迭: �迭�� value ���� ���� ���̴�.
		
		System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t");
		System.out.println(b[0]+"\t"+b[1]+"\t"+b[2]+"\t"+b[3]+"\t"+b[4]+"\t");
		
		System.out.println("---------------- a[0]  ���� kkk ���ڿ��� �Է�");
		a[0]="kkk";
		b[0]=20;
		System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t");
		System.out.println(b[0]+"\t"+b[1]+"\t"+b[2]+"\t"+b[3]+"\t"+b[4]+"\t");
		
		// a[1] ���� b[0]�� ���� �����Ͻÿ�
		a[1]=a[0];
		System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t");
		a[0] = "bbb";
		System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t");
	}

}
