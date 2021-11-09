package ch01;

public class StudentMainTest2 {

	//main function_start of code
	public static void main(String[] args) {
		
		Student student1 = new Student();
		//1.접근해서 name, height,weight, grade 값을 줘서 
		//화면에 출력해주라
		student1.name = "김가영";
		student1.weight = 10;
		student1.height = 20;
		student1.grade = 30;
		
		System.out.println(student1.name);
		System.out.println(student1.weight);
		System.out.println(student1.height);
		System.out.println(student1.grade);
		
		System.out.println("----------------");
		
		Student student2 = new Student();
		//1.접근해서 name, height, weight, grade 갑승ㄹ 줘서
		//화면에 출력해주라
		student2.name = "김가일";
		student2.weight = 11;
		student2.height = 22;
		student2.grade = 33;
		
		System.out.println(student2.name);
		System.out.println(student2.weight);
		System.out.println(student2.height);
		System.out.println(student2.grade);
		
	}//end of main

}//end of class
