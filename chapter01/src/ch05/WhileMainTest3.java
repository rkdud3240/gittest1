package ch05;

public class WhileMainTest3 {
	//main f start of cd
	public static void main(String[] args) {
		
		//do ~ while��
		int input = 10;
		int sum = 0;
		
		do {
			System.out.println("���簪 : " + input);
			sum += input;
			//���� ����� ���ô�.
			input--;
		}while(input != 0);
		
		System.out.println("���������� �����" + sum + "�Դϴ�.");
		

	}//end of m

}//end of c
