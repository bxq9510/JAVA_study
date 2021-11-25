package mv;

import java.util.ArrayList;

public class MovieList {
	String movieName = null; // 영화명
	int moviePrice = 15000; // 영화 가격
	String roomName = null; // 상영관
	int seat = 0; // 좌석 수
	ArrayList<Integer> seats = new ArrayList<>(seat);
	int seatNum = 0; // 좌석 번호

	// 영화 전체보기 (관리자)
	public void viewMv() {
		System.out.println(" / 영화명: " + movieName + " / 상영관: " + roomName + " / 가격: " + moviePrice);
	}
	
	// 영화 전체보기 (관리자)
	public void viewMvList() {
		System.out.print(" / 영화명: " + movieName + " / 상영관: " + roomName + " / 가격: " + moviePrice);
	}
}
