package com.test.java;

public class Ex25_Method {

	public static void main(String[] args) {
		
		//재귀 메소드, Recursive Method
		// - 메소드 구현부에서 자기 자신을 호출하는 메소드
		// - 구조가 헷갈린다.
		// - 파일 디렉토리 구조에서 많이 사용
		
		//m1(); -> 실행 시 무한 반복
		
		int n = 4;
		int result = m2(n);
		
		System.out.println(result);
		
		
		//팩토리얼
		//4! = 4 x 3 x 2 x 1 = 24
		
		n = 4;
		result = factorial(n); //m2(4)
		System.out.printf("%d! = %d\n", n, result);
		
		
		
	}//main

	private static int factorial(int n) {
		
		return (n == 1) ? 1 : n * factorial(n-1);
	}

	public static int m2(int n) {
		
		System.out.println("n: " + n);
		int result = (n == 1) ? 1 : m2(n - 1);
		
		return result;
	}
	
	//재귀 메소드 > 재귀 호출을 가지고 있는 Method!
	public static void m1() {
		System.out.println("m1");
		m1(); //자기 자신 > 재귀 호출, Recursive Call
		//StackOverflowError
		//실수로 이런게 생기면 프로그램 안전성에 문제가 생길 수 있기 때문에 잘 관리해야함!
	}
	
	
}//class
