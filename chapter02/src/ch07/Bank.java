package ch07;

public class Bank {
	
	//��������
	private int balance;
	//��������� ���������ؼ� getter,setter�� �̿� ��ǥ���� oop���
	//�޼���
	
	//�Աݱ��
	public void deposit(int money) {
		//this.balance =this.balance + money;
		this.balance += money;
	}
	//��ݱ��
	public int withdraw(int money) {
		this.balance -= money;
		return money;
	}
	public void showInfo() {
		System.out.println("�����ܾ��� : " + this.balance + "�Դϴ�.");
	}
	
	//getter �޼��� �����
	//�Ϲ������� get()�޼��带 ���� �ܺο��� Ȯ���� �� �ֵ��� �����Ѵ�.
	public int getBalance() {
		return this.balance;
	}
	//setter�޼��� �����
	//�Ϲ������� set() �޼��带 �����ؼ� 
	//�ܺο��� ��������� ������ �� �ֵ��� �����Ѵ�.
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}else {
			this.balance = balance;
		}
	}
	//public class�� .java���� �ȿ� �� �ϳ��� ����� �� �ִ�
class Student{
	
}
}//end of class
