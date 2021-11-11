package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	int grade;

}

public class DataStructureTest1 {

	public static void main(String[] args) {

		List list0;

		// 순서가 있고(인덱스가 있다) 중복이 가능하다.

		// int의 클래스화 - 래퍼클래스 Integer
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Student> member = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<>();

		// 선언과 동시에 초기화
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

		// 값 추가 방법

		list.add(3); // index 0
		list.add(null); // index 1
		list.add(1, 10); // index 1번째에 10을 삽입 (null은 인덱스 2번으로 밀려 난다.)

		System.out.println("값 확인 : " + list);
		// 값 확인 : [3, 10, null] 원래 주소값이 나와야 하는데 잘나오는 것은 toString 메서드를 정의해서

		// 값 삭제 방법
		list.remove(2);
		System.out.println("값 삭제 확인 : " + list);

//		list.clear();
		System.out.println("값 전체 삭제 확인 : " + list);

		// 값 출력 방법
		System.out.println("값 출력 방법 : " + list.get(1));

		for (Integer i : list) {
			System.out.println("for 사용방법 : " + i);// 3 ,10 elements 요소 출력
		}

		// while 사용방법(Iterator, hasNext, .next())
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것

		Iterator<Integer> iter = list.iterator();
		// hasNext가 있으면 true, 없으면 false
		while (iter.hasNext()) {
			System.out.println("while 사용 방법 : " + iter.next());
		}

		// 값 검색 방법
		System.out.println(list.contains(1));
		// list안에 정수값 1이 있는가?
		System.out.println(list.contains(10));

		// 값이 있으면 index의 번호를 반환, 없으면 -1을 반환하는 녀석.
		System.out.println(list.indexOf(10));// 1번째 인덱스에 있다.
		System.out.println(list.indexOf(300));// 없으면 -1을 반환한다.
		System.out.println(list.indexOf(3));// 3은 0번째 인덱스에 있다.

		// 문제 1
		// 이름을 입력하면 names 리스트에 저장, while 문 반복
		// 0번 눌러서 종료 되면 화면에 입력한 이름을 뿌려 주세요
		ArrayList<String> names = new ArrayList<String>();

		// Scanner 사용
		
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String userInput = scanner.nextLine();
		
//		do {
//			
//		}while("end");
//		while(flag) {
//			userInput == names[];
//			
//			if(userInput==0) {
//				flag = false;
//			}
//		}
		 

		
		

	}// end of main

}// end of class
