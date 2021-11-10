package ch03;

import java.util.Scanner;

//콜리 (호출자)
public class MyArticle {
  
	String article;
	WriteArticle hackers;
	WriteArticle sbsNews;
	WriteArticle mbsNews;

	//주소값 연결
	public MyArticle( WriteArticle mbsNews, WriteArticle hackers, WriteArticle sbsNews) {
		
		this.mbsNews = mbsNews;
		this.hackers = hackers;
		this.sbsNews = sbsNews;

	
	}
	public void complete() {
		//Scanner를 사용해서 사용자 입력 값을 받고 콜백메서드를 실행 시켜주세요
		//nextLine
		//1.스캐너 선언하기 
		//2.사용자 입력값 받기
		//3.입력값을 멤버 변수 article에 담기
		Scanner scanner = new Scanner(System.in);
		article = scanner.nextLine();
		
		hackers.printArticle(article);
		sbsNews.printArticle(article);
		mbsNews.printArticle(article);

	}
}
