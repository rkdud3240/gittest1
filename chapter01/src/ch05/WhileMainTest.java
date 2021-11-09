package ch05;

public class WhileMainTest {
	//main function_start of code
	public static void main(String[] args) {
		
		// 1~10까지 덧셈 연산

		int num = 1;
		int sum = 0;
		while(num <= 10) {
			System.out.println("현재값 : " + num);
			sum += num;
			num++; 
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Thread.sleep(1000); //->surround with 선택
		}//end of while
		
		System.out.println("연산의 결과값은 : " + sum + "입니다.");
		
		
	}//end of main

}//end of class
