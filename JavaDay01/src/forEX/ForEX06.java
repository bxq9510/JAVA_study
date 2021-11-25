package forEX;

public class ForEX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "abcdefghijklmnopqrstuvwxyz";
		// 너와 나만의 암호 편지
		String nowMemo = "iloveyouz";	// psvclfvbg
		
		// 암호문으로 바꾸세요
		/**
		 * 행운의 숫자는 7이다
		 * i라는 문자열 index에서 7을 더한 index로 치환이 된다
		 * 
		 * 암호문 출력하시오
		 */
		String newMemo = "";
		for (int i = 0; i < nowMemo.length(); i++) {
			for (int j = 0; j < id.length(); j++) {
				if (nowMemo.charAt(i) == id.charAt(j)) {
					if (j+7 > id.length()) {
						newMemo += id.charAt((j+7)-id.length());
					}else {
						newMemo += id.charAt(j+7);
					}
				}
			}
		}
		System.out.println(newMemo);
		
	}

}
