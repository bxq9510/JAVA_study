package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.S;

public class PartManager {
	private SManager smanagerLink = null;
	private Scanner in = new Scanner(System.in);
	public PartManager(SManager s) {
		this.smanagerLink=s;
	}
	public void goStart() {
		boolean flag = true;
		while(flag) {
			menu();
			System.out.println("메뉴 선택 > ");
			String selNum = in.nextLine();
			switch(selNum) {
			case "1": addManagerS(); break;
			default: flag=false; break;
			}
		}			
	}
	private void addManagerS() {
		// 매니저 추가... SManager어떤 자원이 필요합니가>
		System.out.println("관리자를 지정할 스케줄의 번호를 입력하세요");
		ArrayList<S> sListArr1 = smanagerLink.getsListArr();
		for(int i=0; i < sListArr1.size(); i++) {
			System.out.println("##### NO : "+i+" ####");
			sListArr1.get(i).prt();
		}
		int selNo = in.nextInt();
		in.nextLine();
		System.out.println("관리자 이름을 지정하세요");
		String managerName = in.nextLine();   // 관리자 이름이... S  class
		sListArr1.get(selNo).setManagerName(managerName);
		
	}
	private void menu() {
		// TODO Auto-generated method stub
		System.out.println("1.스케줄 담당자 지정");
	}

}
