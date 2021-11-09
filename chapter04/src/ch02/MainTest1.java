package ch02;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		MyComponents mc = new MyComponents();
		//NullPointerException -> 객체 주소를 넣지 않았거나
		System.out.println("글자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		
//		System.out.println(userInput);
		
		mc.textField.setText(userInput);
	}

}
