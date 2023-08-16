package com.test.java.obj;

public class Ex42_Constructor {

	public static void main(String[] args) {
		
		//Cup.java
		
		/*
			생성자, Constructor
			- (특수한 목적을 가지고) 메소드
			- 멤버를 초기화하는 역할
			
		*/
		
		//자료형 변수명 = new 생성자();
		Box box = new Box();
		
		//***모든 참조형(배열 포함)은 객체 생성 직후 자동으로 멤버가 초기화가 된다.

		//new가 실행되고 Cup()이 실행됨.
		//1. new > 객체 생성 연산자 > 객체를 생성한다. (붕어빵을 만드는 역할)
		//2. Cup() > 매개변수가 없는 Cup이라는 메소드 호출. > 눈씻고 찾아봐도 없어요
		
		//1번 방법 new > yellow, 300
		//2번 방법 new > null, 0 > yellow, 300
		//위 둘이 프로시저가 다름. 생성자를 이용하여 객체가 처음 가지게 될 모습을 표현하는데 많이 씀.
		
		
		Cup c1 = new Cup();
		System.out.println(c1.info()); //해당 객체에 값을 준 적이 없는데 출력하면 색상: null, 크기: 0이 들어가있음.
		//배열에도 동일하게 값을 안넣어도 0으로 초기화 되어있던 것처럼..!
		
		c1.setColor("yellow");
		c1.setSize(300);
		System.out.println(c1.info());
		
		//new > 초기값에서 setter로 값을 다시 설정하면 기존 초기값은 붕뜨니까~~ 이걸 어떻게 할까?
		
		Cup c2 = new Cup();
		c2.setColor("green");
		c2.setSize(500);
		System.out.println(c2.info());
		
		
		Cup c3 = new Cup("pink");
		System.out.println(c3.info());
		
		Cup c4 = new Cup(350);
		System.out.println(c4.info());
		
		Cup c5 = new Cup("orange", 600);
		System.out.println(c5.info());
		
		//Cup() = The method Cup() is undefined > Cup()을 일반 메소드 취급
		//** 생성자는 반드시 new와 함께 사용이 가능하다. > 생성자는 평생 딱 1번만 호출이 가능하다.(객체가 태어나서 죽을때까지)
		//Cup();
		
		
		
	}//main
}//class
