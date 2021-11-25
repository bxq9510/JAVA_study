package Test01;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int javaPoint = 90;
		int htmlPoint = 80;
		int jsPoint = 79;
		
		// 문제	80점 이상인 과목은 모두 몇개인가?
		int cnt = 0;
		if(javaPoint >= 80) cnt++;
		if(htmlPoint >= 80) cnt++;
		if(jsPoint >= 80) cnt++;
		
		System.out.println("80점 이상인 과목은 : " + cnt);
		// 가설 -> 이 프로그램을 과연 많은 사람들이 사용할 것인가?
		// 아닐 것!! -> 과목수가 적음 -> 때문에 배열을 사용해야함
		
		int[] p = new int[5];	// 선언문
		// 배열 변수명, value자료형, 고정길이의 크기
		/**
		 * <선언이 지나면 크기를 바꿀 수 없다 -> 장점일까? 단점일까? 둘다임>
		 * 장점 : access 속도가 좋다
		 * 단점 : 불편하다, 맘대로 변경 불가능
		 * 미리 크기를 할당하기 때문에 사용하지 않는 인덱스가 많다면 메모리 공간이 낭비될 수 있다.
		 * -> 사용하기에는 불편할 수 있으나, 속도가 빠르다! // 크기가 고정된 배열에 사용! (ex. 손님 데이터 등은 X)
		**/
		
		// 		p			int 			5
		//				index 범위 : 0 ~ 4
		
		System.out.println(p.length);
		// .은 변수가 사용할 수 있는 기능이다.
		p[2] = 20;
		p[0] = 40;
		p[1] = 50;
		p[3] = p[2];
		p[4] = p[1] + 20;
		p[5] = 100;		// 예외발생 : 인덱스 범위 오버
		
		// 손코딩으로 다음의 답을 작성하세요
		// p라는 배열에 저장된 value값을 0번 인덱스부터 차례대로 출력하시오
		
		
		
	}

}
