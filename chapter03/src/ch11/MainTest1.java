package ch11;

public class MainTest1 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1,"���̾�","�츣���켼");
		Book book2 = new Book(1,"���̾�","�츣���켼");
		
		System.out.println(book1 == book2);
		
		boolean result = "a".equals("a");
		System.out.println(result);
		System.out.println("a" =="a");
		System.out.println("------------------");
		
		//equals �޼��带 �������ߴ�. (book Ŭ���� �ȿ���)
		if(book1.equals(book2)) {
			System.out.println("���� å�Դϴ�.");
		}else {
			System.out.println("�ٸ� å�Դϴ�.");
		}
	}

}
