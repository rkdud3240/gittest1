package ch04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	Image img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ITPS\\Desktop\\html(jk)"
			+ " (2)\\images\\bg_main_bnn2.jpg");
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawString("�ȳ��ϼ���", 10, 20);
//		g.drawLine(20, 30, 100, 100);//���� �ߴ� , x�� , y��
//		g.drawRect(100, 100, 150, 150);
		g.drawLine(200, 200, 325, 30);
		g.drawLine(450, 200, 325, 30);
		g.drawRect(200, 200, 250, 250);
		g.drawRect(320, 250, 100, 200);
		g.drawImage(img, 30, 40, this);

	}
}

public class MyFrame1 extends JFrame{

	MyPanel myPanel;
	
	//������
	public MyFrame1() {
		initData();
		setInitLayout();
	}
	//�޼��� 2�� ����� �ּ���
	private void initData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}
	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
	}
	
	//���� Ŭ���� , static(���� ���� Ŭ����),(�ν��Ͻ�, ���� Ŭ����)
	static class MyPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			g.drawLine(20, 30, 100, 100);
			g.drawRect(100, 100, 150, 150);
			g.drawLine(200, 200, 325, 30);
		}
	}
	
	//�����Լ� �ۼ�
	public static void main(String[] args) {
		new MyFrame1();
	}
}//class
