package mv;

import java.util.ArrayList;

public class MovieList {
	String movieName = null; // ��ȭ��
	int moviePrice = 15000; // ��ȭ ����
	String roomName = null; // �󿵰�
	int seat = 0; // �¼� ��
	ArrayList<Integer> seats = new ArrayList<>(seat);
	int seatNum = 0; // �¼� ��ȣ

	// ��ȭ ��ü���� (������)
	public void viewMv() {
		System.out.println(" / ��ȭ��: " + movieName + " / �󿵰�: " + roomName + " / ����: " + moviePrice);
	}
	
	// ��ȭ ��ü���� (������)
	public void viewMvList() {
		System.out.print(" / ��ȭ��: " + movieName + " / �󿵰�: " + roomName + " / ����: " + moviePrice);
	}
}
