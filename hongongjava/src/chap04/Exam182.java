package chap04;

import java.util.Scanner;

public class Exam182 {

	public static void main(String[] args) {
		//4번

		for(int x = 1; x <11; x++) {
			for(int y = 1; y < 11; y++) {
				int result = 4 * x + 5 * y;
				if(result == 60) {
//					System.out.println("(" + x + "," + y + ")");
					System.out.printf("(%d,%d)",x,y);
				}
			}
		}
		
		//5번
		System.out.println();
		
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//교수님 풀이 for문 1개로 구동
		
		String stars = "";
		for(int i = 1; i < 5; i++) {
			stars +="*";
			System.out.println(stars);
		}
		
		//6번
		System.out.println();
		
		/*
		for(int i = 1; i < 5; i++) {
			for(int j = 1; i + j <= 4; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j - i >= 1 ; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//단일 for문
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j > i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//가장 java스러운 방법
		stars = "";
		for(int i = 1; i < 5; i++) {
			stars += "*";
			System.out.printf("%4S\n", stars);
		}
		
		//7번
		
		Boolean run = true;
		int balance  = 0;
		Scanner sc = new Scanner(System.in);
		
		Stop: while(run) {
			//메뉴
			
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.println("선택 >");
			
			//교수님 힌트
//			System.out.print("선택> ");
			int selNo = Integer.parseInt(sc.nextLine());

			switch(selNo) {
			case 1 : //스트링으로 받으면 case "1" 따옴표 넣어줘야된다.
				System.out.print("예금액> ");
				int money1 = Integer.parseInt(sc.nextLine());
				balance += money1;
				System.out.println();
				break;
			case 2 : 
				//출금시 잔액 부족 체크
				//잔액이 부족하면 출금 불가, 출금 가능액 표시
				System.out.print("출금액> ");
				int money2 = Integer.parseInt(sc.nextLine());
				if(money2 > balance) {
					System.out.println("잔액부족으로 출금불가");
					System.out.println("출금가능액: " + balance);
				}else {
					balance -= money2;
				}
				System.out.println();
				break;
			case 3 : 
				System.out.print("잔고> " + balance);
				System.out.println();
				break;
			case 4 : 
//				run = false;
				System.out.println();
				break Stop;
			default :
				System.out.println("잘못된 입력입니다");
				break Stop;
			}
		}
		System.out.println("프로그램 종료");
		
		sc.close();
		
		//
		
	}//end main
	

}
