package Manager;

public class GoodsManager {
	String mName = null;
	private String mPwd = null;
	public int mMoney = 0;
	
	GoodsManager(){
		
	}
	
	public void addmMoney(int a) {
		if (mMoney < 1000000) {
			mMoney += a;
		}else {
			System.out.println("�ѹ��� �Ա��� �鸸������ �Դϴ�.");
		}
	}
	
	public void setmName(String name) {
		mName = name;
	}
	
	public void setmPwd(String pwd) {
		mPwd = pwd;
	}
}
