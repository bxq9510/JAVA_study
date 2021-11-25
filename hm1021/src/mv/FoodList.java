package mv;

public class FoodList {
	String foodName = null;	// 음식명
	int foodPrice = 0;	// 음식 가격
	int foodQuantity = 10;	// 음식 수량
	
	// 음식 전체보기 (관리자)
	public void viewFd() {
		System.out.println(" / 음식명: " + foodName + " / 수량: " + foodQuantity + " / 가격: " + foodPrice);
	}

	// 음식 전체보기 (장바구니)
	public void viewFdList() {
		System.out.print(" / 음식명: " + foodName);
	}
}
