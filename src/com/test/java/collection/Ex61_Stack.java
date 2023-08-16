package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex61_Stack {

	public static void main(String[] args) {
		
		/*
			자료구조(컬렉션)
			- 물리적인 특징(내부 구조)
			- 추상적인 특징(사용법)
			
			ADT
			- Abstract Data Type
			- Stack, Queue
			
			
			List
			- ArrayList
			- Queue
			- Stack
			
			Stack
			- 후입선출
			- LIFO, Last Input First Output
			- 저장소에 나중에 들어간 요소가 가장 먼저 나온다.
			ex) 메모리 구조(Stack)
			ex) 되돌리기(Ctrl+Z), 다시하기(Ctrl+Y)
			
			Queue
			- 선입선출
			- FIFO, First Input First Output
			- 저장소에 먼저 들어간 요소가 먼저 나온다.
			ex) 줄서기
			ex) 우리가 사용하는 운영체제(운영체제는 Message Queue로 우리의 행동을 관리함)
		
		*/
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		//Queue
		// - 선입선출
		Queue<String> queue = new LinkedList<String>(); //클래스가 아니기 때문에 object 못 만듦
		//껍데기는 Queue 인데 실제 알맹이는 자식 > 인터페이스 이기 때문에
		
		//1. 요소 추가하기
		// - boolean add(T value)
		queue.add("짜장면");
		queue.add("짬뽕");
		queue.add("탕수육");
		
		//2. 요소 개수
		// - int size()
		System.out.println(queue.size());
		
		//3. 요소 읽기(꺼내기)
		// - poll
		System.out.println(queue.poll()); //짜장면
		System.out.println(queue.size()); //2
		
		System.out.println(queue.poll()); //짬뽕
		System.out.println(queue.size()); //1
		
		System.out.println(queue.poll()); //탕수육
		System.out.println(queue.size()); //0
		
		//이친구는 요소를 다꺼내고소도 읽기 메소드를 사용하면 에러가 나는게 아니라, null이 나옴!
		System.out.println(queue.poll()); //null
		System.out.println(queue.size()); //0
		
		if (queue.size() != 0) {
			System.out.println(queue.poll());
		}
		
		if (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		//5. 요소 확인
		System.out.println(queue.peek());
		
		
		
	}

	private static void m2() {

		Stack<String> stack = new Stack<String>();
		
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		//5. 요소 확인(읽기 O + 삭제 X) (pop 말고 하나 더 있음!) 
		System.out.println(stack.peek()); //볶음밥
		System.out.println(stack.peek()); //볶음밥
		
		//pop 이랑 peek가 뭐가 달라요?
		// > peek은 꺼내는 메소드가 아니라, 뚫린 구멍으로 쳐다보는 '구경'만 하는 메소드
		// 특징: 읽기는 읽고 삭제는 안됨
		// 확인할 때 쓰는 메소드라고 생각하면 됩니당
		
	}

	private static void m1() {

		Stack<String> stack = new Stack<String>();
		
		//후입선출
		//방번호가 없어서 단순 > 사용법 몇가지 안 됨.
		//집어넣을 땐, push (보통 push down이라고 얘기함)
		//꺼낼 땐, pop (pop up 이라고 얘기함)
		
		
		//1. 요소 추가하기
		// - T push(T value)
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		//2. 요소 개수
		//- int size()
		System.out.println(stack.size()); //3
		
		//3. 요소 읽기
		// - T pop()
		System.out.println(stack.pop()); //볶음밥 (마지막에 넣은 데이터)
		//데이터를 읽는 메소드이지만, 꺼내야만 확인이 가능하므로 스택에서 데이터를 삭제하기도 함.
		System.out.println(stack.size()); //2(사이즈가 1 줄음)
		
		System.out.println(stack.pop()); //짬뽕
		System.out.println(stack.size()); //1
		
		System.out.println(stack.pop()); //짜장면
		System.out.println(stack.size()); //0
		
		//빈 스택에서 꺼낼경우 에러 발생 > 스택이 비었는지 확인 후 사용해야 함
//		System.out.println(stack.pop()); //java.util.EmptyStackException
//		System.out.println(stack.size());
		
		//4. 스택이 비었는지?
		if (stack.size() != 0) {
			System.out.println(stack.pop());
		}
		
		if (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
}
