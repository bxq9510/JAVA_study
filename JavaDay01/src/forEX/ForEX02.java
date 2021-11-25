package forEX;

public class ForEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 2;

		// 1번 -> 무한루프 끌라면 콘솔창 빨간 네모ㅎㅎ
		/**
		 * for (int i = 5; i > 0; ) { System.out.println(i+"실행"); }
		 **/

		// 2번
		for (int i = 0; i < a; i++) {
			System.out.println(i + "실행");
		}
		// 조건식에서 변수를 활용할 수 있다. for문이 반복할 때 만다 조건을 체크하는데 그 기준이 매번 다를 수도 있다.
		// a값이 변할 수고 있다. i가 변한다는 것을 알고 있지만 a가 변한다는 것을 잊을 수도 있다는 점..

		// 3번
		for (int i = 0; i < a; i++) {
			System.out.println(i + "실행");
			a = i;
		}
		// 2번 문제를 확실히 느끼자! 바로 a 값을 변경시키니 다음 조건에 바로 반영된다..
		// 범인을 찾아라는 문제는 3번 문제에서 영감을 얻어라!

		// 4번. 0~9까지 숫자중 짝수만 출력
		// itn num=0;
		for (int i = 0; i < 10; i++) {
			// if (num%2==0) {
			if (i%2==0) {
				System.out.println(i);
			}
			//num == 1;
		}
		// for문으로 반복을 하고.. 그 반복하는 순서에서 조건으로 해당하는 문제를 해결한다.
		// i변수가 의미하는 것은?? -> 선언문 : 이 변수를 왜 만들었는가? 힌트: 자료형, 뱐수명, 초기값
		// 42번 라인에서 i는 for문을 반복하기 위한 변수...
		// 0 1 2 3 4 5 6 7 8 9		<<		i의 선언 이유!!
		
		// 43번 라인에서 i가 의미하는 것은 정수 0 1 2 3 4 5 6 7 8 9 로 홀짝을 구분하기 위한 것
		// 두 i가 완전히 다른 용도!!!!

	}
}
