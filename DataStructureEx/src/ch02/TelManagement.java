package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {
 
	// �߰� static insert
	public static void insert(HashMap < String, Phone > map) {
		Phone phone;

		String name, address, telephone;

		Scanner s = new Scanner(System.in);
		System.out.println("�̸� >> :");
		name = s.next();
		System.out.println("�ּ� >> :");
		address = s.next();
		System.out.println("��ȭ��ȣ >> :");
		telephone = s.next();
		
		phone = new Phone(name, address, telephone);

		map.put(phone.name, phone);
		System.out.println("����� �Ϸ�");
	}
	// ����
	public static void delete(HashMap < String, Phone > map) {
		//key�� �̸��� �Է� �޾Ƽ� ���
		String delName;
		
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� >>");
		delName = s.next();
		if(map.containsKey(delName)) {
			//����
			map.remove(delName);
			System.out.println(delName + "�� ��ϵ��� ���� ����Դϴ�.");
		}
		
	}
	// ã��
	public static void search(HashMap < String, Phone > map) {
		//key �̸��� �Է� �޾Ƽ� ã�� ȭ�鿡 ���� �ּ���
		String searchName;
		
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� >>");
		searchName = s.next();
		if(map.containsKey(searchName)) {
			System.out.println(searchName + map.get(searchName).address);
		}else {
			System.out.println(searchName + "�� ��ϵ��� ���� ����Դϴ�.");
		}
	}

	// ��ü����
	public static void showInfo(HashMap < String, Phone > map) {
		//ȭ�鿡 ��ü ������ �ѷ� �ִ� ����� ����� �ּ���
		
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
		
		//�ӽ� ������ ��������
		map.put("ȫ�浿", new Phone("ȫ�浿", "�λ��","010-1111-1111"));
		map.put("�̼���", new Phone("�̼���", "�λ��2","010-2222-2222"));
		

		//�޼��� �̿��غ���
//		insert(map);
//		delete(map);
//		search(map);
//		showInfo(map);
		
		//���࿡ �帧 ����� ����

		System.out.println("----------------");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("----------------");
		
		
		//��ĳ�� �̿��ؼ�
		
		int menu;
			
		while(true) {
			System.out.println("�߰� 0, ���� 1, ã�� 2, ��ü����� 3, ���� 4");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
//		System.out.println("========================");
//		System.out.println(map);
		
	}// end of main

}// end of class
