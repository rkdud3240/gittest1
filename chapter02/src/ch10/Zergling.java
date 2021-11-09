package ch10;

public class Zergling {
	int hp;
	int power;
	String name;

	public Zergling(String name) {
		this.name = name;
		this.hp = 100;
		this.power = 5;
	}

	public void showInfo() {
		System.out.println("=====����â=====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("===============");
	}

	// ���ݴ��մϴ�.
	public void beattacked(int power) {
		this.hp -= power;
		if(this.hp <= 0) {
			System.out.println(this.name + "��  ����߽��ϴ�.");
			this.hp = 0;
		}
	}

//	// 1.���۸��� ������ ����
//	public void attackZealot(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(this.name + "�� " + targetName +"�� ����");
//		zealot.beAttacked(this.power);
//	}
//
//	// 2. ���۸��� ������ ����
//	public void attackMarine(Marine marine) {
//		String targetName = marine.getName();
//		System.out.println(this.name + "�� " + targetName +"�� ����");
//		marine.beAttacked(this.power);
//	}


	//getName
	public String getName() {
		return name;
	}
	
	
	//�޼��� �����ε��� ����� ����
	public void attack(Marine marine){
		String targetName = marine.getName();
		System.out.println(this.name + "�� " + targetName +"�� ����");
		marine.beAttacked(this.power);
	}
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "�� " + targetName +"�� ����");
		zealot.beAttacked(this.power);
	}
	//1. �޼��� �����ε��� ����� ���� 2��~
	
	
	
}// end of class
