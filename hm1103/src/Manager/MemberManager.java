package Manager;

import Member.MemberOBJ;

public class MemberManager {
	// test�� ���ϳ��� �����.
	MemberOBJ m = new MemberOBJ();
	GoodsManager gm = new GoodsManager();
	
	MemberManager() {
		addMoney(10000);
	}
	
	public void addMoney(int mm) {
		m.money = mm;
		m.id="aa";	// �ٸ� ��Ű�� default
		gm.mName="dd";	// ���� ��Ű�� default
		gm.pwd="22";	// ���������� private
		
		// 19��° ������ ������ �ذ��ϱ� ���ؼ��� 
		// GoodsManager�� pwd ������ ���� �����ڸ� �����ؾ���
	}
}
