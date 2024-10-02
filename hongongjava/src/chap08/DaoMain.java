package chap08;

public class DaoMain {

	public static void main(String[] args) {
		
		dbWork(new OracleDao()); //
		
		dbWork(new MySqlDao());

	}

	static void dbWork(DataAccessObject dao) { //DaoMain 클래스 메소드라서 main 메소드 밖에서 만들어야됨
		dao.select(); //db연결하고 sql 구문넣어서 데리고 오면 받아서 출력
		dao.insert();
		dao.update();
		dao.delete();
	}

}
