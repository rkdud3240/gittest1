package ch01;

public class ArrayMainTest {
	// START
	public static void main(String[] args) {

		// �迭
		// �迭�̶� ������ �����͸� ��Ƽ� ������ �����ϱ� ���� ����ϴ� ������ Ÿ���̴�.
		// ������ �ϳ��� �����͸� �����ϱ� ���� ���̶�� �迭�� ���� ���� �����͸� �ϳ��� ������
		// �����ϱ� ���� ���̶�� �� �� �ִ�.

		// �ڹ��� ����
		int number = 10;

		// �迭 ���� ��� 2����
		int[] arr1 = new int[3];// 1.�� ����
		int arr2[] = new int[10];// 2.
		
		
		//�ʱ�ȭ �ϴ� ��� (���� �ִ� ���)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		// ��� ���α׷����� index�� 0���� ���� : ũ��(n)�� index�� ������ ��ȣ(n-1)�� �ٸ���.
		
		//�迭 ����� ���ÿ� �ʱ�ȭ
		int[] numbers1 = new int[] {11, 20, 30};//1.
		int[] numbers2 = {10, 50, 100};//2.
		
		//��¹��
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		System.out.println(numbers1);
		
		//c r u d
		//����, , ,����
		
		// 
		String[] strArr = new String[10];
		strArr[0] = "�߽���";
		strArr[1] = "Ƽ��";
		strArr[2] = "�ֽ�";
		strArr[3] = "�ٸ��콺";
		
		//1. ȭ�鿡 0,1,2,3,4 ������ּ��� ��  for�� ��� ����
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		//�迭�� Ŭ������ Ŭ������ �� ������ ��� ����, �ּҰ��� ����� ���� �� ������ ��밡��
		System.out.println(strArr.length);
		
		System.out.println("==================");
		
		//�ڵ� ���� null ���� ������� ������
		for(int i = 0; i < strArr.length; i++) {
			
			if(strArr[i] != null) {
				System.out.println(strArr[i]);	
			}//end of if
		}//end of for
			//me
//			if(i == 4) {
//				i -= 1;
//			}else {
//				System.out.println(strArr[i]);
//			}
//		}
		
		//��� ���α׷��� ������ index�� 0���� �����մϴ�.
		//�迭�� ����� �� ���� for���� �����ؼ� ���� ��� �մϴ�.
		
//		new int[22]; //���� 22, 21
//		new int[74]; //���� 74, 73
//		new int[283]; //���� 283, 282
		
		
	}// end of main
}// end of class
