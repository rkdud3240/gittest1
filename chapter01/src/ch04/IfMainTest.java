package ch04;

public class IfMainTest {
	//main function_start of code
	public static void main(String[] args) {
		
		// 제어문 if 
		// 주어진 조건에 따라서 실행이 이루어지도록 구현한다.
		//만약 ...이라면
		
		boolean flag = false;
		//if 문 단독 사용 방법
		if(flag) {
			System.out.println("조건식 결과가 true이면 실행 된다.");
		}//end of if
		
		//if else 문
		if(flag) {
			System.out.println("true이면 실행");
		}else {
			System.out.println("flase이면 실행");
		}
		
		//if else if else 문
		int point = 40;
		
		if(point >= 90) {
			System.out.println("A학점입니다.");
		}else if(point >= 80) {
		    System.out.println("B학점입니다.");
		}else if(point >=70) {
			System.out.println("C학점입니다.");//조건식 : true
		}else if(point >=60) {
			System.out.println("D학점입니다.");
		}else{
			System.out.println("F학점입니다.");
		}
		
		
		
	}// end of main

}//end of class
