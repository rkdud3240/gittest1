package ch07;

public abstract class NoteBook extends Computer {

	@Override//재정의
	public void typing() {
		System.out.println("노트북 키보드로 타이핑 합니다.");
		
	}
}
