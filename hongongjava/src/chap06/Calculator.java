package chap06;

public class Calculator {
	//메소드 오버로딩 p287 같은 이름의 메소드, 받는 매개변수 숫자, 타입, 순서로 더 잘 받을수있도록
	
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	
}//end class
