package chap07;

public class CalcMain {

	public static void main(String[] args) {
		Computer com = new Computer();
		//자식 클래스로 생성해야 부모 자식 써먹을수 있음
		Calculator calc = new Calculator();
		
		double result = com.areaCircle(10);
		System.out.println("자식 메소드: " + result);
		
		double result1 = calc.areaCircle(10);
		System.out.println("부모 메소드: " + result1);
		
		//자식에게 추가로 메소드 추가
		double result2 = com.ac(10);
		System.out.println("자식 메소드: " + result2);
		
		
	}//end main

}//end class
