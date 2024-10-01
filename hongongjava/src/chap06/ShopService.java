package chap06;

public class ShopService {
	//싱글톤 사용기법
	//필드 ->자신의 객체 저장
	private static ShopService ssv = new ShopService(); 
	//메소드에서 호출하려면 static달아줘야됨
	
	//생성자 -> 외부 접근 막아야함
	private ShopService() {};
	
	//메소드 -> 외부로 객체를 전달
	static ShopService getInstance() { 
		// 객체 생성없이 접근 static, 객체타입 접근 -ShopService
		return ssv;
	}
	
	
}//end class
