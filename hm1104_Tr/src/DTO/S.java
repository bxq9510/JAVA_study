package DTO;

import java.util.ArrayList;

public class S {
	private String title=null;
	private String memo=null;
	private String stat= "�̿Ϸ�";
	// upgrade2 ����ڸ� �����ϱ� ���� ����
	private String managerName="����";
	// ���¸� ǥ���ϱ� ���� �迭
	private String[] statFlag = {"�Ϸ�","���","�̿Ϸ�","����"};  // ����ȭ �ϱ� ���ؼ� ������� ���µ�.

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public String[] getStatFlag() {
		return statFlag;   // ��°�� �ִ� �̴ϴ�..
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
		System.out.println("���� : "+this.title);
		System.out.println("���� : "+this.memo);
		System.out.println("���� : "+this.stat);
		System.out.println("������ : "+this.managerName);
		System.out.println("------------------");
	}
	
}
