package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest1 {

	public static void main(String[] args) {


		//��� 
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		//��� �� �� �ڷ����� �־��ָ� �ȴ�.
		//����� : T ��ſ� ����� �� � �ڷ����� ������� ������ �ָ� �ȴ�.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
		
		//��� �̱�
		genericPrinter1.setMaterial(powder);
		
		//��� ������
		Powder tempPowder = genericPrinter1.getMaterial();
		System.out.println(tempPowder);
		System.out.println("--------------------------");
		//���� 1. �ö�ƽ���� ���׸� Ŭ������ �����ϰ� ��Ἴ�� �Ŀ� ��Ḧ ���� ���ϴ�.
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();
		//��� �̱�
		genericPrinter2.setMaterial(plastic);
		//��� ������
		Plastic tempPlastic = genericPrinter2.getMaterial();
		System.out.println(tempPlastic);
		System.out.println("--------------------------");
		//GenericPrinter toString();
		System.out.println(genericPrinter1);
		System.out.println("--------------------------");
		System.out.println(genericPrinter2);
	}

}
