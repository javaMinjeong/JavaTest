package com.test.java;

public class Ex21_Method {

	public static void main(String[] args) {

		
		//public static void hello(String name) {}
		//void
		
		//메소드 반환값(리턴값)
		// - 메소드가 실행 후 호출한 곳으로 돌려주는 값
		
		//자기일만 하고 끝나는 형태. 매개변수도 없고 반환값도 없음.
		//내 리모컨 가져가서 저기에 가져다 놔. 매개체가 있음.
		//일을 시키고 나한테 와. -> 호출인에게 결과 보고 후 돌려주는 값(리턴값) -> 매개체 O 반환값 O
	
		getNum(); // 만나면 getNum() Method 실행 -> return값 들고 -> method를 종료한 후에 -> 자기를 호출했던 쪽으로 돌아감.->따로 출력한게 아니면 메모리에만 생기겠쥬?
		System.out.println(getNum());
		System.out.println();
		
		//--------------------------
		
		String result = getName("홍길동");
		System.out.println(result);
		System.out.println();
		//---------------------------
		
		
		
	}//main
	
	public static String getName(String name) {
		
		return "고객명: " + name;
		
		
		
	}
	
	
	
	
	public static int getNum() {
		
		//return문
		// - 메소드 종료
		// - 값을 반환
		return 100;
		//head의 'int'와 body의 'return'은 짝꿍
		//ex) head 'String' body '100' Error -> string이라하고int반환해서
		
		//Unreachable code -> return문을 만나면 메소드 종료하기 때문에 만날 기회가 없음!
		//System.out.println("테스트");
		
		
	}
	
	

}
