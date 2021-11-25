package aaa;

public class day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문
		// 조건문은 조건에 따라서 참과 거짓을 처리하는 구문
		// 조건은 식으로 작성하며 반드시 참과 거짓으로 구분
		// 다음과 같은 조건이 있다. 조건으로 사용할 수 있는 것을 고르시오
		
		/**
		 * 조건으로 사용할 수 있는가..?
		 * 1. a>b	O
		 * 2. a+b	X
		 * 3. a<=b	O
		 * 4. a-b	X
		 * 5. a=b	X  ->  이유? java에서 = 대입연산자, == 비교연산자
		 * 6. a>b	O
		 * 7. a=a+b X
		 */
		
		int a=10;
		int b=20;
		if(a==b) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		int point = 0;
		if(point > 30) {
			System.out.println("레벨업");
			System.out.println("비행기 업");
		}else {
			System.out.println("레벨 다운");
			System.out.println("비행기 다운");
		}
		
		int javaPoint = 70;
		if(javaPoint >= 90) {
			System.out.println("수");
		}else if (javaPoint >= 80) {
			System.out.println("우");
		}else if (javaPoint >= 70) {
			System.out.println("미");
		}else if (javaPoint >= 60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
		
		
	}

}