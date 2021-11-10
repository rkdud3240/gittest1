package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//콜백
public class HackerNews implements WriteArticle{
	// 있는 사이트
	private String printDate() {
		//
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
	}//end of printDate

	@Override
	public void printArticle(String article) {
		System.out.println("***HackerNews***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : " + printDate());
	}
	
	
}
