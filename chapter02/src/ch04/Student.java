package ch04;

public class Student {
	
	//�⺻ ������ 
	//����� ���� �����ڰ� ���� ��쿡��
	//�����Ϸ��� �˾Ƽ� �⺻ �����ڸ� ����� �ش�.
	//�⺻ ������ ��� : 
	public Student() {
		
	}// - ������ : ��ü�� �����Ǿ� s2�� ���� ������ ��������.
	
	
	//������ - constructor
	//��ü�� ������ �� ������ ���� ������� ������ �����ϴ� ��(������ �ο���)
	//�������
	int number;
	String name;
	int grade;
	
	//������ ����� (�����ڰ� ���� ���� - ����� ���� ������)
	//grade �ְ� �ڵ带 ���� �����ϰ� ������ �ּ���
	public Student(int num, String name, int grade) {
		number = num;			//**�Ű�����
		this.name = name;
		this.grade = grade;
		//��������� �Ű������� �̸��� ���ٸ� this.Ű���带
		//����ؼ� ������ �־�� �Ѵ�.
		//this.name, this.grade =>������� 
		
		//**�Ű����� (parameter)
		//�Ű������� �޼ҵ�, �����ڸ� ������ ��, 
		//� ���·� �����Ͱ��� ������ �������ش�.
		
	}//end of St() - ������
		
	//�޼��� ����
	public void showInfo() {
		System.out.println(name + "�� �й��� " 
	+ number + "�̰� \n" + grade + "�г��Դϴ�." );
	}//end of show()
}//end of class
