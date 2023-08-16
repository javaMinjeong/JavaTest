package com.test.java;

public class Ex07_Variable {

	public static void main(String[] args) {
		
		//숫자형 데이터 > 저장할 변수가 필요한 경우
		// - 수치로서의 데이터 > 산술 연산의 대상 > 더하기 빼기
		// - 수치가 아닌 데이터 > 산술 연산의 대상X > String (단순히 아라비아 숫자로 계산한 데이터인 경우인가?)
		
		
		//1. 몸무게 > O
		int weight;
		weight = 70;
		
		//2. 주민등록번호 앞자리(990718) > X
		int jumin; // 애초부터 int로 타입을 설정한게 잘못!
		jumin = 990718;
		System.out.println("주민등록번호: " + jumin);
		
		jumin = 000717; //000718 쓰면 에러나는 이유 -> 8진법을 넘어가서
		System.out.println("주민등록번호: " + jumin);
		
		String jumin2;
		jumin2 = "000717";
		System.out.println("주민등록번호: " + jumin2);
		
		//생긴건 숫자 > 실제로 숫자 취급X
		// - 주민등록번호
		// - 학번
		// - 전화번호
		
		
		
		//자바 기수 표시법
		// - 숫자 데이터 표기 > 3개의 기수법 지원
		//1. 10진수 > 10   > 10
		//2. 8진수  > 010  >  8
		//3. 16진수 > 0x10 > 16
		
		//기수 표현에 상관없이 출력 > 10진수로 출력
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
		
		
		
		
		
	}
	
	
}
