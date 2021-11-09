package ch11;
//싱글톤 패턴 만들기
public class Company {
	
	//1.생성자 private 로 만든다.
	private Company() {
		
	}

	//2. static 변수를 활용해서 내부에서 객체를 생성한다.
	private static Company instance = new Company();//변수선언과 동시에 초기화
	
	//3. 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드를 제공해야 한다.
	public static Company getInstance() {
		//방어적 코드
		return instance;
	}
}
