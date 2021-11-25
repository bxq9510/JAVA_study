package TestCode;

import java.util.Scanner;

public class TrySample {
	public static void main(String[] args) {
		/** Try catch 구분 테스트 코드
		 * 1. 구분해야할 단어,		에러 vs 예외
		 *    에러 : 코드 작성시 빨간중, 컴파일x
		 *    예외(Exception) : 컴파일이 되고 프로그램 실행이 됨. 프로그램 실행 중간에 발생하는 오동작
		 *    	-> NullpointException : 참조할 객체가 없는데 참조하라고 한다면
		 *    	   ArrayIndexOutofBoundException : 배열의 범위를 벗어났을 때
		 *    
		 *    개발언어의 타입 두종류 ->		 컴파일 언어	 	/		 인터프린트 언어
		 *    									java, C				html, javaScript, python
		 *		 						원시파일>목적파일>실행			원시파일 > 실행
		 *						   		  시스템 속도가 이점
		 *								
		 *
		 *	try (필수)
 		 * 		> 예외를 감지하는 코드, 꼭 기억해야 할 것은 예외가 발생하면 아래 코드를 더 이상 실행하지 않고 catch구문으로 이동
 		 * 	catch (필수)
 		 * 		> 예외를 처리하고 프로그램을 안정적으로 유지
 		 * 		> catch 구문은 여러개 올 수 있다.. 단 주의할 점은 맨위가 범위가 제일 작고 아래로 갈수록 커야함.
 		 * 		> 예외를 구체적으로 핸들링하고 싶을때..
 		 * 	finally (선택)
		 *		> 예외가 발생하던 발생하지 않던 try구문을 빠져나갈때 무조건 실행된다
		 *
		 *	
		 *	20 30 프로그램종료 완료 종료 행복한하루
		 */
		Scanner in = new Scanner(System.in);
		try {
			int[] a = {10, 20, 30};
			System.out.println(a[1]);
			System.out.println(a[2]);
			String k = in.nextLine();
			if (k.equals("x")) {
				System.out.println("프로그램종료");
				System.exit(-1); // 프로그램 강제종료
			}
			System.out.println("완료");
		} catch (Exception e) { // 예외가 발생시 e라는 변수에 예외 객체를 참조z
			System.out.println("예외발생");
			e.printStackTrace(); // 예외 내용 출력
		} finally {
			System.out.println("종료");
		}
	}
}
