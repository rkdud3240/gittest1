package ch03;

import java.util.Scanner;

//�ݸ� (ȣ����)
public class MyArticle {
  
	String article;
	WriteArticle hackers;
	WriteArticle sbsNews;
	WriteArticle mbsNews;

	//�ּҰ� ����
	public MyArticle( WriteArticle mbsNews, WriteArticle hackers, WriteArticle sbsNews) {
		
		this.mbsNews = mbsNews;
		this.hackers = hackers;
		this.sbsNews = sbsNews;

	
	}
	public void complete() {
		//Scanner�� ����ؼ� ����� �Է� ���� �ް� �ݹ�޼��带 ���� �����ּ���
		//nextLine
		//1.��ĳ�� �����ϱ� 
		//2.����� �Է°� �ޱ�
		//3.�Է°��� ��� ���� article�� ���
		Scanner scanner = new Scanner(System.in);
		article = scanner.nextLine();
		
		hackers.printArticle(article);
		sbsNews.printArticle(article);
		mbsNews.printArticle(article);

	}
}
