package ch02;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame{
	
	//어댑터 패턴 -> 디자인 패턴의 일종
	//마우스리스너 >>5개나됨 다안씀 ,내가 쓰는 메서드의 하나만 만들어서 쓰는 것
	 
	
	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("어댑터 클래스 이용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
	}
	private void setInitLayout() {
		setVisible(true);
	}
	private void addEventListener() {
		this.addMouseListener(new MyMouseListener());
	}
	//추상클래스는 new 키워드를 사용할 수 없다. --> 클래스의 타입으로만 존재한다.
	//어댑터 패턴이란 추상메서드를 다 구현하고 (일반 메서드로 다 변환) {단, 메서드의 바디 부분을 비워놓음}
	//내부 클래스 생성
	//마우스 어댑터는 일반메서드만 존재하기 때문에 추상메서드가 없는 상태
	private class MyMouseListener extends MouseAdapter{
		//메서드 재정의
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("x좌표값 : " + x);
			System.out.println("y좌표값 : " + y);
		
		}
	} 
	
	//main function
	public static void main(String[] args) {
		new MyFrame6();
	}//end of main
}//end of class
