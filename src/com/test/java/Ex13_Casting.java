package com.test.java;

public class Ex13_Casting {

	public static void main(String[] args) {

		/*
		
		
			형변환, (자료)형변환
			- Casting, Data Type Casting
			- 하나의 자료형을 또 다른 자료형으로 변환하는 작업
			- 코드 작성을 유연하게 하기 위해서 사용
			- int > double
			- float > short
			
			1. 암시적 형변환(자동 타입 변환)
				- 큰형 = 작은형
				- 100% 안전한 작업
				- 복사를 했을 때 원본과 항상 동일한 값 복사
				
			2. 명시적 형변환(강제 타입 변환)
				- 작은형 = 큰형
				- 경우에 따라 다르다.
				- 늘 신경써서 관리할 것!!
				
			명시적 형변환 시 발생하는 데이터가 넘치는 현상 > 오버플로우(Overflow)
			1. 위로 넘치는 현상 > Overflow
			2. 아래(음수)로 넘치는 현상 > Underflow
			1+2. 통상적으로 둘이 합쳐서 Overflow 라고 부름.
			
			*** 오버플로우가 발생할 만한 상황을 미리 예측해서 관리가 필요하다.
		
		
		*/
		
		byte a; //원본(1byte)
		short b; //복사본(2byte)
		
		//a = 10;
		a = Byte.MAX_VALUE;
		
		//암시적 형변환
		//short(2) = byte(1)
		//(자료형) : 형 변환 연산자
		
		b = a; //> 어? 데이터 형태가 다르면 = 등호 못쓰는데? 왜 되지?
		//컴파일러가 하단과 같이 바꿈
		//b = (short)a; //오른쪽 short, 왼쪽 short이기 때문에 에러가 안남! 형변환을 우리가 안하고 자바가 해줘서~!
		
		System.out.println(b);
		
		byte c = 10;
		long d;
		
		//큰형(8) = 작은형(1)
		d = c; //d = (long)c;
		
		System.out.println(d);
		
		
		//---------------------------
		
		short e; //원본
		byte f; //복사본
		
		e = 1000;
		
		//명시적 형변환
		//작은형(1) = 큰형(2)
		//Type mismatch: cannot convert from short to byte -> 형변환 적어주면 오류 clear
		f = (byte)e;
		
		System.out.println(f); //-24 -> 완전히 이상한 값 도출. 부호비트에 값이 들어가며 이상하게 꼬이는 경우도 있뜸!
		
		
		//은행 계좌
		int g; //복사본
		long h; //원본
		
		h = 3000000000L;
		
		//복사(계좌 이체)
		g = (int)h;
		System.out.println("이체 결과: " + g);
		
	}//main

}
