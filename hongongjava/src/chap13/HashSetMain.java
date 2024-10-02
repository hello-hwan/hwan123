package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		// set : 순서 보장 안됨, 중복 객체 저장 안됨, 반복자 필요함 iterate
		
		Set<String> set = new HashSet<String>();
		//눈에 안보이는 미세한 공백이나 이런것들때문에 에러뜰수도 있다.
		//그러면 그냥 아예 다 지우고 새로 써볼것
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JS");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("객체수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수: " + set.size());
		
		iterator = set.iterator();
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음");}
		
	}

}
