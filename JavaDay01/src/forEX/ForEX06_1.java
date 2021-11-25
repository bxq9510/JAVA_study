package forEX;

public class ForEX06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for문은? 반복한다는 것
		// 이중 for문은.. 이중으로 반복한다는것
		// 반복할 문장을.. 하나의 세트로 한다면, 이 세트를 다시 반복하는 것이 이중 반복문..
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "X" + i + "=" + (i*j) + " / ");
			}
			System.out.println();
		}
		
		/**
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 * 
		 * 
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 4-i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}


	}

}
