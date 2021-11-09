//package ch01;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//import javax.swing.JButton;
//import javax.swing.JPanel;
//
//public class ColorChangeFrame extends SuperMyFrame implements ActionListener {
//
//	BorderLayout borderLayout;
//	JPanel panel1;
//	JPanel panel2;
//
//	// 기본
////	JButton button1;
////	JButton button2;
////	JButton button3;
////	JButton button4;
////	JButton button5;
////	JButton button6;
////	JButton button7;
//	// 배열
////	JButton[] buttons = new JButton[7];
//	// 배열리스트
//	final int BUTTONS_SIZE = 7;
//	  //static
//	ArrayList<JButton> buttons = new ArrayList<>();//선언과 초기화 동시에 
//
//	// for문 시 이용
//	Color[] colors = new Color[7];
//
//	public ColorChangeFrame() {
//		initData();
//		setInitLayout();
//		addEventListener();
//	}
//
//	@Override
//	protected void initData() {
//
//		super.initData();
//		setTitle("이벤트 리스너 연습 3");
//		setSize(600, 500);
//		borderLayout = new BorderLayout();
//
//		panel1 = new JPanel();
//		panel2 = new JPanel();
//		// 기본
////		button1 = new JButton("red"); 
////		button2 = new JButton("orange"); 
////		button3 = new JButton("yellow"); 
////		button4 = new JButton("green"); 
////		button5 = new JButton("cyan"); 
////		button6 = new JButton("blue"); 
////		button7 = new JButton("magenta"); 
//		// 배열
////		buttons[0] = new JButton("red"); 
////		buttons[1] = new JButton("orange"); 
////		buttons[2] = new JButton("yellow"); 
////		buttons[3] = new JButton("green"); 
////		buttons[4] = new JButton("cyan"); 
////		buttons[5] = new JButton("blue"); 
////		buttons[6] = new JButton("magenta"); 
//		//color 배열
//
//		// for
//	 for (int i = 0; i < BUTTONS_SIZE; i++) {
//		
//	}
//	}
//
//	@Override
//	protected void setInitLayout() {
//		super.setInitLayout();
//		setLayout(borderLayout);
//		panel1.setBackground(Color.gray);
//		panel1.setPreferredSize(new Dimension(500, 400));
//		add(panel1, BorderLayout.NORTH);
//
//		panel2.setBackground(Color.white);
//		panel2.setLayout(new FlowLayout());
//		panel2.setPreferredSize(new Dimension(500, 100));
//		add(panel2);
//		//기본
////		panel2.add(button1);
////		panel2.add(button2);
////		panel2.add(button3);
////		panel2.add(button4);
////		panel2.add(button5);
////		panel2.add(button6);
////		panel2.add(button7);
//		// 배열
////		panel2.add(buttons[0]);
////		panel2.add(buttons[1]);
////		panel2.add(buttons[2]);
////		panel2.add(buttons[3]);
////		panel2.add(buttons[4]);
////		panel2.add(buttons[5]);
////		panel2.add(buttons[6]);
//		// for
////		for (int i = 0; i < colors.length; i++) {
////			panel2.add(buttons.get(i));
//	}
//
//	@Override
//	protected void addEventListener() {
//		super.addEventListener();
////		button1.addActionListener(this);
////		button2.addActionListener(this);
////		button3.addActionListener(this);
////		button4.addActionListener(this);
////		button5.addActionListener(this);
////		button6.addActionListener(this);
////		button7.addActionListener(this);
//		// 배열
////		buttons[0].addActionListener(this);
////		buttons[1].addActionListener(this);
////		buttons[2].addActionListener(this);
////		buttons[3].addActionListener(this);
////		buttons[4].addActionListener(this);
////		buttons[5].addActionListener(this);
////		buttons[6].addActionListener(this);
//		// for
//		for (int i = 0; i < BUTTONS_SIZE; i++) {
//			buttons.get(i).addActionListener(this);
//		}
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// 1번 버튼이 눌러졌으면 panel1의 색상을 빨간색으로 변경
//		// 2번 버튼이 눌러졌으면 panel2의 색상을 노란색으로 변경
//		JButton clickedButton = (JButton) e.getSource();
////		if(clickedButton.getText().equals(button1.getText())){
////		if(clickedButton == button1) { 
////			panel1.setBackground(Color.red);
////		}else if(clickedButton == button2)  {	
////			panel1.setBackground(Color.orange);
////		}else if(clickedButton == button3)  {	
////			panel1.setBackground(Color.yellow);
////		}else if(clickedButton == button4)  {	
////			panel1.setBackground(Color.green);
////		}else if(clickedButton == button5)  {	
////			panel1.setBackground(Color.cyan);
////		}else if(clickedButton == button6)  {	
////			panel1.setBackground(Color.blue);
////		}else {	
////			panel1.setBackground(Color.magenta);
////		}
////	}
//		// 배열
////		if(clickedButton == buttons[0]) { 
////			panel1.setBackground(Color.red);
////		}else if(clickedButton == buttons[1])  {	
////			panel1.setBackground(Color.orange);
////		}else if(clickedButton == buttons[2])  {	
////			panel1.setBackground(Color.yellow);
////		}else if(clickedButton == buttons[3])  {	
////			panel1.setBackground(Color.green);
////		}else if(clickedButton == buttons[4])  {	
////			panel1.setBackground(Color.cyan);
////		}else if(clickedButton == buttons[5])  {	
////			panel1.setBackground(Color.blue);
////		}else {	
////			panel1.setBackground(Color.magenta);
////		}
//		// for
//		if(clickedButton == button[0]) { 
//			panel1.setBackground(Color.red);
//		}else if(clickedButton == buttons[1])  {	
//			panel1.setBackground(Color.orange);
//		}else if(clickedButton == buttons[2])  {	
//			panel1.setBackground(Color.yellow);
//		}else if(clickedButton == buttons[3])  {	
//			panel1.setBackground(Color.green);
//		}else if(clickedButton == buttons[4])  {	
//			panel1.setBackground(Color.cyan);
//		}else if(clickedButton == buttons[5])  {	
//			panel1.setBackground(Color.blue);
//		}else {	
//			panel1.setBackground(Color.magenta);
//		}
//	}
//
//	public static void main(String[] args) {
//		new ColorChangeFrame();
//	}
//}
