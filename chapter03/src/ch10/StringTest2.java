package ch10;

public class StringTest2 {

	public static void main(String[] args) {
		
		//한번 생성된 string은 불변(immutable)
		// String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성된다.
		String java = new String("java");
		String android = new String("Android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		System.out.println("---------------------------");
		
		//java = java + android;
		java = java.concat(android);
		System.out.println(java);//java + android
		
		System.out.println(System.identityHashCode(java));
		
		
	}//end of main

}//end of class
