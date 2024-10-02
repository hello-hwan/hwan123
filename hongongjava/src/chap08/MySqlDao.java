package chap08;

public class MySqlDao implements DataAccessObject {
	//필드
	
	//생성자
	
	//메소드
	@Override
	public void select() {
		System.out.println("MySqlDB에서 검색");
	}
	
	@Override
	public void insert() {
		System.out.println("MySqlDB에 삽입");
	}
	
	@Override
	public void delete() {
		System.out.println("MySqlDB에서 삭제");
	}
	
	@Override
	public void update() {
		System.out.println("MySqlDB에 수정");
	}

}
