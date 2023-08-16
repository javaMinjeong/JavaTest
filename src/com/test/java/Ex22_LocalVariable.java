package com.test.java;

public class Ex22_LocalVariable {

	//멤버 변수
	int b; 
	
	public static void main(String[] args) {
		
		//지역 변수
		int a; // main 메소드 내에서 선언한 변수
		
		/*
		 	자바 변수의 종류
		 	1. 멤버 변수, Member Variable
		 		- 클래스 수업
		 		
		 	2. 지역 변수, Local Variable
		 		- 여태까지 수업한 변수
		 		
		 	지역 변수
		 	- 메소드 내에서 선언한 변수
		 	- 변수의 선언 위치(***)
		 	
		 	지역 변수의 생명 주기, Life Cycle
		 	- 언제 태어나서(메모리에 생성) ~ 언제 죽는지(메모리에 소멸)
		 	- 생성 > 변수 선언문이 실행되는 순간
		 	- 소멸 > 변수 선언문이 포함된 자신의 영역에서 제어가 벗어나는 순간 (해당 메소드가 종료될 때 사라짐)
		 	
		 	지역 변수의 영역(Scope)
		 	- 선언문이 포함된 블럭({})
		 	
	 	
		 */
		
		int c;
	
		
		String name = "홍길동";
		//String name = "아무개"; Duplicate local variable name
		m1();
		
		//System.out.println(age); age cannot be resolved to a variable
		//이 메소드에서는 age가 누구인지 모름. 왜몰라 아래 메소드에 선언했는데? Because of 생명주기
		//------------------------------------------------------
		
		
		//*** 지역 변수는 초기화를 하지 않으면 사용이 불가능하다.
		int num;
		
		//System.out.println(num); The local variable num may not have been initialized 지역변수 num이 초기화가 되지 않았다.
		//선언만 하면 메모리에 null이 생김. > 지역변수를 생성한 직후는 null 상태입니다. > 존재하지 않는 것 대상으로는 아무것도 추가 작업을 할 수가 없음.
		// > 그래서 초기화를 안하면 출력도 할 수가 없음.
		
		//int result = num + 10; The local variable num may not have been initialized
		//> null은 연산의 대상도 될 수 없음. 행동의 타겟이 될 수 없기 때문에 위 문장도 Error 발생.
		
		
	}//main
	
	public static void m2(String gender) {
		
		//매개변수 == 지역변수
		//지역변수와 동일하게 본 메소드 실행 후 죽음.
		//String gender; Duplicate local variable gender --> 같은 지역 내에 동일한 변수명 불가.
	}
	
	
	public static void m1() {
		
		String name = "아무개";
		//영역이 다르면 동일한 이름의 식별자가 있어도 무관.
		//Method가 바뀌면 이름이 동일한 변수가 양쪽에 모두 존재해도 됨.
		//ex) 1강의실 홍길동, 3강의실 홍길동
		
		int age = 20;
		System.out.println(age);
		
	}
	
	
}
