package aaa;

public class day04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 1. 홀짝인지 확인하는 프로그램을 작성하세요.
		 * 	  
		 *    잘라서 고민을 해야합니다 -> 알고리즘 적인 사고
		 *    홀짝을 구분!!
		 *    if문, 연산자
		 *    i문이 필요한 이유는 홀짝 인지 구분하기 위해 if(a%2==0)
		 *    
		 * 2. a 변수가 3의 배수이면서 5의 배수이면 합격, 아니면 불합격이라고 출력하세요.
		 * 
		 * 3. int b = 5430;
		 * 	  b변수는 거스름돈이다.
		 * 	  출력을 천원짜리 : 5개
		 * 	  백원짜리 : 4개
		 * 	  십원짜리 : 3개로 출력하시오
		 * 
		 *    포인트는 연산->  %, / : 이용에 대한 창조를 하는게 개발자,, 남이 했던 것을 모방하는것이 빠르다
		 *    
		 * 
		 * 4. int a = 40;
		 *    int b = 60;
		 *    String sign="+";
		 *    sign 변수가 + 이면 : a+b
		 *    sign 변수가 - 이면 : a-b
		 *    sign 변수가 / 이면 : a/b
		 *    sign 변수가 * 이면 : a*b
		 */
		
		//1번
		int a = 60;
		if(a%2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		//2번
		if(a%3==0 && a%5==0) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//3번
		int b = 5430;
		if (b>1000) {
			System.out.println("천원짜리 : " + b/1000 + "개");
			System.out.println("백원짜리 : " + (b%1000)/100 + "개");
			System.out.println("백원짜리 : " + ((b%1000)%100)/10 + "개");
		}
		
		if (b>1000) {
			System.out.println("천원짜리 : " + b/1000 + "개");
			b %= 1000;
		}
		if (b>100) {
			System.out.println("백원짜리 : " + b/100 + "개");
			b %= 100;
		}
		if (b>10) {
			System.out.println("십원짜리 : " + b/10 + "개");
		}
		
		//4번
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
