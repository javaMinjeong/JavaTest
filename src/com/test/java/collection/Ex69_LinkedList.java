package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex69_LinkedList {

	public static void main(String[] args) {
		
		/*
(메모리에생기는 모양)물리 구조 + 인터페이스(사용법)
			- Array + List
			- Linked + List
			- Hash + Map
			- Hash + Set
			- Tree + Map
			- Tree + Set
			
			ArrayList
			- 모든 컬렉션 중에서 요소에 접근하는 속도가 가장 빠르다.
			- 요소 삽입/삭제에 대한 비용이 많이 든다. > Shift O
			
			
			LinkedList
			- 요소에 접근 속도가 상대적으로 느리다.
			- 요소 삽입/삭제에 대한 비용이 거의 없다. > Shift X
			
			***자료구조에 대한 이해가 먼저!!!
			***List, Map, Set 차이점 면접 준비
			
		*/
		
		//m1();
		m2();
		
		
	}//main

	private static void m2() {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		long begin = 0, end = 0;
		
		//순차적으로 데이터 추가하기, Append
		System.out.println("[순차적으로 데이터 추가하기, Append]");
		
		////ArrayList 작업시간 확인
		begin = System.currentTimeMillis();
		
		for (int i=0; i<1000000; i++) {
			list1.add(i); //배열 끝에 추가하기
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		////LinkedList 작업시간 확인
		begin = System.currentTimeMillis();
		
		for (int i=0; i<1000000; i++) {
			list2.add(i); //배열 끝에 추가하기
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		System.out.println();
		
		//---------------------------------------------------------------
		//중간에 데이터 추가하기, 삽입(Insert) > Shift 발생
		
		System.out.println("[중간에 데이터 추가하기, 삽입(Insert) > Shift 발생]");
		
		////ArrayList 작업시간 확인
		begin = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list1.add(0, i); //0번 방에 삽입하기
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		////LinkedList 작업시간 확인
		begin = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list2.add(0, i); //0번 방에 삽입하기
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		System.out.println();
		
		//---------------------------------------------------------------
		//중간에 데이터 삭제하기 > Shift 발생
		System.out.println("[중간에 데이터 삭제하기 > Shift 발생]");
		
		////ArrayList 작업시간 확인
		begin = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list1.remove(0); //0번 방 삭제하기
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		////LinkedList 작업시간 확인
		begin = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list2.remove(0); //0번 방 삭제하기
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		System.out.println();
	
		//---------------------------------------------------------------
		//순차적으로 데이터 삭제하기 > 끝 ~ 첫 방으로 삭제 > Shift 불요
		System.out.println("[순차적으로 데이터 삭제하기]");
		
		////ArrayList 작업시간 확인
		begin = System.currentTimeMillis();
		
		for (int i=list1.size()-1; i>=0; i--) {
			list1.remove(i); //끝 > 시작 삭제
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		////LinkedList 작업시간 확인
		begin = System.currentTimeMillis();
		
		for (int i=list2.size()-1; i>=0; i--) {
			list2.remove(i); //끝 > 시작 삭제
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		System.out.println();
		
		
		//우리 주변에는 중간에 데이터를 추가 하는 업무보단, 순차적으로 추가하는 업무가 많기 때문에 상대적으로 ArrayList가 더 많이 쓰임!
			
	}//m2

	private static void m1() {

		//Collection(I) > List(I) > ArrayList(C), LinkedList(C)
		
		//ArrayList vs LinkedList
		// - List > 구현 > 사용법 아주 유사 > 개발자 경험(땡큐)
		// - 내부 구조가 다르다. > 사용 용도가 다르다.
		
		//LinkedList 종류
		//1. LinkedList: 일방통행
		//2. Double LinkedList: 양방향 통행
		//3. Double Circle LinkedList: 양방향 + 처음~끝 연결 > 자바의 LinkedList
		
		//배열이 모든 collection중에서 값을 찾는 속도가 가장 빠르다
		//Why? 속도가 빠름
		//ex. list[2] 의 경우 100 + 4 * 2 = 108 바로 주소를 찾아서 이동하기 때문에 빠름!!!
		//LinkedList는 모든 주소번지가 유기적으로 연결되어 있어 한번에 해당 방을 찾아갈 수 없기 때문에 ArrayList나 순수배열에 비해 속도가 느릴 수 밖에 없음!!
		//사용 용법에 따라 ArrayList 또는 LinkedList 선택해서 사용하면 됨!
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		//List에 넣기
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		//사이즈 확인
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println();
		
		//방별 값 확인
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println();

		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println();
		
		
		
		
	}//m1
}//class
