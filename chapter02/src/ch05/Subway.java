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
		System.out.println(lineNumber + "호선 승객은");
		System.out.println(passengerCount + "명이고");
		System.out.println("현재 수입은 " + money + "원입니다.");
	}
}// end of c
