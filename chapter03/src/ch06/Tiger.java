package ch06;

public class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
		super.move();
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
		super.move();
	}
}
