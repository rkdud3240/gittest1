package ch03;

public class Warrior {
	
	//�������
	char level;
	String name;
	int loseHp;
	String attack1;
	String attack2;
	String attack3;
	
	//����Լ�
	public void attack() {
		System.out.println(name + "�� ���� level(��)�� " 
				+ level + "�Դϴ�." );
		System.out.println(name + "(��)�� ���͸� " + attack1 + 
				"�� �����߽��ϴ�." );
		System.out.println(name + "(��)�� ���͸� " + attack2 + 
				"�� �����߽��ϴ�." );
		
		System.out.println("���Ͱ� " + name+ "(��)�� �����Ͽ� " 
				+ "hp�� " + loseHp + " �𿴽��ϴ�." );
		System.out.println(name + "(��)�� ���͸� " + attack3 + 
				"(��)�� �����߽��ϴ�." );
		System.out.println(name + "(��)�� �¸��߽��ϴ�.\n" +
				"level up�Ͽ����ϴ�." );
	}
}//end of class
