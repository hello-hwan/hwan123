package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMain {

	public static void main(String[] args) {
		//database연결
		// jdbc 등록
		
		Connection conn = null; //Connection 인터페이스가 연결하는 기능
		
		try {//이안에 연결하는 명령문 넣기
			Class.forName("oracle.jdbc.OracleDriver");     // 트라이 캐치 할 것
			conn = DriverManager.getConnection(  //트라이캐치 있어서 add 캐치할것
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"java",
					"1234"
					);
			System.out.println("연결성공");
			
		} catch (ClassNotFoundException e) { 
			// db연결에서는 반드시 에러 사항을 알아야 해서 catch문 수정안함
			e.printStackTrace();
		} catch (SQLException e) {
			// db연결에서는 반드시 에러 사항을 알아야 해서 catch문 수정안함
			e.printStackTrace();
		}finally { //연결 안됐을 경우 추가해줄것
			//반드시 데이터베이스는 연결후에 연결 끊어줘야함
			if(conn != null) { //연결이 안되면 연결 끊어라
				try {
					conn.close(); //트라이 캐치문 추가할것, 연결끊는 메소드
					System.out.println("연결끊기");
				} catch (SQLException e) {
					// db연결에서는 반드시 에러 사항을 알아야 해서 catch문 수정안함
					e.printStackTrace();
				}
			}
		}
		
	}

}
