package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DataStructureTest3 {

	public static void main(String[] args) {
		//전공생은 한 학기동안 배움, 사용하는 것은 몇 가지 안됨
		
		Map map0;
		
		//key 와 value 구조로 데이터를 저장한다.
					
		HashMap<String, String> map1 = new HashMap<String, String>();
		
		//null 값을 허용하지 않는다.
		Hashtable<String, String> map2 = new Hashtable<>();
		
		map1.put("A01", "김포공항 정문");
		map1.put("A02", "김포공항 후문");
		map1.put("A03", "김포공항 로비");
		map1.put("B01", "인천공항 정문");
		map1.put("B02", "인천공항 후문");
		map1.put("B03", "인천공항 로비");
		map1.put("C01", null);
		System.out.println(map1);
		
		
//		map2.put("D01", null);
		System.out.println(map2);
		//java.lang.NullPointerException 오류
		
		//값을 출력 방법
		System.out.println("--------------------");
		System.out.println(map1.get("A01"));
		System.out.println(map1.get("A02"));
		System.out.println(map1.get("A03"));
		
		//삭제 방법
		System.out.println(map1.remove("C01"));
		System.out.println("--------------------");
//		map1.clear();//전체 삭제
		System.out.println(map1);
		
		//사이즈 확인 방법
		System.out.println(map1.size());
		
		//for 문 사용방법
		//1. java.util.Map.Entry
		for (Entry <String, String> entry : map1.entrySet()) {
			System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}
		System.out.println("--------------------");
		//2. map1.keySet()
		for (String key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}
		
	}//end of main
}//end of class
