package ch04;

import java.util.Scanner;

public class IfMainTest2 {
	//main function _ start of code
	public static void main(String[] args) {

		System.out.println("성적을 입력해 주세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		char result = 'Z';
		
		//문제1. if 문을 사용해서 학점을 출력해 주세요.
		//100 ~ 90 : A
		//90~80 : B
		//80~70 : C
		//70~60 : D
		//60~ : F
		
		if(point <= 100 && point >= 90) {
			result = 'A';
		}else if(point < 90 && point>= 80) {
			result = 'B';
		}else if(point < 80 && point >= 70) {
			result = 'C';
		}else if(point < 70 && point >= 60) {
			result = 'D';
		}else if (point < 60 && point >= 0) {
			result = 'F';
		}
		
		//방어적 코드
		if(result != 'Z') {
			System.out.println("당신의 학점은 "+ result +"입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
	}//end of main

}//end of class
