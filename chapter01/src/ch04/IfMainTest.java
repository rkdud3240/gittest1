package ch04;

public class IfMainTest {
	//main function_start of code
	public static void main(String[] args) {
		
		// ��� if 
		// �־��� ���ǿ� ���� ������ �̷�������� �����Ѵ�.
		//���� ...�̶��
		
		boolean flag = false;
		//if �� �ܵ� ��� ���
		if(flag) {
			System.out.println("���ǽ� ����� true�̸� ���� �ȴ�.");
		}//end of if
		
		//if else ��
		if(flag) {
			System.out.println("true�̸� ����");
		}else {
			System.out.println("flase�̸� ����");
		}
		
		//if else if else ��
		int point = 40;
		
		if(point >= 90) {
			System.out.println("A�����Դϴ�.");
		}else if(point >= 80) {
		    System.out.println("B�����Դϴ�.");
		}else if(point >=70) {
			System.out.println("C�����Դϴ�.");//���ǽ� : true
		}else if(point >=60) {
			System.out.println("D�����Դϴ�.");
		}else{
			System.out.println("F�����Դϴ�.");
		}
		
		
		
	}// end of main

}//end of class
