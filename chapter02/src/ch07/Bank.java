package ch07;

public class Bank {
	
	//정보은닉
	private int balance;
	//멤버변수를 정보은닉해서 getter,setter를 이용 대표적인 oop방식
	//메서드
	
	//입금기능
	public void deposit(int money) {
		//this.balance =this.balance + money;
		this.balance += money;
	}
	//출금기능
	public int withdraw(int money) {
		this.balance -= money;
		return money;
	}
	public void showInfo() {
		System.out.println("현재잔액은 : " + this.balance + "입니다.");
	}
	
	//getter 메서드 만들기
	//일반적으로 get()메서드를 만들어서 외부에서 확인할 수 있도록 구현한다.
	public int getBalance() {
		return this.balance;
	}
	//setter메서드 만들기
	//일반적으로 set() 메서드를 제공해서 
	//외부에서 멤버변수에 접근할 수 있도록 구현한다.
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.balance = balance;
		}
	}
	//public class는 .java파일 안에 단 하나만 사용할 수 있다
class Student{
	
}
}//end of class
