package Test01;

public class Test04_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String badA = "abc"; // 금지 문자를 정의한 변수 (문자 = 한문자)
		String title = "hi! good day abc"; // 사용자가 입력한 제목이라고 가정
		// 제목에 금지문자를 쓸 수 없다. title 제목은 사용가능한가를 체크하는 프로그램.
		int cnt = 0;
		for (int i = 0; i < title.length(); i++) {
			for (int j = 0; j < badA.length(); j++) {
				if (title.charAt(i) == badA.charAt(j)) {
					cnt++;
					break;
				}
			}
		}
		if (cnt >= 1) {
			System.out.print("사용불가");
		}else {
			System.out.print("사용가능");
		}

	}

}
