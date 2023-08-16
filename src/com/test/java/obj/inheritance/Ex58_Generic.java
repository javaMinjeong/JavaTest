package com.test.java.obj.inheritance;

public class Ex58_Generic {

	public static void main(String[] args) {
		
		//Item is a raw type. References to generic type Item<T> should be parameterized
		Item<String> item = new Item<String>();
		item.c = "문자열";
		
		
		
		Item<Integer> item2 = new Item<Integer>();
		//Item<int> item2 = new Item<int>(); //값형은 넣을 수가 없음!
		item2.c = 100;
		
		Pen<Boolean> pen = new Pen<Boolean>();
		pen.a = true;
		pen.b = false;
		pen.c = true;
		
		Note<String,Integer> note = new Note<String,Integer>("홍길동", 20);
		
		System.out.println(note.getA()); //String
		System.out.println(note.getB()); //Integer
		
		
		
		
		
		
		
	}//main
}//class


//제네릭 클래스
// - T: 타입 변수(메소드의 매개변수 역할) > 자료형을 전달하는 변수 > 반드시 참조형만 가능
// - <>: 인자리스트(메소드의 () 역할)
class Item<T> {
	
	public int a;
	public int b;
	public T c; //클래스 선언까지는 타입 결정(X) > 객체를 생성할 때 결정(O) (나중에 어떤것이든 다 넣을 수 있음. like Object)
	
}

class Pen<T> {
	
	public T a;
	public T b;
	public T c; //변수이기 때문에 몇번을 사용하든 상관 없음. 필요한 만큼 사용하면 됨!
	
}

class Desk<T> {
	
	public T a; //멤버 변수의 자료형
	
	public void set(T a) { //메소드 매개변수의 자료형
		this.a = a;
		
		T b; //지역변수의 자료형 > 비권장..
	}
	
	public T get() { //메소드 반환타입
		return this.a;
	}
	
}

//매개변수같은 구성이기에 개수를 늘리는것도 가능, 대소문자 안가리나 타입변수는 1글자 대문자로 작성
//타입변수는 많아야 2개고 보통은 1개 사용 > 늘릴수록 어려움
class Note<T,U> {
	
	public T a;
	public U b;
	
	public Note(T a, U b) {
		
		this.a = a;
		this.b = b;
	}
	
	public T getA() {
		return this.a;
	}
	
	public U getB() {
		return this.b;
	}
	
}


