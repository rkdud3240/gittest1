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
		setTitle("�̹��� ��׶��� ���� 2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
//			imageIcon1 = ImageIO.read(new File("among2.png"));
		} catch (Exception e) {
			System.err.println("������ �����ϴ�.");
			System.exit(0);//���α׷��� �˾Ƽ� �����Ű�� ��ɾ�
		}
		
		imagePanel = new MyImagePanel();
		
	}
	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);//ũ�⸦ ���̰ų� �ø��� ���ϰ� ���� �ڵ�
		this.add(imagePanel);
	}
	private void addEventListener() {
							//�͸� ���� ��ü
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//���׿����ڷ� ����ؼ� �ڵ带 �ۼ����ּ���
				// ���ǽ� ? ���1 : ���2; 
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
				
				//switch-case������ ����
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
					System.out.println("����");
			}
				repaint();

			}// end of KeyPressed
		});
	}
	
	//���� Ŭ���� ����
	private class MyImagePanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);
		}
	}

}//end of class
