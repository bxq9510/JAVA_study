package Test01;

public class Method03 {

	public static void main(String[] args) {
		String[] a = new String[5];		// 참조타입 배열: 배열의 value값은 실제 값이 아닌 실제 값이 있는 곳의 주소
										// 참조타입 자료형은 자바에서 별도로 관리한다.. 이유는 공유해서 메모리를 절약
		int[] b = new int [5];			// 원시타입 배열: 배열의 value 값은 실제 값이다.
		
		System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t");
		System.out.println(b[0]+"\t"+b[1]+"\t"+b[2]+"\t"+b[3]+"\t"+b[4]+"\t");
		
		System.out.println("---------------- a[0]  값에 kkk 문자열을 입력");
		a[0]="kkk";
		b[0]=20;
		System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t");
		System.out.println(b[0]+"\t"+b[1]+"\t"+b[2]+"\t"+b[3]+"\t"+b[4]+"\t");
		
		// a[1] 값에 b[0]의 값을 대입하시오
		a[1]=a[0];
		System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t");
		a[0] = "bbb";
		System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t");
	}

}
