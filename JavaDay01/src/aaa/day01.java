package aaa;

public class day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주석 : 개발자가 설명을 작성한 것
		// java를 사랑하자.. java의 문법을 정확히 사용하자!!
		System.out.println(); // 콘솔에 출력하라 (흑백화면)
		// 나는 숫자 10을 출력하고 싶어요
		System.out.println(10);
		//나는 이름(문자)를 풀력하고 싶어요
		System.out.println("kkk");
		System.out.println(10+"kk");
		System.out.println("10"); // 문자 10
		System.out.println("10"+"10"); // +: 연결자 / 1010
		System.out.println(10+10); // +: 사칙연산 더하기 / 20
		System.out.println(10+"10"); // 큰 범위의 형변환이 일어남.. 숫자 10이 문자로 변환됨
		
		// 1. 자료형을 공부해야 한다. 자료형과 변수를 공부
		int a = 10; // int를 저장할 수 있는 변수를 선언하겠다. 초기값은 10이다.
		a=20; // 변수의 저장된 값은 바뀔 수 있다. 그러나 자료형은 바꿀 수 없다.
		String b = "문자열";
		System.out.println("a의 값은 "+a);
		System.out.println("b의 값은 "+b);
		
		System.out.println("------------------");
		// 1. 선언문은 변수를 사용하겠다고 정의함. 이때 자료형과 초기값을 기입.
		// 2. = 대입연산자 x = 10;  10이 먼저 해석 그리고 10을 x에 저장한다.
		//				   x = y+1; y+1이 먼저 실행되고 결과를 x에 저장한다.
		
		int bb = 30; // 선언문 : bb라는 변수를 선언, 자료형은 숫자(정수), 초기값 30
		int kk = 60; // 선언문 : kk라는 변수를 선언, 자료형은 숫자(정수), 초기값 60
		bb=50; // 구현문 : 대입연산자.. 50을 bb라는 변수에 저장하라.
		kk=bb; // 구현문 : 대입연산자.. bb(50)을 kk라는 변수에 저장하라 kk=(50)
		bb=70; // 구현문 : 대입연산자.. 70을 어디에 bb에 저장하라
		String cc = "aaa"; // 선언문 : cc라는 변수를 선언, 자료형은 문자, 초기값 aaa
		String dd = "bbb";
		dd=dd+cc; // 구현문 : 대입연산자 dd+cc + 문자 연결자 (why? dd의 자료형이 문자니까)
		System.out.println(bb); // 70
		System.out.println(kk);// 50
		System.out.println(cc); // aaa
		System.out.println(dd); // aaabbb
		kk=kk+80;
		System.out.println(kk);
		kk += 20; // kk = kk + 20; 48번째 라인과 같은 결과이지만 이렇게 작성하는게 속도가 빠름
		System.out.println(kk);
		kk-=50;
		System.out.println(kk);
		
		// 철수의 성적표를 출력
		double java=50.12;
		double html=60.12;
		// 위의 원점수에서 20점씩 더한 결과를 출력하시오
		java += 20;
		html += 20;
		System.out.println("java 점수 : "+java);
		System.out.println("html 점수 : "+html);
		
		/**
		 * 자료형 (java)
		 * 1. 숫자 : 정수 (음의 정수, 양의 정수, 0)
		 * 2. 문자 : 한 문자
		 * 3. 실수 : 소수점
		 * 4. boolean : 참과 거짓
		 * 5. 문자열 : 한문자 이상
		 */
		
		int d1 = 10;
		char d2 = 'A';
		double d3 = 78.12;
		boolean d4 = true;
		String d6 = "A";
		String d7 = "ABCE";
		
		System.out.print("A"+"\n"); // html <br> 같은 효과.. 개행문자
		System.out.print("B"+"\t");
		System.out.print("C");
		System.out.println();
		System.out.print("E");
		System.out.print("F");
	}

}
