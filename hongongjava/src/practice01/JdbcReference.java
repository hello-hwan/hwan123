package practice01;

public class JdbcReference {
	
	

	JDBC
	자바 프로그램에서 SQL문을 실행하여 데이터를 관리하기 위한 JAVA API

	다양한 DB에 대해 별도의 프로그램을 만들 필요 없이 해당 DB의 JDBC 를 이용하면 하나의 프로그램으로 DB 관리할 수 있음

	Oracle에 있는 JDBC 라이브러리를 자바 프로젝트에 가지고 와야함

	INSERT, UPDATE, DELETE 명령일 경우 executeUpdate()를 호출

	SELECT 명령일 경우 executeQuery()를 호출

	INSERT
	JDBC INSERT
	SQL 작성
	INSERT 하고 싶은 테이블에 원하는 값을 넣어주며 값은 ?로 표현하고 원하는 데이터 타입에 맞게 지정

	Scanner sc = new Scanner(System.in);
	System.out.println("회원가입 페이지");
	System.out.println("아이디 : ");
	String id = sc.next();
//			id를 직접 입력받음
	System.out.println("비밀번호 : ");
	String pw = sc.next();

	System.out.println("이름 : ");
	String name = sc.next();

	System.out.println("이메일 : ");
	String email = sc.next();

//			SQL작성
//			SQL문은 String 형태로 작성
	String sql = "INSERT INTO members VALUES(?, ?, ?, ?)";
//			members라는 테이블을 생성하고 값을 넣어줌
//			INSERT하고자 하는 변수의 값의 자리를 ?로 표현

	DB연동
	데이터 베이스에 연동할 수 있도록 초기 설정 지정

//			DB연동 순서
//			1. DB 사용자 계정명, 암호, DB URL 등 초기 데이터 변수 설정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uid = "원하는 아이디";
			String upw = "원하는 비밀번호";
//			Connection 개체가 위의 3개의 정보를 가지고 java와 DB연결
			
//			사용할 객체의 변수를 미리 선언(finally에서도 사용해야함으로)
			Connection conn = null;
			PreparedStatement pstmt = null;
//			JAVA와 DB간의 연결하는 지점을 만들어 주는 것

	입력
	INSERT하고 싶은 값을 DB에 실제로 입력

	?의 순서에 맞게 값을 넣어줌

	Connection : DB와의 연결을 위한 객체

	PreparedStatement 객체 : SQL문을 실행시키기 위한 객체

	try {
//				예외가 발생할 수 있는 code를 적을 때 사용
//			2. JDBC Connector Driver 호출
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
//				특정 클래스 강제구동 메소드이며 forName은 throws가 있으므로 try catch안에서 실행 
				
						
//			3. DB연동을 위한 클래스들의 객체를 생성 
				/*
				 - Connection 객체 : DB와의 연결을 위한 객체
				 - Connection 객체는 new 연산자를 통해 직접 생성하는 것이 아니라 
				 - DriverManager 클래스가 제공하는 정적 메소드인 getConnection()을 호출하여 객체를 받아옴  
				 */
				conn = DriverManager.getConnection(url, uid, upw);
				
				/*
				 PreparedStatement 객체 
				 - SQL문을 실행시키기 위한 객체
				 Pstmt(PreparedStatement) 객체는 conn 객체가 제공하는 PreparedStatement() 메서드를 호출하여 객체를 받아옴 
				 매개값으로 실행시킬 sql문을 전달
				 */
				pstmt = conn.prepareStatement(sql);
				
				/*
				 SQL완성하기(전달할 SQL에 ?를 채우기)
				 - pstmt 객체를 생성했다면 SQL문의 ?를 채울 수 있음
				 - ?는 첫번째 물음표부터 1번 인덱스값을 가지며 순차적으로 인덱스가 1씩 증가
				 - DB 테이블의 컬럼 타입에 따라 setString(), setInt() 등의 메서드를 통해 ?를 채움  
				 */
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				pstmt.setString(3, name);
				pstmt.setString(4, email);
//				화면으로 입력받은 값을 Connection 클래스를 통해 sql에 접속하여 값을 각각 넣어줄 수 있음
				
				/*
				 pstmt 객체를 통한 SQL 실행 
				 - INSERT, UPDATE, DELETE 명령일 경우에는 excuteUpdate()를 호출
				 - SELECT 명령일 경우 executeQuery()를 호출 
				 - executeUpdate()는 sql 실행 시 성공한 쿼리문의 개수를 실패 시 0을 리턴(정상작동 확인 가능)
				 */
				int rt = pstmt.executeUpdate();
				
				if (rt >= 1) {
					System.out.println("DB에 회원정보 저장 성공!");
					System.out.println("성공한 쿼리 수 " + rt);
				} else {
					System.out.println("DB에 회원정보 저장 실패!");
				}

			} catch (Exception e) {
				e.printStackTrace();
//				예외가 발생했을 때 보여주는 것(지금은 클래스가 없으면 나올듯)
//				어떤 예외가 발생할지 모를때에는 Exception만 적어주면 되고 Exception안에 대부분의 예외가 있기 때문
			}

