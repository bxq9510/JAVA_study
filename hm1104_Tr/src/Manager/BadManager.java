package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.S;

public class BadManager {
	//����
	private SManager smanagerLink = null;// ������ ��ü�� �����ؾ� �ϴµ�? �̷��� ���θ���°ǵ�??//���԰��
	                                     // ���� ������ �ؾ� �ұ�?? SManager�� ����.
	private ArrayList<S> sBadListArr= new ArrayList<>();  
	private Scanner in = new Scanner(System.in);
	public BadManager(SManager s) {
		this.smanagerLink=s;
	}
	
	public void goStart() {
		boolean flag = true;
		while(flag) {
			menu();
			System.out.println("�޴� ���� > ");
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
		System.out.println("1.�߰�");
		System.out.println("2.��ü����");
	}
	
	private void addBadS() {
		System.out.println("������ ������ �������� ��ȣ�� �Է��ϼ���");
		ArrayList<S> sListArr1 = smanagerLink.getsListArr();
		for(int i=0; i < sListArr1.size(); i++) {
			System.out.println("##### NO : "+i+" ####");
			sListArr1.get(i).prt();
		}		
		int selNo = in.nextInt();
		in.nextLine();
		// SManager�� listArr ����Ʈ�� ����
		sBadListArr.add(sListArr1.get(selNo));
	}
}
