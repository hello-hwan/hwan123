package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDao {
	//필드
	Connection conn = null;
	
	//메소드
	//1. 연결설정 메소드 (void) 항상반복
	public void getOpen() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
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
	
	public int insert(Book book) {
		getOpen();
		try {
			String sql = "insert into book (title, writer, price, bNum) "
					+    "values (?, ?, ?, ?) ";
			
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
	
	//5. select: 목록전체 조회 메소드

	//6. delete 메소드 (북번호 이용)
	//7. update 메소드 (책제목의 가격과 책번호 수정)
	

}//end class
