package com.test.java.collection;

import java.util.ArrayList;

public class Ex60_List {

	public static void main(String[] args) {
		
		/*
			컬렉션, Collection
			- JCF, Java Collection Framework
			- (향상된) 배열
			- 기존의 순수 배열
				- 사용법 개량
				- 용도에 따른 입출력 방식/효율성 개량
			- 클래스 + 내부 순수 배열을 가지고 있다.
			- 길이 가변 > 방의 개수를 마음대로 늘리고 줄이는게 가능
			- 자료 구조
			
			컬렉션 종류
			
			1. List 계열 (List, Set, Map 모두 > 인터페이스 > 각 계열별로 사용법이 비슷하다.)
				- ArrayList(*****)
				- LinkedList
				- Queue
				- Stack
				- Vector(legacy)
			
			2. Set 계열
				- HashSet(***)
				- TreeSet
				
			3. Map 계열
				- HashMap(****)
				- TreeMap
				- Properties(legacy)
				- HashTable(legacy)
		
			
			Collection(I) > 인터페이스
			- List(I)
			- Set(I)
			
			Map(I)
		
			----------------------------------------------
		
			ArrayList 클래스
			- ArrayList(C) -> List(I) -> Collection(I)
			- 순수 배열과 구조가 가장 유사함
			- 첨자(index)를 사용해서 요소(element)에 접근
			
		
		*/
		
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		
		
	}//main

