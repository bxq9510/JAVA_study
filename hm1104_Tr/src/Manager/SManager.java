package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.DAO_hm;
import DTO.S;

public class SManager {  // 전역변수는 객체가 만들어 질때(new 생성자()) 할당이 됩니다.
	private Scanner in = new Scanner(System.in);
	//private S[] sList = new S[100]; // 각각의 독립도니 스케줄을 배열로 관리
	private ArrayList<S> sListArr= new ArrayList<>();
	private MyS_Manager msMge = new MyS_Manager(this);  // 주입이 이루어 졌다. 객체를 만든다. 미리 객체를 만들고
	private BadManager sMge= new BadManager(this);
	private PartManager partMge= new PartManager(this);
	private DAO_hm daoHm = new DAO_hm();
	public SManager() {
		System.out.println("생성자에 의해서 객체가 만들어짐");
		boolean flag = true;
		while(flag) {
			menu();
			String selNum = in.nextLine();
			switch(selNum) {
			case "1": addS(); break;
			case "2": delS(); break;
			case "3": modS(); break;
			case "4": seacrchS(); break;
			case "5": allviewS();break;
			case "6": mySList(); break;
			case "7": myBadSList(); break;
			case "8": inputMSGList(); break;
			default: flag=false; break;
			}
		}		
	}
	private void inputMSGList() {
		// TODO Auto-generated method stub
		partMge.goStart();
	}
	private void myBadSList() {
		// TODO Auto-generated method stub
		sMge.goStart();
	}
	public ArrayList<S> getsListArr() {
	//	ArrayList<S> sListArr= new ArrayList<>();
		return sListArr;  
	}
	private void mySList() {
		// TODO Auto-generated method stub
		//new MyS_Manager(this);   // 주입.. 
		msMge.goStart();  // 위에서 만들어진 객체를 참조하여 gostart()메서드를 호출하여서 메뉴를 실행한다.
	}
	private void allviewS() {
		for(int i=0; i < sListArr.size();  i++) {
			System.out.println("##### NO : "+i+" ####");
			sListArr.get(i).prt();
		}
	}
	private void seacrchS() {
		// TODO Auto-generated method stub
		System.out.println("제목을 입력하세요");
		String inputT = in.nextLine();
		for(int i=0; i < sListArr.size();  i++) {
			if(inputT.equals(sListArr.get(i).getTitle())){
				sListArr.get(i).prt();
			}
		}
	}
	private void modS() {
		// 제목은 수정하지 않겠습니다... 메모와 상태만수정이 가능하도록 컨셉을 잡아 볼게요..
		int modNo = chioceList();
		System.out.println("새로운 메모를 입력하세요. 수정을 원하지 않으면 엔터를 입력");
		String newMemo = in.nextLine();
		if(!newMemo.equals("")) {
			sListArr.get(modNo).setMemo(newMemo);
		}
		System.out.println("상태를 수정하세요..");  // 컨셉 : 상태가 3개이니까 3개 중에 하나를 입력하자!!
		                                      // 그러면 이상태를 SManger할까? S에서 할까?(o)
		String[] statF = sListArr.get(modNo).getStatFlag();
		for(int i=0; i < statF.length; i++) {
			System.out.print(statF[i] + " :: ");
		}
		System.out.println(" 위에서 상태를 고르세요");
		String newStatFlag = in.nextLine();
		sListArr.get(modNo).setStat(newStatFlag);
		
	}
	private int chioceList() {
		allviewS();  // 삭제할 번호를 모른다는 가정아래 안내 메시지를 출력한 겁니다.
		System.out.println("삭제할 번호를 입력하세요");
		int inputT = in.nextInt();
		in.nextLine();
		return inputT;
	}
	private void delS() {
		// 스케줄 번호로 삭제해 보겠다. 왜냐면 제목이 중복될 수도 있으니까 ㅎㅎ
		// 번호? 어떻게 번호를 알죠? S  class에 번호가 없잖아요? >> arraylist
		int delNo = chioceList();
		sListArr.remove(delNo);			
	}
	private void addS() {
		// 스케줄을 저장하는 메서드
		S newS = new S();
		System.out.println("제목을 입력하세요");
		String inputT = in.nextLine();
		newS.setTitle(inputT);
		System.out.println("메모를 입력하세요");
		String inputM = in.nextLine();
		newS.setMemo(inputM);
		sListArr.add(newS);
		// 스케줄을 추가하면서 DB에 저장을 한다.
		daoHm.insert(newS);
	}
	public void menu() {
		System.out.println("1.입력");
		System.out.println("2.삭제");
		System.out.println("3.수정");
		System.out.println("4.검색");
		System.out.println("5.전체보기");
		System.out.println("6.별도관리스케줄");
		System.out.println("7.나쁜관리스케줄");
		System.out.println("8.스케줄관리자지정");
	}

}
