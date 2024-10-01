package chap05;

public class Exam223_5 {

	public static void main(String[] args) {
		
		//223p 5번 문제
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0;
		
		//작성 위치
		int cnt = 0;
		
		/*
		for(int i = 0; i < array.length; i++) {
			for(int ele : array[i]) {
				sum += ele;
				cnt++;
			}
		}
		*/
		
		for(int[] ele : array) { // ele1은 array 안의 배열
			for(int ele1 : ele) { //ele2는 배열안의 값
				sum += ele1;
				cnt++;
			}
		}
		
		avg = (double)sum / cnt;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}//end main

}
