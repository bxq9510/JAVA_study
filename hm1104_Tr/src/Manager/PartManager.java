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
			System.out.println("�޴� ���� > ");
			String selNum = in.nextLine();
			switch(selNum) {
			case "1": addManagerS(); break;
			default: flag=false; break;
			}
		}			
	}
	private void addManagerS() {
		// �Ŵ��� �߰�... SManager� �ڿ��� �ʿ��մϰ�>
		System.out.println("�����ڸ� ������ �������� ��ȣ�� �Է��ϼ���");
		ArrayList<S> sListArr1 = smanagerLink.getsListArr();
		for(int i=0; i < sListArr1.size(); i++) {
			System.out.println("##### NO : "+i+" ####");
			sListArr1.get(i).prt();
		}
		int selNo = in.nextInt();
		in.nextLine();
		System.out.println("������ �̸��� �����ϼ���");
		String managerName = in.nextLine();   // ������ �̸���... S  class
		sListArr1.get(selNo).setManagerName(managerName);
		
	}
	private void menu() {
		// TODO Auto-generated method stub
		System.out.println("1.������ ����� ����");
	}

}
