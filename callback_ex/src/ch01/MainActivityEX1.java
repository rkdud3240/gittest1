package ch01;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

//콜백 받는 객체 : CallbackBtnAction 인터페이스를 구현해서 메서드를 정의한다.
public class MainActivityEX1 extends JFrame implements CallBackBtn2{

		int count;
		JLabel label;
		
		public MainActivityEX1() {
			count = 0;
			label = new JLabel(count + "");
			setSize(500, 500);
			setVisible(true);
			setLayout(new FlowLayout());
			add(label);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
		@Override
		public void clikedAddBtn() {
			System.out.println(this.getClass().getName() + "이 콜백 받았다");
			count++;
			label.setText(count+"");
		}


		@Override
		public void passValue(int value) {
			System.out.println("value 값 전달 받음 : " + value);
			label.setText(count+"");
		}


		@Override
		public void clickedMbtn() {
			System.out.println("마이너스 콜백 받았습니다.");
			count--;
			label.setText(count + "");
		}


		@Override
		public void clickedbtn1() {
			System.out.println("+1 콜백 받았습니다.");
			count *= 2;
			label.setText(count + "");
		}


		@Override
		public void clickedbtn2() {
			System.out.println("-2 콜백 받았습니다.");
			count -= 2;
			label.setText(count + "");
		}


		@Override
		public void clickedbtn3() {
			System.out.println("+3 콜백 받았습니다.");
			count += 3;
			label.setText(count + "");
		}
		
		
}//end of MainAct~
