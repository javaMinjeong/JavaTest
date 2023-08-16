package com.test.java.obj;

public class Member {

	//Ex43_Constructor.java
	
	private String id;
	private String pw;
	private String name;
	private int lv;
	
	


	//오버로딩된걸 개발자가 만들어도 프로그램이 자동으로 만들어주지 않음.
	
	//생성자 vs Setter
	//1. 생성자 > 초기화 역할
	//2. Setter > 초기화 이후 수정하는 역할
	
	
//	public Member(String id, String pw, String name, int lv) {
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
//		this.lv = lv;
//	}
	
	//이클립스가 생성자도 우리 대신 만들어주는 기능이 있음 > 마우스 우클릭 > source > Generate constructor using fields..
	//귀찮으면 이렇게 이클립스 기능 활용해서 만들어도 됨.
	public Member(String id, String pw, String name, int lv) {
		//super(); > 상속 배우고 나중에 수업 할 예정!!
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.lv = lv;
	}
	
	
	public String info() {
		
		return String.format("아이디(%s), 암호(%s), 이름(%s), 등급(%d)"
							, this.id
							, this.pw
							, this.name
							, this.lv);
		
	}
	
	
	
}
