package com.test.java;

public class Ex20_Method {

	public static void main(String[] args) {
		
		//메소드 인자 리스트
		// - 파라미터(Parameter)
		// - 인자(Arguments)
		// - 매개변수
		
		//요구사항] '홍길동'에게 인사를 하는 메소드를 구현하시오.
		//추가사항] '아무개'에게 인사를 하는 메소드를 구현하시오.
		//추가사항] '하하하'에게 인사를 하는 메소드를 구현하시오.
		//추가사항] 우리 강의실의 모든 사람마다 각각 인사를 하는 메소드를 구현하시오. x 25개
		//추가사항] 대한민국 모든 사람 x 5174만개
		
		hello();
		hello2();
		hello3();
		System.out.println();
		
		//The method helloEveryOne(String) in the type Ex20_Method is not applicable for the arguments ()
		//소괄호 안에 
		//인자값이 없는 경우, 부를때도 아무것도 없이 부르나, 선언할때 인자값에 리스트가 있으면 호출할때도 리스트 있어야 함)
		//값 초기화는 호출하는쪽에서 대신한다. 인자 -> 매개 변수
		helloEveryOne("홍길동");
		helloEveryOne("아무개");
		helloEveryOne("하하하");
		System.out.println();
		
		//--------------------------
		checkAge(25);
		checkAge(30);
		System.out.println();
		
		//---------------------------
		checkScore("홍길동", 100, 90, 80);
		checkScore("아무개", 50, 60, 70); //실인자
		System.out.println();
		
		//The method checkScore(String, int, int, int) in the type Ex20_Method is not applicable for the arguments (String, int, int)
		//checkScore("하하하", 50, 60);
		
		//The method checkScore(String, int, int, int) in the type Ex20_Method is not applicable for the arguments (String, int, int, int, int)
		//checkScore("하하",10,20,30,40);
		
		//-------------------------------
		
		
		
	}//main
	
	
	//실제로 넘어가는 데이터들 = 실인자(real arguments?)
	//선언할 때 선언된 매개변수 = 가인자
	public static void checkScore(String name, int kor, int eng, int math) {
		
		//총점 > 250점 이상 합격
		int total = 0;
		
		total = kor + eng + math;
		
		String result = total >= 250 ? "합격" : "불합격";
		
		System.out.printf("%s 학생: %d점 = %s\n", name, total, result);
		
		
		
	}
	
	
	
	public static void checkAge(int age) {
		
		String result = age >= 19 ? "성인" : "미성년자";
		
		System.out.printf("%d살은 %s입니다.\n", age, result);
		
		
	}
	
	
	public static void hello() {
		
		System.out.println("홍길동님 안녕하세요.");
		
	}
	
	//변수명과 동일하게 메소드명도 동일명 존재자체는 가능할지라도 실행할 때 어느것을 실행할지 모르기때문에 안된다. 동일명 사용 불가.
	public static void hello2() {
		
		System.out.println("아무개님 안녕하세요.");
		
	}
	
	public static void hello3() {
		
		System.out.println("하하하님 안녕하세요.");
		
	}
	
	
	//메소드 선언부에들어가는 소괄호에서는 변수 초기화가 불가능(선언만 가능)
	public static void helloEveryOne(String name) {
		
		//String name = "이름";
		System.out.println(name + "님 안녕하세요.");
		
	}
	
	

	
	
}
