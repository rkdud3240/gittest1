package ch04;

public class Warrior extends Hero {
	// ���� �� �߸� ������ �ذ�

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboAttack() {
		System.out.println("2�� ����!");
	}
}
