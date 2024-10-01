package chap04;

public class Exam162 {

	public static void main(String[] args) {
		//주사위 2개를 던져서 합이 5가되면 종료 - gameover 출력
		//만약 5가 아니면 (1,3) 주사위 눈 표시
		
		int attempt = 0;
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
//			System.out.println("(" + dice1 + "," + dice2 + ") "); 이거보다 printf가 더 편함
			System.out.printf("(%d,%d) ", dice1, dice2);
			attempt ++;
			if (dice1 + dice2 == 5) {
				System.out.println("\nGame over, 시도횟수: " + attempt); //break 이후에 넣으면 이미 실행이 끝나서 출력안됨
				break;
			}
			
				
			}
		//주사위 눈이 1이면 1등 ~ 6이면 6등이라고 출력
		
		int dice3 = (int)(Math.random() * 6) + 1;
		
		System.out.println(dice3 + "등");
		
		if(dice3 == 1) {
			System.out.println("1등");
		}else if(dice3 == 2) {
			System.out.println("2등");
		}else if(dice3 == 3) {
			System.out.println("3등");
		}else if(dice3 == 4) {
			System.out.println("4등");
		}else if(dice3 == 5) {
			System.out.println("5등");
		}else {
			System.out.println("6등");
		}
		
		switch(dice3){
		case 1 : System.out.println("1등"); break;
		case 2 : System.out.println("2등"); break;
		case 3 : System.out.println("3등"); break;
		case 4 : System.out.println("4등"); break;
		case 5 : System.out.println("5등"); break;
		case 6 : System.out.println("6등"); break;
		default : System.out.println("잘못된 값 입력"); //break; 브레이크 생략가능 
		}
		
		//50에서 100까지 수를 발생 (곱수 = 최종갑 - 초기값 + 1)
		//90이상이면 A, 80이상이면 B, 70 C, 60 D, 나머지 F
		
		int score = (int)(Math.random() * 51) + 50;
		
		switch(score / 10 * 10) {
		case 100 : // System.out.println("A"); break; 얘는 브레이크만 안걸면 자동으로 내려감
		case 90 : System.out.println("A"); break;
		case 80 : System.out.println("B"); break;
		case 70 : System.out.println("C"); break;
		case 60 : System.out.println("D"); break;
		default : System.out.println("F");
		}
		
	}//end main

} //end class
