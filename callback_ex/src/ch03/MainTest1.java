package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
		//��Ŀ ���� ��ü ����
		WriteArticle hackerNews = new HackerNews();
		WriteArticle sbsNews = new SbsNews();
		WriteArticle mbsNews = new MbsNews();
		
		//����ۼ�
//		MyArticle article = new MyArticle("���� ������ 15�� �Դϴ�.", hackerNews);
		MyArticle article = new MyArticle(hackerNews, sbsNews, mbsNews);
		article.complete();

	
	}

}
