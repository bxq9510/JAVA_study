package mv;

import java.util.ArrayList;
import java.util.Scanner;

public class MvUser {
	Scanner in = new Scanner(System.in); // ���ɳ�
	String id = null; // ����� ���̵�
	String pw = null; // ����� ��й�ȣ
	int point = 0; // ����Ʈ
	ArrayList<MovieList> mlist = new ArrayList<>(); // �ڷ��� Ÿ�� MovieList�� ArrayList (�Ű������� ���� ��ȭ����)
	ArrayList<FoodList> flist = new ArrayList<>(); // �ڷ��� Ÿ�� FoodList�� ArrayList (�Ű������� ���� ��������)
	ArrayList<MovieList> mvList = new ArrayList<>(); // �ڷ��� Ÿ�� MovieList�� ArrayList (��ٱ��� ��ȭ����)
	ArrayList<FoodList> fdList = new ArrayList<>(); // �ڷ��� Ÿ�� FoodList�� ArrayList (��ٱ��� ��������)
	ArrayList<Integer> mvSeat = new ArrayList<>(); // ��ٱ��� (��ȭ �¼� ���� ����)
	ArrayList<Integer> fdNum = new ArrayList<>(); // ��ٱ��� (���� ���� ���� ����)

	MvUser(ArrayList<MovieList> movieList, ArrayList<FoodList> foodList) { // ���Թ�� ������
		flist = foodList; // �Ű������� ���� movieList, foodList ��ü�� �ּҸ� ����
		mlist = movieList;
	}

	// ����� ��ü����
	public void viewMem() {
		System.out.println(" / id: " + id + " / pw: " + pw);
	}

	// �α��� �Ϸ� �� �޴�
	public void afterLogin() {
		System.out.println(id + "�� ȯ���մϴ�!");
		while (true) {
			System.out.println("1.��ȭ ����" + "\n" + "2.���� �ֹ�" + "\n" + "3.��ٱ���" + 
								"\n" + "4.����Ʈ ����" + "\n" + "5.�α׾ƿ�");
			String usrInput = in.nextLine();
			if (usrInput.equals("1")) {
				mvOrder();
			} else if (usrInput.equals("2")) {
				fdOrder();
			} else if (usrInput.equals("3")) {
				viewList();
			} else if (usrInput.equals("4")) {
				plusPoint();
			} else if (usrInput.equals("5")) {
				System.out.println("�α׾ƿ�!");
				break;
			} else {
				System.out.println("�ٽ� �����Ͽ� �ֽʽÿ�");
			}
		}
	}

