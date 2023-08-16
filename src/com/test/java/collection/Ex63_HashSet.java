package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex63_HashSet {

	public static void main(String[] args) {
		
		/*
			1. List
				- 순서가 있는 데이터 집합
				- 첨자(방번호)
				- 데이터 중복을 허용
			
			2. Set
				- 순서가 없는 데이터 집합
				- 요소를 구분하는 식별자가 없음
				- 데이터 중복을 허용하지 않음
			
			3. Map
				- 순서가 없는 데이터 집합
				- 키 + 값
				- 데이터 중복을 허용
		
		*/
		
		
		//m1();
		//m2();
		m3();
		
		
		
	}//main

	private static void m3() {

		HashSet<String> name = new HashSet<String>();
		
		name.add("홍길동");
		name.add("홍길동");
		System.out.println(name);
		System.out.println(); //여긴 길동이가 중복값 배제되어 1번만 들어가는데 왜 아래 class에는 중복값도 동명이인으로 간주하고 2번 들어가는지~~???!!!
		
		
		//class를 만들어서 class를 set에 넣으려고 함!
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 20));
		set.add(new Person("아무개", 25));
		set.add(new Person("이순신", 23));
		
		set.add(new Person("홍길동", 20)); //set > 중복값 배제 이걸 중복값으로 볼지 안볼지? > 안 봄 > 동명이인으로 봄 >> 인스턴스끼리의 비교는 주소값비교로 보기 때문에 중복값으로 보지 않음!
		
		System.out.println(set);
		System.out.println();
		
		
		//p1과 p2를 같은 사람이라고 인식하게 수정해보자!! > 가끔씩 구현함!!
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		System.out.println(p1.equals(p2)); //false > 주소값 비교 했기 때문에 false가 나옴!! >  다른 객체쟈낭..
		
		System.out.println("p1: " + p1.hashCode()); //메모리 주소값(정확히는..아래 참고)
		System.out.println("p2: " + p2.hashCode()); //메모리 주소번지를 hash 알고리즘 돌린 값
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		
		System.out.println(s1.equals(s2)); //주소값 비교 > true
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); //상수는 동일값이 나오면 같이 사용한다.
		
		
		
		
	}

	private static void m2() {

		//중복값 제거 > 로또 번호 > 중복되지 않는 난수 생성
		
		//Case 1. ArrayList
		ArrayList<Integer> lotto = new ArrayList();
		
		//6개의 난수 만들어내기
		for (int i=0; i<6; i++) {
			int n = (int)(Math.random() * 45) + 1;
			boolean flag = false;

			//중복 검사 진행하여 n값 add하기
			for (int j=0; j<i; j++) {
				if (lotto.get(j) == n) {
					flag = true;
					break;
				}
			}
			
			if (!flag) {
				lotto.add(n); //중복값이 없다면 n값 add하기
			} else { //중복값이 있다면 포문을 한 바퀴 더 돌아 값을 받기 위해 i--;
				i--;
			}
		} //중복값에 대한 처리 진행
		
		
		
		//Case 2. HashSet
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while (lotto2.size() < 6) { //값을 안넣으면 사이즈는 0이니까 0부터 5까지 6번 돌도록!
			
			int n = (int)(Math.random() * 45) + 1; //1~45 난수 생성
			lotto2.add(n); //이 자체가 Set이므로 중복값 허용 안함
		}
		
		System.out.println(lotto2);
		System.out.println();
		
		//Set의 탐색 > 방번호가 없으므로 루프 못 돔 > 향상된 for문 사용
		for (int num : lotto2) { //내부에 Iterator 구현
			System.out.println(num);
		}
		System.out.println();
		
		//*** List, Set > Iterator 지원 > Iterator란? 일종의 탐색 도구
		Iterator<Integer> iter = lotto2.iterator();
		
		//아래 방식이 바로 향상된 for문과 동일하다.
		while(iter.hasNext()) {
			//int n = iter.next(); > 실수 주의!!!!! 이런식으로 n의 값을 받을 경우 next는 화살표가 가리키고있는 데이터를 반환하고 화살표를 내리기 때문에, 내가 원하는 값을 모두 가져오지 않음. >> next는 while문 안에 한번만 존재해야 함!!! > next는 화살표를 값 반환 후 내려버리기 때문에 주의!!!!!!!!!!!!!!!!!
			System.out.println(iter.next());
		}
		System.out.println();
		
//		System.out.println(iter.hasNext()); //true > 요소 존재 유무 > 내가 이번에 next를 실행하면 가져올 수 있는 값이 있는지에 대한 유무
//		System.out.println(iter.next()); //16 > 요소를 가져오기 > 배열의 첫번째 방의 값 return
//		System.out.println();
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println();
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println();
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println();
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println();
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println();
//		
//		System.out.println(iter.hasNext());
//		//System.out.println(iter.next()); //NoSuchElementException
//		System.out.println();
		
		//방번호가 없기 때문에, 가져올 수 있는 방법은 일부만 못가져오고 처음부터 끝까지 가져올 수 있음!
		
		
		
	}

	private static void m1() {
		
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
		
		//ArrayList 값 추가
		list.add("강아지");
		list.add("고양이");
		list.add("거북이");
		
		//HashSet 값 추가
		set.add("강아지");
		set.add("고양이");
		set.add("거북이");
		
		System.out.println(list.size()); //ArrayList size 찍기
		System.out.println(set.size()); //HashSet size 찍기
		
		System.out.println(list); //[강아지, 고양이, 거북이]
		System.out.println(set); //[고양이, 거북이, 강아지]
		//두개의 순서 상이 > ArrayList는 순서가 존재하는 collection
		//			  > HashSet은 순서가 존재하지 않는 collection
		
		list.add("고양이"); //중복 가능
		System.out.println(list); //[강아지, 고양이, 거북이, 고양이]
		//2개의 고양이가 있더라도 구분 가능 > 1번째방, 3번째방에 있는 고양이 구분 가능
		
		//set은 중복값을 가질 수 없다.
		set.add("고양이"); //중복 발생시키면 에러가 나진 않지만 중복값(고양이)가 안들어감.
		System.out.println(set.add("고양이")); //중복 발생시 return 값은 false 발생
		System.out.println(set); //[고양이, 거북이, 강아지]
		//*** 중복값이 들어가지 않는다. > set의 두드러진 특징
		
		//삭제
		list.remove(1);
		list.remove("거북이");
		System.out.println(list);
		
		set.remove("거북이");
		System.out.println(list); 
		
		System.out.println(set.contains("고양이")); //고양이 있으므로 true 값 반환
		
		//HashMap과 달리 HashSet은 방의 이름도 없고, ArrayList와 달리 방의 번호도 없음!!
		//중복값을 자동으로 배제하는 특성을 살려서 HashSet은 이용됨!!
		
		
		
	}//m1
	
	
}//class

class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	//값이 동일하면 객체가 동일하게 처리하는 방법
	//1. hashCode() 오버라이드
	//2. equals() 오버라이드
	// 이 두개는 주소값비교를 하도록 내부구조가 짜져 있는데, 주소값비교가 아니라 값을 비교하도록 재정의를 하면 됨!!!
	
	public int hashCode() {
		
		//원래 > 자신의 메모리 주소값 반환
		
		//p1 > "홍길동", 20 > "홍길동20" (합쳐서 하나의 문자열로 만들 예정) > 100번지
		//p2 > "아무개", 25 > "아무개25" (합쳐서 하나의 문자열로 만들 예정) > 200번지
		//p3 > "홍길동", 20 > "홍길동20" > 100번지

		return (this.name + this.age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		//p1.equals(p2)
		
		
		return this.hashCode() == obj.hashCode()	;
	}
	
	//보통 equals를 오버라이딩할 때, hashcode도 같이 오버라이딩 한다.
	
	//2명 있던 길동이가 사라졌다!!!!!!!!!!!!!!!!!!
	//길동이 내놩
	//@_@ 어려워
	
	
	
	
}


