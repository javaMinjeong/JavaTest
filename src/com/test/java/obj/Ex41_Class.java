package com.test.java.obj;

public class Ex41_Class {

	public static void main(String[] args) {
		
		//Pencil.java
		//PencilCase.java
		
		//Pencil, PencilCase
		//하나의 클래스가 또다른 클래스를 멤버로 가질 수 있다.
		//필통 안에 연필을 넣을 거당.
		
		//필통부터 먼저 만들고 연필을 만들어서 집어넣는 작업을 해보자!
		
		//1.필통 만들기 > 파란색 필통
		PencilCase pcase = new PencilCase();
		pcase.setColor("파란색");
		
		
		//2-1. 만들어진 필통 안에 연필 넣기 > 2-2방식이 더 좋은 방식이라 주석처리함. 본 식은 좀 길고 복잡 
		/*
		//5바퀴 포문 (집어넣기)
		for (int i=0; i<5; i++) {
			Pencil p1 = new Pencil();
			p1.setHardess("HB");
			p1.setColor("검은색");

			//메서드의 반환값인 대괄호에 배열을 붙인 것.
			//[index] : 인덱서(Indexer) - 표기법
			pcase.getPencil()[i] = p1;
			
		}
		// > 필통안에 있는 공간이 연필 5자루로 꽉차게 됨!
		
		//필통안에있는 배열 꺼내서 출력하기
		for (int i=0; i<5; i++) {
			System.out.println(pcase.getPencil()[i].info());
		}
		*/
		
		//2-2. 만들어진 필통 안에 연필 넣고 출력하기 > 위의 for문 뜯어고쳐서 단순화시키기 > PencilCase class에 add라는 메소드 새로 생성
		//필통에 집어넣는거 단순화 > PencilCase class 내 'add' 메소드 이용
		for (int i=0; i<5; i++) {
			Pencil p = new Pencil();
			p.setHardess("B");
			p.setColor("파란색");
			
			pcase.add(p);
		}
		
		
		//연필 한자루 꺼내보기 및 상황 확인
		
		System.out.println(pcase.info());
		
		Pencil p2 = pcase.get(2);
		
		System.out.println(pcase.info());
		
		
		//************************아래는 96번 문제 설명
		
		//5cm ~ 15cm
		//1mm ~ 20mm
		// > 위 두개는 숫자라 난수 생성 가능
		
		//red, blue, yellow, white, pink, purple, green, black
		// > 문자는 난수 어떻게 만듦? > 배열을 먼저 생성하렴. 배열로 빼면 각 색상은 배열의 n번째방 > 방번호 난수로 만들면 가능
		
		String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
		
		//색상 > 난수화(X)
		//방번호 > 난수 가능~
		
		System.out.println(color[(int)(Math.random() * color.length)]);
		
		
		
		
		
	}
}
