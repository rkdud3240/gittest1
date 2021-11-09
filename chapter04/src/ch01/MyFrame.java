package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("첫번째 GUI 프로그램 작성");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);         //클래스 이름으로 들어가니 얘는 static , 상수
	}                             //콘솔에 빨간 부분 화면창 끔과 동시에 꺼짐
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
