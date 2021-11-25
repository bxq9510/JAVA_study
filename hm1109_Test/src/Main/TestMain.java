package Main;

import DAO.Word_DAO;

public class TestMain {
	public static int timemoney1 = 4000;
	public final static int timemoney2 = 5000; // final > 값 변경 불가, 상수
	public static void main(String[] args) {
		Word_DAO h1 = Word_DAO.getInstance();
		Word_DAO h2 = Word_DAO.hword_dao;
		TestMain.timemoney1 = 8000;
//		TestMain.timemoney2 = 5000;
	}

}
