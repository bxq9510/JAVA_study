package Object;

public class Word {
	private String kor = null;
	private String eng = null;
	// �����α׷������� ���� �ϳ��� ���ؼ� �޼��带 �⺻������ ����ϴ�.
	// �� �޼��带 getter, setter
	// �ܺ� ��ü�� �����ϴ� ����� getter, setter
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
