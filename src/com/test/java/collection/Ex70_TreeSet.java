package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex70_TreeSet {

	public static void main(String[] args) {
		
		/*
			TreeSet
			- Tree 구조 > 이진 트리 구조(이진 탐색 트리, Binary Search Tree)
			- Set 사용법
			
			Set
			- 순서가 없다.
			- 중복값을 가지지 않는다.
			
		*/
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		set1.add(10);
		set1.add(30);
		set1.add(40);
		set1.add(20);
		set1.add(50);
		
		set2.add(10);
		set2.add(30);
		set2.add(40);
		set2.add(20);
		set2.add(50);
		
		System.out.println(set1); //HashSet
		System.out.println(set2); //TreeSet > 오름차순
		System.out.println();
		
		//---------------------------------------
		//탐색 > for / iterator
		//향상된 for문
		for (int n : set2) {
			System.out.println(n);
		}
		System.out.println();
		
		//iterator
		Iterator<Integer> iter = set2.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		//TreeSet 고유 기능 > 시작, 끝 요소 뽑아내기
		System.out.println(set2.first());
		System.out.println(set2.last());
		System.out.println();
		
		////정렬이 되어 있길래 기준값을 넣어주면 조건에 해당하는 값 출력도 가능
		System.out.println(set2.headSet(30)); //exclusive(30 미포함)
		System.out.println(set2.tailSet(30)); //inclusive(30 포함)
		System.out.println(set2.subSet(20, 40)); //첫번째 값 포함, 두번째 값 미포함 범위내 있는 데이터
		System.out.println();
		
		//------------------------
		HashSet<Integer> set3 = new HashSet<Integer>();
		
		set3.add(20);
		set3.add(50);
		set3.add(30);
		set3.add(10);
		set3.add(40);
		
		System.out.println(set3); //HashSet이라 미정렬 상태
		System.out.println();
		
		//위 HashSet 정렬 가보자고
		ArrayList<Integer> list = new ArrayList<Integer>(set3);
		System.out.println(list); //위의 HashSet이 ArrayList로 복사가 됨
		
		//이제 ArrayList sort 활용해서 정렬 해보자고
		Collections.sort(list);
		System.out.println(list);
		//----------------------------------------
		
		
		
	}//main
}//class