	DB 연동 close
	DB 연동을 계속 유지하면 리소스 낭비가 발생하기 때문에 계속 유지할 필요가 없으므로 DB연동 해제

	finally {
//				예외처리와 발생 여부와 상관없이 마지막에 무조건 실행
				/*
				 DB연동에 사용한 객체 자원 반납 
				 - 원활한 JDBC 사용을 위해 사용한 자원을 반납 (메모리 관
				 */
//				try안에서 pstmt와 conn이 유효하기 때문에 try블록 밖에서 빼줘야 함

				try {
					pstmt.close();
					conn.close();
					sc.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}		
			}
	UPDATE
	JDBC UPDATE
	SQL 작성
	원하는 Query에 맞게 값을 넣어 주며 값은 ?로 표현하고 원하는 데이터 타입에 맞게 지정

	String sql = "Update members SET name  = ? , email= ? WHERE id = ?";

	DB연동
	데이터 베이스에 연동할 수 있도록 초기 설정 지정

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "원하는 아이디";
	String upw = "원하는 비밀번호";
			

	Connection conn = null;
	PreparedStatement pstmt = null;

	입력
	조작하고 싶은 값을 실제로 입력

	?의 순서에 맞게 값을 넣어줌

	try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				conn = DriverManager.getConnection(url, uid, upw);
				
				pstmt = conn.prepareStatement(sql);		
				pstmt.setString(1, name);
				pstmt.setString(2, email);
				pstmt.setString(3, id);
				
				int rt = pstmt.executeUpdate();
				
				if (rt>=1) {
					System.out.println("DB에 회원정보 업데이트 성공");
					System.out.println("성공한 쿼리 수 : " + rt);
				}
				else {
					System.out.println("업데이트 실패 ");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	DB 연동 close
	DB 연동을 유지해야 할 필요가 없으므로 DB연동 해제

	finally {

				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}		
			}

	SELECT
	JDBC SELECT

	SELECT는 다른 DML과 다르게 ResultSet과 executeQeury()메소드를 사용하여 결과를 출력할 수 있음
	ResultSet의 next() 메소드를 이용해 한 행씩 값을 불러와서 출력하는 형식
	SQL 작성
	원하는 Query에 맞게 값을 넣어 주며 값은 ?로 표현하고 원하는 데이터 타입에 맞게 지정

	Scanner sc = new Scanner(System.in);
	System.out.println("조회할 job_id를 입력하세요.");
	System.out.println("job_id : ");
	String job_id = sc.next();

	String sql = "SELECT first_name, salary FROM employees WHERE job_id = ?";

	DB연동
	데이터 베이스에 연동할 수 있도록 초기 설정 지정

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "원하는 아아디";
	String upw = "원하는 비밀번호";
			

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	입력
	SELECT 하고 싶은 값을 실제로 입력

	?의 순서에 맞게 값을 넣어줌

	반복문을 통해 SELECT의 결과를 한 행씩 반환

	try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, uid, upw);
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, job_id);
				rs = pstmt.executeQuery();
				
				int count = 0;
				while (rs.next()) {
					
//					String f_n = rs.getString("first_name");
//					int sal = rs.getInt("salary");
					System.out.printf("# 직업이름 : %s\n # 이름 : %s\n# " + "급여 : %d\n" ,
							job_id,rs.getString("first_name"),rs.getInt("salary"));
					count++;
					System.out.println("=========================================");
				}
				if (count < 1) {
					System.out.println("조회 결과가 없습니다.");
				} else {
				System.out.println("조회된 행의 개수 : " + count + "개");
				}
				

				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	DB 연동 close
	DB 연동을 유지해야 할 필요가 없으므로 DB연동 해제

	finally {

				try {
					rs.close();
					pstmt.close();
					conn.close();
					sc.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}		
			}
	
}

