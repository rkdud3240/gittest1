package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame{
	
//	Icon ic = new ImageIcon("sdf.gif");
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;
	int Point = 200;
//	URL url = getClass().getResource("sdf.gif");
	
	
	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
//		ic = new ImageIcon(ic);
//		this.getContentPane().add(icon);
	}
	private void initData() {
		setTitle("이미지 백그라운드 연습 2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
//			imageIcon1 = ImageIO.read(new File("among2.png"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);//프로그램을 알아서 종료시키는 명령어
		}
		
		imagePanel = new MyImagePanel();
		
	}
	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);//크기를 줄이거나 늘리지 못하게 막는 코드
		this.add(imagePanel);
	}
	private void addEventListener() {
							//익명 구현 객체
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//삼항연산자로 사용해서 코드를 작성해주세요
				// 조건식 ? 결과1 : 결과2; 
				int keyCode = e. getKeyCode();
//				if(keyCode == KeyEvent.VK_UP) {
//					yPoint = (yPoint < -10)? 0 : yPoint - 10;
//					System.out.println("yPoint : " + yPoint);
//				}else if (keyCode == KeyEvent.VK_DOWN) {
//					yPoint = (yPoint > 390)? 390 : yPoint + 10;
//					System.out.println("yPoint : " + yPoint);
//				}else if (keyCode == KeyEvent.VK_LEFT) {
//					xPoint = (xPoint < -10)? 0 : xPoint - 10;
//					System.out.println("xPoint : " + xPoint);
//				}else if (keyCode == KeyEvent.VK_RIGHT) {
//					xPoint = (xPoint > 410)? 410 : xPoint + 10;
//					System.out.println("xPoint : " + xPoint);
//				}
//				repaint();
				
				//switch-case문으로 변경
				xPoint -= 10;
				yPoint -= 10;
				switch(xPoint){
				case -10:
					System.out.println("xPoint : " + xPoint);
					break;
				case 400 :
					System.out.println("Point : " + Point);
					break;
				default:
					System.out.println("실패");
			}
				repaint();

			}// end of KeyPressed
		});
	}
	
	//내부 클래스 생성
	private class MyImagePanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);
		}
	}

}//end of class
