package ch11;

import java.util.Calendar;

public class MainTest1 {
	// main function
	public static void main(String[] args) {
		// company ��ü ���� 5��
							//�����ڰ�  private��
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		Company company4 = Company.getInstance();
		Company company5 = Company.getInstance();
		//ȭ�鿡 �ּҰ��� ����غ�����
		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3);
		System.out.println(company4);
		System.out.println(company5);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}

}
