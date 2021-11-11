package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//콜리 : 콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출되었다고 알릴 수 있다. !!
public class SubActivityEx1 extends JFrame implements ActionListener{

	JButton btnAdd;
	JButton Mbtn;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	JButton btnPassValue;
	
	//1.멤버변수로 선언해 준다.
	CallBackBtn2 callbackbtn2;
	
	public SubActivityEx1(CallBackBtn2 callbackbtn2) {
		//!중요
		this.callbackbtn2 = callbackbtn2;
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("더하기 버튼");
		Mbtn = new JButton("뺴기 버튼");
		btn1 = new JButton("2씩 곱하기 버튼");
		btn2 = new JButton("2씩 뺴기 버튼");
		btn3 = new JButton("3씩 더하기 버튼");
		btnPassValue = new  JButton("값 전달버튼");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(btnAdd);
		add(Mbtn);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btnPassValue);
		btnAdd.addActionListener(this);
		Mbtn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btnPassValue.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		
	}
}