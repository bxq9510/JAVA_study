package DTO;

public class Word_DTO {
	// ��ü ���鶧�� ĸ��ȭ ����ȭ�� ����. ����ȭ(����������)
	private String eWord = null;
	private String kWord = null;
	
	public String geteWord() {
		return eWord;
	}
	public void seteWord(String eWord) {
		this.eWord = eWord;
	}
	public String getkWord() {
		return kWord;
	}
	public void setkWord(String kWord) {
		this.kWord = kWord;
	}
	/**
		create table hword(
		eword varchar2(10) primary key,
		kword varchar2(10));
	 */
}
