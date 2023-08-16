package com.test.question.Q101;

public class Espresso {

	private int bean = 0; //에스프레소 생산 시 들어가는 원두량(g)
	
	//TODO 왜 setter가 아니라 생성자를 이용하는지....?
	public Espresso(int bean) {
		this.bean = bean;
	}

	public int getBean() {
		return bean;
	}


	public void drink() {
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.", this.bean);
	}
	
}