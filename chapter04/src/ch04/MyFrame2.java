package ch04;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class MyFrame2 extends JFrame {
	
	JPanel JPanel1;
	JPanel JPanel2;
	JButton button1;
	JButton button2;
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("패널연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel1 = new JPanel();
		JPanel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2,1));
		add(JPanel1);
		add(JPanel2);
		
		JPanel1.setBackground(Color.yellow);
		JPanel2.setBackground(Color.blue);
		
		JPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JPanel1.add(button1);
		JPanel2.add(button2);
		
	}
	public static void main(String[] args) {
		new MyFrame2();
	}
}



















