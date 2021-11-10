package ch01;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

//�ݹ� �޴� ��ü : CallbackBtnAction �������̽��� �����ؼ� �޼��带 �����Ѵ�.
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
			System.out.println(this.getClass().getName() + "�� �ݹ� �޾Ҵ�");
			count++;
			label.setText(count+"");
		}


		@Override
		public void passValue(int value) {
			System.out.println("value �� ���� ���� : " + value);
			label.setText(count+"");
		}


		@Override
		public void clickedMbtn() {
			System.out.println("���̳ʽ� �ݹ� �޾ҽ��ϴ�.");
			count--;
			label.setText(count + "");
		}


		@Override
		public void clickedbtn1() {
			System.out.println("+1 �ݹ� �޾ҽ��ϴ�.");
			count *= 2;
			label.setText(count + "");
		}


		@Override
		public void clickedbtn2() {
			System.out.println("-2 �ݹ� �޾ҽ��ϴ�.");
			count -= 2;
			label.setText(count + "");
		}


		@Override
		public void clickedbtn3() {
			System.out.println("+3 �ݹ� �޾ҽ��ϴ�.");
			count += 3;
			label.setText(count + "");
		}
		
		
}//end of MainAct~
