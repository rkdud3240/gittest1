package ch10;

public class HatcheryMainTest {

	public static void main(String[] args) {
		
		
		
		System.out.println(Hatchery.zerglingCount);
		Hatchery hatchery = new Hatchery("��ó��1");
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		
		
		System.out.println("���� ������ ���۸� �� : " + Hatchery.zerglingCount);
	}

}
