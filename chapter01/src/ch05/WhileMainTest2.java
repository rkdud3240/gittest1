package ch05;

import java.util.Scanner;

public class WhileMainTest2 {

	public static void main(String[] args) {
		
		//상수에 담는 값을 스캐너를 이용해서 코드를 수정해 주세요
		System.out.println("덧셈 값을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		
		final int LIMIT_VALUE = scanner.nextInt();
	
		//final int LIMIT_VALUE = 1000;
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VALUE) {
			
			sum = sum + num;
			num++;
		}
		System.out.println("결과값 : " + sum);
		
	}//end of main

}//end of class
