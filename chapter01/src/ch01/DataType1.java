package ch01;
//주파일을 모아놓은 폴더를 package라고 한다.

public class DataType1 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		// 데이터 타입의 종류
		// 1.기본자료형(primitive data type)
		// 2.참조타입(Reference Type)

		// 기본 자료형
		// 정수형 문자형 실수형 논리형(4가지 존재)

		// 정수형 (1, 10, 100)

		byte b; // 1byte (8bit)
		short s; // 2byte (16bit)
		int i; // 4byte (32bit)
		long l; // 8byte (64bit)
		b = 127;
		// b= 128;
		b = -128;

		// int의 수의 표현범위
		i = 2100000000;
		i = -2100000000;

		l = 2200000000L;// 접미사 (대문자 L 또는 소문자 l을 사용할 수 있다. 가능한 대문자)

		i = 10;
		System.out.println(i);

		i = 300;
		System.out.println(i);
		//ctrl + shift + F : 코드 정리 수시로
	}// end of main

}// end of class
