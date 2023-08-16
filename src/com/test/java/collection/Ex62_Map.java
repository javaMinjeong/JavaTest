package com.test.java.collection;

import java.util.HashMap;
import java.util.Set;

public class Ex62_Map {

	public static void main(String[] args) {
		
		/*
			ArrayList
			- 요소 접근 > 첨자(index) 사용
			- 순서가 있는 데이터 집합(방번호 == 요소의 순서)
			ex) 강의실 6개 > 1강의실, 2강의실, 3강의실.. 6강의실
			- 스칼라 배열(Scalar Array)
			- 요소 일관 접근 > 루프(for)
			- 요소끼리 구분이 힘들다 > 방번호 > 의미가 없다
			- 첨자(index)는 유일하다.
			- 값(value)은 중복이 가능하다. > 방번호가 유일해서..
			
			HashMap
			- 요소 접근 > 키(Key) 사용
			- 순서가 없는 데이터 집합(방 번호X)
			ex) 강의실 6개 > 햇님반, 달님반, 별님반.. 지구반 ( 여기서 이름 '햇님, 달님'을 키(Key)라고 부름)
			- 키(Key) -> 값(value)
			- 맵(Map), 딕셔너리(Dictionary) = 사전 구조
				ex) blue(키) > 파란 색상을 나타내는 말(값)
			- 연관 배열	
			- 요소 일관 접근 > 불가능
			- 요소끼리 구분이 용이하다. > 식별자(key) > 방의 의미 > 가독성
			- 키(key)는 유일하다.
			- 값(value)은 중복이 가능하다. > 키가 유일해서..
		*/

		//타입 변수가 2개
		//String - key 자료형 > 방이름
		//Integer - value 자료형 > 데이터
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//1. 요소 추가
		// - V put(K key, V value)
		map.put("국어", 100); // int 국어 = 100 방이름은 '변수명' 이라고 생각해도 됨!
		map.put("영어", 90);
		map.put("수학", 80);
		
		//2. 요소 개수
		// - int size()
		System.out.println(map.size()); //3
		
		//3. 요소 읽기
		// - V get(K key)
		System.out.println(map.get("국어")); //100
		System.out.println(map.get("영어")); //90
		System.out.println(map.get("수학")); //80
		
		//4. 일괄 탐색 > 불가능 > 존재O
		
		//5. 요소 수정
		// - V put(K key, V value)
		map.put("국어", 95); //추가(X), 수정(O) > 이유? 키는 유일하기 때문에 덮어쓰기 개념
		
		System.out.println(map.get("국어"));
		
		//6. 요소 검색
		// - boolean containsKey(K key)
		// - boolean containsValue(V value)
		// - indexOf() 없는 이유? > index 無
		
		System.out.println(map.containsKey("국어")); //배열안에 국어 점수가 있니?
		System.out.println(map.containsKey("국사")); //배열안에 국사 점수가 있니?
		
		//map 계열은 없는 키를 요구하면 null을 반환
		System.out.println(map.get("국사"));
		
		System.out.println(map.containsValue(90)); //90점 맞은 과목이 있니?
		System.out.println(map.containsValue(100));
		
		//7. 요소 삭제
		// - V remove(K key)
		map.remove("국어");
		
		//없어졌는지 확인 하는 방법 > size를 찍어보거나, 없는키를 반환해서 null값이 나오는지 확인
		System.out.println(map.size()); //2
		System.out.println(map.get("국어")); //null
		
		//8. 초기화
		map.clear();
		
		System.out.println(map.size()); //0
		
		
		//루프 돌리는 방법(map은 방번호가 없기 때문에 for문을 못 돌림)
		map.put("국어", 100);
		map.put("영어", 90);
		map.put("수학", 80);
		
		//Set이 루프를 돌릴 수 있는 자료구조!
		Set<String> set = map.keySet();
		
		System.out.println(set); //[국어, 수학, 영어]
		
		for (String key : set) {
			System.out.println(key + ":" + map.get(key));
		}
		
		//Hash는 순서가 없음!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!순서에 집착하지 마시오! 그려러니~~
		//순서가 중요하다면 애초에 Hash Map을 쓰면 안됨! > ArrayList 써야함! > ArrayList는 순서가 있는 집합이니까~!
		
		
		//교실
		HashMap<String,String> list = new HashMap<String,String>();
		
		list.put("반장", "홍길동");
		list.put("부반장", "아무개");
		list.put("미화부장", "하하하");
		
		//ArrayList와 HashMap은 두개가 완전히 다른 성질의 컬렉션 > 각 성질에 맞춰서 사용하면 됨~!
		//주말에 공부할때 위 두개 위주로 공부하시오!!!
		
		
	}//main
}//class
