package Manager;

import Member.MemberOBJ;

public class MemberManager {
	// test로 고객하나를 만든다.
	MemberOBJ m = new MemberOBJ();
	GoodsManager gm = new GoodsManager();
	
	MemberManager() {
		addMoney(10000);
	}
	
	public void addMoney(int mm) {
		m.money = mm;
		m.id="aa";	// 다른 페키지 default
		gm.mName="dd";	// 같은 페키지 default
		gm.pwd="22";	// 접근제어자 private
		
		// 19번째 라인의 에러를 해결하기 위해서는 
		// GoodsManager의 pwd 변수의 접근 제어자를 변경해야함
	}
}
