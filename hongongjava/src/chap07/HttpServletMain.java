package chap07;

public class HttpServletMain {

	public static void main(String[] args) {
		//필드
		
		//생성자
		
		//메소드
		method(new LoginServlet()); //로그인 합니다
		method(new FileDownloadServlet()); //파일 다운로드 합니다
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
