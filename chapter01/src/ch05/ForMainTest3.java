package ch05;

public class ForMainTest3 {
	//main function_start of code
	public static void main(String[] args) {
		
		//1부터 9까지 반복
//		for(int i = 1; i <= 9; i++) {
//			
//			for(int j = 1; j <= 9; j++) {
//
//				System.out.println(num + " * "+ i +" = "+(num * i));
//			}
//		}
		//이중 for문으로 구구단 2~9 까지 출력해 주세요.
		int num = 0;
		for(num = 2; num <=9; num++ ) {
			//2 ~ 9까지 반복한다.
			
			for(int i = 1; i <= 9; i++) {

				System.out.println(num + " * "+ i +" = "+(num * i));
				
			}
			System.out.println();
		}

		
	}//end of main

}//end of class
