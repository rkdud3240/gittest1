package ch05;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(lineNumber + "ȣ�� �°���");
		System.out.println(passengerCount + "���̰�");
		System.out.println("���� ������ " + money + "���Դϴ�.");
	}
}// end of c
