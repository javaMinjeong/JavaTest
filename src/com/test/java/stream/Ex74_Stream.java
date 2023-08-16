package com.test.java.stream;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Student;
import com.test.util.MyFile;


public class Ex74_Stream {

	public static void main(String[] args) {
		
		//파일 입출력 아님!
		
		/*
			자바 스트림
			1. 입출력 스트림
				- 파일 입출력, 콘솔 입출력, 네트워크 입출력..
			
			2. 스트림
				- Java 8(JDK 1.8)
				- 람다식 + 함수형 인터페이스
				- 배열(컬렉션)의 탐색(조작) 지원
				- 파일 입출력 지원
				- 디렉토리 탐색 지원
				
			배열, 컬렉션 탐색
			1. for문(루프변수)
			2. 향상된 for문
			3. Iterator
			4. 스트림
			
			
			함수형 인터페이스
			1. Consumer
				- (매개변수) -> {구현부}
			
			2. Supplier
				- () -> {return 값}
				
			3. Function
				- (매개변수) -> {return 값}
				
			4. Operator
				- (매개변수) -> {return 값}
				- 매개변수와 반환값의 자료형이 동일
			
			5. Predicate
				- (매개변수) -> {return 값}
				- 반환값이 boolean
			
			
			stream()
			
			.filter(Predicate)
			.map(Function)
			.sorted(Comparator)
			.distinct
			
			.count()/max()/min()/average()/sum()
			.allMatch()/anyMatch()/noneMatch()
			.forEach()
			
		
		*/
		
		String path = "test.java";
		//앞의 확장자와 파일명을 분리해야 하므로
		//인스턴스를 만드려고 오브젝트 만듦
		
		//배포
		// - 한 개발자 만든 자바 소스 > 다른 개발자에게 전달
		//1. 소스 자체 전달 > MyFile.java
		//2. 컴파일한 실행 파일을 전달 > MyFile.class > 압축(1개 파일) > *.jar(자바는 압축할때 확장자가 *.jar)
		
		
		
		
		//import > 같은 프로젝트내에서만 가능!!!!!!!!!!!!!!!!!!!!
		MyFile mf = new MyFile();
		
//		System.out.println(mf.getFileNameWithoutExtension(path)); //test
//		System.out.println(mf.getExtension(path)); //java
		
		
		
		//m1(); //불러온 데이터 구경
		//m2(); //배열, 컬렉션을 탐색하는 여러가지 방법
		//m3(); //stream().forEach 사용해보기
		//m4(); //스트림을 얻어오는 방법(어떤 걸로부터 스트림을 얻어올 수 있는지)
		//m5(); //스트림의 파이프 > filter
		//m6(); //중복 제거 > distinct
		//m7();
		//m8();
		//m9();
		//m10();
		
	}//main

	private static void m10() {

		//집계, 통계, Reduce
		// - count(), max(), min(), sum(), avg()
		// - 최종 파이프
		// - 요소들을 가공해서 통계값
		
		System.out.println(Data.getIntList().stream().count()); //100
		System.out.println(Data.getIntList().stream().max((a, b) -> a - b).get()); //Optional[99] > 진짜 Integer로 바꿀려면 .get() 쓰면 됨!!
		System.out.println(Data.getIntList().stream().min((a, b) -> a - b).get()); //Optional[0] > 진짜 Integer로 바꿀려면 .get() 쓰면 됨!!
		
		//count, max, min 안의 값이 숫자가 아니어도 할 수 있는 일!
		//sum, avg는 안의 값이 숫자여야만 할 수 있는 일!! > 전용 스트림으로만 할 수 있음!!!
		
		int sum = Data.getIntList().stream()
						.mapToInt(n -> n) //Stream<Integer>(X) IntStream(O)
						.sum();
		System.out.println();
		
		double avg = Data.getIntList().stream()
							.mapToInt(n -> n)
							.average().getAsDouble();
		System.out.println(avg);
		
		
		
	}

