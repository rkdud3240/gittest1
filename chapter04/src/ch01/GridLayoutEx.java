package ch01;

import java.awt.*;//��ü ��������
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{
	

	ArrayList<JButton> buttons = new ArrayList<>();
	private final int MAX_COUNT = 6;
	public GridLayoutEx() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("GridLatout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		for (int i = 0; i < MAX_COUNT; i++) {
			buttons.add(new JButton((i+1)+""));
		}
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 3));
								//��(rows),ĭ(cols)
		//JFrame�� ���Ѵ� 
//		add(buttons.get(0));
//		add(buttons.get(1));
//		add(buttons.get(2));
//		add(buttons.get(3));
//		add(buttons.get(4));
		//for
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));
		}
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}//end of class
