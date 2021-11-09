package ch03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8_1 extends JFrame{
	
	BorderLayout borderLayout;
	FlowLayout flowLayout;
	JPanel panel;
	JButton button1; 
	JButton button2; 
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;
	
	public MyFrame8_1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderLayout = new BorderLayout();
		panel = new JPanel();
		button1 = new JButton("start");
		button2 = new JButton("stop");
		
		try {
			backgroundImage = ImageIO.read(new File("sea.png"));
			imageIcon1 = ImageIO.read(new File("fish.png"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);
		}
		imagePanel = new MyImagePanel();
	}
	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(imagePanel);
		this.add(panel, BorderLayout.SOUTH);
		panel.setBackground(Color.white);
		panel.setPreferredSize(new Dimension(500,100));
		panel.add(button1);
		panel.add(button2);
		button1.setBackground(new Color(255,255,255));
		button2.setBackground(new Color(255,255,255));
		
	}
	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode){
				case KeyEvent.VK_UP :
					yPoint = (yPoint <= -40)? 0 : yPoint - 10;
					break;
				case KeyEvent.VK_DOWN :
					yPoint = (yPoint >= 220)? 220 : yPoint + 10;
					break;
				case KeyEvent.VK_LEFT :
					xPoint = (xPoint <= -10)? -10 : xPoint - 10;
					break;
				case KeyEvent.VK_RIGHT :
					xPoint = (xPoint >= 300)? 300 : xPoint + 10;
					break;
				default: 
					break;
				}
//				if(keyCode == KeyEvent.VK_UP) {
//					yPoint = (yPoint < -40)? 0 : yPoint - 10;
//					System.out.println("yPoint : " + yPoint);
//				}else if(keyCode == KeyEvent.VK_DOWN) {
//					yPoint = (yPoint > 220)? 220 : yPoint + 10;
//					System.out.println("yPoint : " + yPoint);
//				}else if(keyCode == KeyEvent.VK_LEFT) {
//					xPoint = (xPoint < -10)? -10 : xPoint - 10;
//					System.out.println("xPoint : " + xPoint);
//				}else if(keyCode == KeyEvent.VK_RIGHT) {
//					xPoint = (xPoint > 300)? 300 : xPoint + 10;
//					System.out.println("xPoint : " + xPoint);
//				}
				repaint();
			}
		});
	}
	
	private class MyImagePanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 200, 200, null);
		}
	}
}
//다음주 do while문 사용해서 스레드 , 동기화까지
