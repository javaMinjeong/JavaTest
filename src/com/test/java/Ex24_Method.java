package com.test.java;

public class Ex24_Method {

	public static void main(String[] args) {

		//Swap
		// - 2개의 공간의 값을 서로 교환하는 작업
		
		int a = 10;
		int b = 20;
		
		swap(a, b); //우리가 이걸 보고 swap 메소드를 생성할 수 있듯이 이클립스도 이걸 보고 만들 수 있음
		//해당 라인에서 단축키 Ctrl + 1
		
		//모든 이름 고치는 법. 이름이 정의된 곳으로 가서 Ctrl + 1 > Rename in file, Rename in workspace, 변수명 및 이름 수정도 가능
		//-----------------------------------------
		
		String s1 = "홍길동";
		String s2 = "아무개";
		
		swap(s1, s2); //메소드를 하나 더 만들건데, 전체적인 로직은 동일하니 -> 메소드 오버로딩!
		
		
	}

	private static void swap(int a, int b) {

		System.out.printf("a: %d, b: %d\n", a, b);
		
		int temp; //빈컵
		temp = a; //빈컵에 a를 담고
		a = b; //비어있는 a에 b를 넣고
		b = temp; //비어있는 b에 빈컵에 담은 a를 넣음
		
		System.out.printf("a: %d, b: %d\n", a, b);
	}

	
	private static void swap(String a, String b) {

		System.out.printf("a: %s, b: %s\n", a, b);
		
		String temp; //빈컵
		temp = a; //빈컵에 a를 담고
		a = b; //비어있는 a에 b를 넣고
		b = temp; //비어있는 b에 빈컵에 담은 a를 넣음
		
		System.out.printf("a: %s, b: %s\n", a, b);
	}

	
	
}
