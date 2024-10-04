package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertMain {

	public static void main(String[] args) {
		// 데이터 추가
		Connection conn = null; //새로 만들땐 연결 다시 해주고 끊어야됨
		// jdbc 드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					//jdbc 오라클 tcp 서버아이피 tcp포트, sid명
					"jdbc:Oracle:thin:@localhost:1521:xe",
					"java",
					"1234"
					);
			System.out.println("연결성공");
			
			//데이터 추가 작업
			String sql = "" // ""는필요 없는거임 잘 보이게 하려고 넣은거
			              + "insert into boards  (bno,btitle,content,bwriter, bdate) "
			              //실행문 뒤에 띄어쓰기 할것 - 실행문에서는 딱 붙어서 나옴
			              + "values (seq_bno.nextval, ?, ?, ?, sysdate) ";
			//물음표는 내용대신 넣은거 preparedStatement 쓸때 보안때문에 ?로 작성후 추가함
			//보안이 되는 sql 실행문
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno", "btitle"});
			//sql 문 뒤에 배열 추가해서 추가된 번호 출력하면 몇번인지 알 수 있다
			pstmt.setString(1,"눈오는밤"); //타이틀 추가
			//integer면 setInt
			pstmt.setString(2,"눈내림");
			pstmt.setString(3,"snow");
			
			//sql문장 실행문
			int rows = pstmt.executeUpdate(); //인서트, 업데이트, 딜리트 명령문
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys(); //결과값 출력
				if(rs.next()) {
					int bno = rs.getInt(1); // 1번은 컬럼번호,getInt(bno);
					String title = rs.getString(2); // 2번은 컬럼번호,getInt(bno);
					System.out.println("저장된 번호: " + bno + "제목: " + title);
				}
				
				System.out.println("추가성공");
				rs.close();
			}else {
				System.out.println("추가실패");
			}
			
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
