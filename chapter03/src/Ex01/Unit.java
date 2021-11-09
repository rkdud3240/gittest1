package Ex01;

//newŰ���带 ����ؼ� �޸𸮿� �ø� �� ����. Ÿ�����θ� ����Ѵ�.
public abstract class Unit {

	protected int power;
	protected int hp;
	protected String name;

	// ����â
	public void showInfo() {
		System.out.println("=====����â=====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("===============");
	}

	// ���ݴ��մϴ�.
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "��  ����߽��ϴ�.");
			this.hp = 0;
		}
	}

	public String getName() {
		return this.name;
	}

	// �޼��� �����ε�
	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(this.name + "�� " + targetName + "�� ����");
		unit.beAttacked(this.power);
	}

}// end of class
