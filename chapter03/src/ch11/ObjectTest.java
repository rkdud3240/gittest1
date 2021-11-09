package ch11;
//많이 사용하는 기본 클래스들이 속한 패키지
import java.lang.*;

//toString() 메서드
class Student {
	
	//ToString();가 이미 정의 됨
	@Override // 재정의
	public String toString() {
		return "학생클래스";
	}
	
}//end of class Student

public class ObjectTest extends Object {
	                            //최상위 클래스, 상속을 하지 않더라도 기본적으로 가져옴
	
	String str1;
	
	public static void main(String[] args) {
		
		//System.out.println(); //만들어준적 없는데 자바가 알아서 만들어줌
		
		Student s1 = new Student();
		System.out.println(s1);
		String str1 = new String("안녕하세요");//사용 가능한 이유는 toString()이 이미 정의됨
		System.out.println(str1);
		
	}//end of main
	
}//end of class ObjectTest 
