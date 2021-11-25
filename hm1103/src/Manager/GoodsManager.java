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
			System.out.println("한번에 입금은 백만원까지 입니다.");
		}
	}
	
	public void setmName(String name) {
		mName = name;
	}
	
	public void setmPwd(String pwd) {
		mPwd = pwd;
	}
}
