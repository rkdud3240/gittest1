package ch01;

public class Zealot {

	private int power;
	private int hp;
	private String name;

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}

	public void showInfo() {
		System.out.println("=====정보창=====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("===============");
	}

	// 공격당합니다.
	public void beAttacked(int power) {
		this.hp -= power;
		if(this.hp <= 0) {
			System.out.println(this.name + "은  사망했습니다.");
			this.hp = 0;
		}
	}
	// 공격합니다. -> 질럿이 마린을 공격하는 동작
	// 다른 객체와 상호작용 - 메서드로 참조 변수 전달
//	public void attackMarine(Marine marine) {
//		String targetName = marine.getName();
//		System.out.println(this.name + "이 " + targetName +"을 공격");
//		marine.beAttacked(this.power);
//	}
//
//	public void attackZergling(Zergling zergling) {
//		String targetName = zergling.getName();
//		System.out.println(this.name + "이 " + targetName +"을 공격");
//		zergling.beattacked(this.power);
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
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "이 " + targetName +"을 공격");
		zergling.beattacked(this.power);
	}
	
	//1. 메서드 오버로딩을 사용해 보자 2개~
	
	
}// end
