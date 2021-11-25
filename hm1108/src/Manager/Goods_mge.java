package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.Goods_DAO;
import DTO.Goods_DTO;

public class Goods_mge {
	private Scanner in = new Scanner(System.in);
	private Goods_DAO dao = new Goods_DAO();
	
	public Goods_mge(){
		boolean flag = true;
		while (flag) {
			menu();
			String selNum = in.nextLine();
			switch (selNum) {
			case "1":
				add();
				break;
			case "2":
				edit();
				break;
			case "3":
				del();
				break;
			case "4":
				search();
				break;
			case "5":
				view1();
				break;
			case "6":
				view2();
				break;
			default:
				flag = false;
			}
		}
	}

	private void add() {
		Goods_DTO good = new Goods_DTO();
		good.setG_id("a1");
		good.setG_name("������ ���");
		good.setG_cnt(10);
		dao.add(good);
		good = new Goods_DTO();
		good.setG_id("a2");
		good.setG_name("������ �̵��");
		good.setG_cnt(10);
		dao.add(good);
		good = new Goods_DTO();
		good.setG_id("a3");
		good.setG_name("������ ����");
		good.setG_cnt(10);
		dao.add(good);
		good = new Goods_DTO();
		good.setG_id("a4");
		good.setG_name("�������");
		good.setG_cnt(10);
		dao.add(good);
	}

	private void edit() {
		Goods_DTO good = new Goods_DTO();
		System.out.println("������ ������ ���̵� �Է��� �ֽʽÿ�.");
		good.setG_id(in.nextLine());
		System.out.println("���ο� �̸��� �Է��� �ֽʽÿ�.");
		good.setG_name(in.nextLine());
		System.out.println("������ �Է��� �ֽʽÿ�.");
		good.setG_cnt(in.nextInt());
		in.nextLine();
		dao.edit(good);
	}

	private void del() {
		Goods_DTO good = new Goods_DTO();
		System.out.println("������ ������ ���̵� �Է��� �ֽʽÿ�.");
		String input = in.nextLine();
		good.setG_id(input);
		dao.del(good);
	}

	private void search() {
		ArrayList<Goods_DTO> hgoodsList = dao.selectAll();
		System.out.println("�˻�:");
		String input = in.nextLine();
		for (int i = 0; i < hgoodsList.size(); i++) {
			if (hgoodsList.get(i).getG_name().contains(input)) {
				hgoodsList.get(i).prt2();
			}
		}
	}

	private void view1() {
		ArrayList<Goods_DTO> hgoodsList = dao.selectAll();
		for (int i = 0; i < hgoodsList.size(); i++) {
			hgoodsList.get(i).prt2();
		}
	}

	private void view2() {
		ArrayList<Goods_DTO> hgoodsList = dao.selectAll();
		for (int i = 0; i < hgoodsList.size(); i++) {
			hgoodsList.get(i).prt1();
		}
		System.out.println("�ڼ��� �˻�(��ȣ):");
		String input = in.nextLine();
		for (int i = 0; i < hgoodsList.size(); i++) {
			if (hgoodsList.get(i).getG_no().equals(input)) {
				hgoodsList.get(i).prt2();
			}
		}
	}

	private void menu() {
		System.out.println("1. ���");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. �˻�");
		System.out.println("5. ��ü1");
		System.out.println("6. ��ü2");
	}
}