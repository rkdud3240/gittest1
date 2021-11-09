package ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	// ctrl + shift + o
	private Image image;
	private Image image2;
	//멤버변수 선언 이미지명을 받는 녀석
	
	public ImagePanel(String imageName) {
		image = new ImageIcon(imageName).getImage();
	}
	
	public ImagePanel() {
		image = new ImageIcon("images.png").getImage();
	}
	
	// paint + ctrl space
	@Override
	public void paint(Graphics g) {
		super.paint(g); // 패널의 가로 크기 만큼, 세로크기만큼
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		g.drawImage(image2, 0, 0, getWidth(), getHeight(), null);
	}
}
//////////////////////////////////////////////////////////////

public class MyFrame3 extends JFrame {

	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;
	private JButton button;
	//추가
	//수정
	public MyFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("J패널에 이미지 넣기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		imagePanel2 = new ImagePanel("images2.png");
		button = new JButton("버튼입니다.");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2,1));
		add(imagePanel);
		add(imagePanel2);
		imagePanel.add(button);
	}

	public static void main(String[] args) {
		new MyFrame3();
	}
}// end of class
