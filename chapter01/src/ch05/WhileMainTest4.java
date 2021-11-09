package ch05;

import java.util.Scanner;

public class WhileMainTest4 {
	//main f start of cd
	public static void main(String[] args) {
		
		//2.
		//사용자가 0을 입력하면 프로그램을 종료시켜라
		//사용자가 입력한 값을 계속 덧셈하는 프로그램으로 변경시켜라
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int sum = 0;
//		do {
//			System.out.println("값을 입력해 주세요");
//			num = scanner.nextInt();
//			sum += num;
//			
//		}while(num != 0 );
//		
//			System.out.println("연산의 결과는 " + sum + "입니다.");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("값을 입력해 주세요");
			num = scanner.nextInt();
			sum += num;
		}
			
			System.out.println("연산의 결과는 " + sum + "입니다.");
		//do ~ While 
		//1.
		//스캐너를 사용해서 사용자에 입력값을 받아서 덧셈 연산을 해주세요
		//연산의 결과를 화면에 출력하는 프로그램을 만들어 주세요
//		System.out.println("덧셈 값을 입력해 주세요");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		
//	
//		int sum = 0;
//		do {
//			sum += num;
//			num--;
//		}while(num != 0 );
//		
//			System.out.println("연산의 결과는" + sum + "입니다.");
			
			
	
	}//end of m
}//end of c
