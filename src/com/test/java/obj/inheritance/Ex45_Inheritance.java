package com.test.java.obj.inheritance;


public class Ex45_Inheritance {

	public static void main(String[] args) {
		
		//어려운 파트!!!!!!!!!!!!!!집중!!!!!!!!!!!!!!!!!
		
		/*
		 	상속, Inheritance
		 	- 부모가 가지는 재산을 자신에게 물려주는 행동
		 	- 부모 클래스가 가지는 재산(클래스가 소유하고 있는 것 > 변수, 메소드)을 자식 클래스에게 물려주는 행동
		 	- 자식 클래스가 코드를 구현하지 않아도, 부모 클래스로부터 구현된 코드를 물려받는 행동
		 	
		 	상속. 왜 해요? WHY?
		 	- 비용 절감
		 	- 코드 재사용(*************************************) > 생산력 증가
		 	
		 	상속 관계에 있는 클래스 호칭
		 	- 부모 클래스 <- 자식 클래스
		 	- 슈퍼 클래스 <- 서브 클래스
		 	- 기본 클래스 <- 확장 클래스
		 	- 기본 클래스 <- 파생 클래스
		 	
		 
		 
		 */
		
		//Parent 객체 생성
		Parent p = new Parent();
		
		//본인 객체의 변수니까 p.찍으면 a,b 보임
		p.a = 10;
		p.b = 20;
		
		//Child 객체 생성 > Child 클래스 내 아무것도 구현 안해놓음 > . 찍었을때 아무것도 없어야하나 a, b가 보임 > 부모가 물려준 멤버 가져옴
		Child c = new Child();
		
		c.a = 10; //부모 클래스가 물려준 멤버
		c.b = 20;
		c.aaa(); //변수뿐만 아니라 부모 클래스의 메소드도 상속 가능.
		
		c.c = 30;
		c.d = 40;
		c.ccc();
		//상속이 되면 점점 내용물이 늘어남 > 내가 구현한 것 뿐만 아니라 부모가 구현한 것 까지 추가되기 때문. 부모가 가진것을 자식도 가지고 있기 때문에 '복사' 개념으로 보기!
		
		
	}//main
}//class

//부모 클래스
class Parent {
	//private 생성이 맞으나 그럴경우 getter,setter 생성까지 필요하니 지금은 public으로 간단하게 생성함
	public int a;
	public int b;
	
	public void aaa() {
		System.out.println("aaa");
	}
	
}

//자식 클래스
class Child extends Parent {
	
	//자식 본인만의 멤버 생성 > 부모가 물려준거 외에 스스로 경제활동이라고 생각
	public int c;
	public int d;
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}

//회원
//1. 일반 회원
// - 이름
// - 아이디
// - 암호
// - 이메일

//2. 관리자 회원
// - 이름
// - 아이디
// - 암호
// - 등급

//부모 클래스 > 일반 회원과 관리자 회원이 공통으로 활용하는 코드
class Member {
	public String name;
	public String id;
	public String pw;
	
	
}



//일반회원
class User extends Member {
	
	public String email;
	
}

//관리자회원
class Administrator extends Member {

	public String lv;
	
}

//상속은 되물림 될 수 있다.(4-5개 관계까지 상속하는건 흔한 일. But 너무 많아지면 관리가 힘듦)
class AAA {
	public int a = 10;
}

class BBB extends AAA {
	public int b = 20;
}

class CCC extends BBB {
	public int c = 30;
}

class DDD extends CCC {
	public int d = 40;
}