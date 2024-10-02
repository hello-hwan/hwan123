package chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		//map : 키와 값으로 구성된 entry 저장
		//Map = 인터페이스, 키는 스트링, 값은 인티저(클래스)
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //키값이 동일하면 마지막 값으로 덮어쓰기
		
		//map 크기
		System.out.println("map 크기 : " + map.size());
		
		//객체 찾기
		System.out.println("홍길동 : " + map.get("홍길동"));
		
		//객체 하나씩 처리
		System.out.println("전체 읽어오기---------------");
		
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) { //향상된 for문
			System.out.println(key + " : " + map.get(key));
		}
		
		/*
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key keyIterator.next();
			Integer value = map.get(key);
			System.println("\t" + key + " : " + value);
		}
		System.out.println();
		*/
		
		//객체 삭제
		map.remove("홍길동");
		
		//객체 하나씩 처리
		System.out.println("전체 읽어오기------------------");
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
