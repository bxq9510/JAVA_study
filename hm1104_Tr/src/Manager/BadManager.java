package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.S;

public class BadManager {
	//설계
	private SManager smanagerLink = null;// 기존에 객체를 참조해야 하는데? 이러면 새로만드는건데??//주입결론
	                                     // 누가 주입을 해야 할까?? SManager가 적당.
	private ArrayList<S> sBadListArr= new ArrayList<>();  
	private Scanner in = new Scanner(System.in);
	public BadManager(SManager s) {
		this.smanagerLink=s;
	}
	
	public void goStart() {
		boolean flag = true;
		while(flag) {
			menu();
			System.out.println("메뉴 선택 > ");
			String selNum = in.nextLine();
			switch(selNum) {
			case "1": addBadS(); break;
			case "2": allBadviewS();break;
			default: flag=false; break;
			}
		}			
	}	
	private void allBadviewS() {
		// TODO Auto-generated method stub
		for(int i=0; i < sBadListArr.size();  i++) {
			System.out.println("##### NO : "+i+" ####");
			sBadListArr.get(i).prt();
		}
	}

	private void menu() {
		// TODO Auto-generated method stub
		System.out.println("1.추가");
		System.out.println("2.전체보기");
	}
	
	private void addBadS() {
		System.out.println("별도로 관리할 스케줄의 번호를 입력하세요");
		ArrayList<S> sListArr1 = smanagerLink.getsListArr();
		for(int i=0; i < sListArr1.size(); i++) {
			System.out.println("##### NO : "+i+" ####");
			sListArr1.get(i).prt();
		}		
		int selNo = in.nextInt();
		in.nextLine();
		// SManager의 listArr 리스트와 공유
		sBadListArr.add(sListArr1.get(selNo));
	}
}
