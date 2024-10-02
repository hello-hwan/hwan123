package chap08;

public interface DataAccessObject {
	//상수
	
	
	//추상메소드
	void select(); //void (abstract) select(); 인터페이스에서 자동으로 abstract 넣어줌
	void insert();
	void update();
	void delete();
	
	
	
}
