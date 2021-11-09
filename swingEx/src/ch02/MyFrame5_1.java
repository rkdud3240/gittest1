package ch02;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame5_1 extends JFrame{

	JLabel label;
	
	public MyFrame5_1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("���콺 �̺�Ʈ");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("hello java ~ ");
		label.setSize(150, 50);
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		label.setLocation(12,40);
	}
	private void addEventListener() {
		this.addMouseListener(new MouseListener() {
			
			//���콺�� �������� �� ����Ǵ� �޼���
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("1111111");
				
			}
			//���콺�� �������� �� ����Ǵ� �޼���
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("2222222");
				
			}
			//���콺�� ������ ��  ����Ǵ� �޼���
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("33333333");
				
			}
			//���콺�� ������ �� ����Ǵ� �޼���
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("4444444444");
				
			}
			//���콺�� Ŭ����  �� ����Ǵ� �޼���
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("5555555555");
				System.out.println("��ǥ��X" + e.getX());
				System.out.println("��ǥ��Y" + e.getY());
				label.setLocation(e.getX(),e.getY());
			}
		});
	}
	
	//main function
	public static void main(String[] args) {
		new MyFrame5();
	}//end of main
}//end of class
