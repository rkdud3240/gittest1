package ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame{
	
	int grade = 10;
	
	public MyRunnable2() {
		runnable.run();
	}

	//익명 구현 객체 모양
//	new Runnable() {
//		
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//		}
//	};
	// 자바 문법

	// 구현 객체
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < grade; i++) {
				System.out.print("--");
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}//end of for
			
		}//end of run
	};
	
}



public class RunnableTest2 {

	public static void main(String[] args) {
		
		MyRunnable2 myRunnable2 = new MyRunnable2();
		//문제 1. 객체 생성과 동시에 run 메서드를 실행 시켜 주세요.
		//문제2. 외부에서 run 메서드 동작 시켜 주세요.
		myRunnable2.runnable.run();
	}

}