	private static void m6() {

		//컬렉션 초기 용량 > 내부 배열의 초기 길이
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		
		//아래 for문에 문제가 있다...? > ArrayList에 아래와 같이 for문을 사용할 땐 잘 생각해봐야 함.
		//2번의 쓰레기 발생, 2번의 복사과정 발생 > 낭비!!!
		//처음부터 데이터 넣는 배열을 10개로 시작했다면..? 위의 낭비 과정 불요.
		//데이터 넣는 배열 수 조절 가능!! > 위의 문장에서와 같이 (initial capacity)활용!!!
		
		for (int i=0; i<10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.add(10); //이 경우엔 기존 초기설정값의 2배가 생성되어 값이 추가가 된다.
		//이제 이젠 더이상 추가 계획 없음(확신) -> 그럼 남은 9칸은 어찌행...? 낭비쟈나~~ > 없앨 수가 있음!!!!!!!!!!!
		
		list.trimToSize(); //데이터가 들어있는만큼의 길이로 재조정 > 진짜로 확신이 들 때만 사용해야 함!!!!! (굳이 따지자면 차라리 안해도 되는게 나을 수도 있음. 후에 추가로 늘려야 할 경우 다시 이 작업은 낭비가 되기 때문~~)
		
		
		
	}

	private static void m5() {

		//ArrayList(컬렉션) 특징
		//1. 내부에 배열을 가지고 있다.
		//2. ArrayList 클래스의 대부분의 기능이 내부 배열을 조작하는 기능으로 구성
		//3. ??? 길이가 가변 > 데이터를 계속 넣으면.. 계속 공간이 늘어난다?? 배열은 길이가 불변인디.....? 내부에 배열이 있다며...??
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		for (int i=0; i<1000000; i++) {
//			list.add(i);
//		}
//		
//		System.out.println(list.size());
		
		
		//List의 size()는 물리적으로 length가 아니라 데이터의 개수이다. 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		System.out.println(list.size());
		
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
		
		list.add(50);
		System.out.println(list.size());
		
		
		
	}

	private static void m4() {
		
		//성적표
		//학생(이름, 국어, 영어, 수학, 총점, 평균)
		
		//선택?
		// - 길이로 판단
		// - 배열(고정) vs ArrayList(불확실)
		
		//순수배열을 쓸지 리스트로 쓸지 고민된다면 길이로 판단.
		//학생이 30명이고 늘어날일도 줄어들일도 없다. > 배열을 써도 되고 리스트를 써도 되고
		//전학생이 잦게 발생 > 불확실 > List
		
		
		//Student[] list;
		ArrayList<Student> list = new ArrayList<Student>();
		
		for (int i=0; i<10; i++) {
			
			int kor = (int)(Math.random() * 41) + 60; //60~100점
			int eng = (int)(Math.random() * 41) + 60; //60~100점
			int math = (int)(Math.random() * 41) + 60; //60~100점
			
			Student s = new Student("학생" + i, kor, eng, math);
			
			list.add(s); //배열에 학생이 추가!!
			
		}
		
		//System.out.println(list); //확인용 dump
		
		System.out.println("==============================================");
		System.out.println("                   성적표");
		System.out.println("==============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for(Student s : list) {
			
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = total / 3.0;
			
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
								, s.getName()
								, s.getKor()
								, s.getMath()
								, s.getEng()
								, total
								, avg);
			
		}
		
		
		
	}

	private static void m3() {
		
		//차원
		int[] 		ns1 = new int[3];
		int[][] 	ns2 = new int[3][3];
		int[][][] 	ns3 = new int[3][3][3];
		
		//ArrayList의 차원
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
		
		
	}

	private static void m2() {
		
		//ArrayList 용법
		ArrayList<String> list = new ArrayList<String>();
		
		//CRUD
		// - Create(쓰기)
		// - Read(읽기)
		// - Update(수정)
		// - Delete(삭제)
		
		
		
		
		
		
		//1. 요소 추가하기
		// - boolean add(T value)
		// - 배열의 맨 마지막에 추가하기 > Append
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("귤");
		list.add("파인애플");
		
		//2. 요소의 개수
		// - int size()
		System.out.println(list.size()); //길이: 5
		
		//3. 요소 접근(읽기)
		// - T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		System.out.println(list.size()-1);
		
		//ArrayIndexOutOfBoundsException > 순수 배열 방번호 에러
		//StringIndexOutOfBoundsException > 배열 문자열 방번호 에러(???)
		//IndexOutOfBoundsException > 컬렉션 방번호 에러
		
		//없는 방번호
		//java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
		//System.out.println(list.get(5));
		
		//4. 요소 수정
		// - list[0] = 10; 대입 or 수정
		// - String set(int index, T newValue)
		String temp = list.set(2, "포도"); 
		System.out.println(list.get(2));
		System.out.println(temp); // > 수정 전 값 불러오기 > 근데 잘 안씀. 수정 전 값을 불러올 일이 많이 없으므로
		System.out.println();
		
		//5. 요소 삭제
		// - 순수 배열의 요소(방) 삭제? > 불가능
		// - 컬렉션은 요소 삭제? > 가능
		// - T remove(int index) > 방번호를 찾아서 삭제
		// - boolean remove(T value) > 값을 찾아서 삭제
		// - *** 시프트가 발생한다!! > 삭제된 방 이후의 모든 요소는 모두 방번호 -1 감소
		
		System.out.println(list.get(1)); //딸기
		System.out.println(list.get(2)); //포도
		System.out.println(list.get(3)); //귤
		System.out.println();
		
		//list.remove(2);
		//list.remove(temp);
		//list.remove("포도"); //**포도가 2개 이상이었다면? 첫번째 만나는 포도를 삭제(두번째 만나는 포도는 삭제 못함) > 때문에 방번호를 콕 찍어서 index로 삭제를 많이 씀!!!
		
		
		//2번째방 "포도" 지우기 > remove(방번호)로 지우기 > 훨씬 더 많이 씀
		list.remove(2); // shift 발생(비워진 방을 메우기 위해 앞 방번호로 모든 값들이 다 이동함)
		System.out.println(list.get(1)); //딸기
		System.out.println(list.get(2)); //귤
		System.out.println(list.get(3)); //파인애플
		System.out.println();
		
		//6. 탐색
		// - 루프
		
		for (int i=0; i<list.size(); i++) {
			System.out.printf("list.get(%d) = %s\n", i, list.get(i));
			
		}
		
		//향상된 for문(foreach문)
		
//		for (변수 : 배열/컬렉션) {
//		} **변수 = 뒤 배열의 방 하나를 가져왔을 때, 저장할 수 있는 변수
		//for는 집합을 먼저 찾아가서 첫번째 방의 값을 item에 복사를하고 실행블럭 안에 들어오고 위로 올라가서 반복. 소비한 첫번째 방을 제외한 두번째 방부터 반복~~
		//향상된 for문은 한번 시작하면 무조건 첫번째방값부터 마지막값까지 다 불러오므로 조작하여 특정 방의 값을 얻을 수는 없다. 특정 방의 값만을 원하는 경우 등은 기존 for문 사용!
		
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		//7. 덤프
		// - Arrays.toString(배열)
		System.out.println(list.toString()); //[바나나, 딸기, 귤, 파인애플]
		System.out.println(list); //[바나나, 딸기, 귤, 파인애플]
		
		//8. 요소 추가(원하는 위치에)
		// - 배열의 원하는 위치에 요소를 추가 > Insert
		// - void add(index index, T value)
		// - ***시프트가 발생한다. > 삽입된 방 이후의 모든 요소의 방번호 + 1
		
		list.add(2, "망고");
		System.out.println(list); //[바나나, 딸기, 망고, 귤, 파인애플]
		
		//9. 기타 등등
		System.out.println(list.indexOf("사과")); //못찾으면 '-1' 반환
		System.out.println(list.indexOf("귤"));
		System.out.println(list.lastIndexOf("파인애플"));
		System.out.println(list.contains("망고")); //망고 있어서 'true' 반환
		
		//10.
		System.out.println(list.isEmpty()); //너 비어있니? false: 아니요, 저는 데이터가 있는데요!
		
		list.clear(); //모든 요소 삭제 > 초기화
		
		System.out.println(list.isEmpty()); //true
		System.out.println(list); //헉 없다!!
		System.out.println(list.size()); //0 없어!!!!
		
	}

	private static void m1() {

		//순수 배열 선언
		// - 타입 명시(int)
		// - 길이 명시(3)
		int[] num1 = new int[3];
		
		//요소 접근 > 첨자(index) 사용 > Indexer
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		
		System.out.println(num1.length);
		System.out.println();
		
		//-----------------------------------
		
		//컬렉션 > 인덱서를 지원하지 않기에 모든걸 다 메소드로 처리!
		// - 타입 명시(Integer) > 제네릭
		// - 길이 명시(X) > 가변 > 선언 시 따로 길이를 요구하지 않음.
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		
		//요소 추가 > 첨자? > add() == append > 차례대로 마지막 방에 넣어라
		// > ()안의 데이터를 방에 집어넣어라.
		num2.add(10); //0번째 방 
		num2.add(20); //1번째 방
		num2.add(30); //2번째 방
		
		//집어넣은 걸 가져올 땐, get을 사용
		System.out.println(num2.get(0)); //num1[0]
		System.out.println(num2.get(1)); 
		System.out.println(num2.get(2)); 
		
		//집어넣은 데이터 수를 알고싶어 = 배열에서의 길이 역할을 알고싶을 땐
		System.out.println(num2.size()); //길이 3
		System.out.println();
		
		num2.add(40);
		num2.add(50);
		
		System.out.println(num2.size()); //길이 5
		System.out.println();
		//계속 넣을 수 있음!
		
		
		
	}
	
}//class
