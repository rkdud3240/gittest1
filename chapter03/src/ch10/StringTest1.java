package ch10;

public class StringTest1 {
	//main function _ start of code
	public static void main(String[] args) {
		
		//String ���� ���
		
		//heap �޸𸮿� �ν��Ͻ��� �����Ǵ� ���
		 String str1 = new String("abc");
		 
		 //data, static, constant pool�� ��ġ�Ѵ�.
		 String str2 = "abc";
		 String str3 = "abc";
		 
		 System.out.println(str1 == str2);
		 System.out.println("----------");
		 System.out.println(str2 == str3);
		 
		 String str4 = new String("abc");
		 String str5 = new String("abc");
		 
		 System.out.println("----------");
		 System.out.println(str4 == str5);
		 
		 String str6 = "abc";
		 String str7 = "abc";
		 
		 System.out.println("----------");
		 System.out.println(str6 == str7);
		 
		 //��� : �� �޸𸮴� ������ �� ���� �ٸ� �ּҰ��� ��������,
		 // ��� Ǯ�� ������ ���ڿ��� ��� ���� �ּҰ��� ������.(���� ���ڿ��� ���)
		 
		 
	}//end of main

}//end of class
