package forEX;

public class ForEX05 {

	public static void main(String[] args) {
		String id = "abcdaaadd";
		// id 변수에 a라는 문자만 출려하시오
		// 문자와 문자열을 공부했다
		// 문자는 하나의 글자,,, 문자열은 하나 이상의 글자를 문자열이라고 한다
		/** a라는 문자를 출력하기 위해서는 문자열에 앞부분부터 하나씩 잘라서 확인을 해야한다
		 * a		b		c		d		a		a		a		d		d
		 * 비교		비교	비교	비교	비교	비교	비교	비교	비교
		 * 출력								출력	출력	출력
		 */
		
		System.out.println(id.charAt(2));	// id라는 문자열에서 2번째 문자를 잘라내고 출력하여라
		// System.out.println(id.charAt(i));	// 문자까지는 잘라냈
		
		for (int i = 0; i < id.length(); i++) {		// 여기서 i는 for문의 반복
			if ('a' == id.charAt(i)) {				// "" -> 문자열, '' -> 문자		// 여기서 i는 문자열의 위치를 의미
				System.out.println(id.charAt(i));
			}
		}
		int num=0;
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i)) {
				num++;
			}
		}System.out.println(num);
		
		/**
		 * 1. 위 소스를 참고하여 a와 b문자만 출력하게 하시오.
		 * 2. 위 소스를 참고하여 a문자와 b문자만을 합하여 별도의 문자열을 만들어서 출력하시오.
		 * 3. 문자의 길이 찾기
		 * 	 a라는 문자가 연속적으로 몇개 있는지를 찾는 문제. 위 문자열에서 a가 연속적으로 두개 나오면 깊이는 2이다.
		 * 	 이런 방식으로 분석한다면 id라는 문자에서 a의 깊이는 무엇인가? (이때 깊이가 가장 깊은 것을 출력)
		 */
		
		// 1번
		int cnt=0;
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i)) {
				System.out.println(id.charAt(i));
			}else if ('b' == id.charAt(i)) {
				System.out.println(id.charAt(i));
			}
		}

	}

}