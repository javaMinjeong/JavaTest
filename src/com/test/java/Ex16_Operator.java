package com.test.java;

import java.util.Scanner;

public class Ex16_Operator {

	public static void main(String[] args) {

		//1. 행동(목적)
		//	b. 비교 연산자
		
		/*
			비교 연산자
			- >, >=, <, <=, ==(equals), !=(not equals)
			(=은 대입자이기 때문에 == 두번 씀)
			- 2항 연산자
			- 피연산자들의 우위(동등) 비교하는 연산자
			- 피연산자는 숫자형을 가진다.
			- 연산의 결과가 항상 boolean이다.
			
					
		*/
		
		
			int a = 10;
			int b = 3;
			
			System.out.printf("%d > %d = %b\n", a, b, a > b);
			System.out.printf("%d >= %d = %b\n", a, b, a >= b);
			System.out.printf("%d < %d = %b\n", a, b, a < b);
			System.out.printf("%d <= %d = %b\n", a, b, a <= b);
			System.out.printf("%d == %d = %b\n", a, b, a == b);
			System.out.printf("%d != %d = %b\n", a, b, a != b);
			System.out.println();
			
			
			//요구사항] 사용자 나이 입력 > 19세 이상 통과, 미만 거절
			Scanner scan = new Scanner(System.in); //import > Ctrl + Shift + O
			
			System.out.print("나이: ");
			
//			int age = scan.nextInt(); //입력받은 숫자를 돌려주는걸 변수에 담는게 제일 편하니까 변수에 담는 과정
			
//			System.out.println(age >= 19); //true(통과), false(거절)
			System.out.println();
			//---------------------------------------------------
			
			//char도 가능
			System.out.println('A' == 'A');
			System.out.println('A' == 'a');
			System.out.println();
			
			//비교 연산자
			//1. 모든 값형 > 안전
			//2. 문자열(참조형)의 비교 > 주의!!
			
			//문자열 비교가 왜 문제가 되는지 한번 봐보자고!
			String s1 = "홍길동";
			String s2 = "홍길동";
			String s3 = "아무개";
			String s4 = "홍";
			s4 = s4 + "길동";
			
			System.out.println(s4); //값: 홍길동
			
			//"홍길동" > "아무개" -> 문자열은 우위비교는 불가하나, 같다 다르다는 비교 가능하니까 한번 봐보자공
			System.out.println(s1 == s2); //값: true
			System.out.println(s1 == s3); //값: false
			System.out.println(s1 == s4); //값: false -> 오잉? true가 나와야 하는데? "홍길동" == "홍길동"
			//내부구조 설명해야하는데 class를 설명해야 되는거라서 설명은 나중에 하고, 결론만 내면.
			//*** 문자열의 비교는 ==, != 연산자를 사용하면 절대 안된다!!!!!
			//	  문자열의 비교는 equals() 메소드를 사용한다.
			
			System.out.println(s1.equals(s2)); //s1 == s2? 값: true
			System.out.println(s1.equals(s3)); //s1 == s3? 값: false
			System.out.println(s1.equals(s4)); //s1 == s4? 값: true -> equals() 메소드로 문자열 비교 가능.
			
			//----------------------------------------
			
			
			
		
		
	}

}
