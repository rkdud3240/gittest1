package ch04;

public class Warrior extends Hero {
	// 빨간 줄 뜨면 누르면 해결

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboAttack() {
		System.out.println("2단 공격!");
	}
}
