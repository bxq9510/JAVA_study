package Test01;

import java.util.Scanner;

public class Amass04 {

	public static void main(String[] args) {
		// 자료형이 소문자 : 원시 타입
		
		
		String[] username = new String[5];	// 배열은 자료형? 변수명?
		
//		Scanner in = new Scanner(System.in);
//		String name = null;
//		System.out.println("이름을 입력하세요");
//		name = in.nextLine();
//		System.out.println(name + "입력하였습니다");
		
		// 1번
		System.out.println("1번----------------");
		String[] user1 = new String[5];
		System.out.println("이름을 입력하세요");
		for (int i = 0; i < user1.length; i++) {
			Scanner in1 = new Scanner(System.in);
			user1[i] = in1.nextLine();
		}
		for (int i = 0; i < user1.length; i++) {
			System.out.print(user1[i] + "\t");
		}
		
		// 2번
		System.out.println("\n" + "2번----------------");
		String[] user2 = {"kimlee", "leejin", "이진호", "삼일동"};
		int cnt = 0;
		String name2 = null;
		Scanner in2 = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		name2 = in2.nextLine();
		for (int i = 0; i < user2.length; i++) {
			if (user2[i].equals(name2)) {
				System.out.println("중복");
				cnt++;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println("사용 가능");
		}
		
		// 3번
		System.out.println("3번----------------");
		String name3 = null;
		Scanner in = new Scanner(System.in);
		System.out.print("이름 : ");
		name3 = in.nextLine();
		for (int i = 0; i < user2.length; i++) {
			if (user2[i].equals(name3)) {
				System.out.println(i + "번");
				break;
			}
		}
		
		// 4번
		System.out.println("4번----------------");
		String[] user4 = {"kimlee", "박군", null, "이진수"};
		int cnt4 = 0;
		for (int i = 0; i < user4.length; i++) {
			if (user4[i] == null) {
				cnt4++;
			}
		}
		System.out.println("탈퇴한 회원 : " + cnt4 + "명");
		
		// 5번
		System.out.println("5번----------------");
		String[] user5 = {"일일일", "둘둘둘", "셋셋셋", "네네네"};
		String[] newuser5 = new String[4];
		String name5 = null;
		Scanner in5 = new Scanner(System.in);
		System.out.println("추가문자열 입력");
		name5 = in5.nextLine();
		for (int i = 0; i < newuser5.length; i++) {
			if (i<2) {
				newuser5[i] = user5[i];
			}else if (i == 2) {
				newuser5[i] = name5;
			}else {
				newuser5[i] = user5[i-1];
			}
		}
		for (int i = 0; i < newuser5.length; i++) {
			System.out.print(newuser5[i] + "\t");
		}
		
	}

}