	private static void m9() {

		//매칭
		// - allMatch(), anyMatch(), noneMatch()
		// - 최종 파이프
		// - 스트림 요소들이 제시한 조건을 만족 유무 판단?
		// 	a. boolean allMatch(Predicate) > 모든 요소가 조건을 100% 만족
		// 	b. boolean anyMatch(Predicate) > 일부 요소가 조건을 만족
		// 	c. boolean noneMatch(Predicate) > 모든 요소가 조건을 만족X
		
		
		//요구사항] 배열 > 짝수만 있는지?
		int[] nums = {1, 2, 3, 4, 5};
		
		boolean result = false;
		
		for (int n : nums) {
			if (n % 2 == 1)	{
				result = true;
				break;
			}
		}
		
		if (result) {
			System.out.println("홀수 발견!!");
		} else {
			System.out.println("짝수 배열~");
		}
		
		//위 작업을 stream으로~~
		System.out.println(Arrays.stream(nums).allMatch(n -> n % 2 == 0)); //모두 짝수니? false
		//홀수가 발견되어 모든 요소가 조건을 만족하지 않으므로 false값 반환 > 훨씬 간단~~~
		
		System.out.println(Arrays.stream(nums).anyMatch(n -> n % 2 == 0)); //한개라도 짝수가 있니? true
		System.out.println(Arrays.stream(nums).noneMatch(n -> n % 2 == 0)); //모두 짝수가 아니니? false
		
		
		
	}//m9

	private static void m8() {
		
		//정렬
		// - sorted()
		// - 중간 파이프
		// - 배열/컬렉션의 sort()와 사용법이 동일 > Comparator 구현
		
		Data.getIntList(10)
			.stream()
			.sorted((a, b) -> b - a) //인자값 없으면 오름차순, 있으면 내맘대로
			.forEach(n -> System.out.println(n));
		
	}//m8

	private static void m7() {

		//매핑 (넘겨받은 값을 뚝딱뚝딱 가공해서 전혀 다른 값으로 돌려주기 뚝딱뚝딱)
		// - map(), mapXXX()
		// - 중간 파이프
		// - 변환 작업
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		list.stream()									//Stream<String>
			.filter(word -> word.length() <= 3)			//Stream<String>
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		list.stream()											//Stream<String>
			.map(word -> word.length()) //String을 Integer로 변환	//Stream<Integer>
			.forEach(num -> System.out.println(num));
		System.out.println(); //출력되는 숫자는 글자수
		
		//----------------------------------------------------------
		
		String[] names = { "홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문", "홍길동", "이순신", "남궁장군", "연개소문"};
		//첫글자가 성, 나머지가 이름이라는 가정하에 이름만 추출해쥬세용
		
		//이름 추출
		Arrays.stream(names)
			.map(name -> name.substring(1)) //문자열을 받아서 가공된 문자열 스트림 내보내깅
			.forEach(name -> System.out.println(name));
		System.out.println();
		//맵은 의도적으로 원본 데이터를 가공해서 새로운 데이터를 만들 때 씁니다
		
		//------------------------------------------이번엔 복잡하게
		
		List<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student("가가가", 100, 90, 80));
		slist.add(new Student("나나나", 50, 60, 70));
		slist.add(new Student("다다다", 90, 100, 30));
		slist.add(new Student("라라라", 40, 90, 20));
		slist.add(new Student("마마마", 80, 40, 100));
		
		slist.stream()
			.map(s -> {
				if ((s.getKor() + s.getEng() + s.getMath()) >= 180) {
					return s.getName() + ":합격";
				} else {
					return s.getName() + ":불합격";
				}
			}) //map이 한 일: Stream<Student> -> Stream<String>
			.forEach(result -> System.out.println(result));
		System.out.println();
		
		//위의 방법은 다른 데이터를 합친거라 추후 수정요구시 적합하지 않음
		//다른방법 진행-------------------
		
