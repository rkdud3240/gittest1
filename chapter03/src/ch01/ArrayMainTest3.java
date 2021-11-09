package ch01;

import java.util.Calendar;

public class ArrayMainTest3 {
	//start
	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는 강물처럼","파울로 코엘료" );
		Book book2 = new Book(2, "플러터 UI실전","김근호" );
		Book book3 = new Book(3, "무궁화꽃이 피었습니다","김진명" );
		Book book4 = new Book(4, "리딩으로 리드하라","이지성" );
		Book book5 = new Book(5, "사피엔스","유발하라리" );
		
		//문제
		//1. 배열을 이용해서 shoppingCart 변수(배열)에 객체를 담아 봅시다.
		Book[] shoppingCart = new Book[5]; 
		
		//2. 사고싶은 책 3개를 장바구니에 담아 봅시다.
		shoppingCart[0] = book1;
		shoppingCart[1] = book2;
		shoppingCart[2] = book3;
		
		//3. 장바구니에 담은 정보를 화면에 출력하세요.
		//오류 수정해 주세요
		
//		shoppingCart[0].showInfo();
//		shoppingCart[1].showInfo();
//		shoppingCart[2].showInfo();
		
//		for (int i = 0; i < shoppingCart.length; i++) {
//			if(shoppingCart[i] != null) {
//				shoppingCart[i].showInfo();
//			}
//		}
		//java.lang.NullPointerException 오류 이유 : 
		//shoppingCart[5] : 주소 | 주소 | 주소 | null | null
		//null도 다 나오라고 해서 그렇다.
		
		//4. 
		shoppingCart[0] = book5;
		
		//5. index 1번째에 book3을 추가 해주세요
		// 0, 1 = book3, 1->2 , 2->3, 3->4
		
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book2;
		shoppingCart[3] = book4;
		shoppingCart[4] = book5;
		
		//삭제 -> 배열에 담겨 있는 값을 제거 하려면 
		//3번째 인덱스를 지워보세요
		shoppingCart[3] = null;
		
		//배열에 추가를 하려면 직접 인덱스 연산을 해서 처리해야 한다.
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
		}
		
		}
	}//end of main

}//end of class
