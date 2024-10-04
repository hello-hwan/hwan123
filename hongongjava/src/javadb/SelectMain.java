package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {

	public static void main(String[] args) {
		// 데이터 조회
		
		//연결
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"java",
					"1234"
					);
			
			System.out.println("연결성공");
			
			String sql = "" +
			             "select * " +
					     "from boards " +
			             "where bwriter = ? ";//조건을 입력
			//근데 "bwriter = 글쓴이1" 이걸 ?로 표현하면 오류뜸
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//조건 추가
			pstmt.setString(1, "글쓴이5"); // ? 하나밖에 없어서 첫번째 1
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Boards bd = new Boards();
				bd.setBno(rs.getInt(1));
				bd.setBtitle(rs.getString(2));
				bd.setContent(rs.getString(3));
				bd.setBwriter(rs.getString(4));
				bd.setBdate(rs.getDate(5));
				
				//to.String 재정의 해서 사용
				System.out.println(bd);
			}
			
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("연결종료");
			}
		}
		
		
	}

}
