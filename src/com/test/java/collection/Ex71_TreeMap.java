package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {

	public static void main(String[] args) {
		
		//TreeMap
		// - Tree > 이진 탐색 트리 > 자동 정렬
		// - Map > 키+값 > 연관 배열
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("white", "흰색");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("orange", "주황");
		map.put("green", "초록");
		
		System.out.println(map); //키(a>z 순으로 정렬됨)
		System.out.println(map.size());
		System.out.println(map.get("green"));
		map.put("green", "녹색");
		System.out.println(map.get("green")); //기존 값 수정된다는 특징(중복 허용 X)
		System.out.println();
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap("m")); //키값이 m으로 시작하기 전까지의 값
		System.out.println(map.tailMap("m")); //키값이 m부터 시작하는 값
		System.out.println(map.subMap("r", "w")); //키값 r부터 w전까지(r포함, w미포함)
		System.out.println();
		
		/*
			List
			- ArrayList > 배열이 필요할 때 / 삽입, 삭제(X) *****
			- LinkedList > ArrayList 대체제 / 삽입, 삭제(O)
			- Stack > 스택 구조 필요
			- Queue > 큐 구조 필요
			- Vector > (ArrayList에게 후임 자리를 물려주고 저물어 가는 클래스..)
		
			Set
			- HashSet > 중복값 배제, 유일한 집합 *****
			- TreeSet > HashSet + 정렬 (사용빈도 거의 없음..연례 행사수준으로...있음..)
			
			Map
			- HashMap > 키/값 연관 배열이 필요할 때 *****
			- TreeMap > HashMap + 정렬
			- HashTable > (HashMap에게 후임 자리를 물려주고 저물어 가는...Vector와 유사한 입지)
			
			그 어디에도 속하지 않는 Collection
			- Properties > JSON, XML로 많이 대체가 됨..! (가끔 쓰긴 씀!)
			
			도구는 도구일 뿐!! 날마다 모든 업무에 쓰일거란 보장은 없다!
		*/
		
		
		
		//Vector 구경!!해보기
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(10);
		System.out.println(list.get(0));
		
	}//main
}//class
