package ex1;
				//����2 : getter �� setter�����
public class Warrior {

	//������� 
	//hp, power, name
	int hp;
	int power;
	String name;
	//�����ڵ� ����� �ּ���

	public Warrior(String name) {
		this.name = name;
	}
	
	//�޼���
	//������(Wizard)�� �����Ѵ�.
	//����â�� �ٸ缭 �� �� �ִ� ����� ����� �ּ���
	public void showInfo() {
		
	}
//	public static void main(String[] args) {
//		returnRandom();
//	}
//	
//	public static void returnRandom() {
//		
//		Random random = new Random();
//		int number = random.nextInt(21);
//		System.out.println(number);
//	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
