package ch07;

public class MainTest2 {

	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("------------------");
		
		Car manualCar = new ManualCar();
		manualCar.run();
		//프레임워크란 실행의 흐름이 정해져 있기 때문에 그 안에서 흐름을 
	}//end

}//end
