package ch01;

import java.util.Calendar;

public class ArrayMainTest3 {
	//start
	public static void main(String[] args) {
		
		Book book1 = new Book(1, "�帣�� ����ó��","�Ŀ�� �ڿ���" );
		Book book2 = new Book(2, "�÷��� UI����","���ȣ" );
		Book book3 = new Book(3, "����ȭ���� �Ǿ����ϴ�","������" );
		Book book4 = new Book(4, "�������� �����϶�","������" );
		Book book5 = new Book(5, "���ǿ���","�����϶�" );
		
		//����
		//1. �迭�� �̿��ؼ� shoppingCart ����(�迭)�� ��ü�� ��� ���ô�.
		Book[] shoppingCart = new Book[5]; 
		
		//2. ������ å 3���� ��ٱ��Ͽ� ��� ���ô�.
		shoppingCart[0] = book1;
		shoppingCart[1] = book2;
		shoppingCart[2] = book3;
		
		//3. ��ٱ��Ͽ� ���� ������ ȭ�鿡 ����ϼ���.
		//���� ������ �ּ���
		
//		shoppingCart[0].showInfo();
//		shoppingCart[1].showInfo();
//		shoppingCart[2].showInfo();
		
//		for (int i = 0; i < shoppingCart.length; i++) {
//			if(shoppingCart[i] != null) {
//				shoppingCart[i].showInfo();
//			}
//		}
		//java.lang.NullPointerException ���� ���� : 
		//shoppingCart[5] : �ּ� | �ּ� | �ּ� | null | null
		//null�� �� ������� �ؼ� �׷���.
		
		//4. 
		shoppingCart[0] = book5;
		
		//5. index 1��°�� book3�� �߰� ���ּ���
		// 0, 1 = book3, 1->2 , 2->3, 3->4
		
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book2;
		shoppingCart[3] = book4;
		shoppingCart[4] = book5;
		
		//���� -> �迭�� ��� �ִ� ���� ���� �Ϸ��� 
		//3��° �ε����� ����������
		shoppingCart[3] = null;
		
		//�迭�� �߰��� �Ϸ��� ���� �ε��� ������ �ؼ� ó���ؾ� �Ѵ�.
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
		}
		
		}
	}//end of main

}//end of class
