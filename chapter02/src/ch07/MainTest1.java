package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		//��������� ���� Ȯ��
		// int balance --> 0
		// double balance -->0.0
		//String balance --> null
		
		bank.deposit(10_000);
		bank.showInfo();
		
		//����� �մϴ�.
		int money = bank.withdraw(5_000);
		System.out.println("�������� �ݾ� : " + money);
		bank.showInfo();
		
		//������ �Ǽ��� ��������� �ٷ� �����ؼ� �ܾ��� ���� ��
//		bank.balance = 100_000;
		bank.showInfo();
		
		//
		//getter, setter
		//read only
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		//setter ����غ���
		bank.setBalance(-10000);
		bank.showInfo();
		
		//���� ���� ������ 4����
		//1. public - ������ ������ ����ϰ� �Ѵ�
		//2. default - ���� ��Ű�� ������ ������ ����Ѵ�. �ƹ��͵� �������� default
		//3. protected - ��Ӱ��迡�� ������ ����Ѵ�.
		//4. private - ���� Ŭ���������� ������ ����Ѵ�.
	}
}
