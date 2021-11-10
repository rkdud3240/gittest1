package ch02;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		//함수 사용하는 방법(모양 맞추기)
		//1. 
			sayHello("반갑습니다.");
		//2. 
			int sum = calcSum();
			System.out.println("sum : "+ sum);
		//3.
			double total = addNum(42.234, 13.4);
			System.out.println("total : "+ total);
			
		
//---------------만든 함수를 사용해 봅시다.-------------------
			//Q1.
			
			int result1 = intAdd(2, 4, 5);
			System.out.println(result1);
				
			//Q2.
			
			double result2 = doubleAdd(34.4, 12.2);
			System.out.println(result2);
			
			//Q3.
				printArticle("오늘 수업도 화이팅");
				
	
	}// end of main
	
	//1. 반환 값이 없는 함수 설계하기
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	//2. 매개변수가 없는 함수 만들기 -> 반환값은 있음
	public static int calcSum() {
		int sum = 0;
		int i;
		for(i = 0; i <=100; i++) {
			//sum = sum + i;
			sum += i;
		}
		return sum;
	}
	
	//3. 반환 값이 있고 매개변수를 받는 함수 만들기
	public static double addNum(double n1, double n2) {
		
		double result = 0.0;
		result = n1 + n2;
		return result;
	}
	
	//---------------함수를 만들어 봅시다.-------------------
	
	//Q1. 리턴값 int, 매개변수 n1,n2,n3이름 ->intAdd
	public static int intAdd(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;//
		return n1 + n2 + n3;
	}
	//Q2. 리턴값 double 매개변수 d1, d2 이름 -> doubleAdd
	public static double doubleAdd(double d1, double d2) {
		return d1 + d2;
	}
	//Q3. 리턴값 없음 매개변수 string article 이름 -> printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}
		
}//end of class
