package student;

import java.util.ArrayList;
import java.util.Scanner;

public class sMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		sService s = new sService();
		ArrayList<sDTO> sdto = new ArrayList<>();
		while(true) {
			System.out.println("1.학생등록");
			System.out.println("2.검색");
			System.out.println("3.모든학생보기");
			System.out.println("4.종료");
			System.out.print(">>>");
			try {
				num = input.nextInt();
			} catch (Exception e) {
				input.nextLine();
			}
			switch(num) {
			case 1 : sDTO s1 = s.sAdd();
					int i = 0;
					for(i = 0; i < sdto.size(); i++) {
						if(s1.getStudentID() == sdto.get(i).getStudentID()) {
							System.out.println("등록된 학생입니다.");
							break;
						}
					 }
					if(i == sdto.size()) {
						sdto.add(s1);
						System.out.println("등록되었습니다.");
					}
				break;
			case 2 : s.sSearch(sdto);
				break;
			case 3 : s.sAll(sdto);
				break;
			case 4 : System.out.println("프로그램을 종료합니다.");
			 		 System.exit(0);
			}
		}
	}
}
