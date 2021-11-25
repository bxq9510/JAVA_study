package DTO;

public class Goods_DTO {
	private String g_no = null; // 물건 번호 (유니크한 특징, 주 식별자)
	private String g_id = null; // 물건의 아이디
	private String g_name = null; // 물건 이름
	private int g_cnt = 0; // 수량
	private String g_date = null; // 입력 날짜
	public String getG_no() {
		return g_no;
	}
	public void setG_no(String g_no) {
		this.g_no = g_no;
	}
	public String getG_id() {
		return g_id;
	}
	public void setG_id(String g_id) {
		this.g_id = g_id;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public int getG_cnt() {
		return g_cnt;
	}
	public void setG_cnt(int g_cnt) {
		this.g_cnt = g_cnt;
	}
	public String getG_date() {
		return g_date;
	}
	public void setG_date(String g_date) {
		this.g_date = g_date;
	}
	public void prt1() {
		System.out.println(this.g_no + " / " + this.g_name + " / " + this.g_cnt);
	}
	public void prt2() {
		System.out.println(this.g_no + " / " + this.g_id + " / " + this.g_name + " / " + this.g_cnt + " / " + this.g_date);
	}
	

}
