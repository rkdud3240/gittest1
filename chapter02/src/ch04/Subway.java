package ch04;

public class Subway {
	
	int lineNumber;//ȣ����ȣ
	int passengerCount;//�°���
	int money;//���ͱ�
	
	//������ - ȣ����ȣ�� �޴� ������ �����
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	//�޼��� take , showInfo
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber + "ȣ�� �°���");
		System.out.println(passengerCount + "���̰�");	
		System.out.println("���� ������ " + money + "���Դϴ�.");	
	}
}//end of c
