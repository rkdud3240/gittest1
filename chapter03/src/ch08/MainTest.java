package ch08;

import java.util.Iterator;

public class MainTest {
	// main function
	public static void main(String[] args) {

		Television televison = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyrobot = new ToyRobot();

//		televison.turnOn();
//		televison.turnOff();
//		
//		System.out.println("==========================");
//		
//		refrigerator.turnOn();
//		refrigerator.turnOff();

		// 다형성 - 배 (신체, 선박, 과일)

		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = toyrobot;

		// 확장 for문 turnOn 호출
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("-------------------");
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("-------------------");
		// instanceOf 연산자 사용해보기
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println("장난감 객체입니다.");

				// 도전과제
				// remote[i] 으로 접근해서
				// 화면에 name 멤버 변수를 출력해주세요.
//				double a = 1.0;
//				int b = (int)a;
				String name = ((ToyRobot) remote[i]).name;// 다운캐스팅
				System.out.println(name);

			}
			// if Tv~
			if (remote[i] instanceof Television) {
				System.out.println("텔레비전 객체입니다.");
			}
			// if Rfr~
			if (remote[i] instanceof Refrigerator) {
				System.out.println("냉장고 객체입니다.");
			}
		}
		//인터페이스의 장점
		//표준화 가능 하다.
		//서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
		//클래스 간에 결합도를 낮춰서 유연한 코드를 설계할 수 있다.
		
		//정리
		//객체 지향 패러다임의 핵심
		//객체와 객체간에 상호 협력해서 코드를 설계해 나간다(버스, 질럿)
		//객체와 객체간에 관계를 정의하여 코드를 설계해 나간다.
		//(상속, 포함관계, 추상클래스, 인터페이스) 
		//다형성(클래스를 다양한 형태로)!!
		
	}// end of main

}// end of class
