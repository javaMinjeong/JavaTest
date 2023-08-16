package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex57_Generic {

	public static void main(String[] args) {
		
		
		//클래스 (하기 5가지 모두 클래스로 봐도 무방)
		//1. 클래스
		//2. 인터페이스
		//3. 추상 클래스
		//4. enum
		//5. 제네릭 클래스
		
		//요구사항] 클래스 설계
		//1. 멤버 변수 선언 > int
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언
	
		//추가사항] String 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] boolean 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] double 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] byte 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] Calendar 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] Student 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] 무한대..
		// >> 하나의 자료형을 중심으로 동일한 업무를 구현하기 위해서는 타입 하나당 클래스를 새로 만들었는데..자료형이 늘어날 수록 비용 증가

		//위의 문제점 > 해결방안
		//1. Object 클래스 > 오래된 방식 ~ 현재 방식
		//2. 제네릭 클래스 > 최신 방식(2014) ~ 현재 방식
		
		
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.toString());
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2.toString());
		System.out.println((int)n2.getData() * 2);
		System.out.println();
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.toString());
		System.out.println(n3.getData() * 2); //가공(숫자형으로 형변환)을 안해도 됨
		System.out.println();
		
		
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2.toString());
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("이순신");
		System.out.println(s3.toString());
		System.out.println(s3.getData().length());
		System.out.println();
		
		
		
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.toString());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.toString());
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		System.out.println();
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.toString());
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();
		
		
		
		//*** 절대 > 값형과 참조형간에 형변환 불가능!!!
		
		//Object 변수 == 만능 주머니(모든 자료형을 담을 수 있는 변수)
		Object o1 = new Object();
		Object o2 = new Hong(); //업캐스팅
		Object o3 = new Scanner(System.in);
		Object o4 = new WrapperInt(100);
		Object o5 = "홍길동";
		//-------------------------위는 참조형, 아래는 값형
		//박싱(Boxing) > 오토박싱
		Object o6 = 10; // = new Integer(10); 
		//???여기는 왜 값형과 참조형간에 형변환이 되는거지?
		//겉으로는 값형을 집어넣은것 같이 보이나, 실제로는 값형으로 보이는 참조값ㅇ을 만든담에 해당 주소번지를 참조한 것!
		Object o7 = true;
		
		System.out.println(o6);
		//System.out.println(o6 * 2); //주소값은 연산의 대상이 될 수 없기 때문에 좌측 연산 불가
		System.out.println((int)06 * 2); //표면상으로 다운캐스팅 문법을 썼으나 내부적으로는 언박싱(Unboxing)
		System.out.println((Integer)06 * 2); //표면상으로 다운캐스팅 문법을 썼으나 내부적으로는 언박싱(Unboxing)
		//위의 형변환 하는 행동들이 객체안에 담긴 값을 꺼내서 형변환하여 값을 꺼냄 > 언박싱(Unboxing)
		
		// Object 변수 만들 때 특징 :: 집어 넣을 때는 맘대로 집어넣으나, 꺼낼 때는 형변환
		
		//((Scanner)o3).nextLine();
		//o3 자료형이 뭐였지? > 기억이 안남 > 올라가서 눈으로 확인해야 함. > 사람이 찾아야 함.
		//((Scanner)o4).nextLine();
		//꺼내쓸 때 뭐가 뭐였는지 몰라서 잘못꺼내서 형변환하면 에러 발생
		
		// >> Object가 참 좋지만 꺼내쓰기는 너무 불편하다! > 그나마 좀 문제를 해결할 만한 대체 수단을 만들었다 > '제네릭 클래스'
		
		
		
		
		
//		Integer num = new Integer(10);
//		System.out.println(num);
//		System.out.println(num + 100);
		
	}//main
}//class


class WrapperInt {
	private int data; //1. 클래스의 중심
	
	//2. data 중심 > 행동
	public WrapperInt(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
	
}

class WrapperString {
	private String data; //1. 클래스의 중심
	
	//2. data 중심 > 행동
	public WrapperString(String data) {
		this.setData(data); //가끔 이클립스에서 자체적으로 코드 한군데 몰빵해야하니까 바꿈!
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperBoolean {
	private boolean data; //1. 클래스의 중심
	
	//2. data 중심 > 행동
	public WrapperBoolean(boolean data) {
		this.setData(data); //가끔 이클립스에서 자체적으로 코드 한군데 몰빵해야하니까 바꿈!
	}

	public Boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperObject {
	
	private Object data; //***
	
	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "WrapperObject [data=" + data + "]";
	}
}

class Wrapper<T> {
	
	private T data;
	
	//주의!! 생성자에는 타입변수 안적음!! Wrapper<T> () XXXX!!!!!
	public Wrapper(T data) {
		this.setData(data);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}
	
}


