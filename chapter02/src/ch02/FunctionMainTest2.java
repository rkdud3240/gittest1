package ch02;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		//�Լ� ����ϴ� ���(��� ���߱�)
		//1. 
			sayHello("�ݰ����ϴ�.");
		//2. 
			int sum = calcSum();
			System.out.println("sum : "+ sum);
		//3.
			double total = addNum(42.234, 13.4);
			System.out.println("total : "+ total);
			
		
//---------------���� �Լ��� ����� ���ô�.-------------------
			//Q1.
			
			int result1 = intAdd(2, 4, 5);
			System.out.println(result1);
				
			//Q2.
			
			double result2 = doubleAdd(34.4, 12.2);
			System.out.println(result2);
			
			//Q3.
				printArticle("���� ������ ȭ����");
				
	
	}// end of main
	
	//1. ��ȯ ���� ���� �Լ� �����ϱ�
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	//2. �Ű������� ���� �Լ� ����� -> ��ȯ���� ����
	public static int calcSum() {
		int sum = 0;
		int i;
		for(i = 0; i <=100; i++) {
			//sum = sum + i;
			sum += i;
		}
		return sum;
	}
	
	//3. ��ȯ ���� �ְ� �Ű������� �޴� �Լ� �����
	public static double addNum(double n1, double n2) {
		
		double result = 0.0;
		result = n1 + n2;
		return result;
	}
	
	//---------------�Լ��� ����� ���ô�.-------------------
	
	//Q1. ���ϰ� int, �Ű����� n1,n2,n3�̸� ->intAdd
	public static int intAdd(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;//
		return n1 + n2 + n3;
	}
	//Q2. ���ϰ� double �Ű����� d1, d2 �̸� -> doubleAdd
	public static double doubleAdd(double d1, double d2) {
		return d1 + d2;
	}
	//Q3. ���ϰ� ���� �Ű����� string article �̸� -> printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}
		
}//end of class
