package ch01;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A'; // ������ 65�� ����
		System.out.println(ch1);
		System.out.println((int) ch1);

		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int) ch2);

		char ch3 = 67;
		System.out.println(ch3);
		System.out.println((int) ch3);

		// ����!!! - ������ ���� �Ұ�
//		char ch4 = -68;
		//���� 
		//1. ��, ��, ��, ��, �� ---> ���� ������ ���ΰ���?
		char a = '��';
		char b = '��';
		char c = '��';
		char d = '��';
		char e = '��';
			
		System.out.print(a);
		System.out.print((int)a);
		
		System.out.print(b);
		System.out.print((int)b);
		
		System.out.print(c);
		System.out.print((int)c);
		
		System.out.print(d);
		System.out.print((int)d);
		
		System.out.print(e);
		System.out.println((int)e);
		
		//---------�����-----------
		System.out.print((int)'��');
		System.out.print((int)'��');
		System.out.print((int)'��');
		System.out.print((int)'��');
		System.out.print((int)'��');
	}

}
