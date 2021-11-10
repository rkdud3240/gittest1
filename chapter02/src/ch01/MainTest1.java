
package ch01;

public class MainTest1 {
	//main function_start of code
	public static void main(String[] args) {
		
	Order order1 = new Order();
	//멤버 변수의 특성. 값을 활성하지 않아도 초기값을 가짐
	//int -> 0 , 참조타입 (대문자로 시작하는 데이터 타입)은 null
	System.out.println(order1.orderId);
	System.out.println(order1.buyerId);
	System.out.println(order1.sellerId);
	System.out.println(order1.productId);
	System.out.println(order1.orderDate);
		
	System.out.println("-----------------");
	//1. order1 값을 넣어 화면에 출력
	
	order1.orderId = 2110210001;
	order1.buyerId = "buyer";
	order1.sellerId = "seller";
	order1.productId = 4567890;
	order1.orderDate = "20211021";
	
	System.out.println(order1.orderId);
	System.out.println(order1.buyerId);
	System.out.println(order1.sellerId);
	System.out.println(order1.productId);
	System.out.println(order1.orderDate);
	
	System.out.println("-----------------");
	//2. userInfo1 값을 넣어 화면에 출력
	
	UserInfo userInfo1 = new UserInfo();
	
	userInfo1.phoneNumber = 1234123412;
	userInfo1.userAddress = "OO시 OO구 OO동 123-4번지 5층";
	userInfo1.userId = "koreajava";
	userInfo1.userName = "코리아 IT";
	userInfo1.userPassword ="koreajava2021";
	
	System.out.println(userInfo1.phoneNumber);
	System.out.println(userInfo1.userAddress);
	System.out.println(userInfo1.userId);
	System.out.println(userInfo1.userName);
	System.out.println(userInfo1.userPassword);
	
	}//end of main

}//end of class