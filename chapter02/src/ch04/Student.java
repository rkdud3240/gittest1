package ch04;

public class Student {
	
	//기본 생성자 
	//사용자 정의 생성자가 없는 경우에는
	//컴파일러가 알아서 기본 생성자를 만들어 준다.
	//기본 생성자 모양 : 
	public Student() {
		
	}// - 생성자 : 객체가 생성되어 s2의 빨간 밑줄이 없어진다.
	
	
	//생성자 - constructor
	//객체를 생성할 때 다음과 같은 모양으로 만들라고 지시하는 것(강제성 부여됨)
	//멤버변수
	int number;
	String name;
	int grade;
	
	//생성자 만들기 (개발자가 직접 정의 - 사용자 정의 생성자)
	//grade 넣고 코드를 정상 동작하게 수정해 주세요
	public Student(int num, String name, int grade) {
		number = num;			//**매개변수
		this.name = name;
		this.grade = grade;
		//멤버변수와 매개변수의 이름이 같다면 this.키워드를
		//사용해서 구분해 주어야 한다.
		//this.name, this.grade =>멤버변수 
		
		//**매개변수 (parameter)
		//매개변수는 메소드, 생성자를 선언할 때, 
		//어떤 형태로 데이터값이 들어올지 정의해준다.
		
	}//end of St() - 생성자
		
	//메서드 정의
	public void showInfo() {
		System.out.println(name + "의 학번은 " 
	+ number + "이고 \n" + grade + "학년입니다." );
	}//end of show()
}//end of class
