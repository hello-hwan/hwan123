package chap01;

import java.util.Scanner; 
//스캐너를 들고옴 - scanner 앞에서 마우스 대보면 import 사용, 다른애들도 import 써서 들고와서 사용

public class Scanner118_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 메소드를 사용해서 객체생성
		String strin;
		
		//for, while문 쓸때 터미네이터 오른쪽 아래 빨간네모버튼 누르면됨
		
		/*
		스트링으로 바로 만든것은(리터럴) q를 저장한 공간이 생기고, 주소가 부여됨, 추가로 q를 넣으면 똑같음
		String str1 = "q";
		String str2 = "q";
		if(str1 == str2) { //q입력하고 나서 값이 q인지 확인 - 다름
			System.out.println("같다");
		}else {
			System.out.println("같다");
		}
		*/
		
		//문자열
		System.out.print("문자열 입력 >");
		strin = sc.nextLine(); // 엔터키 입력전까지 남아있는 데이터 다 가져옴
		System.out.println("입력 받은 문자열: " + strin);
		
		if(strin == "q") { //q입력하고 나서 값이 q인지 확인 - 변수에는 주소만 저장되어 있음
			System.out.println("q입력");
		}else {
			System.out.println("같지않음");
		}
		
		if(strin.equals("q")) { // *q입력하고 나서 변수의 주소로 찾아간 값이 q가 맞는가 - 맞다* 중요
			System.out.println("q입력");
		}else {
			System.out.println("같지 않음");
		}
		
		//숫자
		System.out.print("숫자 입력 >");
		int valInt = sc.nextInt();
		System.out.println("입력 숫자: " +valInt);
		strin = sc.nextLine(); // 공백까지 전부 가져와서 남아있는 데이터가 사라짐
		
		System.out.print("숫자 입력 >"); 
		valInt = Integer.parseInt(sc.nextLine()); // 공백을 가져와서 입력해버림
		System.out.println("입력 받은 숫자: " + (valInt + 100)); 
		
		
		sc.close(); // sc 자원 사용후 종료
	}

}
