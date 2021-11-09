package ch09;

import java.util.Random;

public class MainTest2 {

	public static void main(String[] args) {

		//JDK 만들어준 도구
		Random r = new Random();
		int value = r.nextInt(20);//정수값을 랜덤으로 만들어줌
		System.out.println("value : " + value);
		//Source > generate getters and setters 자동완성
		
	}
}
