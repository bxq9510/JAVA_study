package aaa;

public class day04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sample 예제
		// 1. aa가 60 이상이면 합격을 출력, 미만이면 불합격 출력
		/**
		 * 2. aa가 80 이상이면 우수학생
		 * 		   70 이상이면 보통학생
		 * 		   60 이상이면 열심학생을 출력
		 */
		// 3. 다음 코드의 결과를 손코딩으로 작성하시오.
		
		int aa = 30;
		
		//1번
		if (aa>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		//2번
		if (aa>=80) {
			System.out.println("우수학생");
		}else if (aa>=70) {
			System.out.println("보통학생");
		}else if (aa>=60) {
			System.out.println("열심학생");
		}
		//3번 -> if 절이 몇개인지, if 절이 어디까지가 블록인지 확인, 줄바꿈 필수
		int javaPoint = 70;		// 자바점수 = 70
		if(javaPoint >= 90) {	// 자바점수가 90이상일 때 괄호문 실행
			System.out.println("수");	// 수 출력
		}
		if (javaPoint >= 80) {	// 자바점수가 80이상일 때 괄호문 실행
			System.out.println("우");	// 우 출력
		}
		if (javaPoint >= 70) {	// 자바점수가 70이상일 때 괄호문 실행
			System.out.println("미");	// 미 출력
		}
		if (javaPoint >= 60) {	// 자바점수가 60이상일 때 괄호문 실행
			System.out.println("양");	// 양 출력
		}else {		// 위의 조건문들의 조건에 부합하지않을 시 괄호문 실행
			System.out.println("가");	// 가 출력
		}		// 결과 -> 미 양 출력

	}

}
