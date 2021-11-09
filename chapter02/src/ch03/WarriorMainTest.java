package ch03;

public class WarriorMainTest {

	public static void main(String[] args) {
		// 직접 코드를 실행 시켜 주세요
		Warrior warrior1 = new Warrior();
		
		warrior1.level = '1';
		warrior1.name = "용감한 전사";
		warrior1.loseHp = 100;
		warrior1.attack1 = "육중한 일격";
		warrior1.attack2 = "관절 파괴";
		warrior1.attack3 = "광폭화";
		
		warrior1.attack();
		
	}

}
