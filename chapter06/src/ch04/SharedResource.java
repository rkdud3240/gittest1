package ch04;

class BankAccount {

	private int money = 100_000;

	// getter
	public int getMoney() {
		return this.money;
	}

	// setter
	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else {
			this.money = money;
		}
	}

	// �Աݱ��
	public synchronized void saveMoney(int money) {
		// 10���� ����
		int currentMoney = getMoney();
		System.out.println("�޼��� ���� Ȯ�� 1 : saveMoney");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("�Ա� �� ���� �ܾ� : " + getMoney());
	}

	// ��ݱ��
	public void withdrawMoney(int money) {

		synchronized (this) {
			int currentMoney = getMoney();
			System.out.println("�޼��� ���� Ȯ�� 2 : withdrawMoney");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// ����� �ڵ�
			// Todo
			// ���� �ݾ׺��� ����Ϸ��� �ݾ��� ũ�� ����� �ȵǰ� ����

			setMoney(currentMoney - money);
			System.out.println("��� �� ���� �ܾ� : " + getMoney());

		}
	}
} // end of BankAccount class

class Father extends Thread {

	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// �Ա��ϱ�
		account.saveMoney(10_000);
	}
}

class Mother extends Thread {

	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// ����ϱ�
		account.withdrawMoney(5_000);
	}
}

public class SharedResource {

	public static void main(String[] args) {

		// ���� 10������ ���ݵǾ� �ִ� ���·� ��ü ����
		BankAccount account = new BankAccount();

		Father father = new Father(account);
		Mother mother = new Mother(account);

		// �ƹ����� �Ա��ϴ� ����
		father.start();
		// ��Ӵϰ� ����ϴ� ����
		mother.start();

		// ����ó���ݾ� : 10���� + 1���� - 5õ�� = 10�� 5õ��
		// ����� : 110000 ?? <--�ǵ�ġ ���� ����� ���� �� �ִ�.

		// ����ȭ
		// �Ӱ� ������ �߻��� ���� (�۾��ڰ� �ڿ��� �����ϴ� ����)
		// ���� �ڿ�(������) ����ϰ� �ֱ� ������ ��ȣ ó���� ���־�� �Ѵ�.
		// �ٸ� �۾��ڰ� ������� ���ϵ��� lock �� �ɾ��ش�.
		// ������ ���Ѽ� �۾��� �ϰ� ��
		// �ϴ� ��� - 
		//1. synchronized �޼���
		//2. synchronized {���}
		
	}
}
