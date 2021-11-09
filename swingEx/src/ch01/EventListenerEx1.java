package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener{
	
	JButton button;
	JButton button2;
	
	public  MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("이벤트리스너 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("button 1");
		button2 = new JButton("button 2");
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
		add(button2);
	}
	private void addEventListener() {
		button.addActionListener(this);
		button2.addActionListener(this);
	}//어떤 동작을 등록시키는 역할만 하는 
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("시스템 콜백 실행");
							//시스템 ★콜백★ - > 윈도우 운영체제에게 요청 
							//'사용자가 이 동작을 하였을 때 나에게 알려달라'인터페이스 -> 약속의 의미
		System.out.println("버튼이 클릭되었습니다.");
		System.out.println(e.toString());


	}
}

public class EventListenerEx1 {

	public static void main(String[] args) {
		new MyFrame1();
		
		
	}//end of main
}//end of class
