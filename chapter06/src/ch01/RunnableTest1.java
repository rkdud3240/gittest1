package ch01;

import javax.swing.JFrame;

//Runnable interface�� �����Ͽ� ����� �ȴ�.

class MyRunnable1 extends JFrame implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print(i+"\t");
		}
	}
}

public class RunnableTest1{
	//���� ������_ ������ 1��
	public static void main(String[] args) {
		
		MyRunnable1 myRunnable1 = new MyRunnable1();
		
		//Runnable�� ������ ��ü�� Thread�� �����ؼ� �Ű������� ��� �����带 �����Ѵ�.
		//�۾��� 1_������ 2�� (��Ƽ������)
		Thread thread1 = new Thread(myRunnable1);
		thread1.start();
		
		Thread thread2 = new Thread(myRunnable1);
		thread2.start();
	}

}
