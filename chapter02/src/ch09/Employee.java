package ch09;

public class Employee {

		public static int serialNum = 1000;
		
		private int employeeId;
		private String employeeName;
		private String department;
		
		public Employee() {
			
			serialNum++;
			employeeId = serialNum;
		}
		
		public int getEmployeeId() {
			return employeeId;
		}
		//static�޼��� Ȱ��
		public static int getSerialNum() {
			//���� : static �޼��� �ȿ����� ��� ������ ����� �� ����
			//why : ��ü�� ��������� �� (new)�� �����ؼ� ����� �� �ִ�
			//static�̱� ����
			//��ü�� �����Ǳ� ���� ���� �� �� �ִ� �޼���
//			department = "������";
			return serialNum;
		}
		
}//end of class
