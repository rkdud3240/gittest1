package ch01;
//멀티스레드_스레드 생성 방법
//import java.lang.*;에 Thread가 있어서 따로 임포트 하지 않아도 됨
				//1. 스레드 상속
class MyThreadEx2 extends Thread{
	
	String name;
	
	public MyThreadEx2(String name) {
		this.name = name;
	}
	
	//2. 약속  run , ctrl space
	@Override
	public void run() {
		int i;
		for(i = 0; i < 50; i++) {
			System.out.println(name + " : " + i + "\t");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//end of for
	}//end of run
	
	
}//end of MyTreadEx2


public class ThreadTest2 {
	//메인 스레드_작업자 1명
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		System.out.println("메인 스레드 시작");
		//작업자 1명_여기까지 총 2명
		MyThreadEx2 th1 = new MyThreadEx2("작업자1");
		th1.start(); //스레드의 작업을 시작하는 명령어 입니다.
		
//		for(int i = 0; i < 50; i++) {
//			System.out.println("test : " + i);
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		MyThreadEx2 th2 = new MyThreadEx2("작업자2");
		th2.start();
		MyThreadEx2 th3 = new MyThreadEx2("작업자3");
		th3.start();
		
		System.out.println("메인 스레드 종료");
		
		//Thread[main,5,main]
		//            ㄴ 숫자가 높을 수록 우선순위가 높다.
		
	}//end of main

}//end of class