		slist.stream()
			.map(s-> {
				if ((s.getKor() + s.getEng() + s.getMath()) >= 180) {
					
					Result r = new Result();
					r.setName(s.getName());
					r.setResult("합격");
					return r; //뭘 돌려주는 내맘. 단일 데이터든 객체든 노상관 > 객체의경우 객체에 . 찍으면 이름과 합격여부를 따로 관리가 가능하니 훨 좋음!!
				} else {
					
					Result r = new Result();
					r.setName(s.getName());
					r.setResult("불합격");
					return r;
				}
			})
			.forEach(r -> {
				System.out.println("이름: " + r.getName());
				System.out.println("결과: " + r.getResult());
				System.out.println();
			});
		
	}//m7

	private static void m6() {
		
		//중복 제거
		// - distinct()
		// - 중간 파이프
		// - 앞의 스트림에서 중복 요소를 제거하고 > 유일한 요소만 남은 새로운 스트림을 반환한다.
		
		List<Integer> list = Data.getIntList();
		System.out.println(list);
		System.out.println(list.size()); //100
		System.out.println();
		
		//중복값을 배제하기 위해서는 1:1비교를 해야하니 이중 포문을 돌면서 보통 작업을 하는데, Stream은 .distinct()를 사용하면 간단하게 중복값 제거가 된다.
		
		
		//중복값을 제거하는 여러가지 방법 복습!!
		//요구사항] 위의 배열에서 중복값 제거
		//Case 1. list를 set으로 옮겨서 제거하기
		Set<Integer> set1 = new HashSet<Integer>();
		
		for (int n : list) {
			set1.add(n); //List의 값이 HashSet에 들어오면서 자동으로 중복값 제거
		}
		System.out.println(set1.size()); //61
		System.out.println();
		
		//Case 2. 어레이리스트에서 데이터를 하나씩 가져와서 셋에 집어넣으니까 자동으로 중복값제거.. >>이거 헷갈리넹 위랑 다른점이..
		Set<Integer> set2 = new HashSet<Integer>(list); //중복값
		System.out.println(set2.size()); //61
		System.out.println();
		
		//Case 3. Stream 사용하기
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println(list.stream().count()); //100 > list 원본
		System.out.println(list.stream().distinct().count()); //61 > 중복값 제거한 개수
		System.out.println();
		//forEach의 역할: 데이터를 1개씩 가져와서 소비
		//stream에서도 개수를 셀 수 있음! > stream().count() > 최종 파이프
		
		//-------------------------
		String[] names = { "홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문", "홍길동", "이순신", "남궁장군", "연개소문"};
		Arrays.stream(names)
			.distinct()
			.filter(name -> name.length() == 3)
			.forEach(name -> System.out.println(name));
		System.out.println();
		System.out.println();
		
		//------------------one more time!
		
		List<Cup> clist = new ArrayList<Cup>();
		
		//아래서 만든 final static 상수 사용시 내부적으로는 숫자, 외부적으로는 문자라 편리~
		clist.add(new Cup(Cup.BLACK, 200)); 
		clist.add(new Cup(Cup.BLUE, 300)); 
		clist.add(new Cup(Cup.RED, 400)); 
		clist.add(new Cup(Cup.WHITE, 500)); //1
		clist.add(new Cup(Cup.YELLOW, 600)); //2
		clist.add(new Cup(Cup.BLACK, 700)); 
		clist.add(new Cup(Cup.RED, 800)); 
		clist.add(new Cup(Cup.BLUE, 900)); 
		clist.add(new Cup(Cup.YELLOW, 600)); //2 
		clist.add(new Cup(Cup.WHITE, 500)); //1 
		
		clist.stream()
			.distinct()
			.forEach(cup -> System.out.println(cup));
		System.out.println();
		System.out.println();
		//java는 obj와 obj를 비교할 때는 주소값 비교를 한다 > 아무리 distinct를 해도 컵은 여전히 10개가 나온다.
		
		//그럼 여기서 distinct로 상태가 똑같으면 동일한 것으로 필터링 되어 중복값 걸러지도록 해보자!
		//Set, distinct() > 중복 객체를 제거하려면?
		//1. hashCode() 재정의
		//2. equals() 재정의
		//---------> 아래 cup class 보시오!
		//아래 Cup class 후작업 후 결과값 출력하면 ----> 컵은 중복값이 제거된 8개가 나온다!!
	}

	private static void m5() {
		
		/*
			스트림
			- 데이터 소스로부터 탐색/조작 가능한 도구
			- list.stream()forEach()
		  	  (배열.스트림을 만들고.스트림을 사용하는도구)
		
			파이프, pipe (forEach같은 애들을 파이프라 그럼)
			- 스트림 객체 메소드
			1. 중간 파이프
				- 반환값O + 스트림 반환
				
			2. 최종 파이프
				- 반환값X + void
				- 반환값O + 다른 자료형 반환
			
			
			요소 처리
			- forEach()
			- 최종 파이프
			
			필터링
			- filter()
			- 중간 파이프
			
		
		*/
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list); //원본 덤프
		
		//요구사항] 짝수만 출력
		//for문 활용 출력
		for (int n : list) {
			if (n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		}
		System.out.println();
		System.out.println();
		
		//stream 활용해서 출력하기
		list.stream().forEach(num -> {
			if (num % 2 == 0) {
				System.out.printf("%-4d", num);
			}
		});
		System.out.println();
		System.out.println();
		
		//------위를 좀더 스트림답게
		
		list.stream().filter(num -> num % 2 == 0).forEach(num -> {
			System.out.printf("%-4d", num);
		});
		System.out.println();
		System.out.println("=============================");
		//--------------------아래부터 8/11~
		
		Data.getStringList().stream()
			.filter(word -> word.length() >= 5)
			.forEach(word -> System.out.println(word));
		System.out.println();
		System.out.println("=============================");
		
		//-------------------------
		
		Data.getUserList().stream()
			.filter(user -> user.getWeight() >= 70)
			.filter(user -> user.getGender() == 1) //계속 파이프 걸기 가능!!(스트림의 장점)
			.filter(user -> user.getHeight() >= 180)
			.forEach(user -> System.out.println(user));
		System.out.println();
		System.out.println();
		
		
	}//m5

	private static void m4() {

		//스트림을 얻어오는 방법 (어떤걸로부터 스트림을 얻어올 수 있는지)
		//1. 배열로부터(***********)복습할때 이거 두개 위주로 하세용요용ㅇ가리
		//2. 컬렉션으로부터(**********)
		//3. 숫자 범위로부터
		//4. 파일로부터
		//5. 디렉토리로부터
		
		//종류별로 어떻게 얻어오는지 구경해보기-------------
		
		//1. (순수) 배열로부터 얻어오는 방법
		int[] nums1 = {10, 20, 30};
		
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		//2. 컬렉션으로부터
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		//stream 이라는 이름의 메소드가 있으면 사용할 수 있구나! 없으면 대부분 지원 안한다고 생각하면 됨!
		
		//3. 숫자범위로부터
		
		//Stream<Integer> : 범용 스트림 > forEach > Consumer<Integer>
		//IntStream		  : 전용 스트림 > forEach > IntConsumer
		
		IntStream.range(1, 10).forEach(num -> System.out.print(num)); //일련번호 처리할 때 따로 배열이 없을 때 사용하기 좋음
		System.out.println();
		System.out.println();
		
		//---------------------------
		
		try {
			
			//java.io > 버전업 > java.nio
			
			
			//4. 파일로부터
			// - 스트림 > 파일 읽기
			//Paths.get("C:\\class\\code\\JavaTest\\data\\number.txt")
			// .: 현재 실행 파일이 있는 폴더
			// - 자바 콘솔 프로젝트에서는 프로젝트 루트 폴더를 표현
			//Paths.get(".\\data\\number.txt");
			Path path = Paths.get("data\\number.txt"); // '.\\'생략도 가능
			
			Files.lines(path).forEach(line -> System.out.println(line));
			System.out.println();
			
			//5. 디렉토리부터
			// - 목록보기 > dir.listFiles()
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
				System.out.println(p.toFile().isFile());
				System.out.println();
			});
			
			//Path는 File 클래스와 목적이 달라 isFile,isDir이없으나 toFile쓰면 파일클래스의 메소드들을 사용할 수 있게 됨이거쓰면 됨~!

		} catch (Exception e) {
			System.out.println("at Ex74_Stream.m4");
			e.printStackTrace();
		}
		
	}//m4

	private static void m3() {

		//함수형 프로그래밍 특징 == 의식의 흐름대로..
		Data.getIntList().stream().forEach(num -> System.out.printf("%4d", num));
		
		System.out.println();
		System.out.println();
		

		Data
			.getIntList()
			.stream().
			forEach(num -> System.out.printf("%4d", num));
		System.out.println();
		System.out.println();
		
		
		
		//------------------
		Data.getUserList().stream().forEach(user -> {
			System.out.println("[회원정보]");
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());
			System.out.println("성별: " + (user.getGender() == 1 ? "남자" : "여자"));
			System.out.println();
		});
		
		//--------------------
		Data.getItemList().stream().forEach(item -> {
			System.out.println(item.getName());
			System.out.println(item.getColor());
			System.out.println();
		});
		
		
		
	}//m3

	private static void m2() {

		//배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10);
		
		//list는 그냥 해당 list명을 출력하면 [내용]이 출력된다!
		System.out.println(list);
		
		//1. for
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("위는 for문");
		
		//2.향상된 for문
		for (String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println("위는 향상된 for문");
		
		//3. Iterator
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println("위는 Iterator");
		
		//4. Stream
		Stream<String> stream = list.stream();
		
		Consumer<String> c1 = str -> System.out.print(str + " ");
		
		//forEach 메소드
		//1. stream으로부터 얻어낸 데이터 > 1개씩 가져온다.(like 향상된 for문)
		//2. 가져온 데이터 > Consumer.accept() 메소드의 인자 전달 + 메소드 호출
		//3. 반복 x 요소만큼
		stream.forEach(c1);
		
		//**주의**
		// java.lang.IllegalStateException: stream has already been operated upon or closed at
		//동일 stream을 재 사용하려면 다시 stream을 생성해야 함.
		System.out.println();
		stream = list.stream();
		stream.forEach(c1); //스트림은 forEach를 돌면서 요소를 소비하기 때문에 동일한 stream으로는 소비할 요소가 안 남아있음. 때문에 Error 발생
		System.out.println();
		System.out.println();

		//위 내용을 한줄로 줄여서!
		//메소드 체이닝 > 함수형 프로그래밍 방식
		list.stream().forEach(str -> System.out.print(str + " "));
		System.out.println();
		System.out.println();
		
	}//m2

	private static void m1() {
		
		//어떤 데이터가 있나, Data클래스 내용물 살펴보기!!
		
		//순수 배열 Data
		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums1.length); //100
		System.out.println();
		
		int[] nums2 = Data.getIntArray(5); //개수가 5개인 배열
		System.out.println(Arrays.toString(nums2));
		System.out.println(nums2.length); //5
		System.out.println();
		
		//List<Integer> Data
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3); //list는 toString 안해도 알아서 출력되네!
		System.out.println(nums3.size()); //100 > list는 index의 개수 출력할 때는 'size()' 사용!(ArrayList는 'length' 사용)
		System.out.println();
		
		List<Integer> nums4 = Data.getIntList(5);
		System.out.println(nums4);
		System.out.println(nums4.size()); //5
		System.out.println();
		
		String[] txt = Data.getStringArray();
		System.out.println(Arrays.toString(txt));
		System.out.println(txt.length); //287
		System.out.println();
		
		Item[] items = Data.getItemArray();
		System.out.println(Arrays.toString(items));
		System.out.println(items.length); //19
		System.out.println();
		
		User[] list = Data.getUserArray();
		System.out.println(Arrays.toString(list));
		System.out.println(list.length); //10
		System.out.println();
		
	}//1
}//class

