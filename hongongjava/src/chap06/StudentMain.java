package chap06;

public class StudentMain {

	public static void main(String[] args) { //객체 실행
		//객체를 생성해서 사용
		Student st1 = new Student("240901", "강땡땡");
		//(객체타입) 변수 = new 생성자함수(매개변수)
		//객체는 필드(속성), 메소드 (생성자는 생성할때만) 들어가있다
		System.out.println(st1.stNo);
		System.out.println(st1.name);
		st1.study() ;
		
		Student st2 = new Student("200902","김땡땡"); // ctrl +space
		System.out.println(st2.stNo);
		System.out.println(st2.name);
		
		//필드, 생성자, 메소드 중 생성자는 반드시 필수: 객체를 만들수가 없음
		//컴파일러가 생성자는 없어도 만들어줌
		
		//교수님 문제
		
//		Student stu1 = new Student("24학번", "이사", 90, 40, 79);
//		Student stu2 = new Student("23학번", "이삼", 100, 100, 100);
//		Student stu3 = new Student("22학번", "이이", 77, 100, 50);
//		Student stu4 = new Student("21학번", "이일", 22, 55, 90);
//		Student stu5 = new Student("20학번", "이공", 100, 35, 80);
		
		Student[] stuArr = {
				new Student("24학번", "이사", 90, 40, 79),
				new Student("23학번", "이삼", 100, 100, 100),
				new Student("22학번", "이이", 77, 100, 50),
				new Student("21학번", "이일", 22, 55, 90),
				new Student("20학번", "이공", 100, 35, 80)
		};
		
		for(Student ele : stuArr) {
			System.out.printf("%s : %3d %3d %3d %d %6.2f %s\n", 
					ele.name,ele.kor,ele.eng,ele.math,ele.sum(),ele.avg(),ele.grade());
		}
		
//		System.out.printf("%s : %3d %3d %3d %d %6.2f %s\n", stu2.name,stu2.kor,stu2.eng,stu2.math,stu2.sum(),stu2.avg(),stu2.grade());
//		System.out.printf("%s : %3d %3d %3d %d %6.2f %s\n", stu3.name,stu3.kor,stu3.eng,stu3.math,stu3.sum(),stu3.avg(),stu3.grade());
//		System.out.printf("%s : %3d %3d %3d %d %6.2f %s\n", stu4.name,stu4.kor,stu4.eng,stu4.math,stu4.sum(),stu4.avg(),stu4.grade());
//		System.out.printf("%s : %3d %3d %3d %d %6.2f %s\n", stu5.name,stu5.kor,stu5.eng,stu5.math,stu5.sum(),stu5.avg(),stu5.grade());
		
		
		
	}
}
