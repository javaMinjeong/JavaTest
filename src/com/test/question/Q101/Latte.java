package com.test.question.Q101;

public class Latte {

	private int bean = 0; //라테 생산 시 들어가는 원두량(g)
	private int milk = 0; //라테 생산 시 들어가는 우유량(ml)
	
	public Latte(int bean, int milk) {
		this.bean = bean;
		this.milk = milk;
	}
	
	public int getBean() {
		return bean;
	}
	public int getMilk() {
		return milk;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml으로 만들어진 라테를 마십니다.", this.bean, this.milk);
	}
}
