package com.test.java.obj.inheritance;

public class Ex51_interface {

	public static void main(String[] args) {
		
		/*
			인터페이스, interface
			- 클래스의 일종(선언도 클래스 밖에서 선언)
			- 자료형(클래스도 자료형임다)
			- 객체를 생성할 수 없다.
			- 참조 변수는 생성할 수 있다.
			- 클래스의 부모 역할 > 상속 관계
			
			
		
		*/
		
		//인터페이스로는 객체를 못 만든다.
		//Mouse m1 = new Mouse(); //Cannot instantiate the type Mouse
		//m1.click();
		
		//*** 인터페이스는 상속받는 여러 클래스들을 행동(사용법, 메소드)들을 통일시키는 역할 > 행동 규약 정의
		
		M705 m1 = new M705();
		m1.click();
		m1.click();
		
		
		G304 m2 = new G304();
		//m2.click(); 아 맞다 이 제품은 click이 push를 사용했쮜!
		//m2.push(); //*** 문제점! > 사용자 경험을 살리지 못함!!!!!
		//인터페이스 상속 후에는 m2.click() 사용 가능
		m2.click();
		
		
	}//main
}//class

//인터페이스 선언
interface Mouse {
	
	//인터페이스 멤버
	// - 멤버 변수
	// - 멤버 메소드
	// - 인터페이스는 추상 멤버만을 가질 수 있다.(추상 메소드)
	
	//***** 인터페이스는 구현된 멤버를 가질 수 없다.
	//public int a;
	//public void aaa() {  }
	
	//***** 인터페이스는 구현부를 가진 메소드를 소유할 수 없다.
//	public void aaa() {
//		//구현부
//	}
	
	//구현부가 없는 메소드를 만들 수가 있다.
	//추상 메소드, Abstract Method
	// - 구현부 없이 선언부만 가지는 메소드
	public void click(); //구현부가 없는 메소드(이름은 있는데 내용물이 없는 메소드)
	
}

//부모가 인터페이스일경우 키워드는 'extends'가 아니라 'implements' 사용
//The type M705 must implement the inherited abstract method Mouse.click()
//*** 인터페이스를 상속받는 클래스는 반드시 인터페이스의 추상 메소드를 구현해야 한다.
class M705 implements Mouse {

	//@Override
	public void click() {
		System.out.println("클릭");
	}
	
	//추상 메소드를 구현했다.(정확한 표현) > 일종의 오버라이드
//	public void click() { 
//		
//	}
}

//M705와 G304는 마우스라는 분류에는 들어가지만 실제로는 다른 제품 > 구현될 수 있는 내용이 달라질 수는 있으나, 마우스라는 성질은 똑같다.
class G304 implements Mouse {
	//M705의 click()와 동일한 기능 > 제품이 달라서 사용법이 다르다~
//	public void push() {
//		System.out.println("클릭!!");
//	}

	@Override
	public void click() {
		System.out.println("클릭!!");		
	}
	
}





