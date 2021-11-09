package ch08;

public class Television extends HomeAppliances
                     implements RemoteController{
	
	@Override
	public void turnOn() {
		System.out.println("tv¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv¸¦ ²ü´Ï´Ù.");
	}
}
