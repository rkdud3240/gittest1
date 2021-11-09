package ch03;
//7
import java.util.Scanner;

public class MainTest6 {
	//메인함수 코드시작
	public static void main(String[] args) {
		
		//삼항 연산자
		//조건식 ? 결과1 : 결과2;
		
		int num1 = (5 > 3)? 10 : 20;
		System.out.println(num1);
		
		int num2 = (5 < 3)? 10 : 20;
		System.out.println(num2);
		
		//JDK가 만들어진 도구를 이용해 봅시다.
		int max;
		System.out.println("입력 받은 두 수 중 큰 수를 출력하세요.");
		Scanner scanner = new Scanner(System.in);
		//ctrl + shift + o 
		//ctrl + 마우스로 Scanner 클릭,   ctrl + w 종료
		System.out.println("입력1 : ");
		int x = scanner.nextInt();
		System.out.println("입력2 :");
		int y = scanner.nextInt();
		
		//삼항연산자 식
		max = (x > y)? x:y;
		System.out.println("큰 숫자는 : "+ max + " 입니다.");
		
	}//end of main

}//end of class
