package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{

	//�迭�� ����ؼ� �������ּ���
//	private JButton[] buttons = new JButton[6];
	
	//ArrayList�� �������ּ���
	//�����ذ� �ɷ�  C R U D
	//���� �� ������� <---
	//1. �������
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	//2. ���� �߰��ϴ� ���
 	//3. ���� ����ϴ� ���
	
//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;	

	final int JBUTTONS_SIZE = 16;

	public MyFrame2() {
		initData();
		setInitLayout();
	}
	 
	private void initData() {
		
		setTitle("Flow Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT,1,10));//��ġ������

		//�⺻ �迭
//		buttons[0] = new JButton("1��° ��ư");
//		buttons[1] = new JButton("2��° ��ư");
//		buttons[2] = new JButton("3��° ��ư");
//		buttons[3] = new JButton("4��° ��ư");
//		buttons[4] = new JButton("5��° ��ư");
//		buttons[5] = new JButton("6��° ��ư");
		
		//ArrayList�� ����ϴ� ���
//		buttons.add(new JButton("1��° ��ư"));
//		buttons.add(new JButton("2��° ��ư"));
//		buttons.add(new JButton("3��° ��ư"));
//		buttons.add(new JButton("4��° ��ư"));
//		buttons.add(new JButton("5��° ��ư"));
//		buttons.add(new JButton("6��° ��ư"));
		
		//for�� ����
		//ArrayList�� ó�� ����� 0�Դϴ�.
		for (int i = 0; i < JBUTTONS_SIZE; i++) {
			System.out.println("i" + i);
			buttons.add( new JButton((i+1)+"��° ��ư"));
		}
		
		//for�� ����
//		for (int i = 0; i < buttons.length; i++) {
//			buttons[i] = new JButton("��ư" + (i+1));
//		}
	
//		button2 = new JButton("2��° ��ư");
//		button3 = new JButton("3��° ��ư");
//		button4 = new JButton("4��° ��ư");
//		button5 = new JButton("5��° ��ư");
//		button6 = new JButton("6��° ��ư");
	}//end of initData
	
	private void setInitLayout() {
		setVisible(true);
		//�⺻�迭
//		add(buttons[0]);
//		add(buttons[1]);
//		add(buttons[2]);
//		add(buttons[3]);
//		add(buttons[4]);
//		add(buttons[5]);
		
		//for�� ����
//		for (int i = 0; i < buttons.length; i++) {
//			add(buttons[i]);
//		}
//		add(button1);
//		add(button2);
//		add(button3);
//		add(button4);
//		add(button5);
//		add(button6);
		
		//for�� ����
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));
		}
//		add(buttons.get(0));
//		add(buttons.get(1));
//		add(buttons.get(2));
//		add(buttons.get(3));
//		add(buttons.get(4));
//		add(buttons.get(5));

	}//end of setInitLayout
}//end of MyFrame2

public class FlowLayoutEx {

	public static void main(String[] args) {
		
		new MyFrame2();
	}
}
