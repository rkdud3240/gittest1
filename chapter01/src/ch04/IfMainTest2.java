package ch04;

import java.util.Scanner;

public class IfMainTest2 {
	//main function _ start of code
	public static void main(String[] args) {

		System.out.println("������ �Է��� �ּ��� : ");
		
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		char result = 'Z';
		
		//����1. if ���� ����ؼ� ������ ����� �ּ���.
		//100 ~ 90 : A
		//90~80 : B
		//80~70 : C
		//70~60 : D
		//60~ : F
		
		if(point <= 100 && point >= 90) {
			result = 'A';
		}else if(point < 90 && point>= 80) {
			result = 'B';
		}else if(point < 80 && point >= 70) {
			result = 'C';
		}else if(point < 70 && point >= 60) {
			result = 'D';
		}else if (point < 60 && point >= 0) {
			result = 'F';
		}
		
		//����� �ڵ�
		if(result != 'Z') {
			System.out.println("����� ������ "+ result +"�Դϴ�.");
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		
	}//end of main

}//end of class
