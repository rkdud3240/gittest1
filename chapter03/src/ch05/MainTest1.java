package ch05;

public class MainTest1 {

	public static void main(String[] args) {

		Banana banana = new Banana();
		Peach peach = new Peach();

		banana.showInfo();
		System.out.println("=====================");
		peach.showInfo();

		// 자바에서 다형성이란
		// 부모 타입 인스턴스 변수에 자식 객체를 생성할 수 있다.
		Fruit fruit = new Banana(); // 업 캐스팅 된 상태
		// 바나나의 주소값이 과일에 담김
		// 부모 자식 관계에서 사용 가능하다._상속구조일때만
		// 그 역은 성립하지 않는다.
		// 즉 자식 인스턴스 변수에(참조변수)
		// 부모 인스턴스를 생성시킬 수 없다.
//		Banana banana2 = new Fruit(); (x)
		
		
		
	}

}
