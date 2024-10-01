package chap06;

public class Member { //메인 메소드 안만들고 왔을때 main 치고 ctrl+space
	//필드
	String name;
	String id;
	String password;
	int age;
	
	//생성자
	/*
	//Member(String name, String id, String password, int age){
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	*/
	Member(){} // 명시적 생성자 만들면 반드시 기본생성자 만들어 둘것.
	
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	//메소드

}
