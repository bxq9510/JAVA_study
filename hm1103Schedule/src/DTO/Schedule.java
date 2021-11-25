package DTO;

public class Schedule {
	private String name = null;
	private String content = null;
	private String status = null;
	private String date = null;
	private String[] stat = {"미완료", "완료", "취소"}; 
	
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
		System.out.println("제목 : " + this.name + "\n" + "내용 : " + this.content + "\n"
							+ "상태 : " + this.status + "완료 : " + this.date);
	}
	
}
