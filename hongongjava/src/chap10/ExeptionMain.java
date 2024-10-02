package chap10;

public class ExeptionMain {

	public static void main(String[] args) {
		//예외처리
		//ctrl + D = 한줄 삭제
		try {
			Class clazz = Class.forName("java.lang.String");// 실행하고자 했던 문장 - surround 어쩌고 클릭
			System.out.println(clazz);
		} catch (ClassNotFoundException e) { //객체 생성
			// TODO Auto-generated catch block
//			e.printStackTrace(); // 오류가 발생했을때 처리 할 내용
			System.out.println("클래스를 찾지 못했어요");
		}
		
		try { //try + ctrl space
			//실제 실행할 코드
			String strNum = "a123";
			int num = Integer.parseInt(strNum);
			System.out.println(num);
		} catch (Exception e) {
			//오류가 나타났을때 실행할 내용
			e.printStackTrace(); //얘는 위치도 찾아줌
//			System.out.println("변경 못함"); //얘는 틀리면 출력
		}
		
		//클래스이름 exception으로 하면 오류뜬다
		
		
	}

}
