package ch07;

public class AICar extends Car {
//�߻�޼��� ����� abstract
	
	//�߻�޼��带 ���������� �Ϲݸ޼��� �����
	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("������ �����۸� �����մϴ�.");
		
	}
	
	@Override
		public void washCar() {
			System.out.println("������ ������ �մϴ�.");
		}
	
//	private void run() {
//		// TODO Auto-generated method stub
//
//	}
}
