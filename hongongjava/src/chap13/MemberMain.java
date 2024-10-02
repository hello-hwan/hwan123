package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberMain {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		//new로 만들면 새로운 주소라서 해시코드가 전부 다르게 생성됨
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		set.add(new Member("최길동", 25));
		set.add(new Member("최길동", 30));
		
		System.out.println("총 객체 수: " + set.size() );
		
		//set 전체 출력
		
		for(Member ele : set) { // int i = 0 이거 못씀, 인덱스가 없어서
//			System.out.println(ele.name + ele.age );
			System.out.println(ele);
		}
		
		//set은 아예 인덱스가 없어서 무조건 덩어리로 반복해서 체크해야됨
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) { //다음 객체가 있니? 트루면 {}실행
			Member element = iterator.next(); //다음객체 가져오기
			System.out.println("\t" + element.name + "\t" + element.age);
		}
		
		//반복자 iterator
//		Iderator ir = set.iterator();
		Iterator<Member> ir = set.iterator(); //set의 타입을 몰라서
		while(ir.hasNext()) { //다음 객체가 없을때까지 반복
			Member m = ir.next(); // 다음객체 가져오기
			System.out.println(m.name + m.age);
		}
	}

}
