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
	//���� ������
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		//�۾��� 3�� ����
		MyThread3 th1 = new MyThread3("�۾���1");
		MyThread3 th2 = new MyThread3("�۾���2");
		MyThread3 th3 = new MyThread3("�۾���3");
		//�۾��� ���۽��� �ּ���
		th1.start();
		th2.start();
		th3.start();
		th1.run();//�������������ڰ� public�̶� ��밡��
		
	}//end of main

}//end of class






