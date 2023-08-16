package com.test.java;

import java.util.Scanner;

public class Ex31_while {

	public static void main(String[] args) {

		/*
			반복문
			1. for문
			
			2. while문
			3. do while문 > 거의 안쓰는 구문 > 적용할만한 업무가 거의 없음.
			
			4. for문

			
			if(조건식) {
				문장;
			}
			
			
			//선 조건 후 실행
			while (조건식) {
				문장;
			} //if문을 여러개 겹쳐놓은것과 같다고 보면 됨!
		
		
		
			//실행문 먼저 실행 > 조건 만족 시 다시 실행문으로 
			//선 실행 후 조건
			do
			{
				문장;
			} 
			while (조건식);
			
		*/
		
		//m1();
		//m2();
		//m3();
		m4();
		
		
		
	}

	private static void m4() {

		//콘솔 > UI > 프로젝트 적용
		//자판기
		//1. 메뉴 출력
		//2. 선택
		//3. 결과
		//1~3 반복
		
		Scanner scan = new Scanner(System.in);
		
		int sel = 0; //사용자 선택 메뉴 번호
		boolean loop = true; //반복 조건 > 루프 변수
		
		//true라는 상수가 아니라 true값을 가진 loop라는 변수를 사용하는 이유는?
		// > 제어하기가 편함. ex) while문 안에 for문이 있다. while문을 빠져나오고 싶다고 한다면, loop = false;
		while (loop) {
			
			menu();
			
			sel = scan.nextInt();
			scan.skip("\r\n");
			
			if (sel == 1) {
				//콜라 처리
				m1(scan);
			} else if (sel == 2) {
				//사이다 처리
				m2(scan);
			} else if (sel == 3) {
				//커피 처리
				m3(scan);
			} else {
				//루프 종료
				loop = false;
			}
			
		}//while
		
		System.out.println("프로그램 종료");
		
	}//m4

	private static void m3(Scanner scan) {
		System.out.println("커피~~~~");
		pause(scan);
	}

	private static void m2(Scanner scan) {
		System.out.println("사이다~~~~");
		pause(scan);
	}

	private static void m1(Scanner scan) {
		System.out.println("콜라~~~~");
		pause(scan);
	}

	private static void menu() {
		System.out.println("====================");
		System.out.println("        자판기");
		System.out.println("====================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 커피");
		System.out.println("4. 종료");
		System.out.println("--------------------");
		System.out.print("선택(번호): ");
	}

	private static void pause(Scanner scan) {
		//프로그램을 잠시 중단(콘솔 ver.) > 블럭
		System.out.println("계속하려면 엔터를 입력하세요.");
		scan.nextLine();//이게 콘솔에서 일시정지!!!! 앞에 숫자 받은 \r\n 삭제해주고~~ 삭제안해주면 무한 반복
	}

	private static void m3() {
		
		//1~10까지 누적하시오.
		
		//for문 사용
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//while문 사용
		sum = 0;
		int num = 1;
		
		while (num <= 10) {
			sum +=num;
			num++;
		}
		System.out.println(sum);
		
		
		
	}//m3

	private static void m2() {
		
		//while 사용
		int num = 11;
		
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		
		//do while 사용
		num = 11;
		
		do {
			System.out.println(num);
			num++;
		} while (num <= 10);
		
		
	}

	private static void m1() {

		//요구사항] 1~10까지 출력하시오.
		
		//for문으로 할 수 있는 모든 문 <-> while문으로 할 수 있는 모든 문 >> 서로 완전 대치 가능
		//for문 문제 while로 풀면 while문 문제가 됨.
		
		//방법 1) for문 사용
		for (int i=1; i<=10; i++) { //초기식; 조건식; 증감식
			System.out.println(i);
		}
		System.out.println();
		System.out.println();
		
		//방법 2) while문 사용
		int num = 1;//초기식 > 조건 통제역할
		
		while (num<=10) { //변화를 가지는 유일한 애: num > num을 이용하여 조건 만들기
			System.out.println(num);
			num++; //증감식
		}
		System.out.println();
		System.out.println();
		
	}

}
