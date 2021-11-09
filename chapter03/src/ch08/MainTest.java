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

		// ������ - �� (��ü, ����, ����)

		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = toyrobot;

		// Ȯ�� for�� turnOn ȣ��
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("-------------------");
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("-------------------");
		// instanceOf ������ ����غ���
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println("�峭�� ��ü�Դϴ�.");

				// ��������
				// remote[i] ���� �����ؼ�
				// ȭ�鿡 name ��� ������ ������ּ���.
//				double a = 1.0;
//				int b = (int)a;
				String name = ((ToyRobot) remote[i]).name;// �ٿ�ĳ����
				System.out.println(name);

			}
			// if Tv~
			if (remote[i] instanceof Television) {
				System.out.println("�ڷ����� ��ü�Դϴ�.");
			}
			// if Rfr~
			if (remote[i] instanceof Refrigerator) {
				System.out.println("����� ��ü�Դϴ�.");
			}
		}
		//�������̽��� ����
		//ǥ��ȭ ���� �ϴ�.
		//���� ������� Ŭ�����鿡�� ���踦 �ξ� �� �� �ִ�.
		//Ŭ���� ���� ���յ��� ���缭 ������ �ڵ带 ������ �� �ִ�.
		
		//����
		//��ü ���� �з������� �ٽ�
		//��ü�� ��ü���� ��ȣ �����ؼ� �ڵ带 ������ ������(����, ����)
		//��ü�� ��ü���� ���踦 �����Ͽ� �ڵ带 ������ ������.
		//(���, ���԰���, �߻�Ŭ����, �������̽�) 
		//������(Ŭ������ �پ��� ���·�)!!
		
	}// end of main

}// end of class
