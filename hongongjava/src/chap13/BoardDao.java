package chap13;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	//필드
	
	
	//생성자
	
	
	//메소드
	public List<Board> getBoardList(){
		
		List<Board> bd = new ArrayList<Board>();
		/*
		bd.add(new Board("제목1", "내용1"));
		bd.add(new Board("제목2", "내용2"));
		bd.add(new Board("제목3", "내용3"));
		*/
		for(int i = 0; i < 10; i++) {
			bd.add(new Board("제목"+i,"내용"+i));
		}
		
		
		return bd;
	}


	
}
