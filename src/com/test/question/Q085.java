package com.test.question;

import java.util.Scanner;

public class Q085 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			주민등록번호 유효성 검사를 하시오.
			
			조건)
			- '-'의 입력 유무 상관없이 검사하시오.
			
			1. 사용 변수 선언
			2. 주민등록번호 입력받아
			3. 입력받은 주민등록번호에 계산식 작성하여 유효성 검사후
			4. 조건걸어서 유효성번호가 주민등록번호 마지막자리와 일치할 경우 "올바른~" 출력, 아닐경우 "올바르지 않은~"출력
			
		*/
		
		Scanner scan = new Scanner(System.in);
		
		//사용 변수 선언
		String jumin = "";
		int sum = 0;
		int[] nums = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		
		//주민등록번호 입력받아
		System.out.print("주민등록번호: ");
		jumin = scan.nextLine();
		
		//입력받은 주민등록번호 유효성 검사
		for (int i=0; i<12; i++) { //각 자리마다 nums의 수 곱하여 합 계산
			sum += Integer.parseInt(jumin.substring(i, i+1)) * nums[i];
			System.out.println(sum);
		}
		
		//Integer.parseInt는 char에 사용 불가 > The method parseInt(String) in the type Integer is not applicable for the arguments (char)
		//charAt을 사용하면 숫자가 유니코드 값으로 나옴.
		
		sum = sum % 11; //11 - (합을 11로 나눈 나머지) = 유효성 번호 > 10 이상일 경우 1의자리 반영
		sum = 11 - sum;
		sum = sum % 10;
		
		if (sum == Integer.parseInt(jumin.substring(12,13))) {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
		
	}//main
}
