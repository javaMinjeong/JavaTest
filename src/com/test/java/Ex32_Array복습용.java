package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex32_Array복습용 {

	public static void main(String[] args) {

		/*
			배열,Array
			- 자료 구조
			- 자료형 > 참조형
			- 집합 > 집합 자료형 > 데이터를 여러개 저장할 수 있는 자료형
			- 같은 자료형 / 같은 성격 > 집합
			
		*/
		
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//Q064();
		//Q066();
		//Q067();
		Q068();
		
	}//main

	private static void Q068() {

		//배열의 요소를 삭제하시오.
		
		//배열 오소 삭제 > Left Shift 발생
		
		int[] nums = {5, 6, 1, 3, 2, 8, 7, 10, 4, 9};
		
		int index = 2;
		
		System.out.println(Arrays.toString(nums));
		
		//루프변수 2~8까지 설정
		for (int i=index; i<nums.length-1; i++) {
			
			//왼쪽방 = 오른쪽방
			nums[i] = nums[i+1];
			
		}
		//만일 맨 뒤 요소까지 0이 아닌 숫자가 있다면 마지막 요소 nums[9]가 그대로남아있으므로, 문제에 마지막 요소는 0으로 채우라고 명시.
		//마지막방(인덱스)에 0을 채워줘야 하므로
		nums[nums.length-1] = 0; //오 !!내가 한거보다 이게 훨씬 깔끔하다!!!!!!!!
		System.out.println(Arrays.toString(nums));
		
	}//Q068

	private static void Q067() {

		//배열에 요소를 삽입하시오.
		
		//배열에서 요소가 왼쪽 혹은 오른쪽으로 이동하는 작업 = 'shift'
		//요소가 우측으로 이동했다 > Right Shift > 배열에 삽입할때 Right Shift 구현 필요
		//배열 삽입 >  Right Shift 구현(발생)
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[] {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		
		System.out.print("삽입 위치: ");
		int index = scan.nextInt();
		
		System.out.print("값: ");
		int value = scan.nextInt();
		
		System.out.println(Arrays.toString(nums));
		
		//Right Shift > 삽입할 위치 우측에 있는 요소들을 모두 우측으로 1칸씩 이동시키기
		//우측에서 좌측으로 옮겨야 하는데 내가 필요로하는 루프변수는 2~8 (마지막 한칸은 버려야하니까)
		for (int i=nums.length-2; i>=index; i--) {
			//오른쪽방 = 왼쪽방
			nums[i+1] = nums[i];
		}
		System.out.println(Arrays.toString(nums));
		
		nums[index] = value;
		System.out.println(Arrays.toString(nums));
		
		//모르면 외우면서라도 기억해두기!!!!!!!
	}

	private static void Q066() {
		
		//중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		
		//로또 다섯개 만들때는 이렇게!!
		int[] lotto = new int[6];
		
		for (int j=0; j<5; j++) {
			
			for (int i=0; i<lotto.length; i++) {
				
				//갓 만든 따끈따끈한 난수를 배열에 넣기 전에, 난수 생성후
				int n = (int)(Math.random()*45) +1;
				
				//중복검사하고
				if (isDuplicate(lotto, n)) {
					//이 true에 들어오면 중복된 숫자는 사라지기 때문에 배열의 길이에 비해 중복된 수가 적어지는 현상 발생
					i--; //루프변수의 값을 조절해서 한바퀴를 되돌리면 그만큼 더 돌겠지...? WOW....
				} else {
					
					//[메소드]중복값이 있니? 아니(false) > 배열에 넣기
					lotto[i] = n;
				}
				
				
			}
			
			Arrays.sort(lotto);
			System.out.println(Arrays.toString(lotto));
			
			
		}
		System.out.println();
		
		
		
		//----------------이 아래가 문제풀이!!
		for (int i=0; i<lotto.length; i++) {
			
			//갓 만든 따끈따끈한 난수를 배열에 넣기 전에, 난수 생성후
			int n = (int)(Math.random()*45) +1;
			
			//중복검사하고
			if (isDuplicate(lotto, n)) {
				//이 true에 들어오면 중복된 숫자는 사라지기 때문에 배열의 길이에 비해 중복된 수가 적어지는 현상 발생
				i--; //루프변수의 값을 조절해서 한바퀴를 되돌리면 그만큼 더 돌겠지...? WOW....
			} else {
				
				//[메소드]중복값이 있니? 아니(false) > 배열에 넣기
				lotto[i] = n;
			}
			
			
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		
	}

	private static boolean isDuplicate(int[] lotto, int n) {

		//집합인 배열과 숫자 n 이 넘어왔다!
		//배열을 탐색하라!
		for (int i=0; i<lotto.length; i++) {
			if (lotto[i] == n) {
				return true; //중복이닷! 메소드 탈출!
			}
		}
		
		return false; //중복된거 없어요
	}

	private static void Q064() {
		
		//1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
		
		int[] nums = new int[20];
		int max = 0;
		int min = 21;
				
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 20)+1;
		}
		System.out.println(Arrays.toString(nums));
		
		//가장 큰수 or 가장 작은수를 찾는 알고리즘
		//Max, Min 넣을 변수를 새로 만들고 배열 내 모든 숫자들과 비교하여 작거나 큰 값을 해당 변수에 넣어서 비교하며 찾는 방법
		
		//각각의 값을 max|min과 비교해서 처리
		for (int i=0; i<nums.length; i++) {
			
			if (nums[i] > max) {
				max = nums[i];
			}
			
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		
		
	}

	private static void m13() {
		
		int[] nums = { 5, 3, 1, 4, 2 };
		
		Arrays.sort(nums); //Quicksort implementations > 퀵정렬 > 오름차순 정렬
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m12() {

		//정렬
		// - 요소간의 크기 비교 > 재배치
		
		//1. 오름차순
		//	a. 숫자: 작은 수 > 큰 수
		//	b. 문자열: 문자코드값 순으로
		//	c. 날짜시간: 과거 > 미래 
		
		//2. 내림차순
		//	a. 숫자: 큰 수 > 작은 수
		//	b. 문자열: 문자코드값 역순으로
		//	c. 날짜시간: 미래 > 과거
		
		//정렬 구현
		//1. 개발자 구현
		//2. JDK or Library 사용
		
		//버블 정렬 > 타 정렬 알고리즘보다 느림.
		//오름차순 정렬
		int[] nums = { 5, 3, 1, 4, 2 };
		
		System.out.println(Arrays.toString(nums)); //원본
		System.out.println();
		
		for (int i=0; i<nums.length-1; i++) { // i = 0, 1, 2, 3 > Cycle
			
			for (int j=0; j<nums.length-1-i; j++) { //비교 후 스왑
				
				if (nums[j] > nums[j+1]) { //오름차순
				//			<			   //내림차순
					
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				
			}
			
		}//for
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m11() {

		//배열 초기화 리스트
		int[] nums = new int[3];
		System.out.println(Arrays.toString(nums));
		
		//초기화
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		System.out.println(Arrays.toString(nums));
		
		//초기화 리스트
		int[] nums2 = new int[] { 100, 200, 300 };
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = { 100, 200, 300 };
		System.out.println(Arrays.toString(nums3));
		
		
		String[] names1 = new String[3];
		
		names1[0] = "홍길동";
		names1[1] = "아무개";
		names1[2] = "하하하";

		String[] names2 = { "홍길동", "아무개", "하하하" };
		
		System.out.println(Arrays.toString(names1));
		System.out.println(Arrays.toString(names2));
		
		
		
		
		
	}//m11

	private static void m10() {

		//int a; //null
		//System.out.println(a);
		
		//배열 자동 초기화
		// - 배열(참조형)은 생성 직후에 자동으로 초기화가 된다.
		
		//초기화 규칙
		//1. 정수배열 > 0
		//2. 실수배열 > 0.0
		//3. 문자배열 > \0
		//4. 논리배열 > false
		//5. 참조형배열 > null
		
		
		
		int[] nums = new int[3]; //int x 3
		System.out.println(nums[0]); // >값이 없는데 컴파일 에러 안남. > ? 값이 있음. '0'
		System.out.println(Arrays.toString(nums));
		
		double[] nums2 = new double[3];
		System.out.println(Arrays.toString(nums2));
		
		char[] list1 = new char[3];
		System.out.println(Arrays.toString(list1)); //\0 > 사람 눈에 안보임
		
		boolean[] list2 = new boolean[3];
		System.out.println(Arrays.toString(list2));
		
		String[] list3 = new String[3];
		System.out.println(Arrays.toString(list3));
		
		
	}//m10

	private static void m9() {
		
		//유틸리티 클래스
		// - int > Integer
		// - double > Double
		
		//Arrays 클래스
		// - 배열 유틸리티 클래스
		
		int[] nums = new int[3];
		
		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;
		
		//배열의 상태가 궁금? > 출력!!
		//요거 하단 int[] nums 메소드로 생성함
		printArray(nums);
		
		//------------------------------------------------
		//덤프(dump): 객체의 상태를 하나의 문자열로 풀어내는 행동
		
		System.out.println(nums); //[I@7d6f77cc > @를 중심으로 두개의 데이터 출력 > [: 배열, I: Integer, 메모리 주소값 16진수 > 이 메모리 주소를 '해시코드'라고 부름. >> 배열은 그냥 출력했을 때 '아무 의미가 없다'.
		
		System.out.println(Arrays.toString(nums)); //외부 클래스는 import 해줘야 함!
		
		
		//깊은 복사 메소드
		int[] copy; //copy라는 참조변수 생성
		
		copy = Arrays.copyOfRange(nums, 0, nums.length);
		
		nums[0] = 1000;
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));
		
		
	}//m9
	
	public static void printArray(int[] nums) {
		
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}//printArray
	

	private static void m8() {

		//배열 복사 > 대부분이 얕은 복사, 가끔 깊은 복사를 구현해야 할 때가 생김.
		//1. 얕은 복사, ShallowCopy
		// - 주소값 복사
		// - Side Effect 발생
		
		//2. 깊은 복사, Deep Copy
		// - 요소 복사
		// - Side Effect 없음
		
		//개발자는 Stack에는 직접 접근 가능하나, Heap에는 direct로 직접 접근 불가. > Stack의 누군가를 통해서만 접근 가능.
		
		//---------------------------------------하단 깊은복사
		
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy = new int[3];
		
		for (int i=0; i<nums.length; i++) {
			
			//배열 = 배열 > X
			//int = int > 값형 복사
			copy[i] = nums[i];
		}
		
		nums[0] = 1000;
		
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
		
		
	}//m8

	private static void m7() {

		//배열 복사 - 얕은 복사
		
		
		//값형 복사 > Side Effect가 발생하지 않는다.
		int a = 10;
		int b;
		
		b = a;
		
		//원본 수정 > 복사본에게 영향을 미치는지 확인
		a = 20;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		
		//--------------------
		
		//***개발자가 만드는 모든 지역 변수는 Stack에 생성한다.
		//**new와 함께 적힌 애들은 Stack이 아니라 Heap에 잡힌다.
		int n = 10;
		
		
		
		//------------------------------
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy;
		
		//int[] = int[]
		//*** 배열 변수끼리의 복사는 주소값 복사다.
		copy = nums; //nums가 가진 주소값을 copy에도 저장하라!
		
		
		//원본 수정
		//*** nums와 copy는 같은 주소값을 가지고 ,같은 배열을 가리킨다. > 둘 중 하나를 조작하면 나머지 배열도 영향을 받는다. > Side Effect가 발생한다. > 조심!!!!!
		nums[0] = 1000;
		
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
		
	}//m7

	private static void m6() {

		//배열의 길이는 런타임 때 정할 수도 있다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생수: ");
		int count = scan.nextInt();
		
		int[] kors = new int[count];
		System.out.println(kors.length);
		
		
	}//m6

	private static void m5() {

		//*** 메모리의 공간은 한번 할당되면, 절대(100%)로 공간을 더 늘리거나, 줄일 수 없다.
		
		int n; //4byte
		
		//*** 배열은 처음부터 사용하는 최대 길이 미리 예측!!!!! > 나중에 수정 불가능!!
		
		
		int[] nums = new int[3]; //4byte x 3 = 12byte
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		//갑자기 > 방이 하나 더 필요함!!!(길이 조정이 불가능한 상황)
		//num[3] = 400; //100% 불가능 > 처음부터 사용 길이 예측해야 함!
		
		
	}//m5

	private static void m4() {

		//각 자료형
		
		//정수 배열(byte, short, int long)
		long[] list1 = new long[5];
		list1[0] = 100;
		System.out.println(list1[0]);
		
		//실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		//문자 배열(char)
		char [] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		//논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4 [0] = true;
		System.out.println(list4[0]);
		
		//참조형
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		//Calendar c1;
		//모든 자료형은 배열로 만들 수 있다.
		Calendar[] list6 = new Calendar[5]; //캘린더를 x 5개 생성 X > 캘린더를 저장할 수 있는 변수를 5개 생성한 것.
		list6[0] = Calendar.getInstance(); //이거까지 해줘야 캘린더 값이 들어감!!!
		System.out.printf("%tF\n", list6[0]);
		
		//Calendar c1 = Calendar.getInstance(); > 캘린더를 생성 변수 안에 저장한 것.
		
	}//m4

	private static void m3() {

		int[] nums = new int[3];

		//길이(방의 개수): 3
		//인덱스(방 번호): 0 ~ 2, 0 ~ 길이-1
		//방 1개(데이터): 요소(Element)
		
		
		//java.lang.ArrayIndexOutOfBoundsException:
		// - Index 3 out of bounds for length 3
		//nums[0] = 100;
		//nums[1] = 200;
		//nums[2] = 300;
		//nums[3] = 400;
		
		//입력
		
//		for (int i=1; i<=10; i++) {
//			
//		}
//		
//		for (int i=0; i<10; i++) {
//			
//		}

		//배열의 방을 원하는 순서대로 접근 > 탐색 > for문
		for (int i=0; i<nums.length; i++) {
			nums[i] = i;
		}
		
		//출력
		for (int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		
	}//m3

	private static void m2() {

		//요구사항] 학생 3명 > 국어점수 > 총점, 평균(실수)
		//추가사항] 학생 수 증가 > 300명

		//배열 선언하기(생성하기)
		// - 자료형[] 배열명 = new 자료형[길이]; >길이는 정수
		
//		int[] kors = new int[3];
//		
//		//배열의 방 갯수 == 배열의 길이
//		
//		//배열의 길이 확인하는 방법(배열명.length) > length 속성
//		System.out.println(kors.length);
//		
//		//(좌)int = (우)int
//		kors[0] = 100;
//		kors[1] = 90;
//		kors[2] = 80;
//		
//		int total = kors[0] + kors[1] + kors[2];
//		double avg = total / 3.0;
//		
//		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
		//-------------------------추가사항 해보기-----------
		
		int[] kors = new int[300];
		
		//배열의 방 갯수 == 배열의 길이
		
		//배열의 길이 확인하는 방법(배열명.length) > length 속성
		System.out.println(kors.length);
		//length 속성의 강점: 변수로 활용이 가능하다!!!!!
		
		//(좌)int = (우)int
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		//지금 시점에서는 하나하나 더할 수 밖에 없음 > 실제 프로그램 만들때는 다른 방법 사용
		//kors[3] = 80;
		//..
		//kors[299] = 100;
		
		
		int total = 0;
		
		for (int i=0; i<kors.length; i++) {
			total += kors[i];
		}
		
		double avg = (double)total / kors.length;
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
		
		
		
		
	}//m2

	private static void m1() {

		//요구사항] 학생 3명 > 국어점수 > 총점, 평균(실수)
		//추가사항] 학생 수 증가 > 300명
		
		int kor1;
		int kor2;
		int kor3;
		//학생 수 300명으로 증가 시 변수 +297개 추가 필요
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		//학생 수 300명으로 증가 시 초기값 +297개 추가 필요
		
		int total = kor1 + kor2 + kor3;
		//학생 수 300명으로 증가 시 총점 +297개 추가 필요
		
		double avg = total / 3.0; //casting 연산자를 쓰는 것보다 두 데이터중의 1개를 실수로 만드는게 더 간단하니 학생 수 3명을 3.0 실수로!
		//학생 수 300명으로 증가 시 3.0 -> 300.0으로 변경 필요
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
		
	}//m1

}//class
