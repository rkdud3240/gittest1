package ch05;

public class WhileMainTest {
	//main function_start of code
	public static void main(String[] args) {
		
		// 1~10���� ���� ����

		int num = 1;
		int sum = 0;
		while(num <= 10) {
			System.out.println("���簪 : " + num);
			sum += num;
			num++; 
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Thread.sleep(1000); //->surround with ����
		}//end of while
		
		System.out.println("������ ������� : " + sum + "�Դϴ�.");
		
		
	}//end of main

}//end of class
