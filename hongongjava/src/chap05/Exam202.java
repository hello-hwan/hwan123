package chap05;

import java.util.Arrays;

public class Exam202 {

	public static void main(String[] args) { // Srting[] 문자타입 배열, args =
		
		String args1 = args[0]; //args 가 범위를 벗어나서 오류발생
		System.out.println(args1); // run - run config -argument 10 20치고 run
		String args2 = args[1]; 
		System.out.println(args2);
		int args3 = Integer.parseInt( args[2] ); // 0번 10, 1번 20, 2번 없어서오류
		System.out.println(args3 + 100);
		
		
		//배열을 생성하는 방법
		//배열을 이용하는 방법
		//int[] score = new int[] {};
		//int[] score = {a, b, c, d};
		int[] score = {83, 90, 87};
		
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);
		
		
		int sum = 0;
		for(int i = 0; i < score.length ; i++) {
			sum += score[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum/score.length;
		System.out.printf("평균 : %.2f", avg);
		System.out.println();
		
		//1에서 100까지의 임의의 수 10개를 배열에 저장
		//배열의 합과 평균 (소수 첫째자리까지 나타냄),
		//최대값, 최소값을 구하세요
		
		//배열생성
		//배열 이용 ,합,평균,최대,최소값 구하는건 따로
		
		int[] array = new int[10] ;// 초기값이 0 : int 배열이라서, 실수면 0.0, 클래스는 null
		int sum1 = 0;
		double avg1 = 0.0;
		
		for(int i = 0; i < array.length; i++) {
			int ranNo = (int)(Math.random() * 100)+1;
			array[i] = ranNo ;
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(" " + array[i]);
		}
		
		for(int i = 0; i < 10; i++) {
			sum1 += array[i];
		}
		avg1 = (double)sum1/array.length;
		System.out.println();
		System.out.println("합계는: " + sum1);
		System.out.println("평균은: " + avg1);
		
		int max = 0;
		int min = 100;
		
		for(int i = 0; i < 10; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
	
		
		System.out.println("최대값은: " + max);
		System.out.println("최소값은: " + min);
		
		/*
		max = 0;
		min = 100;
		for(int i = 0; i < 10; i++) {
			System.out.print(" " + array[i]);
		}
		
		for(int i = 0 , j = 1; i < 9; i++, j++) {
			if(array[j] < array[j]) {
				max = array[j];
			}else{
				min = array[i];
			};
		}
		System.out.println();
		System.out.println("최대값은: " + max);
		System.out.println("최소값은: " + min);
		*/
		
		//교수님 풀이
		//배열생성
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			int rNum = (int)(Math.random() * 100) + 1;
			nums[i] = rNum;
		}
		
		System.out.println(nums); // nums 배열 주소값
		System.out.println( Arrays.toString(nums) ); // 배열을 바로 출력: Arrays 클래스 import후 toString
	
		//배열 이용, 합, 평균, 최대, 최소값 구하기
		int sum3 = 0;
		int max3 = 0;
		int min3 = 100;
		for (int i = 0; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");//배열 값 보기 - Arrays 클래스 모를때
			sum3 += nums[i]; // 합계 구하기
			if(max3 < nums[i]) max3 = nums[i];
			if(min3 > nums[i]) min3 = nums[i];
		}
		System.out.println();
		
		double avg3 = (double)sum3 / nums.length;
		System.out.printf("합계는: %d, 평균은: %.2f, 최대값은: %d, 최소값은: %d", sum3, avg3, max3, min3);
		
		
		
	}

}
