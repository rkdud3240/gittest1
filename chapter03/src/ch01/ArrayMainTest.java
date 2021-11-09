package ch01;

public class ArrayMainTest {
	// START
	public static void main(String[] args) {

		// 배열
		// 배열이란 연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입이다.
		// 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러 개의 데이터를 하나의 변수에
		// 저장하기 위한 것이라고 할 수 있다.

		// 자바의 문법
		int number = 10;

		// 배열 선언 방법 2가지
		int[] arr1 = new int[3];// 1.을 권장
		int arr2[] = new int[10];// 2.
		
		
		//초기화 하는 방법 (값을 넣는 방법)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		// 모든 프로그램에서 index는 0부터 시작 : 크기(n)와 index의 마지막 번호(n-1)는 다르다.
		
		//배열 선언과 동시에 초기화
		int[] numbers1 = new int[] {11, 20, 30};//1.
		int[] numbers2 = {10, 50, 100};//2.
		
		//출력방법
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		System.out.println(numbers1);
		
		//c r u d
		//복사, , ,삭제
		
		// 
		String[] strArr = new String[10];
		strArr[0] = "야스오";
		strArr[1] = "티모";
		strArr[2] = "애쉬";
		strArr[3] = "다리우스";
		
		//1. 화면에 0,1,2,3,4 출력해주세요 단  for문 사용 금지
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		//배열은 클래스다 클래스는 쩜 연산자 사용 가능, 주소값이 담겼을 때는 쩜 연산자 사용가능
		System.out.println(strArr.length);
		
		System.out.println("==================");
		
		//코드 수정 null 값을 출력하지 마세요
		for(int i = 0; i < strArr.length; i++) {
			
			if(strArr[i] != null) {
				System.out.println(strArr[i]);	
			}//end of if
		}//end of for
			//me
//			if(i == 4) {
//				i -= 1;
//			}else {
//				System.out.println(strArr[i]);
//			}
//		}
		
		//모든 프로그래밍 언어에서는 index는 0부터 시작합니다.
		//배열을 사용할 때 보통 for문과 관계해서 많이 사용 합니다.
		
//		new int[22]; //길이 22, 21
//		new int[74]; //길이 74, 73
//		new int[283]; //길이 283, 282
		
		
	}// end of main
}// end of class
