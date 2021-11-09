package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {
		//2.
		int temp = Employee.getSerialNum();//static 메서드
		System.out.println(temp);//1000
//		Employee test1 = new Employee();
//		test1.getEmployeeId; // <---일반 메서드
		//1.
		//serialNum -> static 변수
		Employee employee1 = new Employee();
		System.out.println(employee1.serialNum);//1001
		
		System.out.println(employee1.getEmployeeId());//1001
		
		Employee employee2 = new Employee();//1002
		Employee employee3 = new Employee();//1003
		Employee employee4 = new Employee();//1004
		Employee employee5 = new Employee();//1005
		System.out.println("-----------------------");
		System.out.println(employee5.getEmployeeId());
		
		System.out.println(employee5.serialNum);
		System.out.println(employee1.serialNum);
		System.out.println(employee2.serialNum);
		System.out.println(employee3.serialNum);
		//멤버변수와 스테틱 변수는 다르다
		System.out.println("-----------------------");
		//static변수, 멤버변수, 지역변수 -> 메모리 위치 확인
		
		//Q1
		//employee1~5 : 인스턴스 변수로 접근해서 getSerialNum()
		//실행 
		
		System.out.println(employee1.getSerialNum());
		System.out.println(employee2.getSerialNum());
		System.out.println(employee3.getSerialNum());
		System.out.println(employee4.getSerialNum());
		System.out.println(employee5.getSerialNum());
		
		//Q2 
		//클래스 이름으로 접근해서 getSerialNum() 메서드 사용
		System.out.println("-------------------------");
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
	}//end of main

}//end of class
