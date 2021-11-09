package ch03;
//6
public class MainTest5 {

	// 메인함수 코드의 시작
	public static void main(String[] args) {

		// 논리 연산자 (&&엠퍼센트, ||버티컬바, !)
		// 관계연산자와 혼합하여 많이 사용됨
		// 연산에 결과가 true, false

		int num1 = 10;
		int num2 = 20;

		// 1.논리곱 (&&)
		
		boolean flag1 = (num1 > 0) && (num2 > 0); // true
		boolean flag2 = (num1 > 0) && (num2 < 0); // false
		//둘 다 true(참)일때, true를 반환
		
		// 2. 논리합(||)
		
		boolean flag3 = (num1 < 0) || (num2 > 0); // true
		boolean flag4 = (num1 > 0) || (num2 > 0); // true
		//둘 중 하나라도 true이면, 연산의 결과는 true를 반환한다.
		System.out.println(flag4);
		
		System.out.println("----------------");
		
		//num1 = 10
		boolean flag5 = (num1 < 0) && (num2 > 0);
		boolean flag6 = (num1 > 0) || (num2 > 0);
	                    //앞의 식만 보고 true, false 바로 구별
		
	}// end of main

}// end of class
