package chap01;

import java.util.Scanner;

public class Exam120 {

	public static void main(String[] args) {
		
		//문제 1번 출력문 연습
		
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2="123", tel3="4567";
		System.out.println("이름: " + name);
		System.out.print("나이: " + age);
		System.out.printf("\n전화: %s-%s-%s", tel1, tel2, tel3);
		
		
		//문제 2번 스캐너
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n첫번째 수 >");
		String strNum1 = scanner.nextLine(); // String이라서 nextInt 쓰면 오류남
		
		System.out.print("두번째 수 >");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과 :" + result);
		
		//문제 3번 스캐너

		
		System.out.print("이름 입력 >");
		String name1 = scanner.nextLine();
		
		System.out.print("주민번호 앞 6자리 입력 >");
		String no1 = scanner.nextLine();
		
		System.out.print("전화번호 입력 \"-\"입력하시오 >");
		String phone1 = scanner.nextLine();
		
		System.out.println("1. 이름: " + name1);
		System.out.println("2. 주민번호 앞 6자리: " + no1);
		System.out.printf("3. 전화번호: %s", phone1);
		
		
		//문제 4 두수를입력받아서 큰수 빼기 작은수 (숫자는 무작위로 입력)
		System.out.println("숫자 입력 >");
		int su1 = scanner.nextInt(); //nextInt는 반드시 사용후 nextLine으로 제거해줘야됨
		int su2 = scanner.nextInt();
		if(su1>su2) {
			System.out.println();
		}
		
		scanner.close();
		
		
		
 		

	}

}
