package ch06;

public class Human extends Animal{
	
	//move ��Ʈ�� �����̽� -> �������̵�
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
