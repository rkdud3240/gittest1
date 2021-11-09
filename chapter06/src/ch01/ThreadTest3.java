package ch01;
	
class MyThread3 extends Thread{
		
	String name;
		
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " : " + Thread.currentThread());
		}
	}
		
	public MyThread3(String name) {
		this.name = name;
	}
}
		
public class ThreadTest3 {
	//메인 스레드
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		//작업자 3명 생성
		MyThread3 th1 = new MyThread3("작업자1");
		MyThread3 th2 = new MyThread3("작업자2");
		MyThread3 th3 = new MyThread3("작업자3");
		//작업을 시작시켜 주세요
		th1.start();
		th2.start();
		th3.start();
		th1.run();//접근지시제어자가 public이라 사용가능
		
	}//end of main

}//end of class






