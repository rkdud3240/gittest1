package ch03;

//Ŭ������ �����ϴ� ����
public class Student {
//��������������
	//�������
	public int studentID;
	public String studentName;
	public String address;
	
	//�޼���(��������� �̿��ؼ� ��ü�� ����� ����� ����.)
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);
	}
	public String getStudentName() {
		return studentName;
	}
	
	//�޼���� 
	//��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
	//����Լ������ ��
	//�޼��带 ���������ν� ��ü�� ����� �����˴ϴ�.
	
	//1. ������ ģ��.
	//ex)�̼��� �л��� ������ ģ��.
	public void takeTest() {
		System.out.println(studentName + "�л��� ������ ģ��");
	}
	//2.û�Ҹ� �Ѵ�.
	public void cleanUp() {
		System.out.println(studentName + "�л��� û�Ҹ� �մϴ�.");
	}
}//end of class