package com.test.question;

public class Q009 {

	public static void main(String[] args) {
		
		/*
			요구사항]
			- 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
			
			조건]
			- String getName(String name)
				- name: OOO(이름)
				- return: OOO(이름)님
				
			호출]
			result = getName("홍길동");
			System.out.printf("고객: %s\n", result);
			
			result = getName("아무개")
			System.out.printf("고객: %s\n", result);
			
			출력]
			고객: 홍길동님
			고객: 아무개
			-----------------------------------
			1. 메소드 선언 > String getName(String name)
			2. main method에서 사용할 변수 선언 > String result
			3. 매개변수값 가공 > name + "님"
			4. 가공 값 반환
			5. 선언한 메소드 호출 > getName("홍길동")
			6. 반환값 출력 > printf("고객: %s님\n, result") 
		 
		 */
		
		//사용할 변수 선언 및 초기화
		String result = "";
		
		result = getName("홍길동"); //반환된 return값이 main result의 값으로 치환
		System.out.printf("고객: %s\n", result);
		
		result = getName("아무개");
		System.out.printf("고객: %s\n", result);
	
		
	}//main
	
		//name 을 매개변수로 가지는 getName 메소드 선언
		public static String getName(String name) {
			
			String result = name + "님";
			return result; //result 변수로 return값 반환
			
			
		
	}
	
}//class

//Code Review Summary: 전원 동일한 방식으로 새롭게 선언한 메소드에서 매개변수값 가공 및 return값으로 반환하여 출력
