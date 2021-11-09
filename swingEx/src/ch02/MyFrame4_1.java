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
			setTitle("익명구현객체 사용");
			setSize(500, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			button = new JButton("이벤트 등록 후 대기");
			button2 = new JButton("이벤트 등록 후 대기2");
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
					System.out.println("버튼 클릭");
					System.out.println("추후 알아서 구분코드작성");
					
				}
			};
			//익명 구현 객체
			//일회성의 인터페이스를 익명 구현 객체로 만들어서 사용할 수 있다.
			button.addActionListener(ac);
			button2.addActionListener(ac);
			button2.addActionListener(new ActionListener() {
				
				@Override // 추상메서드를 일반 메서드로 구현했다.
				public void actionPerformed(ActionEvent e) {
					System.out.println("버튼이 클릭되었습니다.");
					
				}
			});
		}
		public static void main(String[] args) {
		MyFrame4 mf = new MyFrame4();
		mf.button.setText("안녕하세요");
		//익명클래스 (인스턴스 변수가 없기 때문에 지속적으로 접근해서 사용할 수는 없다.)
			new MyFrame4();
		}
}
