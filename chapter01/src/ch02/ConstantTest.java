package ch02;

public class ConstantTest {
	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {

		// 상수(constant)
		final int MAX_NUM = 12; // 상수를 선언과 초기화를 동시에
		final int MIN_NUM; // 상수선언

		MIN_NUM = 1;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

//		MAX_NUM = 100;
		// 상수에 한번 초기화된 공간에는 값을 변경할 수 없다.

		final int MY_COUNT = 100;
		// 1.위에서 상수는 어디를 말하는 걸까요?
		// MY_COUNT
		// 2. 예약어는 어디 어디를 말하는 건가요?
		// final, int
		// 3. 100은 무엇인가요?
		// 리터럴,값

	}// end of main

}// end of class
