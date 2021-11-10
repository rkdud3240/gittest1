package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MbcNews implements WriteArticle{

	
	private String printDate() {
		
		
		DateFormat formater = new SimpleDateFormat("EEE.yyyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
		
	}

	@Override
	public void printArticle(String article) {
		System.out.println("======MbcNews======");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사작성일 : " + printDate());
		
	}
}
