
package ch01;

public class MainTest1 {
	//main function_start of code
	public static void main(String[] args) {
		
	Order order1 = new Order();
	//��� ������ Ư��. ���� Ȱ������ �ʾƵ� �ʱⰪ�� ����
	//int -> 0 , ����Ÿ�� (�빮�ڷ� �����ϴ� ������ Ÿ��)�� null
	System.out.println(order1.orderId);
	System.out.println(order1.buyerId);
	System.out.println(order1.sellerId);
	System.out.println(order1.productId);
	System.out.println(order1.orderDate);
		
	System.out.println("-----------------");
	//1. order1 ���� �־� ȭ�鿡 ���
	
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
	//2. userInfo1 ���� �־� ȭ�鿡 ���
	
	UserInfo userInfo1 = new UserInfo();
	
	userInfo1.phoneNumber = 1234123412;
	userInfo1.userAddress = "OO�� OO�� OO�� 123-4���� 5��";
	userInfo1.userId = "koreajava";
	userInfo1.userName = "�ڸ��� IT";
	userInfo1.userPassword ="koreajava2021";
	
	System.out.println(userInfo1.phoneNumber);
	System.out.println(userInfo1.userAddress);
	System.out.println(userInfo1.userId);
	System.out.println(userInfo1.userName);
	System.out.println(userInfo1.userPassword);
	
	}//end of main

}//end of class