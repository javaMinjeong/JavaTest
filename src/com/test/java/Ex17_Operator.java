package com.test.java;

import java.util.Scanner;

public class Ex17_Operator {

	public static void main(String[] args) {

		/*
		 	논리 연산자
		 	- &&(and), ||(or), !(not), ^(xor)
		 	- 2항 연산자(&&, ||, ^)
		 	- 1항 연산자(!)
		 	- 피연산자를 대상으로 정해진 규칙에 따라 연산 결과를 반환
		 	- 피연산자의 자료형이 boolean이다.
		 	- 연산의 결과가 boolean이다. (boolean을 가지고 연산 후, 결과도 boolean으로 돌려줌.)
		 	
		 	
		 	서로 다른 조건을 가지고 값을 낼 때 -> 논리 연산자 사용
		 		ex) 소개팅 > 남자소개
		 		1. 키 180cm 이상
		 		2. 잘생길 것
		 		(두 조건을 하나라도 만족하지 못하면 소개팅을 안 할 것!)
		 	
		 	-----------------------------------------
		 	논리곱
		 	A && B =  ?
		 	
		 	- A에 올 수 있는 data: true, false
		 	- B에 올 수 있는 data: true, false
		 	
		 	연산의 결과로 나올 수 있는 것은 아래와 같이 4가지 경우의 수.
		 	T && T = T
		 	T && F = F
		 	F && T = F
		 	F && F = F
		 	(true = 1, false = 0 으로 생각하면 조금 더 쉬움! 위에거 외워야 함!)
		 
		 	-------------------------------------------
		 	논리합
		 	A || B = ?
		 	
		 	T || T = T (전류가 흐르는 상태 + 전류가 흐르는 상태 = 전류가 흐르는 상태. 산술연산이라고 생각하지 말 것!)
		 	T || F = T
		 	F || T = T
		 	F || F = F
		 
		 	--------------------------------------------
		 	부정 > 논리를 반대로 뒤집기
		 	!A = ? (피연산자의 위치는 ! 뒤에 옴)
		 	
		 	!T = F
		 	!F = T
		 	
		 	---------------------------------------------
		 	베타적 논리합
		 	A ^ B = ?
		 	
		 	(두 피연산자가 서로 똑같이 생기면 false, 서로 다르면 true)
		 	T ^ T = F
		 	T ^ F = T
		 	F ^ T = T
		 	F ^ F = F
		 
		*/
		
		System.out.println(true && true); //이렇게 단독으로 쓰이는 경우는 거의 없고,
		
		int age = 20;
		System.out.println((age > 19) && (age < 60)); //비교연산자와 같이 쓰이는 경우가 많음.
		//위 식에서 비교 > 논리 순으로 연산자 우선순위이므로 소괄호 안넣어도 됨.
		System.out.println();
		
		//--------------------------------
		
		/*
			대입 연산자, 할당 연산자
			- =
			- +=, -=, *=, /=, %= : 복합 대입 연산자
			- LValue(변수) = RValue(상수, 변수)
			- LValue와 RValue의 자료형은 반드시 동일해야 한다. > 만약 다르면 형변환.
			- 대입 연산자는 모든 연산자들 중 우선 순위가 가장 낮다.
			
			-----------------------------------------------
			
			연산자 우선 순위
			- 산술(*, / > +, -) > 비교 > 논리 > 대입
			
			------------------------------------------------
			
			연산자 연산 방향
			- 대입, 증감 : 오른쪽 > 왼쪽
			- 나머지 : 왼쪽 > 오른쪽
		
		*/
		
		int sum = 10 + 20 * 3;
		System.out.println(sum);
		System.out.println();
		// 하우에버! 우리는 + 와 *만 신경쓸 게 아니라, =까지 신경써야함.
		// 위 예시에서 총 3개의 연산자.
		
		//---------------------------------------
		int a1 = 10;
		int a2;
		int a3;
		
		a3 = a2 = a1; //대입연산자이므로 실행방향은 우측 > 좌측
		
		//-----------------------------------------
		
		//복합 대입 연산자
		
		int n = 10;
		
		//기존 n에 1을 추가하기 > 누적(***)
		n = n + 1;
		System.out.println(n);
		
		n += 1; //좌측의 식은 위측의 n=n+1;과 같다.
		System.out.println(n);
		
		n += 5;
		System.out.println(n);
		
		
		n = n - 2;
		System.out.println(n);
		
		n -= 2; // = 위측의 n=n-2;와 같다.
		System.out.println(n);
		
		
		n = n * 2;
		System.out.println(n);
		
		n *= 2;
		System.out.println(n);
		
		
		n = n / 5;
		System.out.println(n);
		
		n /= 5;
		System.out.println(n);
		
		
		n = 10;
		n = n % 3;
		System.out.println(n);
		
		n %= 3;
		System.out.println(n);
		
		//-------------------------------------
		
		/*
		
			증감 연산자(모든 연산자중에 가장 쉬운 연산자 라고 하심!)
			- ++(증가), --(감소)
			- 1항 연산자
			- 피연산자는 숫자형을 가진다.
			- 누적 연산을 한다. 기존의 값에 1을 더하거나, 1을 뺀다.
		
			*** 연산자의 위치를 바꿀 수 있다. > 연산자 우선 순위가 달라진다.
			1. ++n : 전위 배치(전치) > 연산자 우선 순위가 가장 높음 -> ()소괄호 빼고 얘가 일등! ->소괄호는 전교0등임.
			2. n++ : 후위 배치(후치) > 연산자 우선 순위가 가장 낮음 -> =대입연산자보다도 꼴등!
			
			*** 증감연산자를 다른 연산자와 한문장에서 사용하지 말것!!
			
		*/
		
		n = 10;
		
		n = n + 1;
		n += 1;
		++n;
		//위 3문장이 모두 동일.
		System.out.println(n);
		
		n = n - 1;
		n -= 1;
		--n;
		System.out.println(n);
		
		//--------------------------------------
		
		n = 10;
		//여기 못씀..!
		//선치 후치 부분
		
		
		//--------------------------------------
		n = 10;
		int result = 0;
		
		//result = 10 + ++n; //연산자 3개 중 ++중간 연산자가 1등 -> 1항 연산자니까 ++n 실행 > 11 -> + 연산자 2등 ==>값: 21
		
		++n;
		result = 10 + n; //->값 21 이거 위의 주석과 동일
		
		
		System.out.println(result); //값: 21
		
		n = 10;
		result = 0;
		
		//result = 10 + n++;
		
		result = 10 + n;
		n++; // 값 20 -> 위의 주석과 동일하나 가독성이 훨 좋음! + 증감연산자를 혼자 놔두는 방식을 통해서 우선순위를 안헷갈리게 만듦.
		
		
		System.out.println(result); //연산자 3개중 ++중간 연산자 꼴지. -> 10 + n = 20 > result 눈에는 ++이 안보이니까 ++하기 전에 20을 먼저 넣어버림.값: 20
		System.out.println(n); //값: 11
		
		//-----------------------------------------
		
		System.out.println("문제");
		int o = 10;
		System.out.println(--o-o--); //값:0....why?
		System.out.println();
		//이거 나중에 해보깅~
		//--o-o-- 3개 연산자 -> --먼저 > 9-o--> 그담 - > -1-- > 그담 -- > -2...? 답은 -2?
		
		//-----------------------------------------
		
		
		/*
		
			조건 연산자
			- ?: 
			- A ? B : C
			- 3항 연산자
			- A: boolean
			- B, C: 상수, 변수 > 데이터(문장이 오는 경우도 있으나, 보통 데이터가 옴)
			- A 조건이 참이면 B를 반환, 거짓이면 C를 반환
		
		*/
		
		boolean flag = true;
		String m1 = "참";
		String m2 = "거짓";
		
		//flag ? m1 : m2; ->반환값을 돌려주면 뭘 해야하는데 그게 없이 그냥 1+2; 여서 에러가 남.
		String result2 = flag ? m1 : m2;
		System.out.println(result2);
		
		//---------------------------------
		
		Scanner scan = new Scanner(System.in); //필요할 때 마다 반복적으로 사용되는 코드들은 외우면 좋음!(복붙해도 문제될 것 없는 코드들) -> 이클립스 코드 조각에 넣어두면 사용하기가 좀 더 쉬워짐. 코드조각? 자동완성을 말함
		//코드조각 등록 방법.
		//Window - preferences - template - new 에서 등록~!
		
		System.out.print("나이: ");
		
		age = scan.nextInt();
		
		//19세 이상 60세 미만 > 통과, 아니면 거절
		result2 = (age >= 19 && age < 60) ? "통과" : "거절";
		System.out.printf("입력한 나이 %d세는 %s입니다.\n", age, result2);
		
		//3항 연산자 > if문 사용
		//닭잡는 칼 vs 소잡는 칼. 적재적소에 맞는 연산자 쓰세용~
		
		//-------------------------------------------
		
		//비트 연산자(=말그대로 비트 연산을 하는 애.) -> 비트대 비트 논리 연산.(값 전체 논리 연산이 아님)
		//: 비트 단위 연산(일반적인 프로그램 개발에서는 안쓰고, 네트워크 프로그래밍할 때 사용)
		int a = 10;
		int b = 3;
		
		//아까 && ||는 피연산자로 boolean이 왔는데 얘는 아님!
		System.out.println(a & b); //값: 2
		System.out.println(a | b); //값: 11
		
		
		
	}

}
