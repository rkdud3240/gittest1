package ch05;

public class DownCastingTest {

	public static void main(String[] args) {
		
	 //1.바나나에 origin 멤버 변수를 추가
		Fruit fruit = new Banana(); // 업캐스팅
									//    ↓
//		fruit.origin;				// 다운캐스팅
		//컴파일러는 부모 타입 인스턴스 변수타입을 바라보고 있는 상태
		//다운 캐스팅을 사용한다면 가능 
		//(컴파일러에게 자식 객체 타입으로 바라보라고 명시)
		 String origin = ((Banana)fruit).origin;
		 System.out.println("원산지 : "+ origin);
		//컴파일 타임 - 사람이 작성한 언어를 기계언어(0,1)로 변환하는 것
		
		//런타임 - 프로그램을 실행했을 때 
		
	}//end

}//end 
