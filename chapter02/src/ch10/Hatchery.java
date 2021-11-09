package ch10;

public class Hatchery {
	
	//static
	public static int zerglingCount = 1 ;//초기값
	//멤버변수 설계
	private String name;
	//생성자 설계
	public Hatchery(String name) {
		this.name = name;
	}	
	//저글링을 생산하는 메서드 만들어 주세요
	public Zergling createZergling() {
		System.out.println("저글링을 생산합니다.");
		zerglingCount++;
		return new Zergling("저글링" + zerglingCount);
		
	}

}
