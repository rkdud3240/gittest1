package ch01;
//콜백메서드를 직접 만들 줄 알아야 한다.

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//인터페이스를 선언한다.
interface CallbackBtnAction {
	public abstract void clickedAddBtn();
	//매개변수로 값 전달 가능
	public abstract void passValue(int value);
	
	public void clickedMinusBtn();
	public void clickedOneBtn();
	public void clickedTwoBtn();
	public void clickedThreeBtn();
	// 메서드 3개 추가 생성

}// end of interface

//콜백 받는 객체 : CallbackBtnAction 인터페이스를 구현해서 메서드를 정의 한다.
class MainActivity extends JFrame implements CallbackBtnAction {

	int count;
	JLabel label;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void clickedAddBtn() {
		// 콜백 되어지는 메서드 :
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("마이너스 콜백 받았습니다.");
		count--;
		label.setText(count + "");
	}

	@Override
	public void clickedOneBtn() {
		System.out.println("+1 콜백 받았습니다.");
		count *= 2;
		label.setText(count + "");
	}

	@Override
	public void clickedTwoBtn() {
		System.out.println("-2 콜백 받았습니다.");
		count -= 2;
		label.setText(count + "");
	}

	@Override
	public void clickedThreeBtn() {
		System.out.println("+3 콜백 받았습니다.");
		count += 3;
		label.setText(count + "");
	}


	@Override
	public void passValue(int value) {
		System.out.println("value 값 전달 받음 : " + value);
		label.setText(count+"");
		
	}

}// end of MainActivity

//콜리(호출자) : 콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출되었다고 알릴 수 있다. !!
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	JButton btnOne;
	JButton btnTwo;
	JButton btnThree;
	// 문제 1 버튼 3개 생성
	
	JButton btnPassValue;

	// 1. 멤버변수로 선언을 해준다.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요!!
		this.callbackBtnAction = callbackBtnAction;

		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("뺴기 버튼");
		btnOne = new JButton("2씩 곱하기 버튼");
		btnTwo = new JButton("2씩 뺴기 버튼");
		btnThree = new JButton("3씩 더하기 버튼");
		btnPassValue = new  JButton("값 전달버튼");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(btnAdd);
		add(btnMinus);
		add(btnOne);
		add(btnTwo);
		add(btnThree);
		add(btnPassValue);
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		btnThree.addActionListener(this);
		btnPassValue.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("더하기 버튼이 클릭 되었습니다.");

		// 1. 버튼 구분
		JButton targetBtn = (JButton) e.getSource();

//		if (targetBtn == btnAdd) {
//			// 더하기 버튼
//			callbackBtnAction.clickedAddBtn();
//		} else if (targetBtn == btnMinus){
//			// 빼기 버튼
//			callbackBtnAction.clickedMinusBtn();
//		}else if (targetBtn == btnOne){
//			// 빼기 버튼
//			callbackBtnAction.clickedOneBtn();
//		}else if (targetBtn == btnTwo){
//			// 빼기 버튼
//			callbackBtnAction.clickedTwoBtn();
//		}else  if (targetBtn == btnThree){
//			callbackBtnAction.clickedThreeBtn();
//		}
		if (targetBtn == btnAdd) {
		// 더하기 버튼
		callbackBtnAction.clickedAddBtn();
		} else if (targetBtn == btnMinus){
		// 빼기 버튼
		callbackBtnAction.clickedMinusBtn();
		}else if (targetBtn == btnPassValue){
		// 빼기 버튼
		callbackBtnAction.passValue(100);
						//alt shift R -> 메서드 이름 바꾸기 !중복되는 경우가 없을 경우에만
		}
	}
}

public class CallbackTest {

	public static void main(String[] args) {

		MainActivity mainactivity = new MainActivity();
		new SubActivity(mainactivity);
	}
}
