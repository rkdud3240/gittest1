package ch11;
//���� ����ϴ� �⺻ Ŭ�������� ���� ��Ű��
import java.lang.*;

//toString() �޼���
class Student {
	
	//ToString();�� �̹� ���� ��
	@Override // ������
	public String toString() {
		return "�л�Ŭ����";
	}
	
}//end of class Student

public class ObjectTest extends Object {
	                            //�ֻ��� Ŭ����, ����� ���� �ʴ��� �⺻������ ������
	
	String str1;
	
	public static void main(String[] args) {
		
		//System.out.println(); //��������� ���µ� �ڹٰ� �˾Ƽ� �������
		
		Student s1 = new Student();
		System.out.println(s1);
		String str1 = new String("�ȳ��ϼ���");//��� ������ ������ toString()�� �̹� ���ǵ�
		System.out.println(str1);
		
	}//end of main
	
}//end of class ObjectTest 
