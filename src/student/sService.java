package student;

import java.util.ArrayList;
import java.util.Scanner;

public class sService {
	private Scanner input = new Scanner(System.in);
	
	public sDTO sAdd() {
		sDTO su1 = new sDTO();
		int num1, sum = 0;
		String s1;
		System.out.print("학번 입력 : ");
		 num1 = input.nextInt();
		 su1.setStudentID(num1);
		 System.out.print("이름 입력 : ");
		 s1 = input.next();
		 su1.setName(s1);
		 System.out.print("국어점수 입력 : ");
		 num1 = input.nextInt();
		 su1.setKor(num1);
		 sum += num1;
		 System.out.print("영어점수 입력 : ");
		 num1 = input.nextInt();
		 su1.setEng(num1);
		 sum += num1;
		 System.out.print("수학점수 입력 : ");
		 num1 = input.nextInt();
		 su1.setMath(num1);
		 sum += num1;
		 if(sum / 3 >= 90) {
			 s1 = "A";
		 }else if(sum / 3 >= 80) {
			 s1 = "B";
		 }else if(sum / 3 >= 70) {
			 s1 = "C";
		 }else if(sum / 3 >= 60) {
			 s1 = "D";
		 }else {
			 s1 = "F";
		 }
		 su1.setGrade(s1);
		 return su1;
	}
	public void sSearch(ArrayList<sDTO> sdto) {
		System.out.print("찾을 학생 학번 입력 : ");
		int num1;
		 num1 = input.nextInt();
		 int i = 0;
		 for(i = 0; i < sdto.size(); i++) {
			 if(sdto.get(i).getStudentID() == num1) {
				 System.out.println("학번 : " + sdto.get(i).getStudentID());
				 System.out.println("이름 : " + sdto.get(i).getName());
				 System.out.println("국어 : " + sdto.get(i).getKor());
				 System.out.println("영어 : " + sdto.get(i).getEng());
				 System.out.println("수학 : " + sdto.get(i).getMath());
				 System.out.println("등급 : " + sdto.get(i).getGrade());
				 break;
			 }
		 }
		 if(i == sdto.size()) {
			 System.out.println("찾는 학생이 없습니다!!!");
		 }
	}
	public void sAll(ArrayList<sDTO> sdto) {
		System.out.println("학생 목록");
		for(int i = 0; i < sdto.size(); i++) {
			System.out.print("학번 : " + sdto.get(i).getStudentID());
			
			System.out.println(" 이름 : " + sdto.get(i).getName());
		 
		 
		}
	}
}
