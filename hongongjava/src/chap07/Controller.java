package chap07; 
// 클래스 바깥에서 다른 클래스 넣어도됨ㅡ 근데 public 넣으면 파일이름이랑 달라서 오류뜸
// 근데 어차피 저장될때는 클래스끼리 따로 저장됨

public class Controller { //main 메소드 포함한 클래스 
	//필드
	public MemberService service;
	
	//생성자
	
	//메소드
	public void setService(MemberService service) {
		this.service = service;
		
	}
	
	public static void main(String[] args) {
		//객체 생성
		Controller ct = new Controller();
		
		//메소드 MemberService
		ct.setService(new MemberService());
		ct.service.login();
		
		//메소드 AService
		ct.setService(new AService());
		ct.service.login();
		
	}

}
