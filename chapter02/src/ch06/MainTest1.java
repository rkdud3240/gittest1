package ch06;

//클래스를 사용하는 입장
public class MainTest1 {
	//main function_start of code
	public static void main(String[] args) {
		
		Student studentLee = new Student(1,"Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		studentLee.showStudentScore();
		
		//학생2동작 총점구하기
		Student studentKim = new Student(2,"kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 70);
		studentKim.showStudentScore();
		
		//학생3동작 총점구하기
		Student studentPark = new Student(3, "Park");
		studentPark.setKoreaSubject("국어", 60);
		studentPark.setMathSubject("수학", 50);
		studentPark.showStudentScore();
		
		
	}//end of main

}//end of class
