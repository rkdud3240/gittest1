package ch06;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		//int ���� ���ڰ����� �ٲ� ��
		//S + "" --> String
		
		//���ڿ��� ����Ʈ��
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		
		//
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		System.out.println(d);
		
		//
//		boolean bl = Boolean.parseBoolean(str2);
//		System.out.println(bl);//����� ���� �� ������ false
		boolean bl = Boolean.parseBoolean(str3);
		System.out.println(bl);
		if (Boolean.parseBoolean(str3)) {
			System.out.println("boolean������ ����Ϸ�.");
		}
		//���� 1
		String str10 = "1001";
		String str11 = "2001";
		
		//str10�� str11�� ���� ���� ���ּ���
		//����� ���� ���
		//str10�� str11�� ���� ���� ���ּ���
		//����� ���� ���
		
		//�ѱ� ���� �ڵ� Ȯ��
		
		
		int n1 =  Integer.parseInt(str10);
		int n2 =  Integer.parseInt(str11);
		
		int p = n1 + n2;
		int x = n1 * n2;
		
		System.out.println("������� : "+ p);
		System.out.println("������� : "+ x);

		
		System.out.println("���ڿ� byte�� ��ȯ : " + b);
		System.out.println("���ڿ� int�� ��ȯ : " + i);
		System.out.println(b);//sysout : �޼��� �����ε��� �ٽ�

	}

}