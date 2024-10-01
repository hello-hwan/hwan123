package chap07;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1 :
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",15); 
				//frontLeftTire 는 new Tire("location", 최대회전수)로 만든 객체
				//이거를 새로운 객체로 갈아넣는다.
				break;
			case 2 :
				System.out.println("앞오른쪽 HankookTire로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽",15);
				break;
			case 3 :
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽",15);
				break;
			case 4 :
				System.out.println("뒤오른쪽 HankookTire로 교체");
				car.frontRightTire = new HankookTire("뒤오른쪽",15);
				break;
			}
			System.out.println("-------------------");
		}
	}

}
