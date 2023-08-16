package com.test.question.Q098;

public class Student {

	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	
	//기본 생성자 메소드
	public Student() {
		this.name = "미정";
		this.age = 0;
		this.grade = 0;
		this.classNumber = 0;
		this.number = 0;
		
	}
	
	//매개변수 5개 받는 생성자 오버로딩
	public Student(String name, int age, int grade, int classNumber, int number) {
	
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
		
	}
	
	//매개변수 2개(이름,나이) 받는 생성자 오버로딩
	//TODO 아니 써줘야 하나???질문!!!
	//2개 받아도 출력값에는 입력받은 변수 외 다른 항목도 다 써줘야함!!!!!
	public Student(String name, int age) {

	
		this.name = name;
		this.age = age;
		this.grade = 0;
		this.classNumber = 0;
		this.number = 0;
		
	}
	
	//매개변수 3개(학년,반,번호) 받는 생성자 오버로딩
	public Student(int grade, int classNumber, int number) {
		this.name = "미정";
		this.age = 0;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
		
	}
	
	//TODO 기본 생성자 값이 나이~번호 모두 int라 0인데 실제 미입력할때 출력값은 "미정" 이라고 뜬다. > 조건 넣어서 0이면 미정이라고 써야하나? > 해보기
	// >> 되게 간단하게 3항연산자를 사용....!! 그리고 값은 int여도 format에서는 s로 받을 수 있나보다...? 3항연산자로 문자열이 들어갈 수 있는 조건을 넣어서 그런가?
	
	//info 메소드
	public String info() {
		
		return String.format("%s(나이 : %s, 학년 : %s, , 반 : %s, 번호 : %s)"
								, this.name
								, this.age != 0 ? this.age + "세" : "미정"
								, this.grade != 0 ? this.grade : "미정"
								, this.classNumber != 0? this.classNumber : "미정"
								, this.number != 0? this.number : "미정");
		
		
		
//		return String.format("%s(나이 : %d세, 학년 : %d, 반 : %d, 번호 : %d)"
//								, this.name
//								, this.age
//								, this.grade
//								, this.classNumber
//								, this.number);
//		
	}
	
	
	
	
	
	
	


	

	
	
	
}
