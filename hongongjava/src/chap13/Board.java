package chap13;

public class Board {
	//필드
	String subject;
	String content;
	String writer;
	
	//생성자
	Board(String subject, String content, String writer){
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	Board(String subject, String content){
		this.subject = subject;
		this.content = content;
	}
	
	//메소드
	@Override
	public String toString() {
		//return super.toString();
		return subject + " : " + content + " : " + writer;
	}
	
	public String getSubject() {return subject;}
	public String getContent() {return content;}
	
}