	// ��ȭ ����
	private void mvOrder() {
		int s = 0;
		System.out.println("��ȭ �����Դϴ�");
		for (int i = 0; i < mlist.size(); i++) {
			System.out.print((i + 1) + "�� : ");
			mlist.get(i).viewMv();
		}
		System.out.println("��ȭ�� ��ȣ�� �Է��Ͽ� �ֽʽÿ�" + "\n" + "0 ������ ����");
		while (true) {
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum <= mlist.size()) {
				if (selNum == 0) {
					System.out.println("��ȭ ���� ����!");
					break;
				} else {
					System.out.println("�󿵰�: " + mlist.get(selNum - 1).roomName + ", "
							+ "�¼�: 1��~" + mlist.get(selNum - 1).seats.size() + "�� �Դϴ�");
					while (true) {
						System.out.println("�¼��� �����Ͽ� �ֽʽÿ�");
						s = in.nextInt();
						in.nextLine();
						if (s > 0 && s <= mlist.get(selNum - 1).seats.size()) {
							if (mlist.get(selNum - 1).seats.get(s-1) == 0) {
								mlist.get(selNum - 1).seats.set((s-1), 1);
								mvSeat.add(s);
								break;
							} else {
								System.out.println("�̹� ����� �¼��Դϴ�");
							}
						} else {
							System.out.println("�¼��� 1��~" + mlist.get(selNum - 1).seats.size()
												+ "�� �Դϴ�.");
						}
					}
					mvList.add(mlist.get(selNum - 1));
					System.out.println("��ȭ: " + mlist.get(selNum - 1).movieName + 
									", �¼�: " + s + "��" + " ��ҽ��ϴ�");
					break;
				}
			} else {
				System.out.println("�ٽ� �����Ͽ� �ֽʽÿ�");
			}
		}
	}

	// ���� �ֹ�
	private void fdOrder() {
		System.out.println("���� �ֹ��Դϴ�");
		for (int i = 0; i < flist.size(); i++) {
			System.out.print((i + 1) + "�� : ");
			flist.get(i).viewFd();
		}
		System.out.println("������ ��ȣ�� �Է��Ͽ� �ֽʽÿ�" + "\n" + "0 ������ ����");
		while (true) {
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum <= flist.size()) {
				if (selNum == 0) {
					System.out.println("���� �ֹ� ����!");
					break;
				} else {
					System.out.println("�ֹ� ������ �Է��Ͽ� �ֽʽÿ�");
					int f = in.nextInt();
					in.nextLine();
					if (f > 0 && f <= flist.get(selNum - 1).foodQuantity) {
						fdNum.add(f);
						fdList.add(flist.get(selNum - 1));
						flist.get(selNum - 1).foodQuantity -= f;
						System.out.println(flist.get(selNum - 1).foodName +
											" ���� " + f + "�� ��ҽ��ϴ�");
						break;
					} else {
						System.err.println("������ Ȯ���� �ֽʽÿ�");
					}
				}
			} else {
				System.out.println("�ٽ� �����Ͽ� �ֽʽÿ�");
			}
		}
	}

	// ��ٱ��� �� ����
	private void viewList() {
		int totalPrice = 0;
		if (mvList.size() > 0) {
			System.out.println("���� ��ȭ");
			for (int i = 0; i < mvList.size(); i++) {
				mvList.get(i).viewMvList();
				System.out.println(" / �¼�: " + mvSeat.get(i));
				totalPrice += mvList.get(i).moviePrice;
			}
		}
		if (fdList.size() > 0) {
			System.out.println("�ֹ� ����");
			for (int i = 0; i < fdList.size(); i++) {
				fdList.get(i).viewFdList();
				System.out.println(" / ����: " + fdNum.get(i) + " / ����: "
									+ fdList.get(i).foodPrice * fdNum.get(i));
				totalPrice += fdList.get(i).foodPrice * fdNum.get(i);
			}
		}
		if (fdList.size() == 0 && mvList.size() == 0) {
			System.out.println("��ٱ��ϰ� ����ֽ��ϴ�");
		}
		System.out.println("���� : " + totalPrice + "��");
		if (totalPrice > point) {
			System.out.println("���� ����Ʈ : " + point);
			System.out.println("����Ʈ�� �����Ͻʽÿ�");
			System.out.println("�����Ͻðڽ��ϱ�? ( Y / N )");
			String input = in.nextLine();
			if (input.equalsIgnoreCase("y")) {
				plusPoint();
			} else if (input.equalsIgnoreCase("n")) {
				System.out.println("��ٱ��� ����!");
			} else {
				System.out.println("�ٽ� ������ �ֽʽÿ�");
			}
		} else {
			System.out.println("�����Ͻðڽ��ϱ�? ( Y / N )");
			String input = in.nextLine();
			if (input.equalsIgnoreCase("y")) {
				point -= totalPrice;
				mvList.clear();
				fdList.clear();
				mvSeat.clear();
				fdNum.clear();
				System.out.println("�����Ǿ����ϴ�!");
				System.out.println("���� ����Ʈ : " + point);
			} else if (input.equalsIgnoreCase("n")) {
				System.out.println("��ٱ��� ����!");
			} else {
				System.out.println("�ٽ� ������ �ֽʽÿ�");
			}
		}
	}

	// ����Ʈ ����
	private void plusPoint() {
		System.out.println("���� ����Ʈ : " + point);
		System.out.println("����Ʈ �����Դϴ�");
		System.out.println("�����Ͻ� �ݾ��� �Է��Ͽ� �ֽʽÿ�");
		int p = in.nextInt();
		in.nextLine();
		point += p;
		System.out.println("���� �Ϸ�!");
		System.out.println("���� �� ����Ʈ : " + point);
	}
}
