package ch03;
//2
public class MainTest2 {
	// �����Լ�_�ڵ� ������
	public static void main(String[] args) {

		// ��� ������ ����(+ - * / %)

		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		int number4 = 5 / 3;
		int number5 = 5 % 3;

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println("=============");
		// ����
		// 1. (12+3)/3 ���� ȭ�鿡 ����غ�����.
		// ��, ������ ���� ��� ������ּ���
		int number6 = (12 + 3) / 3;
		System.out.println(number6);

		// 2. (25%2)���� ȭ�鿡 ����� ������.
		// ��, ���� ��� ���� �ٷ� ȭ�鿡 ������ּ���.
		System.out.println(25 % 2);
		
	}// end of main

}// end of class
