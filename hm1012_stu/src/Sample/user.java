package Sample;

public class user {
	String name = null;	// 회원 이름을 위한 변수
	int age = 0;	// 회원 나이를 위한 변수
	int phone = 0;	// 회원 번호를 위한 변수
	
	// 회원 정보 출력
	public void viewUsr() {
		System.out.print(" / 이름 : " + name + " / 나이 : " + age + " / 전화번호 : " + phone);
		System.out.println();
	}

}