package ch03;
//2
public class MainTest2 {
	// 메인함수_코드 시작점
	public static void main(String[] args) {

		// 산술 연산자 연습(+ - * / %)

		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		int number4 = 5 / 3;
		int number5 = 5 % 3;

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println("=============");
		// 문제
		// 1. (12+3)/3 값을 화면에 출력해보세요.
		// 단, 변수를 만들어서 담고 출력해주세요
		int number6 = (12 + 3) / 3;
		System.out.println(number6);

		// 2. (25%2)값을 화면에 출력해 보세요.
		// 단, 변수 사용 없이 바로 화면에 출력해주세요.
		System.out.println(25 % 2);
		
	}// end of main

}// end of class
