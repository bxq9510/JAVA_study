package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.S;

public class MyS_Manager {
	private SManager sManagerLink = null;  // 2�ܰ� �� ������ �޾�����?
	private Scanner in = new Scanner(System.in);
	private ArrayList<S> sListArr= new ArrayList<>();  // ������ �����ϴ½������� ������ �̴ϴ�.
	public MyS_Manager(SManager s) {
		this.sManagerLink=s;  // ��ü�� �ּҸ� ���Թ޾Ҵ�... 
		// TODO Auto-generated constructor stub
		
		
	}
	public void goStart() {
		boolean flag = true;
		while(flag) {
			menu();
			System.out.println("�޴� ���� > ");
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
		System.out.println("������ ������ �������� ��ȣ�� �Է��ϼ���");
		ArrayList<S> sListArr1 = sManagerLink.getsListArr(); 
		for(int i=0; i < sListArr1.size(); i++) {
			System.out.println("##### NO : "+i+" ####");
			sListArr1.get(i).prt();
		}		
		int selNo = in.nextInt();
		in.nextLine();
		// SManager�� listArr ����Ʈ�� ����
		sListArr.add(sListArr1.get(selNo));
		// �Ʒ��ڵ�� ���纹���� ������ ����� �ڵ�
		/*S s = new S();
		s.setTitle(sListArr.get(selNo).getTitle());
		sListArr.add(s);*/
	}
	private void menu() {
		// TODO Auto-generated method stub
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ü����");
	}
	/**
	    *  1. �߰� 2. ���� 3. ��ü���� <���⼭�� ������ ��ü�� �����ϰų� ���� �� �� ����. ���� ������ ������ ����Ʈ�� ������ ��>
	    *             *1�� �߰������� ���� >>  �������� ���� ��� �� �Ŀ� ������ �����ϵ��� �߰� �� �� �ֽ��ϴ�.
           *SManager�� private ArrayList<S> sListArr= new ArrayList<>(); ���⿡ �������� ����
           * 1. MyS_Manager �� SManager ��ü�� ���� �� �� �־���մϴ�. �̶� ��ü�� ���� ����� �ȵȴ�.
           *    �׷��� ��� ����??  �ּҸ� �޾� �;� �Ѵ�.<�����ڷκ���>
           *    
* ���� 1�� Ŭ�������� �������� �����ϸ� 2��Ŭ���������� ������ �������� ������ �Ѵ�.

* ���� 1�� Ŭ�������� �������� �����Ǵ��� 2�� Ŭ���������� ���� ���� �ʾƵ� �ȴ�.


	    * 
	    */
	
}
