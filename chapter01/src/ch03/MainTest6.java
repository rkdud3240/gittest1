package ch03;
//7
import java.util.Scanner;

public class MainTest6 {
	//�����Լ� �ڵ����
	public static void main(String[] args) {
		
		//���� ������
		//���ǽ� ? ���1 : ���2;
		
		int num1 = (5 > 3)? 10 : 20;
		System.out.println(num1);
		
		int num2 = (5 < 3)? 10 : 20;
		System.out.println(num2);
		
		//JDK�� ������� ������ �̿��� ���ô�.
		int max;
		System.out.println("�Է� ���� �� �� �� ū ���� ����ϼ���.");
		Scanner scanner = new Scanner(System.in);
		//ctrl + shift + o 
		//ctrl + ���콺�� Scanner Ŭ��,   ctrl + w ����
		System.out.println("�Է�1 : ");
		int x = scanner.nextInt();
		System.out.println("�Է�2 :");
		int y = scanner.nextInt();
		
		//���׿����� ��
		max = (x > y)? x:y;
		System.out.println("ū ���ڴ� : "+ max + " �Դϴ�.");
		
	}//end of main

}//end of class
