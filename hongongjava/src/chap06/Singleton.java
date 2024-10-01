package chap06;

public class Singleton {
	// 전체 프로그램에서 하나의 객체만 존재하게 하는 코딩 기법
	// 생성자 접근 불가, 필드 접근 불가
	// class로 접근해야함
	// 필드 (접근제한자, 객체없이 클래스로 접근), (p소문자)
	private static Singleton st  = new Singleton();
	
	String name = "홍길동";
	
	// 생성자 (접근제한자, 클래스이름과 동일하게)
	private Singleton() {};
	
	// 메소드: 외부로 객체 전달 (s 소문자)
	static Singleton getInstance() {
		return st;
	}
	

}//end class
