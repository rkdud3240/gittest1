package ch07;

public abstract class Computer {
	
	//abstract : 추상메서드 - 메서드의 바디가 없음
	public abstract void display();//메서드의 선언부(시그니쳐)
	
	public abstract void typing();//추상클래스를 쓰는 이유 : display와 typing은 니가 알아서 구현해라, 설계자 입장에서 강제성 부여
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	};
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	};
	//
}
