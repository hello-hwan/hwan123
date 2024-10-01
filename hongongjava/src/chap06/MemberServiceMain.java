package chap06;

public class MemberServiceMain {

	public static void main(String[] args) {
		MemberService mem = new MemberService();
		
		boolean result = mem.login("h", "12");
		boolean result1 = mem.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			mem.logout("hong");
		}else {
			System.out.println("ID 또는 PASSWORD가 정확하지 않습니다.");
			//비밀번호가 틀렸습니다 = 아이디 맞다는 이야기
		}
		
		if(result1) {
			System.out.println("로그인 되었습니다.");
			mem.logout("hong");
		}else {
			System.out.println("ID 또는 PASSWORD가 정확하지 않습니다.");
		}
	}

}
