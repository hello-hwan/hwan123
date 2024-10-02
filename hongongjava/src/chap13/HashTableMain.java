package chap13;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableMain {

	public static void main(String[] args) {
		//HashTable : 멀티스레드 환경에 안전하게 사용하는 map
		
		Map<String, String> map = new Hashtable<>();
		
		//Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id = sc.nextLine();
			
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 정확하지 않습니다");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다");
			}
			
			
		}
		sc.close();
	}// end main

}
