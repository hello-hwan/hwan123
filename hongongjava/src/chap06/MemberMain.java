package chap06;

public class MemberMain {

	public static void main(String[] args) {
		// 객체 생성
		Member member = new Member();
		
		System.out.println("이름: " + member.name + " 나이 : " + member.age);
		
		//필드값 변경
		member.name = "최하얀";
		member.age = 23;
		
		//필드값 출력
		System.out.println("이름: " + member.name + " 나이 : " + member.age);
		
		Member member2 = new Member("홍길동", "hong");
		
		System.out.println(member2.name+ member2.id);
		
	}// end main

}
