package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

class MyException{
	
	String fileName;
	
	public MyException(String fileName) {
		this.fileName = fileName;
	}
	//throws란 예외 처리 미루기
	public String readFile() throws IOException {
									
		FileInputStream fis = new FileInputStream(fileName);
		Properties prop = new Properties();
		//ctrl +shift + o
		prop.load(fis);
		String dbType =prop.getProperty("DBTYPE");
		return dbType;
		
	}
}

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		//객체생성
		MyException exception = new MyException("a.txt");
		
		//throws가  있으면? 사용하는 입장에서 예외처리를 직접 해결해야한다.
		try {
			String temp = exception.readFile();
			System.out.println("temp : " + temp);
		} catch (IOException e) {
			System.out.println("파일이 없습니다. 파일을 확인해 주세요.");
		}
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			int userInput = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("예외 발생");
		}finally {
			scanner.close();
		}
		
		
		
		
	}//end of main

}//end of class
