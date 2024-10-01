package chap03;

import java.util.Scanner;

public class Exam150 {

	public static void main(String[] args) {
		
		//4번
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		
		//5 번
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2 ; //double로 결과값만 소수점으로 수정
		int var4 = (int)(var3 * var2);
		System.out.println(var4);
		
		//6번
		int value = 356;
		System.out.println(value - (value % 100));
		
		//7번
		float var7_1 = 10f;
		float var7_2 = var7_1 / 100;
		if (var7_2 == 0.1) {
			System.out.println("10%입니다.");
		}else {
			System.out.println("10%가 아닙니다.");
		};
		
		if (var7_2 == 0.1f) { //데이터 타입이 달라서
			System.out.println("10%입니다.");
		}else {
			System.out.println("10%가 아닙니다.");
		};
		
		//8번
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * (double)height /2 );
		System.out.println(area);
		
		//9번
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 >");
		String str1 = scanner.nextLine();
		
		System.out.print("두번째 수 >");
		String str2 = scanner.nextLine();
		
		double su1 = Double.parseDouble(str1);
		double su2 = Double.parseDouble(str2);
		
		if (su2 == 0.0) {
			System.out.println("결과: 무한대");
		}else {
			System.out.println("결과: " + (double)su1/su2);
		}
		
	
		
		//10번
		int var1_10 = 10;
		int var2_10 = 3;
		int var3_10 = 14;
//		double var4_10 = var1_10 * var1_10 * var2_10 + "." + var3_10;
		double var4_10 = var1_10 * var1_10 * Double.parseDouble(var2_10 + "." + var3_10);
		System.out.println("원의 넓이: " + var4_10);
		
		//11번
//		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		
		System.out.print("패스워드: ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
		
		scanner.close();
		
		//12
		int x = 10;
		int y = 5;
		System.out.println( (x > 7) && (y <= 5) );
		System.out.println( (x % 3 == 2) || (y % 2 != 1) );
		
		//13
		/*
		int value_13 = 0;
		
		value_13 = value + 10; // value += 10;
		value_13 = value - 10; // value -= 10;
		value_13 = value * 10; // value *= 10;
		value_13 = value / 10; // value /= 10;
		*/
		
		//14
		int score = 85;
		String result_14 = ( !(score > 90) ? "가" : "나");
		System.out.println(result_14);
	}

}
