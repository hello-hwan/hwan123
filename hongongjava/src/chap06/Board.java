package chap06;

public class Board {
	//필드
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	//생성자
	Board(String title, String content){
		this.title = title;
		this.content = content;
		this.writer = "로그인한 회원하이디";
		this.date = "현재 컴퓨터 날짜";
		this.hitcount = 0;
	}
	Board(String title, String content,String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = "현재 컴퓨터 날짜";
		this.hitcount = 0;
	}
	Board(String title, String content, String writer, String date){
		this(title, content, writer, date,0);
	}
//	Board(String title, String content, String writer, String date){
//		this(title, content, writer, date);
//		hitcount = 0;
//	} // this로 생성자 로컬변수 묶으면 추가 변수를 this 로컬변수로 나눌수 없다
	Board(String title, String content, String writer, String date, int i){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		hitcount = i;
	}
	
	Board(){} //기본 생성자 = 아무런 값도 넣지않고 객체로 만들어 줄 수 있도록 해줌
	//명시적으로 생성자 생성하면 기본생성자는 추가로 따로 넣어줘야한다.
	
	//메소드

}
