package ex1;
				//과제2 : getter 와 setter만들기
public class Warrior {

	//멤버변수 
	//hp, power, name
	int hp;
	int power;
	String name;
	//생성자도 만들어 주세요

	public Warrior(String name) {
		this.name = name;
	}
	
	//메서드
	//마법사(Wizard)를 공격한다.
	//상태창을 꾸며서 볼 수 있는 기능을 만들어 주세요
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
