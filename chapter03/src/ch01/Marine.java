package ch01;

public class Marine {

	private int power;
	private int hp;
	private String name;

	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}

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
		if(this.hp <= 0) {
			System.out.println(this.name + "��  ����߽��ϴ�.");
			this.hp = 0;
		}
	}
	
//attackZealot
//	// 1.������ ������ ����
//
//	public void attackZealot(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(this.name + "�� " + targetName +"�� ����");
//		zealot.beAttacked(this.power);
//	}
	
//attackZergling
//	// 2. ������ ���۸��� ����
//	public void attackZergling(Zergling zergling) {
//		String targetName = zergling.getName();
//		System.out.println(this.name + "�� " + targetName +"�� ����");
//		zergling.beattacked(this.power);
//	}
	
	//getName
	public String getName() {
		return name;
	}
	
	
	//�޼��� �����ε��� ����� ����
	public void attack(Zealot zealot){
		String targetName = zealot.getName();
		System.out.println(this.name + "�� " + targetName +"�� ����");
		zealot.beAttacked(this.power);
	}
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "�� " + targetName +"�� ����");
		zergling.beattacked(this.power);
	}
	

	
	
}// end of class
