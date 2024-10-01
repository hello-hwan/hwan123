package chap08;

public class RemoteMain {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		rc = new Tv();
		rc.setVolume(50);
		rc.setVolume(7);
		
		rc = new Audio();
		rc.setVolume(-5);
		rc.setVolume(7);
		
	}

}
