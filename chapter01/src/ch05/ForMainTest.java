package ch05;

public class ForMainTest {
	
	//main function_start of code
	public static void main(String[] args) {
		
		/** ������** : ������ �ּ�
		 * for(�ʱ�ȭ��; ���ǽ�; ������){
		 * 		���๮;
		 * }
		 */
		//for���� �̿��ؼ� 1���� 10���� ���� ����
		//���꿡 ���� ����� ���ؼ� ������ �ʿ��ϴ�.
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			//sum = sum + i; 
			sum += i;
			//System.out.println("i�� ���簪 : "+ i);
		}//end of for
	
		System.out.println("sum : " + sum);
	}//end of main

}//end of class
