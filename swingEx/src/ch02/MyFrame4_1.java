package ch02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4_1 extends JFrame{

		JButton button;
		JButton button2;
		public MyFrame4_1() {
			initData();
			setInitLayout();
			addEventListener();
		}
		private void initData() {
			setTitle("�͸�����ü ���");
			setSize(500, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			button = new JButton("�̺�Ʈ ��� �� ���");
			button2 = new JButton("�̺�Ʈ ��� �� ���2");
		}
		private void setInitLayout() {
			setVisible(true);
			add(button, BorderLayout.NORTH);
			add(button2, BorderLayout.SOUTH);
		}
		private void addEventListener() {
			ActionListener ac = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("��ư Ŭ��");
					System.out.println("���� �˾Ƽ� �����ڵ��ۼ�");
					
				}
			};
			//�͸� ���� ��ü
			//��ȸ���� �������̽��� �͸� ���� ��ü�� ���� ����� �� �ִ�.
			button.addActionListener(ac);
			button2.addActionListener(ac);
			button2.addActionListener(new ActionListener() {
				
				@Override // �߻�޼��带 �Ϲ� �޼���� �����ߴ�.
				public void actionPerformed(ActionEvent e) {
					System.out.println("��ư�� Ŭ���Ǿ����ϴ�.");
					
				}
			});
		}
		public static void main(String[] args) {
		MyFrame4 mf = new MyFrame4();
		mf.button.setText("�ȳ��ϼ���");
		//�͸�Ŭ���� (�ν��Ͻ� ������ ���� ������ ���������� �����ؼ� ����� ���� ����.)
			new MyFrame4();
		}
}
