package 김기환;

public class Array {

	public static void main(String[] args) {
		
		//1번
		int[] ten = new int[10];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < ten.length; i++) {
			int tenRan = (int)( Math.random() * 100 ) + 1;
			ten[i] = tenRan;
			sum += ten[i];
			if(max < ten[i]) {
				max = ten[i];
			}
			if(min > ten[i]) {
				min = ten[i];
			}
		}
		
		for(int ele : ten) {
			System.out.print(ele + " ");
		}

		System.out.printf("합계: %d, 최대값: %d, 최소값: %d", sum,max,min);
		System.out.println();
		
		//2
		int[][] dimenTwo = {
				{1,2,3},
				{1,2},
				{1},
				{1,2,3}
		};
		
		for(int[] ele : dimenTwo) {
			for(int ele1 : ele) {
				System.out.print(ele1 + "  ");
			}
			System.out.println();
		}
		
		//3
		int[][] person = new int[3][10];
		int personCnt = 0;
		for(int[] ele : person) {
			for(int ele1 : ele) {
				int man = (int)( Math.random() * 2 );
				ele1 = man;
				System.out.print(ele1);
				if(ele1 == 1) {
					personCnt++;
				}
			}
			System.out.println();
		}
		System.out.printf("현재 관객수는 %2d명\n",personCnt);
		
		//4
		
		int[][] scoArr = new int[3][5];
		
		for(int i = 0; i < scoArr.length; i++) {
			for(int j = 0; j < scoArr[i].length; j++) {
				int score = (int)( Math.random() * 51) +50;
				scoArr[i][j] = score;
				System.out.print(scoArr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < scoArr.length; i++) {
			double sum1 = 0;
			for(int j = 0; j <scoArr[i].length; j++) {
				sum1 += scoArr[i][j];
			}
			double avg = sum1 / scoArr[i].length;
			System.out.printf("%d번 학생 평균 = %2.0f\n", i+1, avg); //.0하면 반올림, int로 하면 소수점 버림
		}
		
		//5
		String[] cards = {"Clubs", "Diamonds", "Heart", "Spade"};
		String[] cardNums = {
				"2", "3", "4", "5", "6", "7", "8", 
				"9", "10", "Jack", "Queen", "King", "Ace"
				};
		
		for(int i = 1; i < 6; i++) {
			int cardSel = (int)( Math.random() * 4);
			int numSel = (int)( Math.random() * 13);
			System.out.println(cards[cardSel] + "의" + cardNums[numSel]);
		}
		
		//6
		int[][] arrDouble = new int[3][5];
		
		for(int i = 1; i < 6; i++) {
			int row = (int)( Math.random() * 3);
			int col = (int)( Math.random() * 5);
			if(arrDouble[row][col] != 1) {
				arrDouble[row][col] = 1;
			}else {
				i--;
			}
		}
		
		for(int[] ele : arrDouble) {
			for(int ele1 : ele) {
				System.out.print(ele1);
			}
			System.out.println();
		}
		
	}//end main

}
