package com.test.java.obj;

public class Ex49_static {

	public static void main(String[] args) {
		
		//요구사항]
		//1. 펜을 생산하시오.
		//2. 생산된 펜의 개수를 세시오.
		
		
		//Case 1.
		// - Pen 객체(클래스)와 count 간의 관계 약함.
		// - 오차 발생(count++ 누락)
//		int count = 0;
//		
//		Pen p1 = new Pen("Monami", "black");
//		count++;
//		
//		Pen p2 = new Pen("Monami", "black");
//		count++;
//		
//		Pen p3 = new Pen("Monami", "black");
//		count++;
//		
//		System.out.println("펜 개수: " + count);
		
		//Case 2. (위의 단점을 개선하는 방식으로)
		// - Pen과 count간의 결합 > 강하게 > 어떻게? > count변수를 pen 클래스 안에 생성
		// - 객체 변수 > 여러개 발생
		// - 그 중 1개 사용 > 왜 그 객체의 count 사용하는지? 당위성(X)
		
//		Pen p1 = new Pen("Monami", "black");
//		p1.count++;
//		
//		Pen p2 = new Pen("Monami", "black");
//		p1.count++;
//		
//		Pen p3 = new Pen("Monami", "black");
//		p1.count++;
//		
//		System.out.println("펜 개수: " + p1.count);
		//엥!! 뭔가 이상하다!!! 동시에 증가가 아니라 각자 자기의 변수를 증가시키고있네??!!
		//해결책: 몰아주기 > No!!! > 왜 전체 count를 p1이 몰아서 해야해??
		
		//Case 3. (위의 두가지의 단점을 개선하는 방식으로)
		// - Pen과 count 간의 관계 > 강하게
		// - count 변수 딱 1개 만들자!! > static
		// - But!! 오차 발생 가능성 있뜸
		
//		Pen p1 = new Pen("Monami", "black");
//		Pen.count++;
//		
//		Pen p2 = new Pen("Monami", "black");
//		Pen.count++;
//		
//		Pen p3 = new Pen("Monami", "black");
//		Pen.count++;
//		
//		System.out.println("펜 개수: " + Pen.count);
		
		//Case 4. (최종!!! The Best Way)
		//Pen을 만들 때 무조건 생성자 메소드가 사용 됨. > 여기에 count!
		
		Pen p1 = new Pen("Monami", "black");
		
		Pen p2 = new Pen("Monami", "black");
		
		Pen p3 = new Pen("Monami", "black");
		
		System.out.println("펜 개수: " + Pen.count);
		
		
	}//main
}//class

class Pen {
	
	//편의상 public으로 count 생성
	//public int count = 0; //Pen의 개수를 센다는 관계가 확실해짐!!
	public static int count = 0; //모든 객체가 같이 쓰는 용도!
	
	
	private String model;
	private String color;
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
	}

	@Override
	public String toString() {
		return "Pen [model=" + model + ", color=" + color + "]";
	}

	

	
}