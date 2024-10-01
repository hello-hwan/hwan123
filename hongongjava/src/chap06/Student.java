package chap06;

public class Student { //메인 메소드가 없는클래스 -객체 생성 클래스
	//필드 (속성)
	String stNo;
	String name;
	
	int kor;
	int eng;
	int math;
	String grade;
	
	//생성자 (객체 생성) -> 객체 생성시에 객체의 속성을 초기화, 가장 중요한 기능
	//객체를 만드는 역할 - 리턴이 없고 이름이 클래스와 동일
	Student(String stNo, String name){ //매개변수를 받아야되면 미리 넣어야됨
		this.stNo = stNo; //생성한 객체의 필드 stNo은 매개변수의 stNo이다
		this.name = name; //생성한 객체의 필드 name은 매개변수의 name이다
	}
	
	Student(String stNo, String name, int kor, int eng, int math){
		this.stNo = stNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	//메소드(기능) 기능을 담당 - 실행블록 {}가지고있음,
	//매개변수로 외부값 받음, 리턴은 없어도 됨 
	void study() { //리턴값없이 void
		System.out.println("공부합니다");
	}
	
	/*
	double sum(int kor,int eng,int math) {
		sum = kor + eng + math;
		return sum;
	}*/
	
	int sum() {
		return kor + eng + math;
	}

	double avg() {
		return sum() / 3.0; //데리고올때 함수니까() 붙여야된다
	}
	
	String grade() {
		int gradeNo = (int)( (kor + eng + math) / (3 * 10) );
		switch(gradeNo) {
		case 10: 
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default:grade = "F";
		}
		return grade;
	}

}
