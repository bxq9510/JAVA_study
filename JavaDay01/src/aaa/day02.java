package aaa;

public class day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음과 같은 프로그램을 작성하시오.
		// 단 오늘 배운 내용만 사용 (if, for 등 금지)
		// 고객의 정보를 관리하는 샘플 프로그램
		// 고객은 아이디, 이름, 나이, 포인트로 구성된다
		// 아이디는 고객을 식별하는데 사용
		// 이름도 고객을 식별하는데 사용
		// 나이는 고객의 연령층을 사용하는데 사용, 추후에 분석용으로 사용
		// 포인트는 고객의 활동에 따라 증가, 감소가 될 수 있다.
		
		// 고객의 정보를 관리하는 변수를 선언하고,
		// 샘플로 선언된 변수를 구현 (테스팅하고)
		// 관련된 고객의 정보를 출력하시오
		
		// upgrade
		// 나이를 출력할 때 성인과 미성년자를 구분하여 같이 출려하시오
		// 예를 들면 나이가 24세이면 나이를 출력하고 24(성인) 출력하시오
		// 연산자는 가능..
		
		String id = "bxq9510"; // 객체
		String name = "윤백선";
		int age = 26;
		int point = 100;
		
		String check = age >= 20 ? "(성인)" : "(미성년자)";
		
		System.out.println("\n======고객 정보======");
        System.out.println("아이디: " + id);
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + check);
        System.out.println("나이: " + point);
        System.out.println("=====================");
	}

}
