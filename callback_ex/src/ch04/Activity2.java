package ch04;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity2 extends JFrame{

	String name;
	JPanel panel;
	CallbackCheckPosition checkPosition;
	
	public Activity2(String name) {
		this.name = name;
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		
		setVisible(true);
		add(panel);
		panel.setBackground(Color.yellow);
		//���콺 ������ ����
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				//����� �ڵ�
				if(checkPosition != null) {
				checkPosition.checkPosition(x, y);
				}
			}
		});
	}
	
	//�޼��带 ���ؼ� �����ϱ�
	public void setCallbackCheckPosition(CallbackCheckPosition callbackcheckPosition) {
		this.checkPosition = callbackcheckPosition;
	}
}
