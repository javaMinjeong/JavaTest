package com.test.java.obj;

public class Ex44_static {

	//main method 실행 전 이뤄지는 여러가지 작업이 있는데. 그중 하나가 클래스 로딩
	
	//1. 클래스 로딩, Class Loading
	// - 프로그램을 실행하기 전에 클래스의 정의를 미리 읽는 작업
	// - 클래스의 정의를 메모리에 얹는 작업
	// - 클래스 로딩 과정에서 모든 static 키워드 인식 > 메모리 실체화(구현)
	
	
	//2. main() 실행
	public static void main(String[] args) {
		
		/*
			static 키워드
			- 클래스 or 클래스 멤버에 붙이는 키워드
			
			
		*/
		
		//상황] 학생 3명 > 300명
		// - "역삼 중학교" > 개명 > "대치 중학교"
		
		Student.setSchool("역삼 중학교"); //정적 변수 > 공용 데이터(***)
		
		
		
		Student s1 = new Student();
		s1.setName("홍길동"); //객체 변수 > 개인 데이터(***)
		s1.setAge(15);
//		s1.setSchool("역삼 중학교"); // > static 멤버를 객체 참조 변수를 통해서 접근하려고 시도 > 불가능!!!
								 //static 멤버는 객체변수로 접근할 수 없음!!!!!
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(15);
//		s2.setSchool("역삼 중학교");
		
		Student s3 = new Student();
		s3.setName("이순신");
		s3.setAge(16);
//		s3.setSchool("역삼 중학교");
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
		
//		//객체 메소드를 사용하려면 반드시 객체를 만들어야 한다.
//		Util util = new Util();
//		
//		int result = util.add(10, 20);
//		System.out.println(result);
//		
//		result = util.add(30, 40);
//		System.out.println(result);
//		
//		//시간이 흐르고....아! 내가 util add라는 걸 사용했던 것은 기억이 나!
//		
//		Util util2 = new Util();
//		
//		result = util2.add(50, 60);
//		System.out.println(result);
//		
//		//객체는 자신만의 데이터를 가져야 한다! >> ex. 하나의 핸드폰을 사용하면 되는데 필요할때마다 계속 폰을 산다. > 
		
		//두 수를 구할 일이 생겼는데, Util이라는 존재를 알게 됨!
		//static이 안붙은 멤버가 없으니, 굳이 인스턴스를 만들 이유가 없음.
		//실행되기 전부터 static 영역에 선언 되어있으니 obj 없이 바로 사용 가능
		int result = Util.add(10, 20);
		System.out.println(result);
		
		result = Util.add(30, 40);
		System.out.println(result);
		
		//어떤 기능이 필요한데, 객체마다 각 값을 가져야 할 기능과, 객체마다 공통의 값을 가져도 되는 기능 중. 공통의값을 가져야 하는경우 class를 만들고 그 안에 static 붙은 변수나 메소드 사용하면 된다.!..!TODO 이말이 맞나 나중에 봐보세요 홍홍
		//ex. Math class, 주로 유틸리티성(도움을 주는) 클래스들이 많음.
		
	}
}

class Student {
	
	//객체 변수(static이 안붙은 변수) > 멤버변수인데 성격이 객체변수 > 사람마다 다른 값을 가져야 한다면...
	private String name;
	private int age;
//	private String school; //**중요 뽀인뜨 > 학생 3명이 역삼중학교에 다닌다고 했으니까
	
	//정적 변수, 클래스 변수, 공용 변수 > 멤버변수인데 성격이 정적변수 > 사람이 달라도 같은 값을 가져야 한다면..
	private static String school; //static의 위치는 private 앞, 뒤 모두 가능!
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}

	//바뀐것
	//1. 메소드에도 static이 붙음
	//2. student.school로 변수명이 변경됨.
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	public String info() {
		return String.format("%s(%d) %s"
								, this.name
								, this.age
								, Student.school);
	}
	
	public void aaa() {
		//객체 메소드 > 객체 멤버든 정적 멤버든 모두 접근 가능!
		// - 개인과 관련된 작업 > 가능
		// - 집합과 관련된 작업(정적 멤버) > 가능
		System.out.println(this.name);		//객체 변수
		System.out.println(Student.school); //정적 변수
		this.setAge(15); 					//객체 메소드
		Student.setSchool("역삼 중학교"); 		//정적 메소드
	}
	
	public static void bbb() {
		//정적 메소드
		// - 개인과 관련된 작업 > 불가능
		// - 집합과 관련된 작업(정적 멤버) > 가능
		System.out.println(Student.school); //정적 변수
		//System.out.println(this.name); 	//객체 변수(X)
		//Cannot make a static reference to the non-static field name
		Student.setSchool("역삼 중학교"); 		//정적 메소드
		//this.setAge(15);					//객체 메소드(X)
	}
	
	
}

class Util {
	
	public static int add(int a, int b) {
		
		return a + b;
		
	}
	
	
}


//그림용 클래스 생성 (수업했던 모든 요소 다 넣어보기)
class Phone {
	
	//객체 멤버 변수
	private String color;
	private String number;
	public int size;
	
	//정적 멤버 변수
	private static int weight;
	public static int battery;
	
	//기본 생성자
	public Phone() {

	}
	
	//오버로딩된 생성자
	
	public Phone(String color, String number) {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static int getWeight() {
		return weight;
	}

	public static void setWeight(int weight) {
		Phone.weight = weight;
	}

	public static int getBattery() {
		return battery;
	}

	public static void setBattery(int battery) {
		Phone.battery = battery;
	}
	
}
