package ch01;

public class ThreadTest1 {

	//main function < -- main Thread(�۾���)
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			//������ �̸����� �����ؼ� �޼���() = static�޼���        
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}//end of main

}//end of class
