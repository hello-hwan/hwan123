package 김기환;

import java.util.Scanner;

public class Doself {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		//1번
		
		
		System.out.print("네자리 년도 입력 >");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println();
		if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다");
		}else {
			System.out.println(year + "년은 평년입니다");
		}
		
		//2번
		
		System.out.println("교환할 금액을 입력하세요");
		int money = Integer.parseInt(sc.nextLine());
		
		System.out.println("##교환할 금액 : " + money);
		
		System.out.println("500원 짜리 : " + money / 500 + "개");
		System.out.println("100원 짜리 : " + (money % 500) / 100 + "개");
		System.out.println("50원 짜리 : " + (money % 100) / 50 + "개");
		System.out.println("10원 짜리 : " + (money % 50) / 10 + "개");
		System.out.println("교환 금액 : " + (money - money % 10) + "개");
		System.out.println("남은 금액 : " + money % 10 + "개");
		
		//3번
		
		int gamble = (int)(Math.random() * 100) +1;
		
		Stop : for (int i = 1; i < 11; i++) {
			System.out.print("1과 100사이의 숫자 입력 : ");
			int gamNum = Integer.parseInt(sc.nextLine());
			if (gamble == gamNum) {
				System.out.println("축하합니다!!");
				break Stop;
			}else if(gamble > gamNum) {
				System.out.println("up하세요!!");
			}else {
				System.out.println("down하세요!!");
			}
		}
		System.out.println("입금하세요!!");
		
		//4
		
		for(int i = 2; i < 10; i++) {
			System.out.print("  "+ i + "단\t");
		}
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%dx%d=%2d\t",j,i,i*j);
			}
			System.out.println();
		}
		
		
		
		//5
		
		boolean run = true;
		
		System.out.println("실행결과");
		while(run) {
			
			System.out.println("-------------");
			System.out.println("1. 화씨 => 섭씨");
			System.out.println("2. 섭씨 => 화씨");
			System.out.println("3. 종료");
			System.out.println("-------------");
			
			System.out.print("▶번호 선택: ");
			String selec = sc.nextLine();
			switch(selec) {
			case "1" : 
				System.out.print("▶화씨 온도 입력: ");
				int hwa = Integer.parseInt(sc.nextLine());
				double hwaTemp = (double)5 / 9 * (hwa - 32);
				System.out.printf("섭씨온도 = %5.6f",hwaTemp);
				System.out.println();
				break;
			case "2" : 
				System.out.print("▶섭씨 온도 입력: ");
				int sup = Integer.parseInt(sc.nextLine());
				double supTemp = (double)9 / 5 * sup + 32;
				System.out.printf("섭씨온도 = %5.6f", supTemp);
				System.out.println();
				break;
			case "3" :
				System.out.print("종료");
				run = false;
				break;
			}
			
		}
		System.out.println();
		System.out.println("program end");
		
		
		//6
		
		int com = (int)(Math.random() * 3);
		boolean play = true;
		
		while(play) {
			System.out.print("## 가위(0) 바위(1) 보(2)");
			int man = sc.nextInt();
			
			if(man > 2) {
				System.out.println("game over");
				play = false;
			}else if(man == com) {
				System.out.printf("사람 %d, 컴 %d 비겼음\n", man, com);
			}else if(man - com == 1 || man - com == -2) {
				System.out.printf("사람 %d, 컴 %d 사람 승리\n", man, com);
			}else {
				System.out.printf("사람 %d, 컴 %d 컴 승리\n", man, com);
			}
		}
		
		
		//7
		
		for (int i = 1; i < 51; i++) {
			int i10 = i / 10;
			int i1 = i % 10;
			
			if (i10 != 0 && i1 != 0 && i10 % 3 == 0 && i1 % 3 == 0) {
				System.out.print("❤️❤️\t");
			}else if( (i10 != 0 && i10 % 3 == 0) || (i1 != 0 && i1 % 3 == 0) ) {
				System.out.print("❤️\t");
			}else {
				System.out.print(i + "\t");
			}

			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		sc.close();
	}//end main

}//end class
