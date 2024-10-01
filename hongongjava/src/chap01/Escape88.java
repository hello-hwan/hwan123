package chap01;

public class Escape88 {

	public static void main(String[] args) {
		//  void  : 리턴타입이지만 리턴값이 없다
		// static : 이 class는 객체 없이도 쓸수있다
		// public : 누구나 사용가능
		// ctrl + alt + 방향키아래쪽 : 복사
		// TODO Auto-generated method stub
		System.out.println("번호\t이름\t직업");  //많이씀
		System.out.println("행 단위 출력n");   //많이씀
		System.out.println("행 단위 출력n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
		
//		float var = 3.14f; //f안넣으면 오류뜸,기본은 double
//		double var1 = 3e6; //3x(10의6승);
		
		boolean  stop = true;
		if(!stop) {  // !stop == not(true);
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		//p103 타입변환
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; 제일 앞에 byte 타입을 int로 수정하면됨
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); // 괄호안에 타입넣기, 소수점 나오게 하기 - 미리 double로 변환후 작업
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; 제일 앞에 char 타입을 int로 변환하면됨 
		int intValue2 = charValue1 +charValue2;
		System.out.println("유니코드 =" + intValue2);
		System.out.println("출력문자=" + (char)intValue2 );
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10/4.0; 제일 앞에 int type을 double로 변환하면됨, float로 변환시 뒤에 f붙여야됨(쓰지말것)
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x/y;
		System.out.println(result);
		
		//p106 문자열을 숫자로 변환, 숫자를 문자열로 변환
		int value1 = Integer.parseInt("10");  //Integer는 Int로 쓰면안됨
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + (value1 + 100)); //문자로 + 연산하면 왼쪽부터 계산되어서 오른쪽도 자동문자변환
		System.out.println("value2: " + (value2 + 100));
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + (str1 + 100));
		System.out.println("str2: " + (str2 + 100));
		System.out.println("str3: " + str3);
		
		//p109 확인문제 5
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		System.out.println((int) c2);
		System.out.println((char) (c1 + 1));
		
		int x1 = 5;
		int y1 = 2;
		int result1  = x1 / y1;
		double result2  = x1 / y1;
		double result3  = (double) x1 / (double) y1; //double 하나만 있어도 값이 double로 바뀜
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		double var11 = 3.5;
		double var12 = 2.7;
		int result10 = (int)(var11 + var12);
		
		System.out.println(result10);
		
		long var21 = 2L;
		float var22 = 1.8f;
		double var23 = 2.5;
		String var24 = "3.9";
		int result20 = (int) (var21 + var22 + var23 )+ (int)Double.parseDouble(var24);
		System.out.println(result20);
		
		String str1_10 = 2 + 3 +""; //5
		String str2_10 = 2 + "" +3; //23
		String str3_10 = "" + 2 + 3; //23
		
		System.out.println(str1_10);
		System.out.println(str2_10);
		System.out.println(str3_10);
		
		byte value1_11 = Byte.parseByte("10");
		int value2_11 = Integer.parseInt("1000");
		float value3_11 = Float.parseFloat("20.5");
		double value4_11 = Double.parseDouble("3.14159");
		
		System.out.println(value1_11);
		System.out.println(value2_11);
		System.out.println(value3_11);
		System.out.println(value4_11);
		
		System.out.printf("값은 %% %.1f \n", value4_11); //줄바꾸기는 폼의 끝에 넣어야된다
		//순번은 차례대로 들어가게되어있음
		System.out.println("end"); //출력후 줄바꿈
		
		//저장안하면 실행해도 수정사항 반영안됨
	} // end main

} //end class
