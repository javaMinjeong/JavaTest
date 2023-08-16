package com.test.question;

import java.util.Scanner;

public class Q091 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			연산식을 입력받아 실제 연산을 하시오.
			
			조건)
			산술 연산자만 구현하시오. (+, -, *, /, %) > 유효성 검사
			연산식의 공백은 자유롭게 입력 가능합니다. > replace
			산술 연산자가 반드시 존재하는지 체크하시오. > 연산자 유효성 검사
			피연산자의 갯수가 2개인지 체크하시오. > 유효성 검사
		
		
		*/
		
		//스캐너 생성 및 임포트
		Scanner scan = new Scanner(System.in);
		
		//사용할 변수 선언 및 초기화
		String expression = "";
		String operator = "";
		int n1 = 0;
		int n2 = 0;
		int result = 0;
		String[] temp = new String[2];
		
		
		//다시!!!******************
		
		//연산식을 입력받아
		System.out.print("입력: ");
		expression = scan.nextLine();
		
		//공백 자유롭게 입력 가능 > 공백 제거
		expression.replace(" ", "");
		
		//내가 실제 필요한건 연산자 기준 n1, n2 나눠서 연산 및 출력할때는 String result에 몰아 넣기
		operator = getOperator(expression);
		
		
		
		//연산자가 있어야만 split으로 길이2짜리 배열이 생기게 되니, 연산자 먼저 필터링
		if (!operator.equals("")) {
			//연산자 기준 나눠야 하니, String 배열 생성
			//TODO Dangling meta character '*' near index 0 > 이거 해결법이 \\붙이는거라고 구글링하면 나오는데 왜???인지..?
			temp = expression.split("\\" + operator);
			
			if (temp.length == 2) {
				//temp 배열 값 n1, n2에 치환
				n1 = Integer.parseInt(temp[0]);
				n2 = Integer.parseInt(temp[1]);
				
				if (operator.equals("+")) {
					result = n1 + n2;
				} else if (operator.equals("-")) {
					result = n1 - n2;
				} else if (operator.equals("*")) {
					result = n1 * n2;
				} else if (operator.equals("/")) {
					result = n1 / n2;
				} else if (operator.equals("%")) {
					result = n1 % n2;
				}
				
				System.out.printf("%d %s %d = %d\n", n1, operator, n2, result);
			
			} else {
				System.out.println("피연산자가 부족합니다.");
			}
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
		}
		
		
		}//main
		
		private static String getOperator(String expression) {
			
			if (expression.contains("+")) {
				return "+";
			} else if (expression.contains("-")) {
				return "-";
			} else if (expression.contains("*")) {
				return "*";
			} else if (expression.contains("/")) {
				return "/";
			} else if (expression.contains("%")) {
				return "%";
			}
			return "";
			
		}//getOperator
		
	
}//class
