package chap13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		//List 컬렉션
		//ArrayList -add("이름"), size() = 갯수, get(2) = 2번 객체, remove(2) or remove("객체이름")
		
		List<String> list = new ArrayList<>(); //ctrl + shift + o 하면 필요한거 다 임포트 시켜줌
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Character> list3 = new ArrayList<>();
		List<Class> list4 = new ArrayList<>();
		List<Long> list5 = new ArrayList<>();
		
		//객체추가
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		
		String skill = list.get(2);
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		for(String ele : list) { //향상된 포문은 타입으로 써야된다 ArrayList 타입 x
			System.out.println(ele);
		}

	}

}
