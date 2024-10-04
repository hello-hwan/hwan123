package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMain {

	public static void main(String[] args) {
		// 연결하기
		Connection conn = null;
		
		try {
			//jdbc등록
			Class.forName("oracle.jdbc.OracleDriver");
			//연결
			conn = DriverManager.getConnection(
					"jdbc:Oracle:thin:@localhost:1521:xe", // url
					"java", // 계정
					"1234" // 계정 비밀번호
					);
			System.out.println("연결성공"); //실제로는 필요없지만 확인하기 위해서 넣어줌
			
			//실제 데이터 작업
			//데이터 수정
			String sql = "" +
			             "update boards " +
					     "set btitle = ?, content = ? " +
			             "where bno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"btitle", "content"});
			pstmt.setString(1, "행복"); //첫번째 물음표
			pstmt.setString(2, "바람분다");
			pstmt.setInt(3,4); //세번째 물음표, 1번을 바꾸겠다
			//데이터 작업 끝
			
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 갯수: " + rows);
			
			//출력작업
			
			/*
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno1 = rs.getInt(3);
					String title1 = rs.getString(1);
					String content1 = rs.getString(2);
					System.out.println(content1);
				}
			}
			*/
			
			pstmt.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결끊기");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
