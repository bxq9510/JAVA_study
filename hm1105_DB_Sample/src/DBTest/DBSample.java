package DBTest;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.DAO_hmember;
import DTO.Member_DTO;

public class DBSample {
	private Scanner in = new Scanner(System.in);
	private DAO_hmember dao=new DAO_hmember();

	public DBSample() {
		boolean flag = true;
		while (flag) {
			menu();
			String selNum = in.nextLine();
			switch (selNum) {
			case "1":
				create();
				break;
			case "2":
				read();
				break;
			case "3":
				update();
				break;
			case "4":
				delete();
				break;
			default:
				flag = false;
			}
		}
	}

	// 이 예제는 create() > update() > delete() > read() 순으로 확인
	private void create() {
		// 샘플로 두개의 튜플은 insert
		Member_DTO m = new Member_DTO();
		m.setId("aaa");
		m.setName("aname");
		m.setPwd("1111");
		dao.add(m);
		m = new Member_DTO();
		m.setId("bbb");
		m.setName("bname");
		m.setPwd("2222");
		dao.add(m);
	}

	private void read() {
		ArrayList<Member_DTO> hmemberList = dao.selectAll();
		for (int i = 0; i < hmemberList.size(); i++) {
			hmemberList.get(i).prt();
		}
	}

	private void update() {
		Member_DTO m = new Member_DTO();
		m.setId("aaa");
		m.setName("이름바꿈");
		m.setPwd("1111");
		dao.update(m);
	}

	private void delete() {
		Member_DTO m = new Member_DTO();
		m.setId("bbb");
		dao.delete(m);
	}

	private void menu() {
		System.out.println("1. create");
		System.out.println("2. read");
		System.out.println("3. update");
		System.out.println("4. delete");
	}
}
