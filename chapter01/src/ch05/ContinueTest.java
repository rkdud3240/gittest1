package ch05;

import java.util.Scanner;

public class ContinueTest {
	//main function start code
	public static void main(String[] args) {
		
		//예약어 continue
		//무시하고 진행하는 continue
		//scanner 이용해서 MAX값,
		// MULTIPLE값 받아서 프로그램을 완성해주세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("MAX 값 입력 : ");
		final int MAX = sc.nextInt();
		System.out.println("배수 값 입력 : ");
		final int MULTIPLE = sc.nextInt();
		final int MIN = 1;
		
		//final int MAX = 10000;
		//final int MULTIPLE = 15;
		
		int num;
		int count = 0;
		
		for(num = MIN; num < MAX; num++) {
			
			//00의 배수이면 출력하지 마시오
			if(num % MULTIPLE == 0) {
				count++;
				continue;
			}//end of if
			
		}//end of for
		//System.out.println("출력값 : " + num);
		System.out.println(MULTIPLE + "의 배수의 개수 " + count);
	}//end of m

}//end of c
