package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//�ݸ� : �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� �޼��尡 ȣ��Ǿ��ٰ� �˸� �� �ִ�. !!
public class SubActivityEx1 extends JFrame implements ActionListener{

	JButton btnAdd;
	JButton Mbtn;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	JButton btnPassValue;
	
	//1.��������� ������ �ش�.
	CallBackBtn2 callbackbtn2;
	
	public SubActivityEx1(CallBackBtn2 callbackbtn2) {
		//!�߿�
		this.callbackbtn2 = callbackbtn2;
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("���ϱ� ��ư");
		Mbtn = new JButton("���� ��ư");
		btn1 = new JButton("2�� ���ϱ� ��ư");
		btn2 = new JButton("2�� ���� ��ư");
		btn3 = new JButton("3�� ���ϱ� ��ư");
		btnPassValue = new  JButton("�� ���޹�ư");
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