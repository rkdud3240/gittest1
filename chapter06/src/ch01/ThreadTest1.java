package ch01;

public class ThreadTest1 {

	//main function < -- main Thread(작업자)
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			//스레드 이름으로 접근해서 메서드() = static메서드        
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}//end of main

}//end of class
