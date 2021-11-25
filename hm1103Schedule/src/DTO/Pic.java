package DTO;

import java.util.ArrayList;

public class Pic {
	private String name = null;
	private ArrayList<Schedule> partList = new ArrayList<>();
	
	public Pic() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Schedule> getPartList() {
		return partList;
	}
	public void setPartList(ArrayList<Schedule> partList) {
		this.partList = partList;
	}
	public void prt() { 
		System.out.println(this.name);
	}
	public void prtSchedule() {
		for (int i = 0; i < partList.size(); i++) {
			System.out.println(this.partList.get(i).getName() + " / " 
		+ this.partList.get(i).getContent() + " / " + this.partList.get(i).getStatus());
		}
	}
}
