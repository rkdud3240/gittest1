package Ex01;

import java.util.Scanner;

public class MainTest1 {
	//main function
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("����1");
		Marine marine1 = new Marine("����1");
		Zergling zergling1 = new Zergling("���۸�1");
		
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
		
		zealot1.attack(zergling1);
		zealot1.attack(marine1);
		
		marine1.showInfo();
		zergling1.showInfo();
		
		//��ĳ�ʸ� ����ؼ� ���࿡ �帧�� ����� ������ 
		//1. ������ ������ ������ �����Ѵ�.
		//2. ������ ���۸��� �����Ѵ�.
		//3. ���۸��� ������ �����Ѵ�.

		final int ONE = 1;
		final int TWO = 2;
		
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		 
		Unit unit;
		
		if(button == ONE) {
			zealot1.attack(marine1);
		}else {
			zergling1.attack(zealot1);
		}
//		unit.showInfo();
		
		//�ٸ� ����� �� ��
//		Scanner sc = new Scanner(System.in);
//		boolean gameOver = false;
//		int userInput = 0;
		
//		final int ZEALOT_ACTION1 = 1;
//		final int ZEALOT_ACTION2 = 2;
//		final int ZEALOT_ACTION3 = 3;
//		final int ZEALOT_ACTION4 = 4;
//		final int GAME_END = 5;
		
//		while(!(gameOver)) {
//			System.out.println("1. ������ ������ ����");
//			System.out.println("2. ������ ���۸��� ����");
//			System.out.println("3. ���۸��� ������ ����");
//			System.out.println("4. ���� ���� ����");
//			System.out.println("5. ����");
//			System.out.print("�Է� : ");
		
//			userInput = sc.nextInt();
		
//			if(userInput == ZEALOT_ACTION1) {
//				zealot1.attack(marine1);
//			}
//			else if(userInput ==2) {
//				marine1.attack(zergling1);
//			}
//			else if(userInput ==3) {
//				zergling1.attack(zealot1);
//			}
//			else if(userInput==4){
//				zealot1.showInfo();
//				marine1.showInfo();
//				zergling1.showInfo();
//			}
//			else if(userInput ==5) {
//				System.out.println("������ �����մϴ�.");
//				gameOver = true;
//			}
//			else {
//				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���.");
//			}
//		}//end of while

	}//end of main

}//end of class
