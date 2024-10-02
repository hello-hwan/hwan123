package chap10;

public class ThrowsMain {

	public static void main(String[] args) {
		// 오류 떠넘기기
		try {
			findClass();// 여기서는 떠넘기면 안됨
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("class 찾지 못함");
		} 

	}

	private static void findClass() throws ClassNotFoundException { //오류에서 throws 클릭하면 생김
		Class clazz = Class.forName("java.lang.String2");  //실행블록으로 떠넘기기
		
	}

}
