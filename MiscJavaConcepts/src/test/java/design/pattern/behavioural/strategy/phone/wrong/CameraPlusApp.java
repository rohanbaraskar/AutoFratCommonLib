package design.pattern.behavioural.strategy.phone.wrong;

public class CameraPlusApp extends PhoneCameraApp {

	@Override
	public void edit() {
		System.out.println("I can Edit Basic Camera App");
	}

	public void share() {
		System.out.println("Share on phone as well as email.");
	}
}
