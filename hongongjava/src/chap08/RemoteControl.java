package chap08;

public interface RemoteControl {
	
	//추상클래스에는 필드, 일반 메소드 넣을수 있음. 생성자는 있지만 생성은 불가
	//추상클래스에는 실행블록 포함
	
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
}
