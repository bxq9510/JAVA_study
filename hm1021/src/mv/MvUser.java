package mv;

import java.util.ArrayList;
import java.util.Scanner;

public class MvUser {
	Scanner in = new Scanner(System.in); // 스케너
	String id = null; // 사용자 아이디
	String pw = null; // 사용자 비밀번호
	int point = 0; // 포인트
	ArrayList<MovieList> mlist = new ArrayList<>(); // 자료형 타입 MovieList인 ArrayList (매개변수로 받은 영화저장)
	ArrayList<FoodList> flist = new ArrayList<>(); // 자료형 타입 FoodList인 ArrayList (매개변수로 받은 음식저장)
	ArrayList<MovieList> mvList = new ArrayList<>(); // 자료형 타입 MovieList인 ArrayList (장바구니 영화저장)
	ArrayList<FoodList> fdList = new ArrayList<>(); // 자료형 타입 FoodList인 ArrayList (장바구니 음식저장)
	ArrayList<Integer> mvSeat = new ArrayList<>(); // 장바구니 (영화 좌석 정보 저장)
	ArrayList<Integer> fdNum = new ArrayList<>(); // 장바구니 (음식 수량 정보 저장)

	MvUser(ArrayList<MovieList> movieList, ArrayList<FoodList> foodList) { // 주입방식 생성자
		flist = foodList; // 매개변수로 받은 movieList, foodList 객체의 주소를 저장
		mlist = movieList;
	}

	// 사용자 전체보기
	public void viewMem() {
		System.out.println(" / id: " + id + " / pw: " + pw);
	}

	// 로그인 완료 후 메뉴
	public void afterLogin() {
		System.out.println(id + "님 환영합니다!");
		while (true) {
			System.out.println("1.영화 예매" + "\n" + "2.음식 주문" + "\n" + "3.장바구니" + 
								"\n" + "4.포인트 충전" + "\n" + "5.로그아웃");
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
				System.out.println("로그아웃!");
				break;
			} else {
				System.out.println("다시 선택하여 주십시오");
			}
		}
	}

	// 영화 예매
	private void mvOrder() {
		int s = 0;
		System.out.println("영화 예매입니다");
		for (int i = 0; i < mlist.size(); i++) {
			System.out.print((i + 1) + "번 : ");
			mlist.get(i).viewMv();
		}
		System.out.println("영화의 번호를 입력하여 주십시오" + "\n" + "0 누르면 종료");
		while (true) {
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum <= mlist.size()) {
				if (selNum == 0) {
					System.out.println("영화 예매 종료!");
					break;
				} else {
					System.out.println("상영관: " + mlist.get(selNum - 1).roomName + ", "
							+ "좌석: 1번~" + mlist.get(selNum - 1).seats.size() + "번 입니다");
					while (true) {
						System.out.println("좌석을 선택하여 주십시오");
						s = in.nextInt();
						in.nextLine();
						if (s > 0 && s <= mlist.get(selNum - 1).seats.size()) {
							if (mlist.get(selNum - 1).seats.get(s-1) == 0) {
								mlist.get(selNum - 1).seats.set((s-1), 1);
								mvSeat.add(s);
								break;
							} else {
								System.out.println("이미 예약된 좌석입니다");
							}
						} else {
							System.out.println("좌석은 1번~" + mlist.get(selNum - 1).seats.size()
												+ "번 입니다.");
						}
					}
					mvList.add(mlist.get(selNum - 1));
					System.out.println("영화: " + mlist.get(selNum - 1).movieName + 
									", 좌석: " + s + "번" + " 담았습니다");
					break;
				}
			} else {
				System.out.println("다시 선택하여 주십시오");
			}
		}
	}

	// 음식 주문
	private void fdOrder() {
		System.out.println("음식 주문입니다");
		for (int i = 0; i < flist.size(); i++) {
			System.out.print((i + 1) + "번 : ");
			flist.get(i).viewFd();
		}
		System.out.println("음식의 번호를 입력하여 주십시오" + "\n" + "0 누르면 종료");
		while (true) {
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum <= flist.size()) {
				if (selNum == 0) {
					System.out.println("음식 주문 종료!");
					break;
				} else {
					System.out.println("주문 수량을 입력하여 주십시오");
					int f = in.nextInt();
					in.nextLine();
					if (f > 0 && f <= flist.get(selNum - 1).foodQuantity) {
						fdNum.add(f);
						fdList.add(flist.get(selNum - 1));
						flist.get(selNum - 1).foodQuantity -= f;
						System.out.println(flist.get(selNum - 1).foodName +
											" 음식 " + f + "개 담았습니다");
						break;
					} else {
						System.err.println("수량을 확인해 주십시오");
					}
				}
			} else {
				System.out.println("다시 선택하여 주십시오");
			}
		}
	}

	// 장바구니 및 결제
	private void viewList() {
		int totalPrice = 0;
		if (mvList.size() > 0) {
			System.out.println("예약 영화");
			for (int i = 0; i < mvList.size(); i++) {
				mvList.get(i).viewMvList();
				System.out.println(" / 좌석: " + mvSeat.get(i));
				totalPrice += mvList.get(i).moviePrice;
			}
		}
		if (fdList.size() > 0) {
			System.out.println("주문 음식");
			for (int i = 0; i < fdList.size(); i++) {
				fdList.get(i).viewFdList();
				System.out.println(" / 수량: " + fdNum.get(i) + " / 가격: "
									+ fdList.get(i).foodPrice * fdNum.get(i));
				totalPrice += fdList.get(i).foodPrice * fdNum.get(i);
			}
		}
		if (fdList.size() == 0 && mvList.size() == 0) {
			System.out.println("장바구니가 비어있습니다");
		}
		System.out.println("총합 : " + totalPrice + "원");
		if (totalPrice > point) {
			System.out.println("현재 포인트 : " + point);
			System.out.println("포인트를 충전하십시오");
			System.out.println("충전하시겠습니까? ( Y / N )");
			String input = in.nextLine();
			if (input.equalsIgnoreCase("y")) {
				plusPoint();
			} else if (input.equalsIgnoreCase("n")) {
				System.out.println("장바구니 종료!");
			} else {
				System.out.println("다시 선택해 주십시오");
			}
		} else {
			System.out.println("결제하시겠습니까? ( Y / N )");
			String input = in.nextLine();
			if (input.equalsIgnoreCase("y")) {
				point -= totalPrice;
				mvList.clear();
				fdList.clear();
				mvSeat.clear();
				fdNum.clear();
				System.out.println("결제되었습니다!");
				System.out.println("남은 포인트 : " + point);
			} else if (input.equalsIgnoreCase("n")) {
				System.out.println("장바구니 종료!");
			} else {
				System.out.println("다시 선택해 주십시오");
			}
		}
	}

	// 포인트 충전
	private void plusPoint() {
		System.out.println("현재 포인트 : " + point);
		System.out.println("포인트 충전입니다");
		System.out.println("충전하실 금액을 입력하여 주십시오");
		int p = in.nextInt();
		in.nextLine();
		point += p;
		System.out.println("충전 완료!");
		System.out.println("충전 후 포인트 : " + point);
	}
}
