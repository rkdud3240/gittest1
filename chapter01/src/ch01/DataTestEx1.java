package ch01;

public class DataTestEx1 {

	//메인함수 (코드의 시작점)
	public static void main(String[] args) {
		//1. 정수 550을 name1 이름으로 변수에 담아 보세요
		int name1 = 550;
		//2. 정수 22억을 name2 이름으로 변수에 담아 보세요
		long name2 = 2200000000L;
		//3. 문자 A를 name3 이름으로 변수에 담아 보세요
		char name3 = 'A';
		//4. 실수 float 타입으로 0.123456을 name4 변수에 담아 보세요
		float name4 = 0.123456F;
		//5. 실수 double 타입으로 200.1234를 name5 변수에 담아 보세요
		double name5 = 200.1234;
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		
		//6. 논리 자료형 isOk 이름을 변수로 선언해 보세요
		boolean isOk;
		//7. isOk 변수값을 true로 초기화 해보세요
		isOk = true;
		System.out.println(isOk);
		//8. isOk 변수에 값을 false로 변경해보세요
		isOk = false;
		System.out.println(isOk);
		//9. 변수란 무엇인지 서술해보세요
		System.out.println("변수는 변하는 수, 값을 저장할 수 있는 메모리 공간");
		//10. 기본 데이터 타입 종류 8가지를 서술해 보세요
		//정수형 : byte, short, int, long
		//실수형 : float, double
		//문자형 : char
		//논리형 : boolean
		
	}//end of main

}//end of class
