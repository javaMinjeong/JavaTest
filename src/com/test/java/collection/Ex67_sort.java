package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {

	
	public static void main(String[] args) {
		
		//배열 or 컬렉션
		// - 오름차순 정렬, 내림차순 정렬
		//1. 직접 알고리즘 구현
		//2. JDK 제공 기능
		
		//2 + 1 합친듯한 느낌! > JDK 제공 + 커스터마이징 + 익명 클래스 사용((선택)이나 안쓰면 코드가 지저분해져서 쓰게 되어있음..!)
		
		//m1();
		//m2(); //문자열 정렬
		//m3(); //날짜 정렬
		//m4(); //객체 정렬
		m5(); //collection 정렬
		
	}//main

	private static void m5() {

		//컬렉션의 정렬
		//1. ArrayList > O (순서가 있는 목록 > 정렬 가능)
		//2. HashMap > X (순서가 없는 데이터 집합)
		//3. Queue > X (List계열이라 순서가 있지만, Queue와 Stack은 들어온 순서가 굉장히 중요하기 때문에 정렬 행위 안 함!!)
		//4. Stack > X
		//5. HashSet > X (방번호 자체가 없어서 정렬이 일어날 수가 없음)
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			list.add((int)(Math.random() * 100)); //0 ~ 99 사이 난수
		}
		
		System.out.println(list); //원본 출력
		
		//정렬 let's do it
		//Collections.sort(list); //오름차순 > 가장 손이 덜 가는 방법
		
		//내림차순
//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		});
		//ArrayList 자체로도 sort기능이 있긴 함! > 내림차순 할 때 가장 손이 덜 가는 방법
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(list);
		
		
		
	}//m5

	private static void m4() {

		//객체 정렬을 위해선 어떤 type이든 obj 필요
		
		//객체 정렬
		Score[] list = new Score[5];
		
		list[0] = new Score("홍길동", 100, 90, 80);
		list[1] = new Score("아무개", 60, 80, 70);
		list[2] = new Score("박복습", 100, 99, 98);
		list[3] = new Score("김배열", 80, 70, 90);
		list[4] = new Score("서연산", 85, 95, 83);
		
		System.out.println(Arrays.toString(list));
		System.out.println();
		
		//각종 정렬
		//Arrays.sort(list); // Error 발생 > sort에서 error > 이름으로 오름차순? 국어로 오름차순? 어떤 조건으로 정렬할지에 대해 알려주지 않았으니 컴퓨터도 몰라요~~
		
		Arrays.sort(list, new Comparator<Score>(){

			@Override
			public int compare(Score o1, Score o2) {
				
				//return o1.getName().compareTo(o2.getName()); //이름순
				//return o2.getKor() - o1.getKor(); //국어점수순
				return (o2.getKor() + o2.getEng() + o2.getMath()) - (o1.getKor() + o1.getEng() + o1.getMath());	//총점순
			}
		});
		
		System.out.println(Arrays.toString(list)); 
		
		
		
	}

	private static void m3() {

		Calendar[] dates = new Calendar[5]; //캘린더를 집어넣을 방을 생성 > 객체는 아직 안 만듦!
		
		for(int i=0; i<dates.length; i++) {
			dates[i] = Calendar.getInstance();
		}
		
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 1);
		dates[3].add(Calendar.DATE, 0);
		dates[4].add(Calendar.DATE, 3);
		
		//출력
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		//정렬
		
		//방법 1 > Arryas.sort 사용(오름차순)
		Arrays.sort(dates);
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		//방법 2 > 내림차순 정렬
		Arrays.sort(dates, new Comparator<Calendar>() {

			@Override
			public int compare(Calendar o1, Calendar o2) {
				
				//Calendar 비교는 '-' 연산자 사용 불가 > 참조형 연산자 사용 불가
				//방법: 직접 구현(tick값 사용) or 메소드 사용
				
				//But 직접구현 지양 > error 발생 가능 有
				//return (int) (o2.getTimeInMillis() - o1.getTimeInMillis()); //두 날짜 차가 긴경우 int 형변환 하는 과정에서 오류가 날 가능성이 있기 때문에 위험.
				
				//compareTo 메소드 사용 지향
				//return o2.compareTo(o1);
				
				//------------------------이번엔 날짜 무관 요일 순 정렬해주세요
				
				//일(1) ~ 토(7)
				return o1.get(Calendar.DAY_OF_WEEK) - o2.get(Calendar.DAY_OF_WEEK);
				
			}
		});
		
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF %tA\n", dates[i], dates[i]);
		}
		System.out.println();
		
		
	}//m3

	private static void m2() {

		//자료형별 정렬
		//1. 숫자
		//2. 문자(열) > 문자코드값 > 숫자
		//3. 날짜시간 > 숫자
		//4. 객체(***) 1~4 다 중요
		
		String txt1 = "홍길동";
		String txt2 = "아무개";
		
		//System.out.println(txt1 > txt2); //참조형 연산 불가 > 주소값은 연산의 대상이 아님.
		//문자열 vs 문자열 비교: 불가능(참조값)
		//문자 vs 문자 비교: 가능(값)
		System.out.println('A' > 'B');
		
		//문자끼리 비교 가능 > 한글자씩 뽑아!
		//직접구현 방식
		int n = 0;
		
		for (int i=0; i<3; i++) {
			char c1 = txt1.charAt(i);
			char c2 = txt2.charAt(i);
			
			if (c1 > c2) {
				n = 1;
				break; //나머지 글자 비교할 필요가 없으니 끝내버리기
			} else if (c1 < c2) {
				n = -1;
				break;
			} // 만약 같으면 다시 위로 올라가서 for문 루프 돌기
			
		}
		
		System.out.println(n);
		
		
		//아래는 자동구현 메소드
		System.out.println(txt1.compareTo(txt2));
		//위에서 직접구현한것과 동일하게 txt1이 더 크면 양수, txt2가 더 크면 음수, 같으면 0 출력
		
		System.out.println(txt1.compareToIgnoreCase(txt2));	//영문자 대소문자 구분 없이 비교하는 메소드
		
		
		
		String[] names = {"홍길동", "아무개", "유재석", "박명수", "이순신", "훈", "김철"};
		//위 배열을 가나다순으로 정렬
		
		//오름차순1
		//Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//오름차순2
//		Arrays.sort(names, new Comparator<String>(){
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
		System.out.println(Arrays.toString(names));
		
		//내림차순
		Arrays.sort(names, new Comparator<String>(){
			
			@Override
			public int compare(String o1, String o2) {
				//return o2.compareTo(o1); //문자 코드값 비교 > 가나다
				//return o1.length() - o2.length(); //글자수 비교
				
				//글자수 비교 후, 2차로 가지런히 배열하기
				if (o1.length() > o2.length()) {
					return 1;
				} else if (o1.length() < o2.length()) {
					return -1;
				} else {

					//2차 정렬 기준 (내림차순)
					return o2.compareTo(o1);
				}
				
			}
		});
		System.out.println(Arrays.toString(names));
		
		
		
	}//m2

	private static void m1() {
		Integer[] nums = {1, 5, 2, 4, 3};
		
		System.out.println(Arrays.toString(nums));
		
		//오름차순 정렬
		Arrays.sort(nums); //Quick Sort
		System.out.println(Arrays.toString(nums));
		
		//내림차순 정렬 > 지원 안함 > 직접 구현
		//Arrays.sort(배열, Comparator); > 내가 원하는 정렬을 할 수 있게끔 도와주는 아이
		//인터페이스의 자식클래스의 객체를 넣어달라ㅏ!
		Arrays.sort(nums, new MyComparator());
		System.out.println(Arrays.toString(nums));
		
		//아래 MyComparator은 객체를 만들려고 생성한게 아니라, 목적 자체가 정렬을 하기 위해 만든 것!!
		//쓸모 없음..
		MyComparator mc1 = new MyComparator();
		System.out.println(mc1.compare(10, 20));
		
		//Arrays.sort(nums2, new MyComparator()); > 또 더블형의 클래스를 생성해줘야 함...번거로워..과해..
		// >> 이럴 때 익명 클래스를 사용!!!
		
		Double[] nums2 = {2.5, 7.1, 3.8, 9.2, 8.9};
		//익명클래스 만들어보잣
		Arrays.sort(nums2, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {

				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}
			
		});
		
		System.out.println(Arrays.toString(nums2));
	}
}//class

//정렬때문에 선언한 클래스
class MyComparator implements Comparator<Integer>{ //T는 앞 배열의 요소타입으로 맞춰야 함!

	@Override
	public int compare(Integer o1, Integer o2) {
		//정렬을 하기 위해선 항상 요소간의 비교가 필요
		//두 요소를 어떻게 비교해서 어떻게 결과를 돌려줄지에 따라서 우리가 원하는 정렬로 커스터마이징 할 수 있음
		//정렬하는 도구!
		
		// o1 vs o2
		//1. 오름 차순
		//	a. o1이 더 크면 > 양수 반환
		//	b. o2가 더 크면 > 음수 반환
		//	c. 같으면 > 0 반환
		// ->3가지 경우의 수가 있기 때문에 boolean으로는 표현 할 수 없고 int로 표현이 가능하다!
		
		//2. 내림 차순
		//	a. o1이 더 크면 > 음수 반환 > -1
		//	b. o2가 더 크면 > 양수 반환 > 1
		//	c. 같으면 > 0 반환

		//오름차순 먼저 해보기!!
		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		} else {
			return 0;
		}
		
	} 
	
}



class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]\n";
	}
	
	
}