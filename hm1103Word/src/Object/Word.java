package Object;

public class Word {
	private String kor = null;
	private String eng = null;
	// 웹프로그램에서는 변수 하나에 대해서 메서드를 기본적으로 만듭니다.
	// 이 메서드를 getter, setter
	// 외부 객체가 접근하는 방법을 getter, setter
	public String getKor() { // getter
		return kor;
	}
	public void setKor(String kor) { // setter
		this.kor = kor;
	}
	public String getEng() { // getter
		return eng;
	}
	public void setEng(String eng) { // setter
		this.eng = eng;
	}
	public void prt() { 
		System.out.println(this.eng + "/" + this.kor);
	}
	
}
