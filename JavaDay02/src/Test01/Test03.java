package Test01;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 선언 : 자료형, 변수명, 사이즈, 인덱스, 초기값
		 */
		int point[] = {10,20,30,40,50};
		// 자료형(value) : int, 변수명: point, 사이즈:5, 인덱스: 0-4, 초기값(value): 10, 20, 30, 40, 50
		// int point[] = new int[5]; // 초기값은 0이 된다!
		
		
		for (int i = 0; i < point.length; i++) {
			System.out.println(point[i]);
		}

	}

}
