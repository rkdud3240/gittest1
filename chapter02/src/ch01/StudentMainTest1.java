package ch01;

//설계된 학생 클래스를 사용해 보는 입장
public class StudentMainTest1 {
	
	//main function_start of code
	public static void main(String[] args) {
		
		Student s1;//지역변수 구분 
		Student s2;
		
		s1 = new Student();
		s2 = new Student();
		//참조변수 //참조값
		System.out.println(s1);
		System.out.println(s2);

	}//end of main

}//end of class
