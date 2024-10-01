package chap04;

public class Exam173_1 {

	public static void main(String[] args) {
		//50에서 100까지 3의 배수 합 구하기
		//3의 배수 출력, 마지막에 3의 배수합 출력 3의배수가 나오면 출력 + 마지막에 3의 배수 합 출력
		
		int sum = 0;
		int cnt3 = 0;
		for (int i = 50; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
				cnt3++;
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		System.out.println("\n3의 배수의 합: " + sum + "\n3의 배수의 갯수: " + cnt3);
		
		//System.out.printf("%010.2f,aaa);
		
		//1에서 n까지의 합이 300이 넘는 순간 n값 구하기
		//7의 배수의 합이 300이 넘는 순간 7의 배수 찾기
		//while 문 (단 무한루프에 잘 빠져서 브레이크 조건을 반드시 확인해야됨)
		
		int sum1 = 0;
		int su7 = 0;
		while(true) {
			su7 ++;
			if(su7 % 7 == 0) sum1 += su7; //if 문 두개
			if (sum1 > 300) break; //if 문 두개
			
		}
		System.out.println("7의 배수의 값은: " +su7);
		System.out.println("합계는: " + sum1);
		
		
		//교수님 풀이
		sum1 = 0;
		su7 = 0;
		while(sum1 <= 300) {
			su7 += 7; //if문 없음
			sum1 += su7;
		}
		System.out.println("7의 배수의 값은: " +su7);
		System.out.println("합계는: " + sum1);
		
		//do-while - 무조건 실행하고 조건보고 반복여부 결정, do while문은 반드시 세미콜론 찍어야됨
		//보통은 잘 안씀
		
		// 구구단: 중첩 for 문
		for ( int i = 2 ; i < 10; i++) {
			System.out.println("\t ====" + i + "단====");
			for (int j = 1; j < 10; j++) {
//				System.out.println("\t" + i + "x" + j + " = " + i * j);
				System.out.printf("\t%02d x %2d = %2d\n", i, j, i*j); //printf 문 사용법 알아둘것
			}
		}
		
		for (int i = 2; i < 10; i++) {
			System.out.printf("%3d단\t",i);
		}
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%dx%d=%2d\t", j,i,i*j);
			}
			System.out.println();
		}
		
		
	}//end main

}//end class
