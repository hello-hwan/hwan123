package chap06;

public class SingletonMain {

	public static void main(String[] args) {
		//싱글톤 사용시 객체 생성불가 -> 메소드 호출해서 받아와야함 (private으로 접근제한 걸어둠)
		Singleton st = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		if (st == st2) {
			System.out.println("주소가 같은 객체" + st);
		}else {
			System.out.println("주소가 다른 객체");
		}
		
		st.name= "야";
		System.out.println(st.name);
		st.name = "아무개";
		System.out.println(st2.name); // 같은 객체를 가리켜서 바뀜
		
		
	}
}
