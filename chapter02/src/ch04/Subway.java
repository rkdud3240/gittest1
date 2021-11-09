package ch04;

public class Subway {
	
	int lineNumber;//호선번호
	int passengerCount;//승객수
	int money;//수익금
	
	//생성자 - 호선번호를 받는 생성자 만들기
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	//메서드 take , showInfo
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber + "호선 승객은");
		System.out.println(passengerCount + "명이고");	
		System.out.println("현재 수입은 " + money + "원입니다.");	
	}
}//end of c
