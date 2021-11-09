package ch11;

public class Book {
	
	private int bookId;
	private String title;
	private String author;
	
	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	//toString 메서드 재정의 해보기
	@Override
	public String toString() {
		
		return bookId + ","+ title +","+author;
		
	}
	
	//책이름 , 작가 까지 같아야  true
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Book) {
			Book tempBook =  (Book)obj;
			//논리적 설계
			if(this.title == tempBook.title &&
			this.bookId == tempBook.bookId &&
			this.author == tempBook.author) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Book book1 = new Book(1, "데미안 ","홍길동");
		System.out.println(book1);
		
	}//end of main
}//end if class
