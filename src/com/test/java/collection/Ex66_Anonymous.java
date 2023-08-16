package com.test.java.collection;

public class Ex66_Anonymous {

	public static void main(String[] args) {
		
		/*
			익명 객체, Anonymous Object
			- 익명 클래스, Anonymous Class
			- 이름 없는 클래스
		*/

		//요구사항] 인터페이스를 구현한 클래스 선언 > 객체 생성
		
		//1. 본인 타입으로 참조 변수 만들기
		BBB b1 = new BBB();
		b1.aaa();
		System.out.println();
		
		//2. 부모 타입(인터페이스)으로 참조 변수 만들기
		AAA b2 = new BBB();
		b2.aaa();
		System.out.println();
		//익명 클래스가 2번과 굉장히 밀접한 연관이 있음.
		
		//3.
		//AAA b3 = new AAA(); //불가 > Cannot instantiate the type AAA
		//b3.aaa();
		
		//The type new AAA(){} must implement the inherited abstract method AAA.aaa()
		AAA b3 = new AAA() {

			//몸통만 있는 클래스(클래스에서 머리통이 하는 일: 이름 붙이는 역할) > 익명클래스
			//이 익명클래스는 앞에 있는 인터페이스의 자식 클래스가 됨.
			@Override
			public void aaa() {
				System.out.println("aaa");
			}
		};
		
		b3.aaa();
		System.out.println();
		
		//b2 vs b3
		
		//b2
		// - AAA 인터페이스 선언
		// - BBB 클래스 구현
		
		//b3
		// - AAA 인터페이스 선언
		// - 실명 클래스 구현(X) > 익명 클래스 구현(O)
		
		//익명 클래스 구현 하는 이유 > 클래스 재사용성 때문
		//익명 클래스 > 재사용 의사 없음
		//실명 클래스 > 재사용 의사 있음 + 다분!!
		
		//클래스 사용 목적 > 객체 생성
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		//익명 클래스 > 붕어빵틀 > 붕어빵을 딱 1개만 만들기위한 틀
		AAA t4 = new AAA() {

			@Override
			public void aaa() {
				
			}
			
		};
		//인터페이스를 타겟으로 잡고, 인터페이스로 인스턴스를 만드는 듯한 표현을 적기
		//이름이 없다보니 해당 클래스를 다시 부를 수 있는 방법이 없고 > 재사용 불가
		
		
		
		
		
		
		
		
		
	}//main
}//class

class Test {
	public int a;
	public int b;
	public void ccc() {
		
	}
}




interface AAA {
	void aaa();
}

//The type BBB must implement the inherited abstract method AAA.aaa()
class BBB implements AAA {

	@Override
	public void aaa() {
		System.out.println("aaa");
	}
	
}