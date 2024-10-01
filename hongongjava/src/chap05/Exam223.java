package chap05;

import java.util.Scanner;

public class Exam223 {

	public static void main(String[] args) {
		
		//확인문제 6
		
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----");
			System.out.print("선택> ");
			
			int selNo = Integer.parseInt( sc.nextLine() );
			
			switch(selNo) {
			case 1 :
				System.out.print("학생수> ");
				studentNum = Integer.parseInt( sc.nextLine() );
				score = new int[studentNum];
				break;
			case 2 :
				for(int i = 0 ; i < studentNum; i++) {
					System.out.printf("score[%d]> ",i);
					score[i] = Integer.parseInt( sc.nextLine() );
				}
				break;
			case 3 :
				System.out.println("점수리스트> ");
				for(int i = 0 ; i < studentNum; i++) {
					System.out.printf("score[%d]> %d\n",i,score[i]);
				}
				break;
			case 4 :
				System.out.println("분석> ");
				int max = 0;
				int min = 100;
				int sum = 0;
				double avg = 0.0;
				for(int i = 0; i < studentNum; i++) {
					sum += score[i];
					if(max < score[i]) {
						max = score[i];
					}
					if(min > score[i]) {
						min = score[i];
					}
				}
				avg = (double)sum / studentNum;
				System.out.printf("최대값은 %d\n 평균은 %f\n", max, avg);
				break;
			default :
				System.out.println("종료");
				run = false;
				break;
			}
		}
		
		sc.close();
		
		
	}//end main

}//end class
