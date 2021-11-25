package DTO;

public class Member_DTO {
	private String id = null;
	private String name = null;
	private String pwd = null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void prt() {
		System.out.println(this.id + " / " + this.name + " / " + this.pwd);
	}
	
	
}
