package ch06;

//Ŭ������ ����ϴ� ����
public class MainTest1 {
	//main function_start of code
	public static void main(String[] args) {
		
		Student studentLee = new Student(1,"Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 90);
		studentLee.showStudentScore();
		
		//�л�2���� �������ϱ�
		Student studentKim = new Student(2,"kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����", 70);
		studentKim.showStudentScore();
		
		//�л�3���� �������ϱ�
		Student studentPark = new Student(3, "Park");
		studentPark.setKoreaSubject("����", 60);
		studentPark.setMathSubject("����", 50);
		studentPark.showStudentScore();
		
		
	}//end of main

}//end of class
