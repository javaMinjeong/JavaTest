package com.test.java;

public class Ex19_Method {

	/*
	
		main 메소드
		- 특수 메소드
		- 이름이 예약어 > main
		- 프로그램이 시작되면 자바가 자동으로 호출하는 메소드
		- 프로그램의 시작점(Entry Point)
		- 프로그램의 종착점(End Point)
		
		*그래서 메인 메소드 외 타 메소드는 호출해야 실행 됨!
	
	
	*/
	
	
	
	public static void main(String[] args) {

		/*
		
			메소드, Method
			- 함수(Function), 프로시저(Procedure), 서브 루트(Sub Routine)
			- 코드의 집합
			- 행동의 단위
			- 같은 목적을 가진 코드의 집합
			- 코드 재사용의 단위
			
			변수 사용 절차
			1. 변수 선언
			2. 변수 사용
			
			메소드 사용 절차
			1. 메소드 선언
			2. 메소드 사용(호출) > 실행
		
		*/
		
		//요구사항] "반갑습니다." 출력 x 5회
		//수정사항] "반갑습니다." 수정
		//실제로 프로그래밍은 처음 생각했던대로 결과가 끝나는 경우가 없음. 중간에 계속 바뀜!
		//수정을 대비해서 프로그램을 짜야함!
		
		//비용? 1줄을 만들때 10 이라고 치면 10 x 5 = 50의 비용 
		System.out.println("반갑습니다"); //작성
		System.out.println("반갑습니다");
		System.out.println("반갑습니다");
		System.out.println("반갑습니다");
		System.out.println("반갑습니다");
		System.out.println();
		
		//메소드 사용 목적
		//1. 코드의 분리 > 목적 맞는 코드를 각각 따로 관리 ->폴더 관리와 비슷하다고 보면 될듯!
		//2. 코드의 재사용(한번 정의해놓은것을 계속 반복 호출 ->이점: 유지보수가 쉬워짐)
		
		//메소드 호출(실행) //메소드는 항상 실행이 끝나면 돌아감. 원래 자리로 main에서 실행하면 실행 후 main으로 돌아감
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
		
		//요구사항] 숫자를 한글로 1~10까지 출력
		printNumber();
		

		//위 방법을 생산성있게 만드는 방법이 메소드
		//메소드와 메소드는 서로 독립적인 관계라 다른 메소드를 만들고 싶으면 main 메소드를 나가야함.
		//메소드는 class 밖으로 나갈 수 없음.
			
	}//main

	//메소드 선언
	//1. class 내부
	//2. 메소드간의 순서 무관(보통 main method를 가장 위에 두는 편. main이 기본이라)
	
	/*
	
		메소드 선언 구문
		
		public static void hello() {
		
		}
	
		- public static void hello() : 선언부(header)
		- {} : 구현부(body)
		
		- public : 접근 지정자(제한자)(Access Modifier)
		- static : 정적 키워드
		- void : 반환 자료형
		- hello : 메소드명 > 개발자 명명
		- () : 인자 리스트
	
	*/
	
	//Method: 특정한 목적을 가지는 코드의 집합
	public static void hello() {
		
		//해당 메소드가 하려는 업무 구현 
		System.out.println("안녕하세요.");
		
		//main method 안에는 반갑습니다 5번, hello method 안에는 안녕하세요.
		//hello method 안에꺼가 실행 안됨..ㅠ Why? 메소드는 선언만 한다고 실행이 되는게 아니라 사용을 해야 실행이 됨!
		//선언만 하고 호출을 한적이 없으니 실행이 안 됨!
		//부를 때는 main에서 메소드 인자리스트까지 불러야함! 
		
		//main은 왜 안불렀는데 실행이 되나? > 누군가 불렀단 얘기! > 위로 가시오!!
		
		
	}
	
	public static void printNumber() {
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		System.out.println();
		
		
		
	}
	
	
	
	
}//class
