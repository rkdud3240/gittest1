package ch07;

public abstract class Computer {
	
	//abstract : �߻�޼��� - �޼����� �ٵ� ����
	public abstract void display();//�޼����� �����(�ñ״���)
	
	public abstract void typing();//�߻�Ŭ������ ���� ���� : display�� typing�� �ϰ� �˾Ƽ� �����ض�, ������ ���忡�� ������ �ο�
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	};
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	};
	//
}
