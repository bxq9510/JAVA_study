package forEX;

public class ForEX05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 1. �� �ҽ��� �����Ͽ� a�� b���ڸ� ����ϰ� �Ͻÿ�.
		 * 2. �� �ҽ��� �����Ͽ� a���ڿ� b���ڸ��� ���Ͽ� ������ ���ڿ��� ���� ����Ͻÿ�.
		 * 3. ������ ���� ã��
		 * 	 a��� ���ڰ� ���������� � �ִ����� ã�� ����. �� ���ڿ����� a�� ���������� �ΰ� ������ ���̴� 2�̴�.
		 * 	 �̷� ������� �м��Ѵٸ� id��� ���ڿ��� a�� ���̴� �����ΰ�? (�̶� ���̰� ���� ���� ���� ���)
		 * 4. 3�� ���� ���� �� aaa�� kkk�� ����!
		 * 
		 * 
		 * 		<����� ������ �� �ǵ�>
		 * 	- ��Ȯ�� ���� ����� �˰� �־���Ѵ�.
		 *  - �츮�� ��� ������� ������ �ذ��ؾ���.
		 *  
		 *  - 4������ ���� �ڰ��� : ����� �̽��� �ȴٸ�... ���..
		 *  
		 *  - ���α׷����� ��� + ���� : java, C, C++, ���̽� ���� �ش�
		 *   > ���ͳ� �ҽ� �˻�, ���� �ƴ� �� �ܿ� ���� �ڲ� ã������ ���� <��Ȯ�� ������ �ľ��ϴµ� ����>
		 *   > ���� ��Ȯ�ϰ� �ƴ� ����� �ڲ� ��������� �ϸ� �Ƿ��� �´�!
		 *   
		 *   
		 *   ����, ���ǹ�, �ݺ���, ������, �ڷ��� (����, �Ǽ�, boolean, ���ڿ�)
		 *   �̿� ���õ� ������ �ߴ� ���� �Ӹ��ӿ� ����
		 *   ������ �� ������ +, ������ �� ������+ ���� ��ﾲ..
		 *   ���빮����
		 *   ���� ���� ������ � ����� �ϰ� �ִ°�? �����ϱ� �м��ϴ� ��...<�˰����� ����� ����>
		 */
		
		// 1��
		String id = "abc!!!daaaaaadkaaaadda";
		System.out.print("1�� : ");
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i) || 'b' == id.charAt(i)) {
				System.out.print(id.charAt(i));
			}
		}
		System.out.print("\n");
		
		// 2��
		String result = "";
		for (int i = 0; i < id.length(); i++) {
			if ('a' == id.charAt(i) || 'b' == id.charAt(i)) {
				result += id.charAt(i);
			}
		}
		System.out.println("2�� : "+result);
		
		// 3��
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
	//	}System.out.println("3�� : "+num);
		
		// 4��
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
		System.out.println("���� : " + num);
		
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
//			id.charAt(num1-i) = 'k'; // k�� �ٲٴ� ���� �־������!
//		}
//	}
//	
		
		

	}

}
