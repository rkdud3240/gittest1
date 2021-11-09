package ch03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame implements ActionListener {

	BufferedImage backgroundImage;
	BufferedImage amongimage1;
	BufferedImage amongimage2;
	CustomJPanel customJPanel;

	//
	BorderLayout borderLayout;
	JPanel bottomPanel;
	JButton btnstart;
	JButton btnstop;
	boolean isOn = true;

	// thread 사용할 이미지
	int among1XPoint = 0;
	int among1YPoint = 370;

	int among2XPoint = 200;
	int among2YPoint = 200;

	public MiniAmongUs() {
		initData();
		setInitLayout();

		// 스레드 동작 시작
		Thread thread = new Thread(customJPanel);
		thread.start();
		addEventListener();
	}

	private void initData() {
		setTitle("어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			amongimage1 = ImageIO.read(new File("among1.png"));
			amongimage2 = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		customJPanel = new CustomJPanel();
		borderLayout = new BorderLayout();
		bottomPanel = new JPanel();
		btnstart = new JButton("start");
		btnstop = new JButton("stop");
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);// 이미지 늘어나지 않게
		this.setLayout(borderLayout);

		this.add(customJPanel, BorderLayout.CENTER);
		this.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		bottomPanel.add(btnstart);
		bottomPanel.add(btnstop);
	}

	private void addEventListener() {

		btnstart.addActionListener(this);
		btnstop.addActionListener(this);

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				System.out.println(code);
				switch (code) {
				case KeyEvent.VK_UP:
					among2YPoint -= 10;
					break;
				case KeyEvent.VK_DOWN:
					among2YPoint += 10;
					break;
				case KeyEvent.VK_LEFT:
					among2XPoint -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					among2XPoint += 10;
					break;
				default:
					break;
				}
				repaint();
			}
		});
	}

	// 내부 클래스 생성
	private class CustomJPanel extends JPanel implements Runnable {

		@Override
		protected void paintComponent(Graphics g) {
			// Components x Componet o
			super.paintComponent(g);// 먼저 있어야함
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(amongimage1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(amongimage2, among2XPoint, among2YPoint, 100, 100, null);
		}

		@Override
		public void run() {
			// 2. 변수를 새롭게 활용해서 while 문을 멈추거나 다시 시작할 수 있게 코드를 수정합니다.
			boolean isRight = true;

			while (true) {

				if (isOn) {
					if (isRight) {
						among1XPoint += 10;
					} else {
						among1XPoint -= 10;
					}
					if (among1XPoint == 400) {
						isRight = false;
					}
					if (among1XPoint == 0) {
						isRight = true;
					}

					// 이미지 1 과 이미지 2와 좌표값이 x, y일치한다면 이미지 2를 없애라
					if ((among1XPoint == among2XPoint) && (among1YPoint == among2YPoint)) {
						amongimage2 = null;
					}

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				repaint();
			} // end of while

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 1. 버튼이 start , stop 인지 구분해 주세요
		JButton button = (JButton) e.getSource();
		if (button == btnstart) {
			System.out.println("시작버튼");
			isOn = true;
		} else {
			System.out.println("종료버튼");
			isOn = false;
		}

		

	}
}

public class MainTest1 {

	public static void main(String[] args) {

		new MiniAmongUs();
	}
}
