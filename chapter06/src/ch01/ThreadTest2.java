package ch01;
//��Ƽ������_������ ���� ���
//import java.lang.*;�� Thread�� �־ ���� ����Ʈ ���� �ʾƵ� ��
				//1. ������ ���
class MyThreadEx2 extends Thread{
	
	String name;
	
	public MyThreadEx2(String name) {
		this.name = name;
	}
	
	//2. ���  run , ctrl space
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
	//���� ������_�۾��� 1��
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		System.out.println("���� ������ ����");
		//�۾��� 1��_������� �� 2��
		MyThreadEx2 th1 = new MyThreadEx2("�۾���1");
		th1.start(); //�������� �۾��� �����ϴ� ��ɾ� �Դϴ�.
		
//		for(int i = 0; i < 50; i++) {
//			System.out.println("test : " + i);
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		MyThreadEx2 th2 = new MyThreadEx2("�۾���2");
		th2.start();
		MyThreadEx2 th3 = new MyThreadEx2("�۾���3");
		th3.start();
		
		System.out.println("���� ������ ����");
		
		//Thread[main,5,main]
		//            �� ���ڰ� ���� ���� �켱������ ����.
		
	}//end of main

}//end of class
