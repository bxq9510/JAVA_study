package forEX;

public class ForEX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 10까지 합한 결고 값을 출력하시오
		/**
		 * 반복하는 순서 : 1 2 3 4 5 6 7 8 9 10
		 * 반복하는 동작 : 누적된 합 > 합을 저장 > 저장? 변수 선언!
		 * 주의할 점 : 변수의 선언은 위치를 고려해야 함 -> scope의 위치, 변수제거시점도 생각해야함 (JVM)
		 * 조건 추가 : 짝수만 합한다 > 변수가 필요? X > 조건문 필요... 어디에 삽입할 것인가?
		 */
		
		// 다음 코드에서 선언된 변수는 총 몇개인가요? -> 2개
		int sum=0;							// 변수 sum 선언 -> 전체 식에 영향 (scope)		// int는 4byte의 값을 저장 -> 지역변수를 사용할 수록 메모리 감소!
		for (int i = 0; i < 11; i++) {		// 변수 i 선언   -> for문에 영향
			if (i%2==0) {
				sum+=i;						// if문에 한줄이면 괄호 {} 생략가능!
			}
		}
		System.out.println(sum);
		// System.out.println(i);	-->	  error : i의 scope에서 out되었기 때문
		
		//목적을 달성하기 위해 변수를 선언하고, 그 선언된 변수를 컨트롤하는 것
		// 누적시키는 변수가 필요... 그래서 17번에 선언을, 20번에 합하는 구현을 한 것

	}

}
