package chap01;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 퍼블릭은 무조건 이름 동일하게 해야 오류안뜬다 (public 일때는 파일이름과 클래스 이름 동일하게 만들것)
		// 파일이름도 쉽게 알수있도록 지어야된다 (안들어가도 알수있게);
		System.out.println("Hello java~");
		//자바는 세미콜론 없으면 오류뜸
		//디스켓 하나는 자기만, 디스켓 여러개는 전부다 저장 - 저장누르면 자동 컴파일
		//저장안된 상태에서는 실행안됨 -> 세이브하라고 경고창 뜸
		//객체 - 객체혼자서 기능을 포함한다. 구조적 - 객체와 기능을 분리해서 연결 프로그램이 기능을 하도록 한다.
		//자바는 함수 x -> 메소드로 하다가 다시 함수기능 도입
		//메모리 너무 많이남으면 노란선으로 경고해줌
		//객체지향 - 캡슐화, 은닉화, 다용성?
		//워크스페이스 처음에 지정해줄수있음 - 여러군데 만들어놓았다면/
		//저장안되면 제목앞에 별 붙음 (*)
		//소스경로에 *.java;하면 전부 실행
		//*사용가능한 최소 파일은 패키지 + 소스파일
		// public class Hello(클래스 이름 대문자){};
		// 반드시 메인메소드 있어야 실행됨 public static void main(){};
		//*아주 긴 코드는 반드시 주석달아야됨 - 수정할때는 언제 누가 어떤 이유로(누군가 시켜서) 무엇을 수정했다.
		//*수정할때는 반드시 주석처리후 (삭제x); 수정
		
		char cha1 ='A';    // 문자지만 타입이 숫자이기 때문에 ""가 아닌 ''로 사용해야 된다.
		System.out.println(cha1);
		int int1 = 'A';
		System.out.println(int1);
		char cha2 ='가';
		System.out.println(cha2);
		int int2 = '나';
		System.out.println(int2);
		
		//롱타입 변수
		long var1 = 10;
		System.out.println(var1);
//		long var2 = 1000000000000000;  긴숫자는 L붙여줘야 에러로 안뜸
		long var2 = 1000000000000000L;
		System.out.println(var2);
		
		// \r 캐리지리턴 - 해당라인의 처음으로
		
	}

}
