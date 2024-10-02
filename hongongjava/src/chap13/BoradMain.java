package chap13;

import java.util.List;
import java.util.Vector;

public class BoradMain {

	public static void main(String[] args) {
		//Vector 멀티 스레디 환경에 안전
		List<Board> list = new Vector<Board>(); 
		//crtl + shift + o   new Vector<>();이렇게 해도 나옴
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i = 0; i < list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject);
		}
		
		for(Board ele : list) {
			System.out.printf("%s\t%s\t%s\n",ele.subject,ele.content,ele.writer);
		}
		
		//해시코드
		Board bd = new Board("제목", "내용", "글쓴이");
		System.out.println(bd); 
		//println은 객체를 toString 메소드를 실행
		//toString을 오버라이드 해놓으면 객체 이름만 써도 바로 적용됨
		System.out.println(bd.hashCode()); // 순수한 해시코드 = int 값
		System.out.println(bd.toString()); // 
		
		//주소(해시코드)가 같은데 값이 다른경우 학번은 같은데 이름이 다른경우
		
	}//end Main

}//end Class