//이전 > Set 수업 내용 중 하나
class Cup {
	
	public final static int BLACK = 1;
	public final static int WHITE = 2;
	public final static int RED = 3;
	public final static int YELLOW = 4;
	public final static int BLUE = 5;
	
	//private String color2; //주관식 > color2 = "whte" > 혹여나 오타 발생 시 관련된 모든 유효성검사를 다 해야 하므로.. > 개발자 손을 다 타야하고 사용자가 실수를 할 확률 多 But 위처럼 상수처리하면 .찍으면 나오고 알아보기도 쉽고, 실수할 확률이 줄어듬

	private int color; //빨강, 파랑...선택하는 값(나열해놓고 하나 콕 찝어서 선택하는 것들) > 열거값 > 
	private int size;
	
	public Cup(int color, int size) {
		this.color = color;
		this.size = size;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", size=" + size + "]";
	}

	
	
	//개발자의 의도대로 객체를 비교하려면..
	@Override
	public int hashCode() {
		return ("" + this.color + this.size).hashCode(); //숫자 > 값형 > 참조주소가 없으므로 바로 주소값을 못얻어내므로 숫자를 문자열로 바꿔야함. > 공식적으로 String.value of 이나 앞에 "" 더해서 간단하게 문자열로 바꾸기
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
	
}//Cup

//String<Student>를 받아서 -> map() 을 거치면 -> Stream<Result>를 돌려줄 예정
class Result {
	
	private String name;
	private String result;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}




