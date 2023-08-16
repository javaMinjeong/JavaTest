package com.test.question.Q104;

public class Main {

	public static void main(String[] args) {
		
		//배열 생성
		MyArrayList list = new MyArrayList();

		//현재 상황 보기
		System.out.println(list);
		
		//추가
		list.add("홍길동");
	
		list.add("아무개");
		list.add("하하하");
		list.add("호호호");
		list.add("후후후");
		System.out.println(list); //dump

		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
//		System.out.println(list.get(5)); //*** 없는 방번호
//		System.out.println(list.get(6)); //물리적으로는 존재하지만, 대외적으로는 존재하지 않는 방으로 만들기
//		System.out.println(list.get(7));
//		System.out.println(list.get(8)); //여기부터 nullPointerException > 실제 배열이 7까지만 있는 상황이라. 앞의 5,6,7도 에러를 내게 만들자!

		//개수
		System.out.println(list.size());

		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//수정
		list.set(0, "우하하");
		System.out.println(list.get(0));

		//삭제
		list.remove(1);
		System.out.println(list);
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
		
		list.add("이순신");
		System.out.println(list);
		
		

		//삽입
		list.add(1, "호호호");
		System.out.println(list);
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}

		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}

		//추가로 만들어보기 연습
		System.out.println(list.lasIndexOf("홍길동"));
		System.out.println(list.indexOf("홍길동",3));
		System.out.println(list.contains("홍길동"));
		
		System.out.println(list);
		
		//초기화
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		
	}
}
