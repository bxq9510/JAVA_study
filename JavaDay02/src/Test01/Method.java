package Test01;

public class Method {
	// 배열에 고객의 정보를 저장하는 프로그램..
				//  기능 : 가입, 삭제, 보기, 수정 ....
				// 1. 메서드의 정의와 활용     <point> 
				//      메서드는 기능, 변수는 저장의 의미를 가지고 있다.
		        //   step1. 의미분석 <기능과 변수를 구분하는 것>
		        //      주머니에 돈을 쓸어 담는다      >> 기능: 쓸어담는기능               변수: 주머니
	            //      배열에 문자열을 저장한다       >> 기능 : 배열에 저장한다            변수: 배열, 문자열
				//   step2. 기능의 분류< 기능을 사용하기 위해서 호출하는 자가 넘겨 주는 값이 있다 없다.> - 중요*******
		        //     기능의 정의는 : 과자를 사온다.. 실제 기능은 동생이 한다.. 동생에서 호출할 때(심부를 시킬때) 돈을 안주면 1번, 주면2번의 의미
		        //      주머니에 돈을 쓸어 담는다? 기능: 쓸어 담는 기능이라고 한다면..
		        //      기능을 수행하기 위해서는 주머니와 돈이 라는 것이 있어야 합니다.
		        //      돈이라는 것은 기능 안에서 자체적으로 돈(2만원)을 담는 것과-1,  기능을 사용하면서 돈을 넘겨 주는 것 두 가지가 있다.(*)-2
		        //      A라는 사람이 1번 기능을 사용한다면 2만원 담는 것.             A라는 사람이 만원을 넘겨주면 만원을 담는 것
		        //      B라는 사람이 1번 기능을 사용한다면 2만원 담는 것.             b라는 사람이 5만원을 넘겨주면 오만원 담는 것.
		        //      예) 학생들에게 똑같이 3개의 사탕을 나눠 주려고 한다   >>>  1 or 2
		        //                        >> 어떤 정보도 넘겨 받을 필요가 없다.
		        //      예) 1학년, 2학년, 3학년을 각각 나누어서 학년별로 1,2,3씩 차별적으로 나눠 주려고 한다>>> 1 or 2    
		        //                        >> 기능을 실행할때 학년의정보를 넘겨 주게 됩니다.
		        //   step3. 기능을 처리한 후에 돌려 줘야 할 것이 있는가? <호출한 자에게 넘겨주는 값이 있다, 없다> - 코드의 재사용성과 관련
		        //                                          코드의 재사용성이란 코드를 한번만 작성하고 여러곳에서 가져다 사용하는 것.
		        //      예) 학생들에게 똑같이 3개의 사탕을 나눠 주려고 한다. 돌려줘야 할 값: 사탕3개	
		        // 2. 1차원 배열의 활용 
				// 3. 라이브러리 활용 : Scanner
		
		// 위 기능을 전공적으로 분석을 하면
		//  **  기능의 정의와 기능의 호출로 구분한다.  정의서 1개,  호출부는 여러개..  중복된 코드를 메서드 처리하여 여러 부분에서 가져다 사용(호출)할 수 있다.
		//      특수문자가 포함되었는지의 기능을 정의는 1개.  호출은 ? 1.아이디에 유효성에서 사용, 2. 비밀번호 유효성..
		//  **  기능을 수행하기 위해서 호출부에서 자료를 전달하는 것을 파라미터라고 부릅니다.
		//      파라미터의 정의는 ? 호출부에서(주어생략 절대 하시 마세요) 기능을 호출할때 넘겨주는 값(값의 종류 int, String, boolean, char...)
		//                                       인간은 지폐라는 자료형을 이해하지만 컴퓨터가 이해하는 자료형은 위와 같다..
		// ******* 호출부에서 기능을 호출할때 기능의 결과값을 받을 것인가? ... (리턴값)
		
		
		public static void checkSign() {   // 메서드 정의  : 괄호를 보고 알 수 있다. 파라미터필요없음 , 개발자가 정의한 메서드, 개발자재량
			System.out.println("checkSign 기능이 수행됩니다."); // 메서드는 하나의 기능을 수행하도록 만드는 것이 원칙.
		}          // id유효성체크와 배열에 저장이라는 기능이 있을 경우는 각각  따로 메서드 처리 한다.
		
		public static void printID(String id) {   // 호출부에서 아이드를 넘겨 주면 해당 id를 출력하는 메서드 정의// 파라미터타입 선언
			System.out.println("당신이 입력한 아이디는 : "+id);
		}
		public static void checkUseID(String id) {
			 System.out.println("휴효성을 검사할 아이디 : "+id);
		}
		public static void main(String[] args) {  // 메서드 정의 : 괄호를 보고 알 수 있다.파라미터가 문자열 배열임
			                                      // 메서드 기능 : 자바 프로그램이 시작일때 처음으로 실행되는 기능 <변경 불가능>
			printID("aaaa");
			printID("bbbb");
			checkUseID("kkkabc");
			checkSign();  // 메서드의 호출
			System.out.println("hahaha");
			checkSign();
			System.out.println("gogogo");
		
		}
		/**
		 *   참고 > 메서드 명은  메서드명으로 통해서 기능이 유추되어야 합니다.. 변수명도 마찬가지 네이밍규칙..(유투
		 *   문제1 > 넘겨 받은 문자열에 특수 문자가 포함되었지 확인하는 메서드를 정의하고 샘플로 호출해 보세요.
		 *          메서드 내부에 기능을 구현하지 말고 다음 코드로 대체한다.
		 *          System.out.println("휴효성을 검사할 아이디 : "+id);
		 * 
		 */
}
