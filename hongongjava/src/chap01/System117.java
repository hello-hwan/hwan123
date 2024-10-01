package chap01;

import java.io.IOException;

public class System117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int keyCode;
		while(true) {
			try {
				System.out.print("키 입력 >"); //커서 아무데나 냅둬도 자동으로 찾아감
				// 영어 같은 경우에는 통문자로 읽어내지 못함
				// 한글 같은 경우에는 하나씩 입력되어 합쳐보면 이상하게 나옴
				//시스ㅊ템 인
				keyCode = System.in.read(); // ioexception이 생길 가능성이 높으니 예외 처리하세요 -suround선책
				System.out.println("keyCode : " + keyCode);
				if(keyCode == 113) {
					break;
				}
			} catch (IOException e) {  //입출력 예외가 생겼다면
				System.out.println("입력 오류 발생");
			}
		}
		System.out.println("종료");
		

	}//end main
	
}//end class
