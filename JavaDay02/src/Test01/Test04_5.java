package Test01;

public class Test04_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 여러분은 회원가입의 id유효성을 판단하는 프로그램을 작하고 있습니다.
		 * 반드시 특수문자가 포함이 되어야함.
		 */
		String sign = "!@#$%^&";
		String id = "nakim2!mi!";
		int cnt = 0;
		for (int i = 0; i < id.length(); i++) {
			for (int j = 0; j < sign.length(); j++) {
				if (sign.charAt(j) == id.charAt(i)) {
					cnt++;
				}
			}
		}
		// 문제1.	무조건 특수문자가 1개 포함되어야 한다. 사용이 가능하면 사용이 가능합니다라고 출력
		
		if (cnt == 1) {
			System.out.println("사용가능");
		}else {
			System.out.println("사용불가");
		}
		
		// 문제2.	특수문자가 2개 이상 포함이 되어야한다. 사용이 가능하면 사용이 가능합니다라고 출력
		
		if (cnt >= 2) {
			System.out.println("사용가능");
		}else {
			System.out.println("사용불가");
		}
		

	}

}
