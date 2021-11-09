package ch07;

public class AICar extends Car {
//추상메서드 만들기 abstract
	
	//추상메서드를 직접구현한 일반메서드 만들기
	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}

	@Override
	public void wiper() {
		System.out.println("스스로 와이퍼를 동작합니다.");
		
	}
	
	@Override
		public void washCar() {
			System.out.println("스스로 세차를 합니다.");
		}
	
//	private void run() {
//		// TODO Auto-generated method stub
//
//	}
}
