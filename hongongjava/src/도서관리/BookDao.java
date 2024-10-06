package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDao {
	//Dao 클래스 만드는 이유: 데이터베이스와 java 연결하는 메소드 작성
	//Dao 클래스에서 sql문 작성하고 데이터 베이스에 연동
	//Dao에서 만들어둔 객체를 이용하여 데이터 베이스 자료 추가,제거,수정,조회
	//select, insert , update, delete
	
	
	//필드
	
	//Connection 변수 만드는 이유?
	// Connection 개체가 url, uid ,upw 정보를 가지고 java db연결
	// url은 jdbc:oracle:thin:@localhost:1521:xe
	// uid = java
	// upw = 1234
	Connection conn = null;
	
	//메소드
	//1. 연결설정 메소드 (void) 항상반복
	public void getOpen() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//특정 클래스 강제구동 메소드
			//forName은 throws가 있기때문에 try catch문 실행
			//Connection 객체는 new 연산자로 생성불가능
			//DriverManager클래스의 정적메소드 getConnection
			//이거를 사용해서 객체 생성해야됨
			
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"java",
					"1234"
					);
			System.out.println("연결성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//2. 연결 끊기 메소드 (void) 항상반복
	public void getClose() {
		if(conn != null) {
			try {
				conn.close();
				System.out.println("연결종료");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//데이터 추가
	//3. insert 메소드
	
	public int insert(Book book) {//인서트할 내용을 객체로 받아와서 처리
		getOpen();// Connection 객체 메소드로 생성 후 db와연결
		try {
			String sql = "insert into book (title, writer, price, bNum) "
					+    "values (?, ?, ?, ?) ";
			//sql문은 무조건 String sql = "sql명령어"
			//?는 무조건 setString(setInt)로 1번부터 차례대로 생성
			//한줄 끝날때 반드시 띄어쓰기할것-안하면 붙여서 쓰는걸로 돼서 오류남
			
			//PreparedStatement = sql문을 실행하기 위한 객체
			//conn객체의 prepareStatement() 메서드로 객체를 받아옴
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getWriter());
			pstmt.setInt(3, book.getPrice());
			pstmt.setString(4, book.getbNum());
			
			//sql문장 실행
			int rows = pstmt.executeUpdate();
			return rows;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return 0;
		}
	
	//4. select: 조건에 따른 검색 (책제목)메소드
	public void select(String title) {
		//Connection 객체 conn으로 url, id, pw 연결
		getOpen();
		
		try {
			//squl문 작성
			String sql = "select * " +
					"from book " +
					"where title = ? ;";
			
			//작성한 sql문을 실행시키기 위한 메소드 PreparedStatement 객체 작성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//?를 처리하기 위한 메소드 실행
			pstmt.setString(1,title);
			
			//sql 실행문 
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Book bk = new Book();
				bk.setTitle(rs.getString(1));
				bk.setWriter(rs.getString(2));
				bk.setPrice(rs.getInt(3));
				bk.setbNum(rs.getString(4));
				
				System.out.println(bk.getTitle() + bk.getWriter() + bk.getPrice() + bk.getbNum());
			}
			
//			System.out.println(rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
	}
	
	//5. select: 목록전체 조회 메소드
	public void selectAll() {
		
		getOpen();
		
		String sql = "select * " +
				    "from book ";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs);
			}
			
			pstmt.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		getClose();
	}
	
	
	//6. delete 메소드 (북번호 이용)
	
	public void delete(String bNum) {
		
		getOpen();
		String sql = "delete from book " +
				"where bNum = ?; ";
		
		PreparedStatement pstmt;
		try {
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bNum);
			
			int rows = pstmt.executeUpdate();
			
			if(rows == 1) {
				System.out.println("삭제행 수: " + rows);
			}
			
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		getClose();
		
	}
	
	//7. update 메소드 (책제목의 가격과 책번호 수정)
	
	public int update(String title, int price, String bNum) {
		getOpen();
		
		String sql = "update book " +
		             "set price = ?, bNum = ?" +
				     "where title = " + title ;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, price);
			pstmt.setString(2, bNum);
			
			int rows = pstmt.executeUpdate();
			
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				System.out.println();
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	
}//end class
