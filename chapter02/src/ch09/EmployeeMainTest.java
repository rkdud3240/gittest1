package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {
		//2.
		int temp = Employee.getSerialNum();//static �޼���
		System.out.println(temp);//1000
//		Employee test1 = new Employee();
//		test1.getEmployeeId; // <---�Ϲ� �޼���
		//1.
		//serialNum -> static ����
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
		//��������� ����ƽ ������ �ٸ���
		System.out.println("-----------------------");
		//static����, �������, �������� -> �޸� ��ġ Ȯ��
		
		//Q1
		//employee1~5 : �ν��Ͻ� ������ �����ؼ� getSerialNum()
		//���� 
		
		System.out.println(employee1.getSerialNum());
		System.out.println(employee2.getSerialNum());
		System.out.println(employee3.getSerialNum());
		System.out.println(employee4.getSerialNum());
		System.out.println(employee5.getSerialNum());
		
		//Q2 
		//Ŭ���� �̸����� �����ؼ� getSerialNum() �޼��� ���
		System.out.println("-------------------------");
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
		System.out.println(Employee.getSerialNum());
	}//end of main

}//end of class
