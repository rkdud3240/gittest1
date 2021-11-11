package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {
 
	// 추가 static insert
	public static void insert(HashMap < String, Phone > map) {
		Phone phone;

		String name, address, telephone;

		Scanner s = new Scanner(System.in);
		System.out.println("이름 >> :");
		name = s.next();
		System.out.println("주소 >> :");
		address = s.next();
		System.out.println("전화번호 >> :");
		telephone = s.next();
		
		phone = new Phone(name, address, telephone);

		map.put(phone.name, phone);
		System.out.println("등록이 완료");
	}
	// 삭제
	public static void delete(HashMap < String, Phone > map) {
		//key는 이름을 입력 받아서 사용
		String delName;
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름 >>");
		delName = s.next();
		if(map.containsKey(delName)) {
			//삭제
			map.remove(delName);
			System.out.println(delName + "은 등록되지 않은 사람입니다.");
		}
		
	}
	// 찾기
	public static void search(HashMap < String, Phone > map) {
		//key 이름을 입력 받아서 찾고 화면에 보여 주세요
		String searchName;
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름 >>");
		searchName = s.next();
		if(map.containsKey(searchName)) {
			System.out.println(searchName + map.get(searchName).address);
		}else {
			System.out.println(searchName + "은 등록되지 않은 사람입니다.");
		}
	}

	// 전체보기
	public static void showInfo(HashMap < String, Phone > map) {
		//화면에 전체 정보를 뿌려 주는 기능을 만들어 주세요
		
		Set<String> names = map.keySet();
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println(name + " " + person.telephone);
		}
	}

	public static void main(String[] args) {
		
		HashMap < String, Phone > map = new HashMap<String, Phone>();
		
		//임시 데이터 만들어놓기
		map.put("홍길동", new Phone("홍길동", "부산시","010-1111-1111"));
		map.put("이순신", new Phone("이순신", "부산시2","010-2222-2222"));
		

		//메서드 이용해보기
//		insert(map);
//		delete(map);
//		search(map);
//		showInfo(map);
		
		//실행에 흐름 만들어 보기

		System.out.println("----------------");
		System.out.println("전화번호 관리 프로그램");
		System.out.println("----------------");
		
		
		//스캐너 이용해서
		
		int menu;
			
		while(true) {
			System.out.println("추가 0, 삭제 1, 찾기 2, 전체보기는 3, 종료 4");
			Scanner s = new Scanner(System.in);
			menu = s.nextInt();
			
			switch (menu) {
			case 0:
				insert(map);
				break;
			case 1:
				delete(map);
				break;
			case 2:
				search(map);
				break;
			case 3:
				showInfo(map);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
				break;
			}
		}
//		System.out.println("========================");
//		System.out.println(map);
		
	}// end of main

}// end of class
