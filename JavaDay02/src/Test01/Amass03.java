package Test01;

public class Amass03 {

	public static void main(String[] args) {
		// 전공용어를 사용해야 합니다.
		// 배열 : 고정길이 자료형(길이 조정 불가능), 길이, index 와 value, 메모리에 연속적으로 할당
		int[] a = { 1, 2, 3, 4, 5 };

		// 반복문
		// 반복문을 제어하는 break; continue;
		// : 반복문을 종료 :다시 조건으로 진행하여라 <혼동될 확률이 90%이 됩니다-어렵다, 내길이아니다>
		// <이렇게정의> 현재 반복문을 즉시 종료 : 아래 코드를 실행하지 않고 바로 조건으로 고~(증감식부분은 동작)
		// for문 공부하는 방법 : 초기값, 조건, 증감식을 통해서 수행범위를 파악하고, +++ 반복영역

		boolean flag = false; // 체크 하는 변수를 하나 둡니다. 유사한코드 : 합계, 숫자의 수,
		for (int i = 0; i < 5; i++) { // i는 행을 의미
			for (int j = 0; j < 4; j++) { // j는 열을 의미
				System.out.print("*");
				if (j == 2) {
					flag = true;
					break; // j가 2일 경우 종료 (현재 반복문을 종료)
				}
			}
			if (flag) {
				break;
			}
			System.out.println();
		}

		// 위랑 같은 소스인데 자바의 라벨을 이용하여 해결
		OK: for (int i = 0; i < 5; i++) { // 라벨을 정의한다.
			for (int j = 0; j < 4; j++) { // j는 열을 의미
				System.out.print("*");
				if (j == 2) {
					break OK; // j가 2일 경우 종료 (현재 반복문을 종료)
				}
			}
			System.out.println();
		}
		// 위 2중 반복문에서 ... 처음으로 if(j==2) 조건이 true가 된다면 이중 포문을 모두 종료하고 싶다
		// 어떻게 하면 될까요??

	}

}
