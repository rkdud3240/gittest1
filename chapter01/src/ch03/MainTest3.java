package ch03;
//4
public class MainTest3 {
	//�����Լ�_�ڵ� ����
	public static void main(String[] args) {
		
		//����, ���� ������
		//++, --
		
		int num1 = 1;
		num1 ++;
		System.out.println(num1);
		
		int num2 = 1;
		num2--;
		System.out.println(num2);
		
		//1. ���� �����ڰ� �ڿ� �� ���
		int num3 = 10;
		int num4;
		
//		num4 = num3++;
		num4 = ++num3;
		
		System.out.println(num4);
		System.out.println(num3);
		
		int num5 = 100;
		int num6;
		
		//1.num5�� num6 ������ ��� �ּ���
		// �� ���� �����ڸ� ����ؼ� num6������ 101�� ���� ���
		
		num6 = ++num5;
		System.out.println(num6);
		
		//2.num5�� num6 ������ ��� �ּ���
		// �� ���� �����ڸ� ����ؼ� num6������ 101�� ���� ���
		
		num6 = num5++;
		System.out.println(num6);
		
		System.out.println(num5);
		
		//��� : ���� �����ڴ� ����(����)�� �ִ� ���� 1 ���� ��Ų��. 
		//�� �տ� ���� ���� �ڿ� ���� �� ���꿡 ������ �ٸ���.
		
	
		
	}//end of main

}//end of class
