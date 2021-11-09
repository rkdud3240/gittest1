package ch11;

import java.util.Calendar;

public class MainTest1 {
	// main function
	public static void main(String[] args) {
		// company 객체 생성 5개
							//생성자가  private라서
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		Company company4 = Company.getInstance();
		Company company5 = Company.getInstance();
		//화면에 주소값을 출력해보세요
		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3);
		System.out.println(company4);
		System.out.println(company5);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}

}
