package com.test.java;

public class Ex14_Casting {

	public static void main(String[] args) {

		//정수형 리터럴은 int이다.
		//실수형 리터럴은 double이다.
		
		//byte = int
		//작은형(1) = 큰형(4)
		byte b1 = 10; // 어? 가운데 (byte) 안적었는데? -> 서비스 문법 -> 예외적으로 byte 변수나 short 변수에 값을 넣을 때는 자동으로 됨.
		//단, 이경우는 애초에 들어갈 수 없는 상수면 컴파일 에러를 만들기 때문에 오버플로우가 안생김.
		
		//short = int
		//작은형(2) = 큰형(4)
		short s1 = 10;
		
		//int = int
		int n1 = 10;
		
		//long = int
		//큰형(8) = 작은형(4)
		long l1 = 10;
		//long l1 = (long)10; 가운데 long이 생략된거나 같음.
		
		//float = double
		//작은형(4) = 큰형(8)
		float f1 = (float)3.14;
		//float f1 = 3.14F; -> 간단하게 형변환

		//double = double
		double f2 = 3.14D;
		
		
		//---------------------------------------------------------------------
		
		//정수 > 실수
	
		int n2 = 100; //원본(4byte)
		float n3; //복사본(4byte)
		
		//위 2개는 범위가 똑같음.
		
		//형변환
		//float = int
		//4byte = 4byte
		//암시적 형변환 > 안전
		n3 = n2;
		System.out.println(n3); //100.0
		
		int n4;			//복사본
		float n5 = 100; //원본
		
		//Type mismatch: cannot convert from float to int
		//형변환
		//int = float
		//4byte = 4byte
		//명시적 형변환
		n4 = (int)n5;
		System.out.println(n4);
		
		//int가 더 작고 float이 더 크다고 생각.(int에는 50억 못넣지만 float에는 넣을수 있음. 물리적으로는 4byte이지만 내부는 다르다.)
		
		//***정수와 실수간의 크기 비교는 단순하게 byte로 하는게 아니라 실제 표현 가능한 숫자의 범위로 비교해야 한다.
		
		//int(4) < float(4)
		//long(8) < float(4)
		//float은 0을 250개까지 붙일 수 있기때문에... 넘사벽
		
		//크기 정리
		//byte(1) < short(2) < int(4) < long(8) <<< float(4) < double (8)
		
		//char > 겉보기는 문자, 속으론 숫자 > 프로그램 입장 > 숫자 취급
		char m1;  //2byte
		short m2; //2byte
		
		m1 = 'A';
		
		//형변환
		//short = char
		//2byte = 2byte > 둘 중에 한개를 더 크게 보고있다는 상황.
		m2 = (short)m1; //short < char 캐릭터가 더 크다!
		System.out.println(m2); //대문자 A의 문자코드값. 65
		
		char m3;
		short m4;
		
		m4 = 65;
		
		//형변환
		//char = short
		//2byte = 2byte		
		m3 = (char)m4; //엥? char가 더 큰데? 왜 에러가 나지?
		
		//똑같은 자료형을 뒤집으면 하나는 명시적 하나는 암시적일수밖에없음. 근데 위의 사례는 둘다 명시적.
		
		System.out.println(m3);
		
		
		//ㅇㅎ!!!short는 음수부터 양수까지 범위지만,
		//char는 0부터 65535까지~~
		
		
		int m5;
		char m6;
		
		m5 = 44032;
		System.out.println((char)m5);
		
		m6 = '가';
		System.out.println((int)m6);
		
		
		//*** 값형끼리 형변환
		//***값형과 참조형끼리는 형변환이 절대 불가능
		//***boolean 형변환 불가능(타 언어는 가능하나, Java는 불가능)
		//정수 > 정수
		//실수 > 실수
		//정수 > 실수
		//실수 > 정수
		//문자 > 정수 (사실 얘는 정수를 정수로 바꾼거이나 표면적으로는..문자>정수)
		//정수 > 문자
		
		
		//값형 <- (형변환O) -> 값형
		//값형 <- (형변환X) -> 참조형
		
		String a1 = "100";
		int a2;
		
		//"100" > 100
		
		a2 = Integer.parseInt(a1); //형변환X "이건 형변환이 아니다!" 매커니즘이 다르다!
		
		//값형과 참조형은 형변환을 할 수는 없지만, 별도의 수단을 통해서 변환 지원을 합니다.
		
		//-------------------------------
		
		//100 > "100"
		String a3;
		int a4;
		a4 = 100;
		//   String.valueOf(값형 데이터)
		a3 = String.valueOf(a4); //100 > "100" 잘 안씀
		
		a3 = a4 + "";//a4 뒤에 빈문자를 붙인 새로운 문자열 -> "100"
		
		
		
		
		
	}

}
