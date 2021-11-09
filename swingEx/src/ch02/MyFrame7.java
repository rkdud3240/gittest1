package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame{

	JTextArea area;
	//자료형 대문자 -> 클래스타입, 점연산자 사용가능
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}
	
	private void addEventListener() {
//		area.addKeyListener(this);//이 클래스 자체가 JFrame이자 KeyListener이기 때문이다.
		area.addKeyListener(new KeyAdapter() {
		
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					area.append("방향키" +" : ↑" + "\n");
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append("방향키" +" : ↓"+ "\n");
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append("방향키" +" : →"+ "\n");
				}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					area.append("방향키" +" : ←"+ "\n");
				}
			}
		});
	}

	//문자를 눌렀을 때 호출, 문자키에만 반응 합니다.
//	@Override
//	public void keyTyped(KeyEvent e) {
//		System.out.println("keyTyped" + e.getID());
//	}
	
	//키보드를 눌렀을 때 호출, 모든 키보드에 반응 합니다.
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed" + e.getID());
//	}
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed" + e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + "");
//		area.append(e.getKeyCode() + "\n");
		
//		if(e.getKeyCode() == KeyEvent.VK_UP) {
//			area.append("방향키" +" : ↑" + "\n");
//		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
//			area.append("방향키" +" : ↓"+ "\n");
//		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
//			area.append("방향키" +" : →"+ "\n");
//		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
//			area.append("방향키" +" : ←"+ "\n");
//		}
		//위쪽 방향키
		//아래쪽 방향키
		//좌 방향키
		//우 방향키
//	}
	//키보드를 뗐을 때 호출, 모든 키보드에 반응 합니다.
//	@Override
//	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased" + e.getID());
		
	}

