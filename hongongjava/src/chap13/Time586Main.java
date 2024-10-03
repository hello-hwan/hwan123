package chap13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Time586Main {

	public static void main(String[] args) {
		// 프로그램 실행 시간 체크
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		//System.out.println(list1.get(0));
		
		endTime = System.nanoTime();
		System.out.println("ArrayList\t 걸린시간:\t" + (endTime - startTime) +  " ns");
		
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList\t 걸린시간:\t" + (endTime - startTime) +  " ns");
	}

}
