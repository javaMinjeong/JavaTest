package com.test.java.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex73_Lambda {

	public static void main(String[] args) {
		
		/*
			람다식 > 익명 객체의 (구현된) 추상 메소드 > 인터페이스 변수에 저장 > 람다식은 반드시 인터페이스가 필요하다!!!
		
		
			함수형 인터페이스, Functional Interface
			- 람다식을 사용하기 위한 자격
			- 다른 용도로 사용 안함
			- 1. 표준 API 함수형 인터페이스 > JDK 제공 (사용 多)
			- 2. 사용자 정의 함수형 인터페이스 > 개발자 선언
		
			표준 API 함수형 인터페이스(아래 항목 카테고리라고 생각!)
			1. Consumer > (추상메소드의 생김새가) 매개변수O, 반환값X
				- Consumer<T>
				- BiConsumer<T>
				- IntConsumer
				- ..
				
			2. Supplier > 매개변수X, 반환값O
				- Supplier<T>
				- ..
				
			3. Function > 매개변수O, 반환값O
				- Function<T,R>
				- BiFunction<T,U,R>
				- ..
				
			4. Operator > 매개변수O, 반환값O
				- BinaryOperator<T>
				- Function 하위셋
			
			5.Predicate > 매개변수O, 반환값O 
				- Predicate<T>
				- Function 하위셋
				- ..
		
		*/
		
		//The target type of this expression must be a functional interface
		Test t1 = () -> System.out.println("aaa");
		t1.aaa(); //aaa
		
		//m1(); //Consumer
		//m2(); //Supplier
		m3(); //Function
		//m4(); //Operator
		//m5(); //Predicate
		//m6(); //표준 API 함수형 인터페이스의 정적/디폴트 메소드
		
	}//main

	private static void m6() {

		//표준 API 함수형 인터페이스 > 정적/디폴트 메소드
		// - 람다 객체들의 연산자 역할
		
		//업무 1.
		Student s1 = new Student("홍길동", 100, 90, 80);
		
		Consumer<Student> c1 = s -> System.out.println("총점: " + s.getTotal());
		c1.accept(s1); //총점: 270
		
		//업무 2.
		Consumer<Student> c2 = s -> System.out.println("이름: " + s.getName());
		c2.accept(s1); //이름: 홍길동
		
		//요구사항] 업무1과 업무2를 동시에 시행
		test(s1, c1, c2);
		
		Consumer<Student> c4 = s -> System.out.println("평균: " + s.getTotal()/ 3.0);
		
		//c1 + c2 = test
		//c3 = c1 + c2
		Consumer<Student> c3 = c1.andThen(c2).andThen(c4);
		
		c3.accept(s1);
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10)); //true
		
		Function<Boolean, String> f2 = flag -> flag ? "성공" : "실패";
		System.out.println(f2.apply(true)); //성공
		
		//Function = Function + Function
		//f3 = f1 + f2;
		Function<Integer, String> f3 = f1.andThen(f2);
		System.out.println(f3.apply(-10)); //실패
		
		
		Function<Integer, String> f4 = num -> num > 0 ? "참" : "거짓";
		Function<String, Integer> f5 = str -> str.length();
		
		Function<Integer, Integer> f6 = f4.andThen(f5); //f4 + f5
		System.out.println(f6.apply(-10)); //2
		
		Function<Integer, Integer> f7 = f5.compose(f4); //f5 + f4
		System.out.println(f7.apply(-10)); //2
		
		//2의 배수
		Predicate<Integer> p1 = num -> num % 2 == 0;
		
		//3의 배수
		Predicate<Integer> p2 = num -> num % 3 == 0;
		
		int a = 10;
		
		System.out.println(p1.test(a)); //true
		System.out.println(p2.test(a)); //false
		
		//a가 2와 3의 공배수?
		System.out.println(p1.test(a) && p2.test(a)); //false
		
		//p1 && p2
		Predicate<Integer> p3 = p1.and(p2);
		System.out.println(p3.test(a)); //false
		
		
		
		//p1 || p2
		System.out.println(p1.test(a) || p2.test(a));
		
		//p1 && p2
		Predicate<Integer> p4 = p1.or(p2);
		System.out.println(p4.test(a)); //false
		
		
		
		//-------------
		
		System.out.println(!p1.test(a));
		
		Predicate<Integer> p5 = p1.negate();
		System.out.println(p5.test(a));
		
		
	}//m6

	private static void test(Student s1, Consumer<Student> c1, Consumer<Student> c2) {
		c1.accept(s1);
		c2.accept(s1);
	}

	private static void m5() {

		//Predicate
		// - 매개변수를 전달하면 처리 후, 반환값을 돌려주는 업무를 구현
		// - 매개변수O, 반환값O
		// - testXXX() 추상 메소드 제공
		// - Function의 하위셋
		// - 매개변수를 전달받아 > Boolean 반환(Boolean 반환값 고정)
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		
		Predicate<Integer>		   p1 = num -> num > 0;
		
		System.out.println(f1.apply(10)); //true
		System.out.println(f1.apply(-10)); //false
		
		System.out.println(p1.test(10)); //true
		System.out.println(p1.test(-10)); //false
		
		BiPredicate<Integer, Integer> bp2 = (a, b) -> a > b;
		System.out.println(bp2.test(10, 20)); //false
		System.out.println(bp2.test(20, 10)); //true
		
		
		
	}//m5

	private static void m4() {

		//Operator
		// - 매개변수를 전달하면 처리 후, 반환값을 돌려주는 업무를 구현
		// - 매개변수O, 반환값O
		// - applyXXX() 추상 메소드 제공
		// - Function의 하위셋
		// - 매개변수와 반환값이 타입이 같다.
		
		BinaryOperator<Integer> bo1 = (a, b) -> a + b;
		System.out.println(bo1.apply(10, 20)); //30
		
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(10, 20)); //30
		
		//Function<T,T>
		UnaryOperator<Integer> uo1 = num -> num * num;
		System.out.println(uo1.apply(10)); //100
		
		
	}//m4

	private static void m3() {

		//Function
		// - 매개변수를 전달하면 처리 후, 반환값을 돌려주는 업무를 구현
		// - 매개변수O, 반환값O(input, output 모두 존재)
		// - applyXXX() 추상 메소드 제공
		
		//<T> the type of the input to the function
		//<R> the type of the result of the function
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10)); //true
		System.out.println(f1.apply(-10)); //false
		
		Function<String,Integer> f2 = str -> str.length();
		System.out.println(f2.apply("펑션이오")); //4
		System.out.println(f2.apply("안녕하세요")); //5
		
		Function<Student,Boolean> f3 = s -> {
			return s.getTotal() >= 180? true : false;
		};
		if (f3.apply(new Student("홍길동", 80, 75, 90))) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		} //합격
		
		BiFunction<Integer, Integer, Integer> bf1 = (a,b) -> a + b;
		System.out.println(bf1.apply(10, 20)); //30
		
		DoubleToIntFunction f4 = num -> (int)num;
		System.out.println(f4.applyAsInt(3.14)); //3
		
	}//m3

	private static void m2() {

		//Supplier
		// - 매개변수 없이 반환값을 돌려주는 업무를 구현
		// - 매개변수X, 반환값O
		// - getXXX() 추상 메소드 제공
		
		Supplier<Integer> s1 = () -> 100;
		System.out.println(s1.get()); //100
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<String> s3	= () -> "홍길동";
		System.out.println(s3.get()); //홍길동
		
		//이게 뭐하는 짓인지는 to be continued!!!
		
		Supplier<Student> s4 = () -> new Student("홍길동", 100, 90, 80);
		System.out.println(s4.get());
		
		IntSupplier s5 = () -> 200;
		System.out.println(s5.getAsInt()); //200
		
	}//m2

	private static void m1() {
		
		//Consumer
		// - 매개변수를 받아서 소비하는 업무를 구현
		// - 매개변수O, 반환값X > 추상메소드
		// - acceptXXX() 추상 메소드 제공
		
		//--------사용자정의형 인터페이스 사용해보기--------
		MyConsumer m1 = num -> System.out.println(num * num);
		//자료형 생략, 매개변수 1개 > 소괄호 생략
		//실행 객체 1개 > 중괄호 생략
		
		m1.test(10); //100
		
		//---------이번엔 표준 API 사용해보기------
		//Integer
		Consumer<Integer> c1 = num -> System.out.println(num * num);
		c1.accept(5); //25
		
		//String
		Consumer<String> c2 = str -> System.out.println(str.length());
		c2.accept("람다식"); //3
		c2.accept("람다식입니다. 그렇습니다."); //14
		
		//Integer
		Consumer<Integer> c3 = count -> {
			for (int i=0; i<count; i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c3.accept(5);
		
		//Student
		Consumer<Student> c4 = s -> {
			System.out.println("이름: " + s.getName());
			System.out.println("국어: " + s.getKor());
			System.out.println("영어: " + s.getEng());
			System.out.println("수학: " + s.getMath());
			System.out.println("총점: " + s.getTotal());
		};
		c4.accept(new Student("홍길동", 100, 90, 80));
		//이름: 홍길동
		//국어: 100
		//영어: 90
		//수학: 80
		//총점: 270
		
		//BiConsumer
		BiConsumer<String, Integer> bc1 = (name, age) -> {
			System.out.printf("이름: %s, 나이: %d세\n", name, age);
		};
		bc1.accept("홍길동", 20);
		
		//IntConsumer
		IntConsumer ic1 = num -> System.out.println(num * num);
		ic1.accept(10);
		
	}//m1
	
	
}//class

@FunctionalInterface
interface MyConsumer {
	void test(int num);
}




//functional interface, 함수형 인터페이스
// - 함수형 인터페이스는 추상 메소드를 딱 1개만 가질 수 있다.
// - 그 1개의 추상 메소드가 곧 람다식이 되기 때문에..!
//(람다식을 저장하는 인터페이스는 반드시 메서드를 1개만 가질 수 있다. -> 이것이 함수형 인터페이스)

//람다식을 저장하는 목적의 인터페이스 vs 일반적인 인터페이스
// - 차이가 없다.

@FunctionalInterface
interface Test {
	void aaa();
	//void bbb();
}

interface Test2 {
	
	//일반적인 인터페이스 멤버
	// - 추상 멤버
	void aaa();
	
	//자바의 인터페이스 멤버
	// - 추상 멤버
	// - 구현 멤버(***) (인터페이스는 이론적으로 구현부를 가지면 안되나 자바는 구현 멤버를 가질 수 있다...! 물론 normal 형태로는 가질 수 없음!) 
	
//	public int a;
//	public void bbb() {
//		
//	}
	
	final public int b = 20;
	final static public int c = 30;
	
	public static void ccc() {
		
	}
	
	default void ddd() {
		
	}
}