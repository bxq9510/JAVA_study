package DTO;

public class Word_DTO {
	// 객체 만들때는 캡슐화 은닉화를 생각. 은닉화(접근제어자)
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
