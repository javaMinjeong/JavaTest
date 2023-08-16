package com.test.java;

import java.util.Scanner;

public class Ex29_for {

	public static void main(String[] args) {

		//제어문 > 조건문
		//제어문 > 반복문
		
		
		/*
		
			반복문
			- 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
			- 생산성 향상 + 유지보수성 향상
			
			for문
			
			for (초기식; 조건식; 증감식) {
				문장;
			}
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6(); //오 요거 좀 헷갈 다시봥
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		m15();
		
		
		
	}//main

	private static void m15() {

		//난수 만들기, Random
		// - 임의의 수
		
		//1. Math 클래스 > 대중화 방법(다른 언어에서도 흔하게 사용)
		//2. Random 클래스 > 자바 방법
		
		System.out.println(3.14);
		System.out.println(Math.PI);
		
		System.out.println(Math.abs(10));		
		System.out.println(Math.abs(-10));		
		System.out.println();
		
		//Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0.
		//Returned values are chosen pseudorandomly(유사 난수) with (approximately)uniform distribution from that range.
		//0.0 ~ 0.99999999999
		
		for (int i=0; i<10; i++) {
			//System.out.println(Math.random()); //쓸만한 값이 없으니 가공 필요!
			
			//0.0 > 0
			//0.1 > 1
			//0.15 > 1
			//0.2XX > 2
			//0.3XX > 3
			//..
			//0.9XX > 9
			
			//0~9 사이의 난수
			//System.out.println((int)(Math.random() * 10));
			
			//1~10 사이의 난수
			//System.out.println((int)(Math.random() * 10) + 1);
			
			//4~7 사이의 난수
			//0~3 사이의 난수 + 4 [시작 숫자를 0으로 바꾸기 > 각 -4]
			System.out.println((int)(Math.random() * 4) + 4);
	
		
		}

	}

	public static void m14() {
		
		//빈 리턴문
		//- 값을 반환하는 목적이 아니라
		//- 메소드를 중단하는 역할만 한다.
		return;
	}
	//이상한 점1) void는 값을 return 하지 않음
	//이상한 점2) return 뒤에 값이 없는데 오류가 안 뜸.
	//위 점을 역으로 잘 이용하여 흐름을 통제할 때 사용
	
	
	
	//This method must return a result of type int
	// > 모든 경우의 수 > 반드시 return문이 존재해야 함.
	public static int m13() {
		
		int num = 10;
		
		//하기 상황은 num이 사용자 입력값이라면 if의 조건이 true 일지, false 일지 알 수 없음
		//경우의수 끝에 return문을 생성한다면, 모든 경우의 수에 return문이 존재해야 함!
		if (num % 2 == 0) {
			return 10;
		} else {
			return 0; //else절을 생성할 경우, false 경우의 수에도 return문을 만나기 때문에 에러 없이 가능!
		}
		
	}
	
	public static int m12() {
		
		return 10; //메소드 자료형타입의 값을 반환해야 에러 안남
	}
	
	
	private static void m11() {

		//요구사항] 사용자 숫자 입력 > 입력받은 숫자 누적 > 입력 횟수? > m6()
		//추가사항] 홀수만 입력~(짝수는 입력 중단)
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; //누적 변수
		int num = 0; //사용자 입력값
		
		//루프를 몇바퀴 돌려야할지 모르는 상황(사용자가 입력한 횟수만큼이라)
		//회전수를 예측하기 힘들 때 > 무한루프와 break문 적절히 사용
		for (;;) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) { //짝수 입력
				//break;
				return; //자신이 속한 method를 빠져나감
			}
			
			sum += num;
			
		}
		
//		System.out.println(sum); //Unreachable code > return이 아니라 break로 가야 해당 코드까지 도달.
		//보통은 break가 맞는데 가끔씩 return으로 탈출하는 작업도 함!
		
	}

	private static void m10() {

		//학교 담임 선생님 > 학생 상담 > 1번 ~ 30번
		
//		for (int i=1; i<=30; i++) {
//			
//			//일이 생겨서 상담을 갑자기 그만둬야되면, 그만둬야할 조건 만들기
//			if (i == 16) {
//				break; //오늘은 일이 생겨서 15번 학생까지만 상담합시당!
//			}
//			
//			System.out.printf("%d번 학생 상담중..\n", i);
//		}
		
		for (int i=1; i<=30; i++) {
			
			if (i == 10 || i == 15) {
				continue; //10번, 15번 학생 오늘 결석이라 이 친구 빼고 상담하자구!
			}
			
			System.out.printf("%d번 학생 상담중..\n", i);
		}
		
		//굳이 따지자면 일반적으로 break를 쓰는 경우가 多
		
	}

	private static void m9() {

		//break, continue > 독립적 사용 불가 > 다른 제어문과 함께 사용
		
		//break > 자신이 속한 제어문을 탈출(if문 예외, 인식 불가)
		
		//continue > 실행 > 제어문의 시작으로 이동(처음으로 돌아가세요.) -> 이번 판만 쉴게용!!
		
		//독립적 사용 불가 예시
//		for (int i=1; i<=10; i++) {
//			
//			break; //break > 자신이 속해있는 제어문을 탈출하는 역할 > for문 탈출
//			
//			//System.out.println(i); Unreachable code
//		}
		
		for (int i=1; i<=10; i++) {
			
			if (i == 5) {
				//break; //Why? 여기서 for문 빠져나가는지? > if문은 예외임. 인식 못함. > if문에 있다고 인식 못하고 for문 탈출
				continue;
			}
			
			System.out.println(i);
		}
		//루프변수를 이용하여 직접 통제 or break를 가지고 강제적으로 통제해야 하는경우가 있다.
		//break와 continue를 적절하게 쓰면 일반 제어와 다른 제어를 만들어 낼 수 있다!
		
		
	}

	private static void m8() {

		//무한 루프, Infinite Loop
		//1. 사용자 실수 > 수정
		//2. 사용자 의도 > 어떻게?
		
		int num = Integer.MIN_VALUE;
		System.out.println(num);
		
		num--;
		System.out.println(num);

		//정확히 따지면 아래 for문은 무한루프는 아님!
		//무한 루프(X) > 21억바퀴 > 최저값 -21억 > 넘어가면 underflow 발생 으로 양수 > 언젠가 조건이 성립하지 않는 값이 나옴.(이유는 위에 코드)
//		for (int i=0; i<10; i--) {
//			System.out.println(i);
//		}
		
		//무한루프
		//조건식을 항상 만족시킨다면? > 진정한 무한루프
		//+21억 overflow 발생 > 음수 전환 > 계속 누적 + > 무한반복
//		for (int i=0; true; i++) {
//			System.out.println(i);
//		}
		
//		for (int i=0; ; i++) {
//			System.out.println(i);
//		} //조건식 비워도도 true로 취급!!
		
//		for (;;) {
//			System.out.println("반복문");
//		}//초기식, 조건식, 증감식 모두 필수는 아님!
		
	}

	private static void m7() {

		//요구사항] 구구단 출력
		
		/*
		
			5 x 1 = 5
			5 x 2 = 10
			5 x 3 = 15
			..
			5 x 9 = 45
		
		*/
		
		//절차 1) 형태 반복
//		for(int i=0; i<9; i++) {
//			System.out.println("5 x 1 = 5");
//		
//		}
		
		//절차 2) 1~9 > 루프변수 변경
//		for(int i=1; i<=9; i++) {
//			System.out.printf("5 x %d = 5\n", i);
//			
//		}
		
		//절차 3) 결과값 변경
		for(int i=1; i<=9; i++) {
			System.out.printf("5 x %d = %2d\n", i, 5 * i);
			
		}
		
		//----------------------------------------------------
		//요구사항] 사용자가 원하는 단 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단: ");
		int dan = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
			
		}

		
	}

	private static void m6() {

		//요구사항] 사용자로부터 숫자 10개를 입력받아 누적?
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; //누적변수
		
		//반복된다 싶으면 일단 for문으로 묶기!
		//10번을 돌리면 되는거니까 이 변수에서는 루프변수를 쓸 일이 없으니 식은 맘대로~!
		//***누적변수의 초기화는 for문 밖으로!!!!!!!!!!! > 이 실수 다수 발생!!!!!!!!!!!!!!!!!!
		for (int i=0; i<10; i++) {
			System.out.print("숫자: ");
			int num = scan.nextInt();
			sum += num; //사용자 입력 숫자 > 누적
		}
		System.out.println(sum);
		
	}

	private static void m5() {

		//요구사항] 1 ~ 사용자가 원하는 숫자까지의 합?
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		int sum = 0; //누적변수
		
		//몇회전? 컴파일 시점 > 알 수 없음, 런타임 시점 > 알 수 있음 
		for (int i=1; i<= num; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d = %d\n", num, sum);
		
	}

	private static void m4() {

		//요구사항] 1~10까지의 합 > 누적
		
		//누적하기
		//1) 누적 변수 생성(반드시 초기화)
		//2) 내가 원하는 숫자를 얻기 위한 for문을 만든다.
		//3) 누적 변수에다가 숫자를 연산한다.
		
		
		int sum = 0;
		//null은 연산의 대상이 될 수 없기 때문에, 반드시 초기화를 해줘야 함!!!!!
		//0이라고 넣어야지만 내가 하는 누적작업에 영향을 미치지 않기 때문에, 일반적으로 누적변수는 0으로 초기화함.
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			sum += i; //sum = sum + i;
			//1 = 0 + 1
			//3 = (0 + 1) + 2
			//6 = (0 + 1 + 2) + 3
			//10 = (0 + 1 + 2 + 3) + 4
			//...
			//45 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8) + 9
			//55 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) + 10
		}
		System.out.println(sum);
		
	}

	private static void m3() {

		//반복문 > 루프변수?
		//2. 루프 변수의 역할 > 회전수 or 값
		
		//요구사항] 숫자 1~10까지 출력
		
		//1nd
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println();
		
		//2nd > 같은 내용이 반복되는 코드는 좋은 코드가 아니다. 절대 쓰지 말 것!
		int num = 1;
		
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		System.out.println();
		
		//3rd
		num = 1;
		for (int i = 0; i<10; i++) {
			System.out.println(num + ":" + i);
			num++;
		} 
		System.out.println();
		//위 코드에서 num도 변수, i도 변수 > 두 변수는 변화가 굉장히 닮아있음.
		
		//4th > 굳이 num변수가 필요 없어도 되니까 i를 1로 바꿔보자!
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		//조건식을 10,000으로 바꾸면 값도, 회전수도 쉽게 수정이 가능!
		//루프변수가 값을 제공하는 역할이 굉장히 중요!!
		
		//5th
		for (int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println(); //1~10사이의 홀수값
		
		for (int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println(); //1~10사이의 짝수값
		//업무할때도 이런 수열을 많이 사용함! > 반복문이 큰역할!!

	}

	private static void m2() {

		//반복문 > 회전수?
		//1. 반복문의 실행 횟수를 내가 제어할 수 있는지?
		
		for (int i=1; i<=5; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for (int i=5; i<=9; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for (int i=1; i<=9; i=i+2) {
			System.out.println("실행문");
		}
		System.out.println();

		for (int i=5; i>0; i--) {
			System.out.println("실행문");
		}
		System.out.println();
		// > 똑같은 회전수를 만드는 for문은 정말 다양~~하게 나올 수 있다.
		//   통상적으로 1씩 증가하는 for문 많이 사용!
		
		
		
	}

	private static void m1() {

		//요구사항] "안녕하세요" x 5회 출력
		
		//Case 1. (직접 5번 출력)
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println();
		
		//Case 2. (method로 빼기 > 하나의 행동을 정의하고 호출을 반복) *1번보다 좋은 점: 코드 분리 구현 > 식별 용이, 수정 및 관리 용이
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
		
		//Case 3. (반복문 사용)
		//초기식: 보통 변수 1개를 만들어서 초기화 하는 작업을 함.
		//조건식: 초기식에서 만든 변수에 특정 조건을 검.
		//증감식: 초기식에서 만든 변수에 값을 변화시킬 수 있는 식 입력.
		//-------------------for문 실행 순서
		//1. int i=1
		//2. i<=5
		//3. (조건이 참이면,) 블럭(문장) 실행
		//**반복문은 }를 만나면 탈출하는게 아니라, 식으로 되돌아감 > 증감식으로 되돌아감.
		//4. i++ (증감식 실행)
		//5. i<=5
		//6. 블럭(문장) 실행
		//7. i++
		//8. i<=5
		//9. 블럭(문장) 실행
		//...
		//조건식이 false면 블럭을 실행시키지 않은 채 바깥으로 빠져나가고 끝.
		//--------------------------각 식별 역할
		//초기식: 루프 변수(i)를 초기화하는 역할
		//조건식: 루프 지속 유무 조건
		//증감식: 루프 변수에 변화를 주는 역할 > 언젠가 루프 탈출(false) 
		
		for (int i=1; i<=5; i++) {
			System.out.println("안녕하세요.");//x5회
		}
	
	
	}//m1

	public static void hello() {
		System.out.println("안녕하세요.");
	}
	
	
}
