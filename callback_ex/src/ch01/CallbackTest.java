package ch01;
//�ݹ�޼��带 ���� ���� �� �˾ƾ� �Ѵ�.

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//�������̽��� �����Ѵ�.
interface CallbackBtnAction {
	public abstract void clickedAddBtn();
	//�Ű������� �� ���� ����
	public abstract void passValue(int value);
	
	public void clickedMinusBtn();
	public void clickedOneBtn();
	public void clickedTwoBtn();
	public void clickedThreeBtn();
	// �޼��� 3�� �߰� ����

}// end of interface

//�ݹ� �޴� ��ü : CallbackBtnAction �������̽��� �����ؼ� �޼��带 ���� �Ѵ�.
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
		// �ݹ� �Ǿ����� �޼��� :
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("���̳ʽ� �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count + "");
	}

	@Override
	public void clickedOneBtn() {
		System.out.println("+1 �ݹ� �޾ҽ��ϴ�.");
		count *= 2;
		label.setText(count + "");
	}

	@Override
	public void clickedTwoBtn() {
		System.out.println("-2 �ݹ� �޾ҽ��ϴ�.");
		count -= 2;
		label.setText(count + "");
	}

	@Override
	public void clickedThreeBtn() {
		System.out.println("+3 �ݹ� �޾ҽ��ϴ�.");
		count += 3;
		label.setText(count + "");
	}


	@Override
	public void passValue(int value) {
		System.out.println("value �� ���� ���� : " + value);
		label.setText(count+"");
		
	}

}// end of MainActivity

//�ݸ�(ȣ����) : �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� �޼��尡 ȣ��Ǿ��ٰ� �˸� �� �ִ�. !!
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	JButton btnOne;
	JButton btnTwo;
	JButton btnThree;
	// ���� 1 ��ư 3�� ����
	
	JButton btnPassValue;

	// 1. ��������� ������ ���ش�.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// �߿�!!
		this.callbackBtnAction = callbackBtnAction;

		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnOne = new JButton("2�� ���ϱ� ��ư");
		btnTwo = new JButton("2�� ���� ��ư");
		btnThree = new JButton("3�� ���ϱ� ��ư");
		btnPassValue = new  JButton("�� ���޹�ư");
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
//		System.out.println("���ϱ� ��ư�� Ŭ�� �Ǿ����ϴ�.");

		// 1. ��ư ����
		JButton targetBtn = (JButton) e.getSource();

//		if (targetBtn == btnAdd) {
//			// ���ϱ� ��ư
//			callbackBtnAction.clickedAddBtn();
//		} else if (targetBtn == btnMinus){
//			// ���� ��ư
//			callbackBtnAction.clickedMinusBtn();
//		}else if (targetBtn == btnOne){
//			// ���� ��ư
//			callbackBtnAction.clickedOneBtn();
//		}else if (targetBtn == btnTwo){
//			// ���� ��ư
//			callbackBtnAction.clickedTwoBtn();
//		}else  if (targetBtn == btnThree){
//			callbackBtnAction.clickedThreeBtn();
//		}
		if (targetBtn == btnAdd) {
		// ���ϱ� ��ư
		callbackBtnAction.clickedAddBtn();
		} else if (targetBtn == btnMinus){
		// ���� ��ư
		callbackBtnAction.clickedMinusBtn();
		}else if (targetBtn == btnPassValue){
		// ���� ��ư
		callbackBtnAction.passValue(100);
						//alt shift R -> �޼��� �̸� �ٲٱ� !�ߺ��Ǵ� ��찡 ���� ��쿡��
		}
	}
}

public class CallbackTest {

	public static void main(String[] args) {

		MainActivity mainactivity = new MainActivity();
		new SubActivity(mainactivity);
	}
}
