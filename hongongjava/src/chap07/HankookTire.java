package chap07;

public class HankookTire extends Tire { //부모객체 복사 붙여넣기로
	//필드
	//public int maxRotation; //최대회전수
	//public int accRotation; //누적회전수
	//public String location; //바퀴 위치
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		//location = location;
		//this.maxRotation = maxRotation;
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + 
		(maxRotation - accRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}
	
}
