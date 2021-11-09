package Ex01;

public class Define {

		public static final int MIN = 1;
		public static final int MAX = 9999;
		public static final double PI = 3.14;
		public static final String GREETING = "Good morning";
		public static final int MATH_CODE = 1001;
		//메인함수
		public static void main(String[] args) {
			
//			Define define = new Define();
			//new 라는 키워드 없이 클래스 이름으로 사용할 수 있다.
			System.out.println(Define.MIN);
			System.out.println(Define.MAX);
			System.out.println(Define.PI);
			System.out.println(Define.GREETING);
			System.out.println(Define.MATH_CODE);
			
		
		}//end of main
}//end of class
