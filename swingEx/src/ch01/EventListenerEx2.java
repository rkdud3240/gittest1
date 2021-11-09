package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

//�������̽��� ������θ� �� ��
class MyFrame2 extends SuperMyFrame implements ActionListener {
	
	//�⺻
//	JButton button1;
//	JButton button2;
//	JButton button3;
//	JButton button4;
//	JButton button5;
	
	//����
//	JButton[] buttons = new JButton[5];
	
	//ArrayList
	ArrayList<JButton> buttons = new ArrayList<>();
	 final int BUTTONS_SIZE = 5; 
	//final�� �ҹ���
	 
	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	@Override
	protected void initData() {
		setTitle("�̺�Ʈ ������ ���� 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		//�⺻
//		button1 = new JButton("�̺�Ʈ ��ư 1");
//		button2 = new JButton("�̺�Ʈ ��ư 2");
//		button3 = new JButton("�̺�Ʈ ��ư 3");
//		button4 = new JButton("�̺�Ʈ ��ư 4");
//		button5 = new JButton("�̺�Ʈ ��ư 5");
		
		//�迭
//		buttons[0] = new JButton("�̺�Ʈ ��ư 1");
//		buttons[1] = new JButton("�̺�Ʈ ��ư 2");
//		buttons[2] = new JButton("�̺�Ʈ ��ư 3");
//		buttons[3] = new JButton("�̺�Ʈ ��ư 4");
//		buttons[4] = new JButton("�̺�Ʈ ��ư 5");
		//for�� ���� 
		for (int i = 0; i < BUTTONS_SIZE; i++) {
			buttons.add(new JButton("�̺�Ʈ ��ư"+(i+1)));
		}

	}

	@Override
	protected void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		
		//�⺻
//		add(button1);
//		add(button2);
//		add(button3);
//		add(button4);
//		add(button5);
		
		//�迭
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
		//�⺻
//		button1.addActionListener(this);
//		button2.addActionListener(this);
//		button3.addActionListener(this);
//		button4.addActionListener(this);
//		button5.addActionListener(this);
		//�迭
//		buttons[0].addActionListener(this);
//		buttons[1].addActionListener(this);
//		buttons[2].addActionListener(this);
//		buttons[3].addActionListener(this);
//		buttons[4].addActionListener(this);
		//for�� 
		for (int i = 0; i < BUTTONS_SIZE; i++) {
			buttons.get(i).addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("��ư�� ���������ϴ�.");
		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());
		// ���ڿ��� ���ؼ�
		// 1�� ��ư�� Ŭ���Ǿ����ϴ�.
		// 2�� ��ư�� Ŭ���Ǿ����ϴ�.
		
		//�⺻
//		if (clickedButton.getText().equals(button1.getText())) {
//			System.out.println("1�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		} else if (clickedButton.getText().equals(button2.getText())) {
//			System.out.println("2�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		} else if (clickedButton.getText().equals(button3.getText())) {
//			System.out.println("3�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		} else if (clickedButton.getText().equals(button4.getText())) {
//			System.out.println("4�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		} else {
//			System.out.println("5�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		}
		
		//�迭
//		if (clickedButton.getText().equals(buttons[0].getText())) {
//			System.out.println("1�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		} else if (clickedButton.getText().equals(buttons[1].getText())) {
//			System.out.println("2�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		} else if (clickedButton.getText().equals(buttons[2].getText())) {
//			System.out.println("3�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		} else if (clickedButton.getText().equals(buttons[3].getText())) {
//			System.out.println("4�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		} else {
//			System.out.println("5�� ��ư�� Ŭ���Ǿ����ϴ�.");
//		}
		
		//for �� ����
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
