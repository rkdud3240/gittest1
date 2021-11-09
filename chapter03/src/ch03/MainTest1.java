package ch03;

class A{
	int number1;
	int number2;
	int number3;
}

class B{
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
}
//상속
class C extends A{
	
	int number4;
	int number5;
}

public class MainTest1 {

	public static void main(String[] args) {
 //참조타입,참조변수 - > 주소값이 들어간다 -> 점연산자 사용가능
		C c = new C();
		c.number1 = 1;
		c.number2 = 2;
		c.number3 = 3;
		c.number4 = 4;
		c.number5 = 5;
		
		System.out.println(c.number1);
		System.out.println(c.number5);
		
	}//end

}//end
