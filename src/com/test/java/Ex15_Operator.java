package com.test.java;

public class Ex15_Operator {

	public static void main(String[] args) {

		/*
		
			연산자, Operator
			- 수학 연산자 > (대부분) > 프로그래밍 연산자
			- 피연산자를 대상으로 미리 정해진 행동(연산)을 한 후에 행동(연산)의 결과를 반환하는 요소
			- 주로 기호를 많이 사용 + 단어도 많이 사용
			
			1. 문장, Statement
			2. 표현식, Expression
			3. 연산자, Operator
			4. 피연산자, Operand
			5. 연산자 우선 순위
			6. 연산자 연산 방향
			
			문장, Statement
			- 1개 이상의 표현식이 모여서 문장을 만든다.
			- int sum = 10 + 20;
			
			표현식, Expression
			- 문장을 구성하는 최소 단위 > 하나의 완성된 문장을 만들 수 있는 최소 표현
			- int sum; -> 변수 선언 -> 하나의 표현식.
			- 10 + 20 -> 하나의 표현식.
			- sum = 30 -> 하나의 표현식.
			
			연산자, Operator
			- +
			- =
			
			피연산자, Operand
			- + : 10, 20
			- = : sum, 30
			
			연산자 우선 순위
			- 하나의 문장에 속해있는 연산자들 중 누가 먼저 실행하는지에 대한 규칙
			- 1 + 2 * 3
			
			연산자 연산 방향
			- 하나의 문장에 속해있는 연산자들 중 우선 순위 동일하면 누가 먼저 실행하는지에 대한 규칙
			- 대부분: 왼쪽 > 오른쪽 실행  **반대 방향인 경우가 몇가지 없기 때문에 반대방향만 기억하면 됨!**
			- 1 + 2 + 3
		
		
			연산자 종류
			1. 행동(목적)
				a. 산술 연산자
				b. 비교 연산자
				c. 논리 연산자
				d. 대입 연산자
				e. 증감 연산자
				f. 조건 연산자
				g. 비트 연산자
				
			2. 용법(피연산자 개수)
				a. 1항 연산자
				b. 2항 연산자
				c. 3항 연산자
				
				
			산술 연산자
			- +, -, *, /, %(mod, 나머지)
			- 2항 연산자(->반드시 피연산자가 2개다.)
			- 피연산자를 숫자형을 가진다. (정수, 실수)
		
		*/
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b); // 3(몫)-> 소수 이하가 안나옴 => 몫
		System.out.printf("%d %% %d = %d\n", a, b, a % b); //1(나머지)IllegalFormatFlagsException -> 형식 문자 잘못
		//%를 escape 시켜야 함! -> %%
		
		System.out.println();
		
		double c = 10;
		double d = 3;
		System.out.printf("%f / %f = %f\n", c, d, c / d); //동일한 연산자라고하더라도 피연산자의 자료형에 따라 결과가 다르게나옴. 몫이 소수점까지 나옴.
		
		System.out.println();
		
		System.out.println(10 / 3);     //정수/정수 = 정수 3
		System.out.println(10.0 / 3.0); //실수/실수 = 실수 3.333333333333333
		System.out.println(10.0 / 3);   //실수/정수 = 실수 3.333333333333333
		System.out.println(10 / 3.0);   //정수/실수 = 실수 3.333333333333333
		System.out.println();
		
		//System.out.println(100 / 0); ArithmeticException: / by zero
		System.out.println(100 / 0.0); //피제수나 제수 둘중의 하나가 실수가 되면 가능.
		System.out.println(-100 / 0.0);
		
		//----------------------------7/19(수)-----------------------------------------------------
		
		//*** 모든 산술 연산자의 결과 자료형은
		//	  두 피연산자의 자료형 중 더 크기가 큰 자료형으로 반환된다.
		System.out.println(10 / 3);     //int / int = int
		System.out.println(10.0 / 3);   //double / int = double (둘 중에 double이 더 커서 double 반환)
		System.out.println(10 / 3.0);   //int / double = double (둘 중에 double이 더 커서 double 반환)
		System.out.println(10.0 / 3.0);   //double / double = double
		System.out.println();
		
		int e = 1000000000;
		int f = 2000000000;
		
		System.out.println(e + f); //30억 > -1,294,967,296 > int + int = int 30억 -> overflow 발생
		//그럼 위 연산의 결과를 30억을 표현하는 자료형이 되게끔 하려면 어떻게 해야할까?
		//두 자료형중 1개를 int 보다 큰 long으로 바꿔주면 됨!
		System.out.println((long)e + f); //3,000,000,000
		System.out.println();
		
		e = 300000;
		f = 500000;
		System.out.println(e * f); //150,000,000,000 > -323855360 > overflow 발생
		System.out.println(e * (long)f); //150000000000
		System.out.println();
		
		e = -2100000000;
		f = 100000000;
		System.out.println(e - f); //2,094,967,296 > overflow 발생???맞나 이따 다시 한번 읽어보기
		System.out.println();
		
		//----------------------------------------------
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3;
		
		//예외 상황 > byte, short 연산 결과는 무조건 int 이다 > CPU 처리단위
		//(피연산자중 더 큰 자료형이 연산의 결과다. 라는 게 절대적인게 아님!)
		//byte + byte = byte(X) -> byte를 읽어갈때는 byte만 읽어가는게 아니라 나머지 남는 3byte자리까지 가져가기때문에 효율성 때문에 이런 상황 발생
		//byte + byte = int(O)
		//short + short + short(X)
		//short + short = int(O)
		
		//Type mismatch: cannot convert from int to byte
		//b3 = b1 + b2; -> Error -> 명시적 형변환을 하라
		b3 = (byte)(b1 + b2);
		System.out.println();
		
		//***위와 같은 이유 > 정수 사용 > byte, short를 거의 사용 안함
		//	 정수 > 주로 int 사용(그 이유중에 하나가 바로 위와 같은 상황. casting 해야 하는 상황 발생)
		
		//-----------------------------------------------
		
		System.out.println(10 % 3);
		System.out.println(10 % 4);
		System.out.println(10 % 5);
		System.out.println(10 % 10);
		System.out.println(10 % 11); //몫이 없기 때문에 나머지가 10!
		//나머지 연산자를 꽤 많이 씀! -> 특정 텀을 두고 반복되는 것을 만들 때, 홀짝수 구분할 때, 달력 등..
		
		//나머지 연산자
		// - 패턴
		
		System.out.println();
		System.out.println(10 % 2);
		System.out.println(11 % 2);
		//위와 같이 홀짝 구분도 나머지 연산자로 가능!
		
		
		
		
		
		
	}

}
