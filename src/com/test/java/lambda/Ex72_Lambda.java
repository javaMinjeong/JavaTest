package com.test.java.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Ex72_Lambda {

	public static void main(String[] args) {
		
		/*
			람다식, Lambda Expression
			- 함수형 프로그래밍 > 지원
			- 자바 > 람다식 > 컬렉션 조작(= 스트림)
			- 람다식을 사용하면 코드가 간결해진다.
			- 자바의 메소드 > 다른(간결한 표현)
			- 람다식은 매개변수를 가지는 코드블럭이다. (=메소드)
			- 자바의 람다식은 인터페이스를 사용해서 만든다.(자바만의 특징)
			
			람다식 형식
			- 인터페이스 변수 = 람다식; 
			- ex) MyInterface m1 = () -> {};

			- 자바의 메소드의 다른 표현(실제 의미는 조금 다르나, 겉으로 드러난것만 보면 메소드의 다른 표현이라고 생각하면 됨!)
			- (매개변수) -> {실행코드}
			- a. (매개변수): 메소드의 매개변수 리스트와 동일
			- b. ->: 화살표(Arrow), 코드블럭 호출 역할
			- c. {실행코드}: 메소드의 구현부와 동일
			
		*/
		
		//m1();
		//m2();
		m3();
		
	}//main

	private static void m3() {

		//외부파일 활용하여 성적순으로 정렬해보기 > 파일입출력 + 람다식
		
		//1. 파일 읽기
		String path = "C:\\Users\\skfoc\\Downloads\\파일_입출력_문제\\성적.dat";
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			ArrayList<Student> list = new ArrayList<Student>();
			
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {

				//텍스트 1줄 > Student 객체 1개
				//홍길동,47,61,73
				
				String[] temp = line.split(",");
				
				Student s = new Student(
									temp[0],
									Integer.parseInt(temp[1]),
									Integer.parseInt(temp[2]),
									Integer.parseInt(temp[3])
									);
				
				list.add(s);
				
				
			}
			System.out.println(list);
			
			//성적순 > 정렬
//			list.sort(new Comparator<Student2>() {
//
//				@Override
//				public int compare(Student2 o1, Student2 o2) {
//					return o2.getTotal() - o1.getTotal();
//				}
//			});
			
			//람다식으로 정렬
			list.sort((o1, o2) -> o2.getTotal() - o1.getTotal());
			
			
			
			for (Student s : list) {
				System.out.println(s.getName() + ":" + s.getTotal());
			}
			
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Ex72_Lambda.m2");
			e.printStackTrace();
		}
	}

	private static void m2() {

		//람다식 활용 == 익명클래스(객체) 활용
		
		//Math.random() //0~1 실수 난수
		Random rnd = new Random();
		
		//int valuebetween 0 (inclusive) and the specified value (exclusive)
		//System.out.println(rnd.nextInt(10)); //0~9
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			nums.add(rnd.nextInt(10) + 1); //1~10
		}
		System.out.println(nums);
		
		//익명클래스 활용하여 정렬
		nums.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2; //오름차순
			}
		});
		System.out.println(nums);
		
		//람다식 활용하여 정렬
		nums.sort((Integer o1, Integer o2) -> {
			return o1 - o2;
		});
		
		//더줄여
		nums.sort((o1, o2) -> o2 - o1); //내림차순
		System.out.println(nums);
		
	}

	private static void m1() {
		//요구사항] MyInterface를 구현한 객체를 1개 만드시오.
		MyInterface m1 = new MyClass();
		m1.test();
		
		//------------------------------
		MyInterface m2 = new MyInterface() {
			
			@Override
			public void test() {
				System.out.println("익명 클래스에서 구현한 메소드");
			}
		};
		m2.test();

		//-------------------------------
		//람다식 왼쪽에 인터페이스가 빠지면 추상메소드를 알 수가 없기 때문에 람다식 왼쪽에 인터페이스가 들어와야 함! > 자바 람다식의 한계! > 람다식 만으로는 에러가 남.
		MyInterface m3 = () -> {
			System.out.println("람다식에서 구현한 메소드");
		};
		m3.test();
		System.out.println();
		
		//-------------------------
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			
			@Override
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();
		System.out.println();
		
		////위에걸 람다식으로 만들면
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		System.out.println();
		
		//---------------------------
		//*** 실행블럭에 문장이 1개면 {} 생략 가능
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();
		System.out.println();
		
		ParameterNoReturn pr4 = (int num) -> {
			System.out.println(num);
		};
		pr4.call(100);
		System.out.println();
		
		//*** 매개변수의 자료형을 생략할 수 있다.
		ParameterNoReturn pr5 = (num) -> System.out.println(num);
		pr5.call(500);
		System.out.println();
		
		//*** 매개변수의 ()를 생략할 수 있다.
		ParameterNoReturn pr6 = num -> System.out.println(num);
		pr6.call(5000);
		System.out.println();
		
		//-------------------------
		MultiParameterNoReturn pr7 = (String name, int age) -> {
			
			System.out.println(name + "," + age);
		};
		pr7.call("홍길동", 20);
		System.out.println();
		
		//--------------------
		//*** 매개변수의 소괄호는 매개변수가 1개일때만 생략할 수 있다.
		MultiParameterNoReturn pr8 = (name, age) -> System.out.println(name + "," + age);
		pr8.call("아무개", 25);
		System.out.println();
		
		//--------------
		NoParameterReturn pr9 = () -> {
			return 100;
		};
		System.out.println(pr9.call());
		System.out.println();
		
		//-------------
		//return문에 하나가 있을 때는 return마저도 생략해야 한다.(구현부 중괄호 없애고 싶으면 return까지 같이 생략)
		NoParameterReturn pr10 = () -> 300;
		System.out.println(pr10.call());
		System.out.println();
		
		//---------------------
		ParameterReturn pr11 = name -> name.length();
		System.out.println(pr11.call("홍길동"));
		System.out.println(pr11.call("남궁길동"));
		System.out.println();
	}
}//class

interface MyInterface {
	void test();
}

class MyClass implements MyInterface {

	@Override
	public void test() {
		System.out.println("실명 클래스에서 구현한 메소드");
	}
	
}

interface NoParameterNoReturn {
	void call();
}

interface ParameterNoReturn {
	void call(int num);
}

interface MultiParameterNoReturn {
	void call(String name, int age);
}

interface NoParameterReturn {
	int call();
}

interface ParameterReturn {
	int call(String name);
}


class Student {
	
	//홍길동,47,61,73
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]\n";
	}
	
	
}