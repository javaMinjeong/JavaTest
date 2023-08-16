package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		
		/*
		 	요구사항] 
		 	- 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		 			
		 	조건]
		 	- 세금: 수입의 3.3%
		 	
		 	입력]
		 	- 한달 수입 금액(원): 1000000
		 	
		 	출력]
		 	세후 금액(원): 967,000원
		 	세금(원): 33,000원
		 	-------------------------------------
		 	1. 입력 > scanner 생성
		 	2. 사용할 변수 선언 및 초기화 > int income, int afterTaxIncome; int tax;
		 	3. 입력 문구 출력 > print
		 	4. 연산
		 	5. 출력 > printf("%,d\n %,d\n", afterTaxIncome, tax)		 		
		 	
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int income = 0;
		int afterTaxIncome = 0;
		int tax = 0;
		
		System.out.print("한달 수입 금액(원): ");
		income = scan.nextInt();
		
		afterTaxIncome = (int)(income * 0.967);
		tax = (int)(income * 0.033);
				
		System.out.printf("세후 금액(원): %,d원\n세금(원): %,d원\n", afterTaxIncome, tax);
		
	}
	
}
