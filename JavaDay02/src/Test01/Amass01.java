package Test01;

public class Amass01 {

	public static void main(String[] args) {
		// 전공용어를 사용해야 합니다.
		// 배열 : 고정길이 자료형(길이 조정 불가능), 길이, index 와 value, 메모리에 연속적으로 할당
		int[] a = { 1, 2, 3, 4, 5 };

		// 반복문
		for (int i = 0; i < a.length; i++) { // i가 의미하는 바 ? for문의 반복 회수를 제어하기 위한 변수
			System.out.println(a[i]); // i를 인덱스로 활용한겁니다.
		}

		// 반복문 : for , while : 조건이 true이면 반복하고, 조건이 false일때 반복을 종료
		int i = 0;
		for (; i < a.length;) { // i가 의미하는 바 ? for문의 반복 회수를 제어하기 위한 변수
			System.out.println(a[i]); // i를 인덱스로 활용한겁니다.
			i++;
		}
		// for문을 공부하는 습관 ? 초기값이 무엇인지? 기존에 따라 범위가 무엇인지? 증가하는지 감소하는지?
		// 마지막 중요한 것.... 반복하는 코드의 범위

		int index = 0; // 여기 까지는 에러가 없습니다
		while (index < a.length) { // 선언문 분석? 1.자료형 2.변수명 3. 초기값 4.변수의 scope
			System.out.println(a[index]); // 비교연산자 설명 하시오 ? 참과 거짓의 결과를 나타 낼 수 있는것이 비교연산자
			// 종류 : < > == !
			index++;

		}
		// while exit 일경우 위치 ( while 조건이 거짓일 경우 )

	}

}
