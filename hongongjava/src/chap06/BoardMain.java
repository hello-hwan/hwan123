package chap06;

public class BoardMain {

	public static void main(String[] args) {
		// 생성자 함수
		
		Board bd1 = new Board("책1","범죄");
		
		Board bd2 = new Board("책2", "스릴러","한빛미디어");
		
		Board bd3 = new Board("책3", "SF", "한빛미디어","240927");
		
		Board bd4 = new Board("책4", "다큐멘터리", "한빛미디어", "200927", 123);
		
		Board stan = new Board();

		System.out.printf("%s, %s, %s, %s, %d\n",bd1.title, bd1.content,bd1.writer,bd1.date,bd1.hitcount);
		System.out.printf("%s, %s, %s, %s, %d\n",bd2.title, bd2.content,bd2.writer,bd2.date,bd2.hitcount);
		System.out.printf("%s, %s, %s, %s, %d\n",bd3.title, bd3.content,bd3.writer,bd3.date,bd3.hitcount);
		System.out.printf("%s, %s, %s, %s, %d\n",bd4.title, bd4.content,bd4.writer,bd4.date,bd4.hitcount);
		System.out.printf("%s, %s, %s, %s, %d\n",stan.title, stan.content,stan.writer,stan.date,stan.hitcount);
		
		stan.title = "기본책";
		stan.content = "기본내용";
		
		System.out.printf("%s, %s, %s, %s, %d\n",stan.title, stan.content,stan.writer,stan.date,stan.hitcount);
	}//end main

}//end class
