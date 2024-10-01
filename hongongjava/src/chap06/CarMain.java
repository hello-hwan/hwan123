package chap06;

public class CarMain {

	public static void main(String[] args) { //main 메소드 넣으라고
		//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.getMaxSpeed());
		System.out.println("현재속도: " + myCar.getSpeed());
		
		//필드값 변경
//		myCar.setSpeed(int speed) = 60;
		myCar.setSpeed(60) ;
		System.out.println("수정된 속도: "+ myCar.getSpeed());
		myCar.color = "흰색";
		
		//교재 p279
		myCar.setGas(5); //
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas 주입할 필요 없음");
		}else {
			System.out.println("gas 주입하세요");
		}
		
		//교재 p284
		System.out.println("교재 284--------------------------");
		myCar.keyTurnOn();
		
		myCar.run2();
		
		int speed = myCar.getSpeed();
		System.out.println("현재속도는 " + speed + "km/h 입니다");
		
		//교재 p327
		myCar.setSpeed(-10);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) { //!false(stop 필드 세팅값) 라면 
			myCar.setStop(true); //스탑을 트루로 만들어서 속도를 0으로 만든다
		}
		
		System.out.println(myCar.getSpeed());
		
		
		
	}//end main
	
}
