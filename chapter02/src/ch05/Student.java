package ch05;

public class Student {
	
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	//�л��� ������ ź��.(��ü�� ��ü���� ��ȣ�ۿ��ϰ� �ڵ带 ����)
	public void takeBus(Bus bus) {
		bus.take(1200); //Bus.java�� ��ȣ�ۿ�
		this.money -= 1200;
		
	}
	//�л��� ����ö�� ź��. (��ü�� ��ü�� ��ȣ�ۿ�)
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	//����â �����ֱ�
	public void showInfo() {
		System.out.println(name+"���� ���� ���� : " + money + "�Դϴ�.");
	}
}