package chap06;

public class CalcMain {

	public static void main(String[] args) {
		//생성자 함수로 객체 생성
		Calculator cal = new Calculator();
		
		double result1 = cal.areaRectangle(10);
		double result2 = cal.areaRectangle(10,20);
		
		//정사각형의 넓이
		System.out.println( result1 );
		
		//직사각형의 넓이
		System.out.println( result2 );
	}

}
