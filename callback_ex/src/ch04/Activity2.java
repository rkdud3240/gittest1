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
		//마우스 리스너 생성
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				//방어적 코드
				if(checkPosition != null) {
				checkPosition.checkPosition(x, y);
				}
			}
		});
	}
	
	//메서드를 통해서 연결하기
	public void setCallbackCheckPosition(CallbackCheckPosition callbackcheckPosition) {
		this.checkPosition = callbackcheckPosition;
	}
}
