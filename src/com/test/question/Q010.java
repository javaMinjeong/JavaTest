package com.test.question;

public class Q010 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			- 숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
			
			조건]
			- void digit(int num)
			- 3항 연산자 사용(조건문 사용 금지)
			- 입력한 숫자가 4자리 이상이면 그대로 출력한다.
			
			호출]
			digit(1);
			digit(12);
			digit(321);
			digit(5678);
			digit(98765);
			
			출력]
			1 → 0001
			12 → 0012
			321 → 0321
			5678 → 5678
			98765 → 98765
			-------------------------
			1. 메소드 선언 > void digit(int num){}
			2. 매개변수 선언 > int result = 0;
			3. 매개변수값 가공
				> result = 조건 ? 참 : 거짓
			4.digit 메소드 내 가공값 출력
			5. 메소드 호출
			
		*/
		
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
		
	}//main
	
		public static void digit(int num) {
			
			String result = "";
			result = num >= 1000 ? "" + num : (num >= 100 ? "0" + num : (num >= 10 ? "00" + num : ("000" + num)));
		
			System.out.printf("%d → %s\n", num, result);
		
	
		
	}//digit
	
	
	
}
