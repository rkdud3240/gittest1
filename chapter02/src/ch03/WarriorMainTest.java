package ch03;

public class WarriorMainTest {

	public static void main(String[] args) {
		// ���� �ڵ带 ���� ���� �ּ���
		Warrior warrior1 = new Warrior();
		
		warrior1.level = '1';
		warrior1.name = "�밨�� ����";
		warrior1.loseHp = 100;
		warrior1.attack1 = "������ �ϰ�";
		warrior1.attack2 = "���� �ı�";
		warrior1.attack3 = "����ȭ";
		
		warrior1.attack();
		
	}

}
