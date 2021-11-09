package ch03;

public class Car {
	
	String name;
	int price;
	//포함관계 has a
	//포함관계는 상속할 수 없다. 차와 엔진은 상속할 수 없다.
	Engine engine;
	
	
	public Car(String name,int price) {
		this.name = name;
		this.price = price;
		engine = new Engine("GDI", 500);
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("price : " + price);
	}
}
