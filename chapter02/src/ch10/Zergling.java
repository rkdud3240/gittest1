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
		System.out.println("=====정보창=====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("===============");
	}

	// 공격당합니다.
	public void beattacked(int power) {
		this.hp -= power;
		if(this.hp <= 0) {
			System.out.println(this.name + "은  사망했습니다.");
			this.hp = 0;
		}
	}

//	// 1.저글링이 질럿을 공격
//	public void attackZealot(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(this.name + "이 " + targetName +"을 공격");
//		zealot.beAttacked(this.power);
//	}
//
//	// 2. 저글링이 마린을 공격
//	public void attackMarine(Marine marine) {
//		String targetName = marine.getName();
//		System.out.println(this.name + "이 " + targetName +"을 공격");
//		marine.beAttacked(this.power);
//	}


	//getName
	public String getName() {
		return name;
	}
	
	
	//메서드 오버로딩을 사용해 보자
	public void attack(Marine marine){
		String targetName = marine.getName();
		System.out.println(this.name + "이 " + targetName +"을 공격");
		marine.beAttacked(this.power);
	}
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "이 " + targetName +"을 공격");
		zealot.beAttacked(this.power);
	}
	//1. 메서드 오버로딩을 사용해 보자 2개~
	
	
	
}// end of class
