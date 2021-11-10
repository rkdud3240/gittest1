package ch06;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		//int 값을 문자값으로 바꿀 때
		//S + "" --> String
		
		//문자열을 바이트로
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		
		//
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		System.out.println(d);
		
		//
//		boolean bl = Boolean.parseBoolean(str2);
//		System.out.println(bl);//제대로 형이 안 맞으면 false
		boolean bl = Boolean.parseBoolean(str3);
		System.out.println(bl);
		if (Boolean.parseBoolean(str3)) {
			System.out.println("boolean형으로 변경완료.");
		}
		//문제 1
		String str10 = "1001";
		String str11 = "2001";
		
		//str10과 str11을 덧셈 연산 해주세요
		//결과값 까지 출력
		//str10과 str11을 곱셈 연산 해주세요
		//결과값 까지 출력
		
		//한글 깨짐 코드 확인
		
		
		int n1 =  Integer.parseInt(str10);
		int n2 =  Integer.parseInt(str11);
		
		int p = n1 + n2;
		int x = n1 * n2;
		
		System.out.println("덧셈결과 : "+ p);
		System.out.println("곱셈결과 : "+ x);

		
		System.out.println("문자열 byte값 변환 : " + b);
		System.out.println("문자열 int값 변환 : " + i);
		System.out.println(b);//sysout : 메서드 오버로딩의 핵심

	}

}