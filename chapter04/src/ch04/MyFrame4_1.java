package ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame4_1 extends JFrame{

	BufferedImage backgroundImage;
	MyImagePanel myImagePanel;
//	BufferedImage imageIcon;
//	BufferedImage imageIcon2;
//	BufferedImage imageIcon3;
//	BufferedImage imageIcon4;
//	BufferedImage imageIcon5;
	//3개 이상 만들어서 화면에 올려주세요
	//반복적인 부분 보이면 배열, 어레이 리스트 사용, for문
	
	//배열
	BufferedImage[] imageIcons = new BufferedImage[5];
	
	//ArrayList 사용
//	ArrayList<BufferedImage> imageIcons = new ArrayList<>();
	
	//생성자
	public MyFrame4_1() {
		initData();
		setInitLayout();
	}
	//initData
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			//배열
			imageIcons[0] =  ImageIO.read(new File("star.png"));
			imageIcons[1] =  ImageIO.read(new File("earth.png"));
			imageIcons[2] =  ImageIO.read(new File("sun.png"));
			imageIcons[3] =  ImageIO.read(new File("among1.png"));
			imageIcons[4] =  ImageIO.read(new File("among2.png"));
			
			//ArrayList 배열
//			imageIcons.add(ImageIO.read(new File("star.png")));
//			imageIcons.add(ImageIO.read(new File("earth.png")));
//			imageIcons.add(ImageIO.read(new File("sun.png")));
//			imageIcons.add(ImageIO.read(new File("among1.png")));
//			imageIcons.add(ImageIO.read(new File("among2.png")));
			
			//일반
//			imageIcon =  ImageIO.read(new File("star.png"));
//			imageIcon2 =  ImageIO.read(new File("earth.png"));
//			imageIcon3 =  ImageIO.read(new File("sun.png"));
//			imageIcon4 =  ImageIO.read(new File("among1.png"));
//			imageIcon5 =  ImageIO.read(new File("among2.png"));
			
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		//myImagePanel 생성
		myImagePanel = new MyImagePanel();
		
	}
	//setInitLayout
	private void setInitLayout() {
		setVisible(true);
		add(myImagePanel);
	}
	
	private class MyImagePanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			//ArrayList
//			for (int i = 0; i < imageIcons.size(); i++) {
//				g.drawImage(imageIcons.get(i), 200, 200, 80, 80, null);
//			}
			//배열
			g.drawImage(imageIcons[0], 300, 150, 100, 100, null);
			g.drawImage(imageIcons[1], 60, 130, 150, 150, null);
			g.drawImage(imageIcons[2], 30, 50, 60, 60, null);
			g.drawImage(imageIcons[3], 200, 200, 80, 80, null);
			g.drawImage(imageIcons[4], 150, 200, 80, 80, null);
			
			//일반
//			g.drawImage(imageIcon, 300, 150, 100, 100, null);
//			g.drawImage(imageIcon2, 60, 130, 150, 150, null);
//			g.drawImage(imageIcon3, 30, 50, 60, 60, null);
//			g.drawImage(imageIcon4, 200, 200, 80, 80, null);
//			g.drawImage(imageIcon5, 150, 200, 80, 80, null);
			
		}
	}//end of inner class
	
	//메인함수
	public static void main(String[] args) {
		new MyFrame4_1();

	}//end of main
}//end of class
