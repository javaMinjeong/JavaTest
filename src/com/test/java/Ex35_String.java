package com.test.java;

public class Ex35_String {

	public static void main(String[] args) {
		
		/*
			문자열
			- 물리적으로는 참조형이지만, 약간의 값형의 성질을 가진다.
			- 박쥐
			
			1. 메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다.
			2. "문자열은 불변(Immutable)이다." > 한번 만들어진 문자열은 절대 수정할 수 없다.
			3. 문자열은 참조형이다.
		
		*/
		
		//m1();
		//m2();
		m3();
		
		
	}

	private static void m3() {

		//String vs StringBuilder
		// - 문자열 클래스
		
		
		String s1 = "홍길동"; //문자열 리터럴 사용 > 특혜
		String s2 = new String("홍길동"); //원래 이렇게 써야하눈뎅
		
		//StringBuilder s3 = "홍길동"; // > 리터럴 사용 불가
		StringBuilder s3 = new StringBuilder("홍길동"); // > 정석대로 사용 가능
		
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println(s3.length());
		
		//StringBuilder > 수정 작업 강하다.
		
		//String bs StringBuilder 소요시간 test
		
		long begin = System.nanoTime();
		
		//작업 > String
		String txt1 = "홍길동";
		
		for (int i=0; i<100000; i++) {
			txt1 = txt1 + ","; //수정 작업
		}
		
		long end = System.nanoTime();
		
		System.out.println(txt1.length()	);
		System.out.println(end-begin + "ns");
		
		//작업 > StringBuilder
		
		begin = System.nanoTime();
		
		StringBuilder txt2 = new StringBuilder ("홍길동");
		
		for (int i=0; i<100000; i++) {
			txt2.append("."); //txt2 = txt2 + "."
			
		}
		
		end = System.nanoTime();
		
		System.out.println(txt2.length()	);
		System.out.println(end-begin + "ns");
		
		//String 작업 시간: 2,442,289,600ns > 2.4s
		//StringBuilder 작업 시간: 2,687,700ns > 0.002s
		
		
	}

	private static void m2() {

		//문자열은 불변이다. > 되도록 하지 말아야하는 행동!!
		//1. 문자열의 잦은 수정
		//2. 커다란 문자열의 수정
		
		String txt1 = "홍길동";
		
		txt1 = txt1 + "님"; //수정
		System.out.println(txt1);
		
		//반복적인 수정은 쓰레기를 어마어마하게 만들어내기 때문!
		//heap내에서 참조가 끊기면 해당 상수는 쓰레기 = garbage가 된당.
		
		for (int i=0; i<100; i++) {
			txt1 = txt1 + "님";
		}
		System.out.println(txt1);
		
		//-------------------------------------------
		
		txt1 = "홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.";
		
		txt1 = txt1 + "!";
		System.out.println(txt1);
		
		
	}//m2

	private static void m1() {

		//**모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다.
		
		
		
		int n1 = 10;			//4byte
		int n2 = 2000000000;	//4byte
		
		
		//하나의 메소드 안에서 선언된 상수는 같이 사용된다.
		String s1 = "홍길동";
		String s2 = "안녕하세요. 홍길동입니다.";
		String s3 = "홍길동";
		String s4 = "홍";
		s4 = s4 + "길동";
		
		System.out.println(s1 == s3); //절대 사용 금지!! > Why? 메모리에서 주소값이 동일한지 아닌지를 비교하기 때문에...
		System.out.println(s1 == s4); // false
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4)); // equals는 heap에가서 비교하기 때문에!!
		
		//문자열이 메모리를 아끼기위해, 한번 만들어진 상수가 어디선가 똑같이 쓰이면 재사용하자!! > 덩치 큰 상수는 메모리에 하나만 존재하게 됨. > 메모리 절약을 위해 이런 절차 수립
		
		s1 = s1 + "님"; //홍길동 > 홍길동님 > heap속의 홍길동과 님을 합쳐 새로운 홍길동님이라는 상수를 만든다고 생각!
		//문자열만은 side effect가 없어야 ㅎ
		
		
	}
	
}
