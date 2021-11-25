package DTO;

import java.util.ArrayList;

public class S {
	private String title=null;
	private String memo=null;
	private String stat= "미완료";
	// upgrade2 담당자를 지정하기 위한 변수
	private String managerName="미정";
	// 상태를 표현하기 위한 배열
	private String[] statFlag = {"완료","취소","미완료","보류"};  // 은닉화 하기 위해서 ㅁ만들어 졌는데.

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public String[] getStatFlag() {
		return statFlag;   // 통째로 주는 겁니다..
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public void prt() {
		System.out.println("------------------");
		System.out.println("제목 : "+this.title);
		System.out.println("내용 : "+this.memo);
		System.out.println("상태 : "+this.stat);
		System.out.println("관리자 : "+this.managerName);
		System.out.println("------------------");
	}
	
}
