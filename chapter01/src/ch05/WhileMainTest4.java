package ch05;

import java.util.Scanner;

public class WhileMainTest4 {
	//main f start of cd
	public static void main(String[] args) {
		
		//2.
		//����ڰ� 0�� �Է��ϸ� ���α׷��� ������Ѷ�
		//����ڰ� �Է��� ���� ��� �����ϴ� ���α׷����� ������Ѷ�
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int sum = 0;
//		do {
//			System.out.println("���� �Է��� �ּ���");
//			num = scanner.nextInt();
//			sum += num;
//			
//		}while(num != 0 );
//		
//			System.out.println("������ ����� " + sum + "�Դϴ�.");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("���� �Է��� �ּ���");
			num = scanner.nextInt();
			sum += num;
		}
			
			System.out.println("������ ����� " + sum + "�Դϴ�.");
		//do ~ While 
		//1.
		//��ĳ�ʸ� ����ؼ� ����ڿ� �Է°��� �޾Ƽ� ���� ������ ���ּ���
		//������ ����� ȭ�鿡 ����ϴ� ���α׷��� ����� �ּ���
//		System.out.println("���� ���� �Է��� �ּ���");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		
//	
//		int sum = 0;
//		do {
//			sum += num;
//			num--;
//		}while(num != 0 );
//		
//			System.out.println("������ �����" + sum + "�Դϴ�.");
			
			
	
	}//end of m
}//end of c
