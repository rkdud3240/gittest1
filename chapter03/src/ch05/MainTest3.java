package ch05;

public class MainTest3 {

	public static void main(String[] args) {
		// ������ : �迭 (�ڷᱸ��) ���迡���� ��� ����
		// �ϳ��� ������ ������ �����͸� ������ �����ϱ� ���� ���

		// 1.
		Banana banana1 = new Banana();
		Banana banana2 = new Banana();

		Banana[] bananaBuket = new Banana[2];
		bananaBuket[0] = banana1;
		bananaBuket[1] = banana2;

		// 1�� foreach _showInfo ȣ��
		for (Banana banana : bananaBuket) {
			banana.showInfo();
		}
		//������
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();
		
		//�迭 ����ؼ� ��� �ּ���
		//�迭�� 2ĭ
		Peach[] peachBuket = new Peach[2];
		peachBuket[0] = peach1;
		peachBuket[1] = peach2;
		
		//for ����ؼ� showInfo �޼��� ȣ��
//		for (Peach peach : peachBuket) {
//			peach.showInfo();
//		}
		//3. �������� ����Ѵٸ� 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		Fruit[] fruitBuket = new Fruit[4];
		fruitBuket[0] = banana1;
		fruitBuket[1] = peach1;
		fruitBuket[2] = banana2;
		fruitBuket[3] = peach2;
		
		for (Fruit fruit : fruitBuket) {
			fruit.showInfo();
		}
	}
}
