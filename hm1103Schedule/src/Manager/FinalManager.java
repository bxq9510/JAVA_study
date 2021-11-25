package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.Schedule;

public class FinalManager {
	private Scanner in = new Scanner(System.in);
	ScheduleManager dlink = null;
	
	public FinalManager(ScheduleManager s) {
		dlink = s;
	}

	public void runDate() {
		ArrayList<Schedule> dList = dlink.getScheduleList();
		System.out.println("<�Ϸ�������> ������ ��ȣ�� �Է��ϼ���");
		for (int i = 0; i < dList.size(); i++) {
			System.out.println("NO." + (i+1));
			dList.get(i).prt();
		}
		int selNo = in.nextInt();
		in.nextLine();
		System.out.println("�Ϸ����� �Է��ϼ���");
		String date = in.nextLine();
		dList.get(selNo).setDate(date);
	}
}
