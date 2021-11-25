package forEX;

public class ForEX05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 1. 위 소스를 참고하여 a와 b문자만 출력하게 하시오.
		 * 2. 위 소스를 참고하여 a문자와 b문자만을 합하여 별도의 문자열을 만들어서 출력하시오.
		 * 3. 문자의 길이 찾기
		 * 	 a라는 문자가 연속적으로 몇개 있는지를 찾는 문제. 위 문자열에서 a가 연속적으로 두개 나오면 깊이는 2이다.
		 * 	 이런 방식으로 분석한다면 id라는 문자에서 a의 깊이는 무엇인가? (이때 깊이가 가장 깊은 것을 출력)
		 * 4. 3번 연계 가장 긴 aaa를 kkk로 변경!
		 * 
		 * 
		 * 		<어려운 문제를 낸 의도>
		 * 	- 정확한 나의 기술을 알고 있어야한다.
		 *  - 우리가 배운 기술에서 문제를 해결해야함.
		 *  
		 *  - 4개월을 배우고 자격증 : 취업에 미스가 된다면... 억울..
		 *  
		 *  - 프로그래밍적 사고 + 도구 : java, C, C++, 파이썬 전부 해당
		 *   > 인터넷 소스 검색, 내가 아는 것 외에 것을 자꾸 찾으려는 습관 <정확한 개념을 파악하는데 방해>
		 *   > 내가 정확하게 아는 기술을 자꾸 써먹으려고 하면 실력이 는다!
		 *   
		 *   
		 *   선언문, 조건문, 반복문, 연산자, 자료형 (정수, 실수, boolean, 문자열)
		 *   이와 관련된 예제를 했던 것을 머릿속에 정리
		 *   정수일 때 연산자 +, 문자일 때 연산자+ 샘플 기억쓰..
		 *   응용문제는
		 *   나는 나의 뇌에게 어떤 명령을 하고 있는가? 세분하기 분석하는 것...<알고리즘적 사고의 시작>
		 */
		
		// 1번
		String id = "abc!!!daaaaaadkaaaadda";
		System.out.print("1번 : ");
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i) || 'b' == id.charAt(i)) {
				System.out.print(id.charAt(i));
			}
		}
		System.out.print("\n");
		
		// 2번
		String result = "";
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i) || 'b' == id.charAt(i)) {
				result += id.charAt(i);
			}
		}
		System.out.println("2번 : "+result);
		
		// 3번
	//	int num = 0;
	//	int cnt=0;
	//	for (int i = 0; i < id.length(); i++) {
	//		if ('a' == id.charAt(i)) {
	//			cnt++;
	//		}else {
	//			if (num < cnt) {
	//				num = cnt;
	//			}
	//			cnt=0;
	//		}
	//	}System.out.println("3번 : "+num);
		
		// 4번
//		String cnts="";
//		String nums="";
		int num = 0;
		int numi = 0;
		int cnt=0;
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i)) {
				cnt++;
				if (num < cnt) {
					num = cnt;
					numi = i+1;
				}
			}else {
				cnt=0;
			}
		}
		System.out.println("깊이 : " + num);
		
		for (int i = 0; i < id.length()+1; i++) {
			if (i == numi-num) {
				for (int j = 0; j < num; j++) {
						System.out.print('k');
						i++;
				}
			} else if (i >= numi+1) {
				System.out.print(id.charAt((i-1)));
			} else {
				System.out.print(id.charAt(i));
			}
		}
		
//		for (int i = 0; i < num; i++) {
//		if ('a'==id.charAt(numi-i)) {
//			id.charAt(num1-i) = 'k'; // k로 바꾸는 식을 넣어줘야함!
//		}
//	}
//	
		
		

	}

}
