package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DataStructureTest2 {

	public static void main(String[] args) {
		
		Set set0;
		//������ ����. �ߺ��� �Ұ�
		//HashSet ���� ���� ���
		
		HashSet <Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(1);//�ߺ���
		set1.add(2);
		set1.add(3);
		set1.add(3);//�ߺ���
		
		System.out.println("set1 : " + set1);
		
		//size ��
		System.out.println("������ Ȯ�� : " + set1.size());
		
		//����
		set1.remove(1);
//		set1.clear();
		System.out.println(set1);
		
//		for (int i = 0; i < set1.size(); i++) {
//			System.out.println("set1 �� Ȯ�� : " + i);
//		}
		
		//while�� ��� ���
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("�� Ȯ�� : " + iter.next());
		}
		
		//���ο� ���� �ִ� �� Ȯ��
		System.out.println(set1.contains(1));
		System.out.println(set1.contains(3));
		
		
		HashSet<Integer> set2 = new HashSet<>();
		
		// set2. ����� 6���� �Ϸ�
		//�ƴϸ� �ѹ� �� ����
		//��
//		while(set2.size() < 6) {
//			set2.add(getRandomNumber());
//		}
		//�����
		boolean flag = true;
		
		while(flag) {
			set2.add(getRandomNumber());
			if(set2.size() == 6) {
				flag = false;
		}
	}
		System.out.println(set2);
		System.out.println(set2.size());
		
	}//end of main
	
	public static int getRandomNumber() {
		
		Random random = new Random();
		int value = random.nextInt(45)+1;
		return value;
	}
	
}//end of class
