package ch07;

public abstract class Car {
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	//후크(hook)메서드 : 필요하면 가져다가 쓰는 것 
	public void washCar() {

	}
	
	//템플릿메서드 패턴
	//핵심 !!
	//하위 클래스에서 재정의 할 수 없게 해야 한다. --> final
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
		
	}
}
