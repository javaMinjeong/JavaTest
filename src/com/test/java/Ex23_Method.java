package com.test.java;

public class Ex23_Method {

	public static void main(String[] args) {

		/*
		
			메소드 오버로딩, Method Overloading
			- 같은 이름의 메소드를 여러개 만드는 기술
			- 메소드의 인자리스트를 다양한 형태로 구성해서, 같은 이름의 메소드를 여러개 만드는 기술
			
			메소드 오버로딩 이유?
			- 성능 향상? > X (성능 동일)
			- 개발자에게 도움 > O(사람에게 좋음)
			- 메소드 이름을 여러개 외우지 않아도 되게끔 하나로 통일
			
			
			메소드 오버로딩 구현 조건 가능
			1. 매개변수의 개수
			2. 매개변수의 자료형
			
			메소드 오버로딩 구현 조건 불가능
			1. 매개변수의 이름
			2. 반환값의 자료형
			
			(이 4가지만 잘 구분할 수 있으면 됨!!!)
			
			메소드를 여러개 선언할 예정!!!
			1. public static void test() {}				->문제 없음 > 매개변수 0개
			2. public static void test() {}				->실패. > 1번 때문에
			3. public static void test(int n) {}		->가능. > 1번 메소드와 이름은 똑같지만, 매개변수가 1개, 인자를 안주면 에러가 발생!
			4. public static void test(int m) {}		->실패. > 3번과 식별이 불가. > 호출해보면 3번을 부를지 4번을 부를지 컴퓨터는 아몰랑!
			5. public static void test(String s) {}		->가능. > 3번은 int밖에 못받아서 > 자료형이 다르기때문에 타 메소드는 에러가 떠서 5번 호출 가능!
			6. public static void test(int n, int m) {} ->가능. > 매개변수 값 2개 넣지 않으면 에러 떠서
			7. public static int test() {}				->실패. > 1번과 구분 불가
			
			메소드를 호출하기!! > 검증!!
			test(); 		> 1번 호출 > 여기 매개변수 값을 안주면 3번 메소드는 Error가 나기 때문에 1-3번중 구분 가능.
			test(10); 		> 3번 호출 > 숫자를 받아줄 매개변수가 1번은 없기 때문에 구분 가능.
			test("홍길동");	> 5번 호출 > 호출 형태로 = 매개변수 값으로 자료형이 다르면 에러가 뜨기 때문에 구분 가능.
			test(10, 20);	> 6번 호출 > 값 2개 넣지 않으면 에러나성 구분 가능.
			
			int result = test(); //7번 > 호출할 때 까지는 1번값과 구분이 불가하다. 우측부터 연산하기 때문에!
		*/
		
		drawLine();
		drawLine("*");
		
		System.out.println(100);
		System.out.println("문자열");
		//println 이라는 메소드 자체가 오버로딩이 되어있음. 왜? println의 인자로 boolean도 되고, double도 되고 다 되어서
		//println은 실제 10개 오버로딩이 되어있지만 이용자는 println 1개로 알고있음.
		//만약 오버로딩이 없었다면 우리는 printlnString, printlnInteger 등등.. 메소드 10개를 알고 있어야 했으나
		//오버로딩이 있음으로써 우리는 1개만 알면 됨. -> println
		
		
	}//main
	
	public static void println(int num) {
		
	}
	
	public static void println(String txt) {
		
	}
	
	
	public static void test() {
		
	}
	
	public static void test(int n) {
		
	}
	
	
	
	
	
	
	
	//요구사항] 선을 그리는 메소드를 선언하시오.	
	public static void drawLine() {
		System.out.println("==========================="
				+ "===");
	}//drawLine

//	public static void drawLine2() {
//		System.out.println("**********************************:");
//	}//의미있는 메소드명을 정하기가 매우 어려움. -> 이런 불만 해소를 위해 메소드 오버로딩이 있음
	
	//메소드 오버로딩 -> 매개변수를 넣으니까 동일 메소드명인데 에러가 안나네?
	public static void drawLine(String s) {
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.println();
		

	}	
	
}
