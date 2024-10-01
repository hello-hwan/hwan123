package chap06;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	private int maxSpeed = 350;
	
	// private는 반드시 Getter, setter이용해서 접근해야됨
	// 메뉴바- source-generate getter setter 로 
	// private 접근할 수 있는 메소드 쉽게 만들어줌
	
	private int speed;

	private int gas;
	
	private boolean stop;
	
	//생성자 - 매개변수가 없으면 컴파일러 자동생성해도됨
	
	//메소드
	/*
	void setGas(int gas) { //가스 투입 메소드
		//리턴타입은 결과를 출력할 타입, 투입할때는 매개변수 타입만 같으면 된다
		//같은 타입끼리는 오버로딩안됨 
		//int x, int y => int y, int x (X) 오류출력됨 -컴퓨터가 구분못함
		
		this.gas = gas;
	}
	
	int getSpeed() { //speed 값을 외부로 내보내주는 메소드
		//보통은 필드에 바로 접근 안하고 변형하여(보안,보호를 위하여) 값 출력
		return speed;
	}
	*/
	
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

	/*
	public boolean isGasState() { //boolean 일때는 get 앞에 is 붙임
		return gasState;
	}
	
	public void setGasState(boolean gasState) {
		this.gasState = gasState;
	}
	*/
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		this.speed = speed;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas--;
			}else {
				System.out.println("멈춥니다. (gas잔량: " + gas + ")");
				return; //void일때는 종료
			}
		}
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	
	void run2() {
		for(int i =10; i < 51; i += 10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}
}//end class
