package com.test.java;

import java.util.Scanner;

public class Ex12_Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Wrpper Class
		//               추가기능(핵심기능) 감싸서 새로운 무언가
		
//		System.out.print("문자열: ");
//		String line = scan.nextLine(); //reader.readLine()
//		System.out.println(line);
		
//		System.out.print("숫자: ");
//		int num = scan.nextInt(); //Integer.parseInt("100")을 안해도 됨~!
//		System.out.println(num);
		
		//숫자 2개 입력 > 연산
		
		System.out.print("첫번째 숫자: ");
		
		//String input = reader.readLine();
		//int num = Integer.parseInt(input);
		
		double num1 = scan.nextDouble();
		
		System.out.print("두번째 숫자: ");
		double num2 = scan.nextDouble();
		
		System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, num1 + num2); //scanner는 위에 throws exception도 안적어도 됨.
		//메인은 스캐너로 연습 하고 BufferedReader 보조로 연습하기!
		
		
	}
	
	
}
