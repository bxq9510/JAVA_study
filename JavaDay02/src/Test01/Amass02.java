package Test01;

public class Amass02 {

	public static void main(String[] args) {
		// 전공용어를 사용해야 합니다.
		// 배열 : 고정길이 자료형(길이 조정 불가능), 길이, index 와 value, 메모리에 연속적으로 할당
		int[] a = { 1, 2, 3, 4, 5 };

		// 반복문
		// 반복문을 제어하는 break; continue;
		// : 반복문을 종료 :다시 조건으로 진행하여라 <혼동될 확률이 90%이 됩니다-어렵다, 내길이아니다>
		// <이렇게정의> 현재 반복문을 즉시 종료 : 아래 코드를 실행하지 않고 바로 조건으로 고~(증감식부분은 동작)
		for (int i = 0; i < a.length; i++) { // i가 의미하는 바 ? for문의 반복 회수를 제어하기 위한 변수
			if (i == 3)
				break;
			System.out.println(a[i]); // i를 인덱스로 활용한겁니다.
		}
		System.out.println("continue -------------------------");
		for (int i = 0; i < a.length; i++) { // i가 의미하는 바 ? for문의 반복 회수를 제어하기 위한 변수
			if (i == 3)
				continue;
			System.out.println(a[i]); // i를 인덱스로 활용한겁니다.
			// i=0 a[0] > i=1 a[1] i=2 a[2] i=3
			// 1 2 3
		}
		// 1245 정답이거라도 예측 << 자바를 더 사랑하세요...

	}

}
