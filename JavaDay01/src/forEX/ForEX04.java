package forEX;

public class ForEX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <Today Coding> **어제 오늘 배운 기술만 사용**
		/**
		 * 1. 0부터 20까지의 홀수의 합을 구하시오
		 * 2. 0부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과를 출력하시오
		 * 3. 0부터 100까지 숫자 중 홀수는 홀수끼리 빼기하고 짝수는 짝수끼리 합한 겂을 각각 출력하시오
		 * 4. 0부터 100까지 숫자 중 3의 배수는 총 몇개입니까?
		 * 5. 0부터 100까지 숫자 중 4의 배수이면서 5의 배수를 모두 출력하시오 -레벨업!-
		 * 6. [범인을 찾아라!] 0부터 100까지 하나씩 더한다. 이때 더한 값을 150을 넘겨버리는 숫자가 범인이다! 범인 출력
		 * 7. [피보나치수열] 1+1+2+3+5+8+13=결과값이 출력 되도록 하시오 <swap>
		 * 	  콜라랑 사이다가 있.. 두 컵을 서로 swap하시오
		 *    swap 포인트는 빈 컵을 만드는 것
		 *    첫번째 이전의 수를 A변수
		 *    두번째 이전의 수를 B변수
		 *    현제의 피보나치를 C변수라고 할 때
		 *    
		 *    1+1+2가 있을 때 다음 피보나치 수를 찾기 위해서는 이전의 수와 두번째 이전의 수를 더해야 합니다.
		 *    
		 *    중요한 것은 1+1+2+3이 되었을 때 또 첫번째 이전의 수와 두번째 이전의 수를 더해야 한다.
		 */

		// 1번. 0부터 20까지의 홀수의 합을 구하시오
		int sum1 = 0;
		for (int i = 0; i < 21; i++) {  // 21번 반복하겠다. 그리고 i를 정수로도 사용하겠다.
			if (i % 2 == 1) {           // 비교 연산자 앞하고 뒤하고 가르다. > 리턴값은 true or false
				sum1 += i;				// 대입연산자는 뒤에 것을 처리한 결과를 앞에다가 저장하라. > 결과값은 자료형 범위
			}
		}
		System.out.println(sum1);

		System.out.println("-------------------");
		// 2번. 0부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과를 출력하시오
		int sum2 = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				sum2 -= i;
			} else {
				sum2 += i;
			}
		}
		System.out.println(sum2);

		System.out.println("-------------------");
		// 3번. 0부터 100까지 숫자 중 홀수는 홀수끼리 빼기하고 짝수는 짝수끼리 합한 겂을 각각 출력하시오
		int even = 0;
		int odd = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd -= i;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		//

		System.out.println("-------------------");
		// 4번. 0부터 100까지 숫자 중 3의 배수는 총 몇개입니까?
		int three = 0;
		for (int i = 0; i < 101; i++) {
			if (i != 0 && i % 3 == 0) {
				three++;
			}
		}
		System.out.println(three);


		System.out.println("-------------------");
		// 5번. 0부터 100까지 숫자 중 4의 배수이면서 5의 배수를 모두 출력하시오
		for (int i = 0; i < 101; i++) {
			if (i != 0 && i % 4 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("-------------------");
		// 6번. [범인을 찾아라!] 0부터 100까지 하나씩 더한다. 이때 더한 값을 150을 넘겨버리는 숫자가 범인이다! 범인 출력
		int sum6 = 0;
		for (int i = 0; i < 101; i++) {
			sum6 += i;
			if (sum6 > 150) {
				System.out.println(i);
				// break;
				i = 101;
			}
		}
		// 6번문제
		// 1 int sum6=0;
//	      for (int i = 0; sum6 < 150; i++) {
//	         sum6+=i;
//	         if(sum6 > 150) {
//	            System.out.println("6. 범인은 "+i+" 이다.");
//	         }
//	      }

		// 2 int sum6=0;
//	      for (int i = 0; i<101; i++) {
//	         
//	         if(sum6 < 150) {
//	            sum6+=i;
//	         }else {
//	            System.out.println("6. 범인은 "+(i-1)+" 이다.");
//	            i=sum6;
//	         }
//	         
//	      }

		// 3 int sum6=0;
//	      for (int i = 0; i<101 && sum6<150; i++) {
//	         sum6+=i;
//	         if(sum6 > 150) {
//	            System.out.println("6. 범인은 "+i+" 이다.");
//	         }
//	      }

		// 4 int sum6=0;
//	      for (int i = 0; i<101; i++) {
//	         sum6+=i;
//	         if(sum6 > 150) {
//	            System.out.println("6. 범인은 "+i+" 이다.");
//	            i=100;
//	         }
//	      }

		// 5 int sum6=0;
//	      for (int i = 0; i<101; i++) {
//	         sum6+=i;
//	         if(sum6>150 && sum6<160) {
//	            System.out.println("6. 범인은 "+i+" 이다.");
//	         }
//	      }
		System.out.println("-------------------");
		// 7번. [피보나치수열] 1+1+2+3+5+8+13=결과값이 출력 되도록 하시오
		int sum7 = 0;
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		for (int i = 0; i < 7; i++) {
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			sum7 += num3;
		}
		System.out.println(sum7);

	}

}
