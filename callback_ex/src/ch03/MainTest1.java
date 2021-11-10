package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
		//해커 뉴스 객체 생성
		WriteArticle hackerNews = new HackerNews();
		WriteArticle sbsNews = new SbsNews();
		WriteArticle mbsNews = new MbsNews();
		
		//기사작성
//		MyArticle article = new MyArticle("오늘 날씨가 15도 입니다.", hackerNews);
		MyArticle article = new MyArticle(hackerNews, sbsNews, mbsNews);
		article.complete();

	
	}

}
