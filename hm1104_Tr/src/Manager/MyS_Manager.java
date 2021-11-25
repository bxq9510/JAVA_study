package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.S;

public class MyS_Manager {
	private SManager sManagerLink = null;  // 2단계 왜 주입을 받았을까?
	private Scanner in = new Scanner(System.in);
	private ArrayList<S> sListArr= new ArrayList<>();  // 별도로 관리하는스케줄을 저장할 겁니다.
	public MyS_Manager(SManager s) {
		this.sManagerLink=s;  // 객체의 주소를 주입받았다... 
		// TODO Auto-generated constructor stub
		
		
	}
	public void goStart() {
		boolean flag = true;
		while(flag) {
			menu();
			System.out.println("메뉴 선택 > ");
			String selNum = in.nextLine();
			switch(selNum) {
			case "1": addS(); break;
			case "2": delS(); break;
			case "3": allviewS();break;
			default: flag=false; break;
			}
		}			
	}
	private void allviewS() {
		for(int i=0; i < sListArr.size();  i++) {
			System.out.println("##### NO : "+i+" ####");
			sListArr.get(i).prt();
		}
		
	}
	private void delS() {
		// TODO Auto-generated method stub
	}
	private void addS() {
		System.out.println("별도로 관리할 스케줄의 번호를 입력하세요");
		ArrayList<S> sListArr1 = sManagerLink.getsListArr(); 
		for(int i=0; i < sListArr1.size(); i++) {
			System.out.println("##### NO : "+i+" ####");
			sListArr1.get(i).prt();
		}		
		int selNo = in.nextInt();
		in.nextLine();
		// SManager의 listArr 리스트와 공유
		sListArr.add(sListArr1.get(selNo));
		// 아래코드는 복사복으로 저장할 경우의 코드
		/*S s = new S();
		s.setTitle(sListArr.get(selNo).getTitle());
		sListArr.add(s);*/
	}
	private void menu() {
		// TODO Auto-generated method stub
		System.out.println("1.입력");
		System.out.println("2.삭제");
		System.out.println("3.전체보기");
	}
	/**
	    *  1. 추가 2. 삭제 3. 전체보기 <여기서는 스케줄 자체를 수정하거나 삭제 할 수 없다. 단지 별도의 스케줄 리스트에 저장할 뿐>
	    *             *1번 추가에대한 내용 >>  스케쥴을 먼저 등록 한 후에 별도로 관리하도록 추가 할 수 있습니다.
           *SManager의 private ArrayList<S> sListArr= new ArrayList<>(); 여기에 스케줄이 있죠
           * 1. MyS_Manager 가 SManager 객체를 참조 할 수 있어야합니다. 이때 객체를 새로 만들면 안된다.
           *    그러면 어떻게 알지??  주소를 받아 와야 한다.<생성자로부터>
           *    
* 만약 1번 클래스에서 스케줄을 수정하면 2번클래스에서도 수정된 스케줄이 보여야 한다.

* 만약 1번 클래스에서 스케줄이 삭제되더라도 2번 클래스에서는 삭제 되지 않아도 된다.


	    * 
	    */
	
}
