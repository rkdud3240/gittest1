package ch05;
//다형성 : 이 클래스를 바나나라고도 볼 수있고 과일이라고도 볼 수 있음
//ex : 과일 배 , 신체 배 , 선박 배
public class Banana extends Fruit {

	String origin;
	
	public Banana() {
		name = "바나나";
		price = 3000;
		fresh = 100;
		origin = "태국";
	}

}
