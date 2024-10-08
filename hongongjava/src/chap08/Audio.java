package chap08;
//자식 클래스는 ctrl + c, ctrl + v
public class Audio implements RemoteControl {
	//필드
	private int volume;
	
	//생성자
	
	
	//메소드 ctrl + space로 추상메소드 전부 재정의해야 Tv에 오류 사라짐
	@Override
	public void turnOn() {
		System.out.println( "Audio를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println( "Audio를 끕니다");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println( "현재 Audio 볼륨은 " + this.volume);
	}
	
}
