package ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame{
	
	int grade = 10;
	
	public MyRunnable2() {
		runnable.run();
	}

	//�͸� ���� ��ü ���
//	new Runnable() {
//		
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//		}
//	};
	// �ڹ� ����

	// ���� ��ü
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
		//���� 1. ��ü ������ ���ÿ� run �޼��带 ���� ���� �ּ���.
		//����2. �ܺο��� run �޼��� ���� ���� �ּ���.
		myRunnable2.runnable.run();
	}

}
