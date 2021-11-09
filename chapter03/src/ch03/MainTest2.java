package ch03;

class Cal {
	
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public int multiply(int n1, int n2) {
		
//		/*
//		 * 
//		 * 1000줄 ~~ 코드이다
//		 * 
//		 * 
//		 */
		return n1 * n2;
		//return super.multiply(n1, n2);
	}
}

class Cal2 extends Cal {
	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	//메서드 오버로딩 :
	//이름은 같은데 매개변수는 다른
	//오버라이드 :
	//부모에 있는 메서드를 필요에 의해서 재정의 해서 사용하는 개념
//	public int multiply(int n1, int n2) {
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0을 입력 하지 마세요");
//		}
//		return n1 * n2;
//	}//똑같은 메서드 사용 가능

	@Override
	public int multiply(int n1, int n2) {
		if(n1 == 0 || n2 ==0) {
			System.out.println("multiply 메서드를 실행합니다.");
			return super.multiply(n1, n2);
		}
		//return super.multiply(n1, n2);
		//this.name = name;와 비슷
		return n1 * n2;
			  
	}
	
}//end of cal2 e cal


public class MainTest2 {

	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 7));
		System.out.println(cal2.multiply(10, 0));
	}
}//end of MainTest2

