package ch04;

public class StudentMainTest {
	
	//main function _ start of code
	public static void main(String[] args) {
						//������
		Student s1 = new Student(1, "ȫ�浿", 3);//��� ���߱� Student(int Num)
					//new��� Ű����
		System.out.println(s1.number);
		System.out.println(s1.name);
		System.out.println(s1.grade);
		
		s1.showInfo();
		System.out.println("-----------------");
		
		//�⺻ �����ڷ� ��ü �����غ���
		//Student s2  = new Student();
		//s2.grade = 2;
		//s2.name = "�̼���";
		//s2.number = 2;
		Student s2  = new Student(2, "�̼���", 2);
		
		System.out.println(s2.number);
		System.out.println(s2.name);
		System.out.println(s2.grade);
		
		s2.showInfo();
	}//end of main

}//end of class