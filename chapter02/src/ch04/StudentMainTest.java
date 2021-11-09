package ch04;

public class StudentMainTest {
	
	//main function _ start of code
	public static void main(String[] args) {
						//생성자
		Student s1 = new Student(1, "홍길동", 3);//모양 맞추기 Student(int Num)
					//new라는 키워드
		System.out.println(s1.number);
		System.out.println(s1.name);
		System.out.println(s1.grade);
		
		s1.showInfo();
		System.out.println("-----------------");
		
		//기본 생성자로 객체 생성해보기
		//Student s2  = new Student();
		//s2.grade = 2;
		//s2.name = "이순신";
		//s2.number = 2;
		Student s2  = new Student(2, "이순신", 2);
		
		System.out.println(s2.number);
		System.out.println(s2.name);
		System.out.println(s2.grade);
		
		s2.showInfo();
	}//end of main

}//end of class