package ch04;

public class Bus {
	// 버스 번호
	// 승객 수
	// 수입
	int busNumber;
	int passengerCount;
	int money;
	
	//생성자가 기본 생성자를 만들지 않으면,
	// 컴파일러가 기본 생성자를 만들어 준다.
	
	public Bus(int busNumber){
		this.busNumber = busNumber;
	}
	public void take(int money) {
//		this.money = money + money;
		this.money += money;
		passengerCount++;
		
	}
	public void showInfo() {
		System.out.println(busNumber + "번의 승객은");
		System.out.println(passengerCount + "명이고");	
		System.out.println("현재 수입은 " + money + "원입니다.");	
		}
	
}
