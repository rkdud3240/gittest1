package ch06;

public class Human extends Animal{
	
	//move 컨트롤 스페이스 -> 오버라이드
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
