package ch03;

public class Warrior {
	
	//멤버변수
	char level;
	String name;
	int loseHp;
	String attack1;
	String attack2;
	String attack3;
	
	//멤버함수
	public void attack() {
		System.out.println(name + "의 현재 level(은)는 " 
				+ level + "입니다." );
		System.out.println(name + "(이)가 몬스터를 " + attack1 + 
				"로 공격했습니다." );
		System.out.println(name + "(이)가 몬스터를 " + attack2 + 
				"로 공격했습니다." );
		
		System.out.println("몬스터가 " + name+ "(을)를 공격하여 " 
				+ "hp가 " + loseHp + " 깎였습니다." );
		System.out.println(name + "(이)가 몬스터를 " + attack3 + 
				"(으)로 공격했습니다." );
		System.out.println(name + "(이)가 승리했습니다.\n" +
				"level up하였습니다." );
	}
}//end of class
