package ch01;
//�������� ��Ƴ��� ������ package��� �Ѵ�.

public class DataType1 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		// ������ Ÿ���� ����
		// 1.�⺻�ڷ���(primitive data type)
		// 2.����Ÿ��(Reference Type)

		// �⺻ �ڷ���
		// ������ ������ �Ǽ��� ����(4���� ����)

		// ������ (1, 10, 100)

		byte b; // 1byte (8bit)
		short s; // 2byte (16bit)
		int i; // 4byte (32bit)
		long l; // 8byte (64bit)
		b = 127;
		// b= 128;
		b = -128;

		// int�� ���� ǥ������
		i = 2100000000;
		i = -2100000000;

		l = 2200000000L;// ���̻� (�빮�� L �Ǵ� �ҹ��� l�� ����� �� �ִ�. ������ �빮��)

		i = 10;
		System.out.println(i);

		i = 300;
		System.out.println(i);
		//ctrl + shift + F : �ڵ� ���� ���÷�
	}// end of main

}// end of class
