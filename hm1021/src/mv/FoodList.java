package mv;

public class FoodList {
	String foodName = null;	// ���ĸ�
	int foodPrice = 0;	// ���� ����
	int foodQuantity = 10;	// ���� ����
	
	// ���� ��ü���� (������)
	public void viewFd() {
		System.out.println(" / ���ĸ�: " + foodName + " / ����: " + foodQuantity + " / ����: " + foodPrice);
	}

	// ���� ��ü���� (��ٱ���)
	public void viewFdList() {
		System.out.print(" / ���ĸ�: " + foodName);
	}
}
