package chap03;

public class Assign146 {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		result = result + 10;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 3;
		System.out.println(result);
		result /= 5;
		System.out.println(result);
		result %= 3;
		System.out.println(result);
		
		int su = 1;
		int su2 = 2;
		System.out.println(su & su2); //2진수 계산하여 겹치는 값 01, 10 = 겹치는게 없어서 0(2)
		System.out.println(su | su2); //2진수 계산해서 있는 값 01, 10 = 11(2)
		System.out.println(su ^ su2); //2진수 계산해서 두개가 다르면 출력 둘다 달라서 11(2) = 3 출력
		
		su = 2;
		su2 = 2;
		System.out.println(su & su2); //2진수 계산하여 겹치는 값 01, 10 = 겹치는게 없어서 0
		System.out.println(su | su2);
		System.out.println(su ^ su2);
		
		su = 3;
		su2 = 2;
		System.out.println(su & su2); //2진수 계산하여 겹치는 값 01, 10 = 겹치는게 없어서 0
		System.out.println(su | su2);
		System.out.println(su ^ su2);
		
		



	} // end main

}// end class
