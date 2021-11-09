package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		//재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 1. ThreeDPrinter1 -> 객체 생성
		ThreeDPrinter1 printer1 = new ThreeDPrinter1(); 
		//setter 메서드 사용할 때 Powder
		printer1.setMaterial(powder);
		System.out.println(printer1.getMaterial());
		
		System.out.println("-----------------------------");
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		
		System.out.println("-----------------------------");
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		//1.재료 세팅
		printer3.setMaterial(powder);
		
		//자료를 꺼내 보세요
		System.out.println(printer3.getMaterial());
//		printer3.setMaterial(plastic);
		
		//요청 : 변수에 ThreeDPrinter3에 재료를 저장해 주세요
		//재료  : temp1
		Powder temp1 = (Powder)printer3.getMaterial();
		//질문 
		System.out.println(printer3);
		
	}//end of main

}//end of class
