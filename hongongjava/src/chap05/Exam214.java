package chap05;

public class Exam214 {

	public static void main(String[] args) {
		//2차원 배열
		
		// 열의 수가 같음
		// int[][] scores;
		// score = new int[2][3];
		// int[][] arr1 = new int[2][3];
		
		//열의 수가 다름
		// int[][] arr2 = new int[2][];
		// arr2[0] = new int[2];
		// arr2[1] = new int[3];
		
		int[][] scores = {
				{10,20,30},
				{40,50,60}
		};
		
		//향상된 for문
		/*
		for(int i = 0; i < scores.length; i++) {
			
		}
		*/
		
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println(scores[1][1]); //2행 2열
		
		//2*3배열을 선언하고 
		//1에서 10까지 무작위 수를 입력하세요
		
		int[][] nums = new int[2][3];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				int ran = (int)(Math.random() * 10) + 1;
				nums[i][j] = ran;
				System.out.print(nums[i][j] + "  ");
			}
			System.out.println();
		}
		
		//향상된 for 문
		int[] su = {10,200,30,40,-50,777,555};
		//배열의 합, 최대값, 최소값
		//향상된 for 문 이용(for(let ele of idx)랑 동일
		
		int sum = 0;
		int max = Integer.MIN_VALUE; // int 값 중에 최소값 (정수범위)
		int min = Integer.MAX_VALUE; //int 값 중에 최대값 (정수 범위)
		for(int ele : su ) {
			sum += ele;
		}
		System.out.println("sum = " + sum);
		
		for(int ele : su) {
			if(max < ele) {
				max = ele;
			}
			if(min > ele) {
				min = ele;
			}
		}
		System.out.println("최대값: " + max + "\n최소값: " + min);
	}

}
