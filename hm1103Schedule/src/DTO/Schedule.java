package DTO;

public class Schedule {
	private String name = null;
	private String content = null;
	private String status = null;
	private String date = null;
	private String[] stat = {"�̿Ϸ�", "�Ϸ�", "���"}; 
	
	public String[] getStat() {
		return stat;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void prt() { 
		System.out.println("���� : " + this.name + "\n" + "���� : " + this.content + "\n"
							+ "���� : " + this.status + "�Ϸ� : " + this.date);
	}
	
}
