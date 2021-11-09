package ch07;

public abstract class Car {
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	//��ũ(hook)�޼��� : �ʿ��ϸ� �����ٰ� ���� �� 
	public void washCar() {

	}
	
	//���ø��޼��� ����
	//�ٽ� !!
	//���� Ŭ�������� ������ �� �� ���� �ؾ� �Ѵ�. --> final
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
		
	}
}
