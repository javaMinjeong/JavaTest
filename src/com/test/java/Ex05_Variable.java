package com.test.java;

public class Ex05_Variable {

	public static void main(String[] args) {
		
		//모든 자료형(8종류) + 변수 생성하기
		
		//빨간 밑줄 > 에러 > 컴파일 에러
		
		//정수 > byte(1), short(2), int(4), long(8)
		
		byte b1;
		b1 = 100;
		System.out.println(b1);
		
		//Type mismatch: cannot convert from int to byte
		//b1 = 128;
		//b1 = -129;
		
		b1 = Byte.MAX_VALUE;
		System.out.println(b1);
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		
		
		short s1;
		s1 = 128;
		System.out.println(s1);
		
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		
		s1 = Short.MIN_VALUE;
		System.out.println(s1);
		
		
		
		int n1;
		n1 = 1000000;
		System.out.println(n1);
		
		n1 = Integer.MAX_VALUE;
		System.out.println(n1);
		
		n1 = Integer.MIN_VALUE;
		System.out.println(n1);
		
		
		
		long l1;
		l1 = 100;
		System.out.println(l1);
		
		l1 = 1000000000;
		System.out.println(l1);
		
		//The literal 3000000000 of type int is out of range
		//l1 = 3000000000;
		l1 = 3000000000L;
		System.out.println(l1);
		// ----> max value가 30억이 넘는데 왜 30억은 안될까? ----> 상수 뒤 L 붙이면 됨! 자세한 사유는 노션에..
		
		l1 = Long.MAX_VALUE;
		System.out.println(l1);
		
		
		//1. 변수
		//2. 상수(-> 변하지 않음. = 수정할 수 없음)
		//	a. 이름이 있는 상수 > final 변수 > 변수명 > 대문자로만 작성 > Constant
		//	b. 이름이 없는 상수 > 순수 데이터 > 리터럴(Literal) -> 이름 있는 상수와 구분하기위해 자바는 이렇게 사용
		
		System.out.println(100); // -> 100은 상수. 저 100은 뭘 의미하는지 모름 -> 이름이 없는 상수 -> 정수형 리터럴
		
		final byte KOR = 100; //-> 이름이 있는 상수(일반적인 상수) 자바는 final이라는 키워드를 앞에 붙이다보니, final 상수, 상수, final 변수 등으로 불림
		//final 변수 명은 다 대문자로 써야 함!! 대문자로 써야 다른 사람들이 해당 변수 건들지 않음!
		//절대로 건들면 안되는 값에 final 변수를 사용~! 보편적으로는 그냥 변수 사용.
		
		//The final local variable kor cannot be assigned. It must be blank and not using a compound assignment
		//kor = 90; //수정 가능 하므로 변수.
		
		//LValue(변수) = RValue(상수, 변수)
		//********** LValue와 RValue는 자료형이 동일해야 한다.
		
		b1 = 10; //byte
		s1 = 10; //short
		n1 = 10; //int
		l1 = 10; //long
		
		
		int n2;
		n2 = 10;
		
		//*** 정수형 상수가 int 일까?
		// - 운영체제 + CPU
		// - 운영 체제가 한번 처리하는 데이터의 양이 int 자료형이 된다.
		
		//운영체제
		// - 8bit 운영체제 > int > 1byte
		// - 16bit 운영체제 > int > 2byte
		// - 32bit 운영체제 > int > 4byte
		// - 64bit 운영체제 > int > 8byte(X) > 여전히 4byte(O)
		//이런 base 때문에 대대로 정수형 상수가 int로 취급되어 옴.
		//기억해! 상수는 integer다.
		
		//----------------------------------------------------------------
		
		// - 정수형 리터럴은 int
		
		//실수
		// - 실수형 리터럴은 자료형이 뭘까? double
		
		
		//단정도형
		float f1;
		f1 = 3.14F; //Type mismatch: cannot convert from double to float
		//뒤에 F붙이면 float형 실수가 됨!(대소문자 구분X)
		System.out.println(f1);
		
		
		//배정도형
		double d1;
		d1 = 6.28D; // double의 D는 생략 가능
		System.out.println(d1);
		
		f1 = 123.1234567890123456789012345678901234567890F;
		d1 = 123.1234567890123456789012345678901234567890D;
		
		System.out.println(f1);
		System.out.println(d1); //float 대비 자리수 더 detail하게 표현해줘서 정밀도가 높다고 함.
								//소수에서 뿐만 아니라 정수에서도 그렇다. 아래를 봐보시오!
		
		f1 = 123456789012345678901234567890F;
		d1 = 123456789012345678901234567890D;
		
		System.out.println(f1);
		System.out.println(d1);
		
		double d2 = 0.25;
		System.out.println(d2);
		
		double d3 = 0.1;
		System.out.println(d3);
		
		System.out.println(0.1 + 0.2); //약간의 오차 발생
		
		//정수형 > 4가지 > int(주력), long(가끔)
		//실수형 > 2가지 > double(주력)
		//---> 사람도 필통안에 펜이 많아도 선호하는 펜만 쓰듯이, 선호하는 도구위주로 씀
		
		//--------------------------------------------
		
		//문자형
		char c1;
		c1 = 'A'; //A cannot be resolved to a variable > 문자 리터럴
		//일반적인 단어가 오면 예약어(?)가 아닌 이상 변수로 취급. 그러므로 문자 데이터임을 표시할 때는 ' ' 표시
		System.out.println(c1);
		
		c1 = '가';
		System.out.println(c1);
		
		c1 = '@';
		System.out.println(c1);
		
		c1 = '1'; //숫자 1과 문자 '1'은 똑같지 않다.
		System.out.println(c1); //문자코드값 49
		//											0011 0001
		
		int n = 1; // 0000 0000 0000 0000 0000 0000 0000 0001
		
		//c1 = '홍길동'; //Invalid character constant
		//문자 상수는 1글자만 표현 가능.
		
		//홍길동이라는 이름을 저장하고 싶은 경우,
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		//-----------------------------------------------------------
		
		//논리형
		// - true, false
		
		boolean flag;
		
		flag = true; //논리형 상수(리터럴) -> boolean은 true 혹은 false로 표현한다.
		flag = false;
		
		System.out.println(flag); //화면에 찍히기보다 내부적으로 조건을 판단할 때 사용
		
		//------------------------------------------------------------
		
		
		//참조형
		// - String
		
		//String
		// - 문자열
		// - 문자 열 > 문자들이 열을 지어있는 형태 > 문자 집합 > char가 여러개..
		// 주의* 대문자로 시작하며, 자주색으로 변하지 않음! -> 나중에 배울 때 이유 나옴
		
		String name;
		
		name = "홍길동";  //홍길동 cannot be resolved to a variable
						//문자열 상수(리터럴) 표기법
						//" " 안에 Enter 오면 안됨~~!
		
		System.out.println(name);
		
		
		String nick = ""; //space bar도 글자중에 하나! -> 문자 리터럴 안에 아무것도 없는것을 -> 빈문자열, Empty String
		System.out.println(nick);
		
		
		//연산자 일부
		// - 대입 연산자
		// - 산술 연산자
		
		int a1 = 10;
		int a2 = 20;
		int a3 = a1 + a2; //산술 연산자(+)
		
		System.out.println(a3);
		
		String t1 = "홍";
		String t2 = "길동";
		String t3 = t1 + t2; //산술 연산자(X) > 문자열 연산자(O) concat
		
		System.out.println(t3);
		
		//요구사항] 숫자 2개를 연산과정과 함께 결과를 출력하시오.
		// 10 + 20 = 30
		
		a1 = 10;
		a2 = 20;
		a3 = a1 + a2;
		
		System.out.println("10 + 20 + 30");
		
		System.out.println(a1 + " + " + a2 + " = " + a3);
		System.out.println(a1 + " + " + a2 + " = " + a1 + a2);
		//보통 같은 항렬의 연산자는 순서가 상관이 없으나 컴퓨터는 그걸 몰랑~~ 무조건 왼쪽부터 연산함.
		//왼쪽 숫자 + 오른쪽 문자 -> +는 문자열 연산자 ---------------왼쪽에 있는 애는 문자열, 오른쪽은 숫자 니까 고럼? 문자+숫자니까 문자열로..
		//특정 연산을 먼저 하길 원하면 소괄호 붙이면 됨!
		System.out.println(a1 + " + " + a2 + " = " + (a1 + a2));
				
		
	}
	
	
	
}
