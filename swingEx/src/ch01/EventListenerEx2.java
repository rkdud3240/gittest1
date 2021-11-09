package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

//인터페이스는 기능으로만 쓸 때
class MyFrame2 extends SuperMyFrame implements ActionListener {
	
	//기본
//	JButton button1;
//	JButton button2;
//	JButton button3;
//	JButton button4;
//	JButton button5;
	
	//베열
//	JButton[] buttons = new JButton[5];
	
	//ArrayList
	ArrayList<JButton> buttons = new ArrayList<>();
	 final int BUTTONS_SIZE = 5; 
	//final은 소문자
	 
	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	@Override
	protected void initData() {
		setTitle("이벤트 리스너 연습 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		//기본
//		button1 = new JButton("이벤트 버튼 1");
//		button2 = new JButton("이벤트 버튼 2");
//		button3 = new JButton("이벤트 버튼 3");
//		button4 = new JButton("이벤트 버튼 4");
//		button5 = new JButton("이벤트 버튼 5");
		
		//배열
//		buttons[0] = new JButton("이벤트 버튼 1");
//		buttons[1] = new JButton("이벤트 버튼 2");
//		buttons[2] = new JButton("이벤트 버튼 3");
//		buttons[3] = new JButton("이벤트 버튼 4");
//		buttons[4] = new JButton("이벤트 버튼 5");
		//for문 변경 
		for (int i = 0; i < BUTTONS_SIZE; i++) {
			buttons.add(new JButton("이벤트 버튼"+(i+1)));
		}

	}

	@Override
	protected void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		
		//기본
//		add(button1);
//		add(button2);
//		add(button3);
//		add(button4);
//		add(button5);
		
		//배열
//		add(buttons[0]);
//		add(buttons[1]);
//		add(buttons[2]);
//		add(buttons[3]);
//		add(buttons[4]);
		
		//ArrayList
		for (int i = 0; i < BUTTONS_SIZE; i++) {
			add(buttons.get(i));
		}
	}

	@Override
	protected void addEventListener() {
		//기본
//		button1.addActionListener(this);
//		button2.addActionListener(this);
//		button3.addActionListener(this);
//		button4.addActionListener(this);
//		button5.addActionListener(this);
		//배열
//		buttons[0].addActionListener(this);
//		buttons[1].addActionListener(this);
//		buttons[2].addActionListener(this);
//		buttons[3].addActionListener(this);
//		buttons[4].addActionListener(this);
		//for문 
		for (int i = 0; i < BUTTONS_SIZE; i++) {
			buttons.get(i).addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼이 눌러졌습니다.");
		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());
		// 문자열을 비교해서
		// 1번 버튼이 클릭되었습니다.
		// 2번 버튼이 클릭되었습니다.
		
		//기본
//		if (clickedButton.getText().equals(button1.getText())) {
//			System.out.println("1번 버튼이 클릭되었습니다.");
//		} else if (clickedButton.getText().equals(button2.getText())) {
//			System.out.println("2번 버튼이 클릭되었습니다.");
//		} else if (clickedButton.getText().equals(button3.getText())) {
//			System.out.println("3번 버튼이 클릭되었습니다.");
//		} else if (clickedButton.getText().equals(button4.getText())) {
//			System.out.println("4번 버튼이 클릭되었습니다.");
//		} else {
//			System.out.println("5번 버튼이 클릭되었습니다.");
//		}
		
		//배열
//		if (clickedButton.getText().equals(buttons[0].getText())) {
//			System.out.println("1번 버튼이 클릭되었습니다.");
//		} else if (clickedButton.getText().equals(buttons[1].getText())) {
//			System.out.println("2번 버튼이 클릭되었습니다.");
//		} else if (clickedButton.getText().equals(buttons[2].getText())) {
//			System.out.println("3번 버튼이 클릭되었습니다.");
//		} else if (clickedButton.getText().equals(buttons[3].getText())) {
//			System.out.println("4번 버튼이 클릭되었습니다.");
//		} else {
//			System.out.println("5번 버튼이 클릭되었습니다.");
//		}
		
		//for 문 변경
//		for (int i = 0; i < buttons.length; i++) {
//			
//		}
	}
}

public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame2();
	}
}
