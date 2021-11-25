package forEX;

public class ForEX06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번
		System.out.println("1번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2번
		System.out.println("2번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 11; j++) {
				if (j < 10 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 3번
		System.out.println("3번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 4번
		System.out.println("4번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				if (j <= i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 5번
		System.out.println("5번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 5) {
					if (j <= i) {
						System.out.print("*");
					}
				} else if (i > 4) {
					if (j < 9 - i) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

		// 6번
		System.out.println("6번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 5) {
					if (j < 4 - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i > 4) {
					if (j < i - 4) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

		// 7번
		System.out.println("7번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 5) {
					if (j < 5 - i) {
						System.out.print("*");
					}
				} else if (i > 4) {
					if (j < i - 3) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

		// 8번
		System.out.println("8번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 5) {
					if (j < i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i > 4) {
					if (j < 8 - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

		// 9번
		System.out.println("9번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 11; j++) {
				if (i < 5) {
					if (j < 5-i || j > 5+i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else if (i > 4) {
					if (j < i-3 || j > 13-i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		// 10번
		System.out.println("10번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				if (j < 8-i || j > 8+i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// 10번
		System.out.println("10번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 11번
		System.out.println("11번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				if (j < i || j >= 17-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// 12번
		System.out.println("12번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i < 5) {
					if (j < i || j > 8-i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i > 4) {
					if (j < 8-i || j > i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		
		// 13번
		System.out.println("13번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i < 5) {
					if (j < i || j > i+4) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i > 4) {
					if (j < 8-i || j > 12-i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		
		// 14번
		System.out.println("14번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				if (j == 8+i || j == 8-i || i == 8) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 15번
		System.out.println("15번");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == i || j == 8-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		

	}

}
