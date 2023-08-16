package com.test.java.obj.cast;

public class Ex56_Casting {

	public static void main(String[] args) {
		
		
		//프린터 기기
		// - LG500
		// - HP600
		
		//(interface 사용 전)
//		LG500 lg = new LG500();
//		HP600 hp = new HP600();
//
//		//같은 용도지만 두 클래스의 사용법이 상이
//		lg.on();
//		hp.powerOn();
//		
//		lg.print();
//		hp.printing();
//		
//		lg.off();
//		hp.powerOff();
		
		//(interface 사용 후)
		LG500 lg = new LG500();
		HP600 hp = new HP600();
		
		lg.powerOn();
		hp.powerOn();
		
		lg.print();
		hp.print();
		
		lg.powerOff();
		hp.powerOff();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//interface 사용한거에 여기에 형변환을 섞어보자
		Printer p1;
		LG500 lg2 = new LG500();
		
		//Printer = LG500
		//부모 = 자식
		//업캐스팅
		p1 = lg2;
		
		//업캐스팅
		Printer p2 = new HP600();
		
		Object o1 = new LG500();
		
		//상황] 프린터 판매 대리점 운영
		// - 재고
		//		- LG500 x 5대
		//		- HP600 x 3대
		// - 매일 업무
		//		- 프린터가 제대로 동작 > 기능 확인
		
		//추가상황] LG500 x 500대, HP600 x 300대
		//추가상황] BenQ700, Epson800 > 추가 브랜드(제품)
		//m1(); //가장 단순, 비효율
		//m2(); //배열처리
		m3(); //형변환을 이용한 방법
		
		
		
		
		
		
	}//main

	private static void m3() {

		//형변환 이용 > 하나의 배열로 통합 관리 가능
		Printer[] ps = new Printer[8]; //어? 인터페이스로는 객체를 못만드는데? 이건 객체를 만든게 아니라 프린터라는 타입을 넣을 수 있는 변수를 8개 생성한거라 가능
		
		//*** 서로 다른 클래스의 객체를 하나의 넣기!!
//		ps[0] = new LG500();
//		ps[1] = new HP600();
		
		//재고
		for (int i=0; i<ps.length; i++) {
			
			if (i < 5) { //앞에 5대는 lg 브랜드 프린터
				ps[i] = new LG500();
			} else { //뒤에 3대(나머지)는 hp 브랜드 프린터
				ps[i] = new HP600();
			}
		}
		
		//업무
		//인터페이스와 업캐스팅이 만나서 > 똑같은 매서드를 가졌고, 같은 배열에 들어갔고, 루프를 돌릴 수 있게되어 아주 간단한 루프 생성이 됨!
		for (int i=0; i<ps.length; i++) {
			ps[i].print();
			
			//추가 업무
			// - LG500 > selfTest()
			// - HP600 > clean()
			
			//자식타입을 부모한테 형변환하여, 부모한테는 selfTest(), clean()이 안보임!
			// 문제 > 본인들만의 고유한 코드 사용 불가 > 다운 캐스팅 진행
			
			//ps[i].?
			
			//객체 instanceof 클래스 > 앞 타입의 객체가 뒤의 클래스니? > 네or아니오
			//System.out.println(ps[i] instanceof LG500 );
			
			if (ps[i] instanceof LG500) {
				((LG500)ps[i]).selfTest();
			} else if (ps[i] instanceof HP600) {
				((HP600)ps[i]).clean();
			}
			
			
			
			//조건부에서 순서가 바뀌면 또 에러가 발생하니 다른 방법(위의 방법)을 사용!!
//			if (i<5) {
//				((LG500)ps[i]).selfTest(); //.과 형변환중에 .이 먼저 실행되기때문에 괄호로 묶고 . 찍으면 lg500의 참조변수타입이 보임
//			} else {
//				((HP600)ps[i]).clean();
//			}
			//업캐스팅 쓰는 이유? 서로다른프린터기를 한타입에 넣으려고
			//다운캐스팅 쓰는 이유? 일괄적 관리는 편하지만, 자식들이 갖는 본인의 특수한 기능을 쓸 수 없기 때문에 다운캐스팅 진행
		}
		
		
		
	}

	private static void m2() {
		
		//배열처리를 하자 > 개수증가는 손쉽게 처리 가능하나, 새로운 제품이 생기면 새로운 배열을 새로 만들어야 함!
		LG500[] lg = new LG500[5];
		
		for (int i=0; i<lg.length; i++) {
			lg[i] = new LG500();
		}
		
		HP600[] hp = new HP600[3];
		
		for (int i=0; i<hp.length; i++) {
			hp[i] = new HP600();
		}
		
		
		//업무
		for (int i=0; i<lg.length; i++) {
			lg[i].print();
		}
		
		for (int i=0; i<hp.length; i++) {
			hp[i].print();
		}
		
		
	}

	private static void m1() {
		
		//가장 단순한 방법, 비효율적인 방법
		LG500 lg1 = new LG500();
		LG500 lg2 = new LG500();
		LG500 lg3 = new LG500();
		LG500 lg4 = new LG500();
		LG500 lg5 = new LG500();
		
		HP600 hp1 = new HP600();
		HP600 hp2 = new HP600();
		HP600 hp3 = new HP600();
		
		//업무(모든 프린터 동작 여부 확인)
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();

		hp1.print();
		hp2.print();
		hp3.print();
		
	}
}//class

interface Printer {
	void print();
	void powerOn();
	void powerOff();
	
}



class LG500 implements Printer {
	
	private String type;
	private int price;
	
	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n", this.type);
	}
	
//	public void on() {
//		System.out.println("프린터 전원을 켭니다.");
//	}
//	
//	public void off() {
//		System.out.println("프린터 전원을 끕니다.");
//	}
	
	public void selfTest() {
		System.out.println("자가 점검을 합니다.");
	}

	@Override
	public void powerOn() {
		System.out.println("프린터 전원을 켭니다.");		
	}

	@Override
	public void powerOff() {
		System.out.println("프린터 전원을 끕니다.");		
	}
}

class HP600 implements Printer {
	
	private String color;
	private int price;
	
//	public void printing() {
//		System.out.println("출력합니다.");
//	}
	
	public void powerOn() {
		System.out.println("전원 켜짐");
	}
	
	public void powerOff() {
		System.out.println("전원 꺼짐");
	}
	
	public void clean() {
		System.out.println("헤더를 청소합니다.");
	}

	@Override
	public void print() {
		System.out.println("출력합니다.");		
	}
	
}
