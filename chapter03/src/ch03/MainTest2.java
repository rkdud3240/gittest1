package ch03;

class Cal {
	
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public int multiply(int n1, int n2) {
		
//		/*
//		 * 
//		 * 1000�� ~~ �ڵ��̴�
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
	
	//�޼��� �����ε� :
	//�̸��� ������ �Ű������� �ٸ�
	//�������̵� :
	//�θ� �ִ� �޼��带 �ʿ信 ���ؼ� ������ �ؼ� ����ϴ� ����
//	public int multiply(int n1, int n2) {
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0�� �Է� ���� ������");
//		}
//		return n1 * n2;
//	}//�Ȱ��� �޼��� ��� ����

	@Override
	public int multiply(int n1, int n2) {
		if(n1 == 0 || n2 ==0) {
			System.out.println("multiply �޼��带 �����մϴ�.");
			return super.multiply(n1, n2);
		}
		//return super.multiply(n1, n2);
		//this.name = name;�� ���
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

