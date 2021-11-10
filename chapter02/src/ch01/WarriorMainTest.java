package ch01;

public class WarriorMainTest {

	//설계된 클래스를 사용하는 쪽 코딩
	public static void main(String[] args) {
		
		int height;//지역변수(stack/ 함수안, 메서드 안 위치),
				//데이터 타입 : int
		
		Warrior w1 = new Warrior();
		//참조 타입에는 주소값이 담긴다.
		w1.height = 200;
		w1.power = 100;
		w1.name = "전사";
		w1.color = "초록색";
		
		System.out.println(w1.height);
		System.out.println(w1.power);
		System.out.println(w1.name);
		System.out.println(w1.color);
		
		System.out.println("--------------");
		Warrior w2 = new Warrior();
		w2.height = 100;
		w2.power = 50;
		w2.name = "작은 천사";
		w2.color = "빨간색";
		
		System.out.println(w2.height);
		System.out.println(w2.power);
		System.out.println(w2.name);
		System.out.println(w2.color);

	}//end of main

}//end of class