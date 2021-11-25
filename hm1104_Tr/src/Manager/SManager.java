package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.DAO_hm;
import DTO.S;

public class SManager {  // ���������� ��ü�� ����� ����(new ������()) �Ҵ��� �˴ϴ�.
	private Scanner in = new Scanner(System.in);
	//private S[] sList = new S[100]; // ������ �������� �������� �迭�� ����
	private ArrayList<S> sListArr= new ArrayList<>();
	private MyS_Manager msMge = new MyS_Manager(this);  // ������ �̷�� ����. ��ü�� �����. �̸� ��ü�� �����
	private BadManager sMge= new BadManager(this);
	private PartManager partMge= new PartManager(this);
	private DAO_hm daoHm = new DAO_hm();
	public SManager() {
		System.out.println("�����ڿ� ���ؼ� ��ü�� �������");
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
		//new MyS_Manager(this);   // ����.. 
		msMge.goStart();  // ������ ������� ��ü�� �����Ͽ� gostart()�޼��带 ȣ���Ͽ��� �޴��� �����Ѵ�.
	}
	private void allviewS() {
		for(int i=0; i < sListArr.size();  i++) {
			System.out.println("##### NO : "+i+" ####");
			sListArr.get(i).prt();
		}
	}
	private void seacrchS() {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��ϼ���");
		String inputT = in.nextLine();
		for(int i=0; i < sListArr.size();  i++) {
			if(inputT.equals(sListArr.get(i).getTitle())){
				sListArr.get(i).prt();
			}
		}
	}
	private void modS() {
		// ������ �������� �ʰڽ��ϴ�... �޸�� ���¸������� �����ϵ��� ������ ��� ���Կ�..
		int modNo = chioceList();
		System.out.println("���ο� �޸� �Է��ϼ���. ������ ������ ������ ���͸� �Է�");
		String newMemo = in.nextLine();
		if(!newMemo.equals("")) {
			sListArr.get(modNo).setMemo(newMemo);
		}
		System.out.println("���¸� �����ϼ���..");  // ���� : ���°� 3���̴ϱ� 3�� �߿� �ϳ��� �Է�����!!
		                                      // �׷��� �̻��¸� SManger�ұ�? S���� �ұ�?(o)
		String[] statF = sListArr.get(modNo).getStatFlag();
		for(int i=0; i < statF.length; i++) {
			System.out.print(statF[i] + " :: ");
		}
		System.out.println(" ������ ���¸� ������");
		String newStatFlag = in.nextLine();
		sListArr.get(modNo).setStat(newStatFlag);
		
	}
	private int chioceList() {
		allviewS();  // ������ ��ȣ�� �𸥴ٴ� �����Ʒ� �ȳ� �޽����� ����� �̴ϴ�.
		System.out.println("������ ��ȣ�� �Է��ϼ���");
		int inputT = in.nextInt();
		in.nextLine();
		return inputT;
	}
	private void delS() {
		// ������ ��ȣ�� ������ ���ڴ�. �ֳĸ� ������ �ߺ��� ���� �����ϱ� ����
		// ��ȣ? ��� ��ȣ�� ����? S  class�� ��ȣ�� ���ݾƿ�? >> arraylist
		int delNo = chioceList();
		sListArr.remove(delNo);			
	}
	private void addS() {
		// �������� �����ϴ� �޼���
		S newS = new S();
		System.out.println("������ �Է��ϼ���");
		String inputT = in.nextLine();
		newS.setTitle(inputT);
		System.out.println("�޸� �Է��ϼ���");
		String inputM = in.nextLine();
		newS.setMemo(inputM);
		sListArr.add(newS);
		// �������� �߰��ϸ鼭 DB�� ������ �Ѵ�.
		daoHm.insert(newS);
	}
	public void menu() {
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.����");
		System.out.println("4.�˻�");
		System.out.println("5.��ü����");
		System.out.println("6.��������������");
		System.out.println("7.���۰���������");
		System.out.println("8.�����ٰ���������");
	}

}
