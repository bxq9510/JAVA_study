package Test01;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] saveInt = new int[10];	// 길이와 인덱스(0~) 범위를 꼭 기억! 무조건 분석해야함... value가 가질 수 있는 자료형
		
		// saveInt 배열의 value에 차례대로 0부터 9까지 숫자를 저장하자
		// 인덱스가 0-9까지 반복, value도 여기서 변경이 된다.
		
		/** value 입력부 for */
		// int valueNumber = 0;
		for (int i = 0; i < 10; i++) {
			// 여기서 i는 배열의 인덱스일까요?, 배열의 value 일까요?, 과연 i는 무엇일까요?
			// -> i는 그냥 for문을 반복시키기위해서 선언된 변수
			saveInt[i] = i;		//여기서 i를 배열의 인덱스로 사용한 것을 알게되는것!
			// valueNumber++;
		}
		
		/** value 출력부 for */
		for (int i = 0; i < 10; i++) {
			System.out.println(saveInt[i]);
		}
		
		// 0번부터 9번 값에 9 8 7 6 5 4 3 2 1 0 순으로 출력되게 하세요... (단, 9값은 index 0에 저장된 value)
		for (int i = 9; i >= 0; i--) {
			System.out.println(saveInt[i]);
		}

	}

}
