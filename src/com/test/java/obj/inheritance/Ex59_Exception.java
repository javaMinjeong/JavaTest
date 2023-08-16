package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_Exception {

	public static void main(String[] args) {
		
		/*
			예외, Exception
			- 런타임 오류
			- 컴파일 발견(X) > 실행 중 발견(O)
			- 개발자 미리 예측(O) or 예측(X)(몰랐다)
			
			
			예외 처리, Exception Handling
			1. 전통적인 방식
				- 제어문 사용(조건문)
				
			2. 전용 방식
				- try catch finally 문 사용
		
		*/
		
		
		//m1();
		//m2();
		//m3();
		//m4();
		
		try {
			//m5();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		//각자 try catch로 처리하는 방식 > 지사 처리 방식(각자도생)
		//예외 미루기 > 본사 처리 방식 > main method 에서 예외 처리 방식 > 설계시 머리를 써서 구현해야 함!
		
		m6();
		
		try {
			int num = 0;
			System.out.println(100 / num);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//try catch절 사용 시, 절대 catch절을 비워두지 말 것!!!!! > 비워둘 경우 어디서 에러가 났는지 알 리가 없음~~~~컴파일에러도 아니고 런타임에런데 아무 문구가 없으면 어케 찾아어디서그런건지~~~~~~~~
		
		//코드조각 등록하기
		
		try {
			
		} catch (Exception e) {
			System.out.println("at Ex59_Exception.main");
			e.printStackTrace();
		}
		
		
		
		
	}

	private static void m6() {
		
		//예외 던지기
		
		//요구사항] 숫자 입력 > 처리
		//조건] 반드시 짝수만 입력
		//			홀수 입력 > 에러 처리
		
		int num = 5;
		
		if (num % 2 == 0) {
			System.out.println("업무 진행..");
		} else {
			System.out.println("예외 처리..");
		}
		
		//프로젝트 시, 웬만하면 if절로 예외 처리 or try catch로 예외처리 선택하여 코드작성해야 깔끔함
		
		//try 구현 > java가 이해하는 진짜 에러가 일어나지 않는 이상 사용 불가
		// 강제로 에러내는 방법을 알아보자!!
		try {
			if (num % 2 == 1) {
				throw new Exception("홀수 입력"); //주의! throw > 예외 던지기, throws > 예외 미루기!
				//자바는 try절에서 throw ~~문구를 만나는 순간 일을 중단하고 냅다 catch절로 이동한다. 들어오자마자 에러가 나면 안되니까 조건을 넣어서 사용!
			}
			System.out.println("업무 진행..");
		} catch (Exception e) {
			System.out.println("예외 처리..");
			System.out.println(e.getMessage());
		}
		
		
	}

	private static void m5() throws Exception {

		//예외 미루기 > 'throws Exception'
		//main method에서는 throws Exception을 적지 않는다!! > 후 처리할 애가 없으므로 예외를 인정하고 뻑을 내겠다는 뜻!
		
		BufferedReader reader
			= new BufferedReader(new InputStreamReader(System.in));
		
		//Unhandled exception type IOException
//		try {
//			String input = reader.readLine();
//		} catch (Exception e) {
//			
//		}
		
		String input = reader.readLine();
		
		
	}

	private static void m4() {
		
		try {
			
			//0으로 나누기 > ArithmeticException
			int num = 10;
			System.out.println(100 / num); // throw new ArithmeticException()
			
			//배열 첨자 > ArrayIndexOutOfBoundsException
			int[] nums = new int [3];
			nums[0] = 10; // new ArrayIndexOutOfBoundsException
			
			//널참조 > NullPointerException
			Scanner scan = null;
			scan.nextLine(); // new NullPointerException
		} catch (ArithmeticException e) { //자료형때문에 try가 던진 공을 잡는다.
			System.out.println("0으로 나누기");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자");
		} catch (NullPointerException e) {
			System.out.println("널참조");
		} catch (Exception e) {
			System.out.println("예외 처리"); // 앞 3명이 공을 다 못받을 경우 뒷처리를 해주기 위해 존재 like if절의 else 절! > 예측 못한걸 대비하여 보험처럼 작성
			//순서상 exception은 catch절의 맨 끝에 넣어줘야함!
			
		} // >>>> 상세한 예외처리는 못한다는 단점. detail이 떨어짐
						
	}

	private static void m3() {

		//0으로 나누기 > ArithmeticException
		try {
			int num = 10;
			System.out.println(100 / num);
		} catch (Exception e) {
			System.out.println("0으로 나누기");
		}
		
		//배열 첨자 > ArrayIndexOutOfBoundsException
		try {
			int[] nums = new int [3];
			nums[2] = 10;
		} catch (Exception e) {
			System.out.println("배열 첨자");
		}
		
		//널참조 > NullPointerException
		try {
			Scanner scan = null;
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("널참조");
		}
		
		// >>>>>>>> 가독성 떨어짐 > m4()를 보시오!
		
	}

	private static void m2() {
		
		int num = 0;
		
		try {
			//비즈니스 영역
			System.out.println(100 / num);
		} catch (Exception e) {
			//예외처리 영역
			System.out.println("예외 처리");
		} finally {
			//마무리 영역 > 무조건 실행되는 블럭 > 뒷수습
			// - 예외와 상관없이 항상 실행해야 하는 코드 블럭
			System.out.println("마지막");
		}
		
		//finally가 없는 try catch문이 압도적으로 많음!
		
		
		
	}

	private static void m1() {

		//요구사항] 숫자를 입력받아 연산을 하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		int num = scan.nextInt();
		
		//예외 처리 > 전통적인 방식 (예외가 발생할 수 있는 상황에 대한 사전 처리)
		
		//권장(보통 비즈니스코드를 '참' 자리에 넣고, 예외처리코드를 '거짓'자리에 넣는 편)
		if (num != 0) {
			//비즈니스 코드(=업무 코드) > 원래 목적!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		} else {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		//비권장 > 가독성
		if (num == 0) {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		} else {
			//비즈니스 코드(=업무 코드) > 원래 목적!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		}

		//결과가 똑같음에도 전자는 권장, 후자는 비권장인 이유는?
		// '가독성' 때문.
	
		
		//------------------------try catch finally
		
		//try 영역 > 감시!!(CCTV) > 예외가 발생하는지 감시
		//try catch에는 조건이 없다.
		//try는 아묻따 바로 들어와서 실행. try 블럭이 실행되면 다른 블럭은 쳐다도 안보고 빠져나감
		//try 아묻따 첫째줄 실행 > 둘째줄 에러 발생 > 프로그램 뻑이 안나는 대신 하던일을 멈추고 catch절로 이동
		
		//if문 vs try문
		// - if문: 사전에 미리 검사를 해서 사고가 안나게 처리
		// - try문: 일단 실행 > 감시!! > 사고가 터지면 그때 뒷처리
		
		
		
		
		
		try {
			System.out.println(1);
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			System.out.println(2);
		} catch (Exception e) {
			System.out.println("0을 입력하면 안됩니다.");
			
			//Exception e
			// - 예외 객체
			// - 예외의 상황을 전달
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
		
		System.out.println("종료");
		
		
		
		
		
	
	}//m1
}
