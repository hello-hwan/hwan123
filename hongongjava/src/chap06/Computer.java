package chap06;

public class Computer {
	//필드
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	/*
	int sum1(int[] values) {
		
	}
	*/
	
	/*
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	*/
	
	int sum2(int ...values) {
		int sum = 0;
		for(int num : values) {
			sum += num;
		}
		return sum;
	}
	
	//생성자
	
	//메소드
	
	

}
