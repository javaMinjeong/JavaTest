package com.test.java;

public class Ex33_Array {

	public static void main(String[] args) {

		//다차원 배열
		// - 1~3차원
		
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		
		
		
	}

	private static void m5() {

		//문제 설명
		// - 5x5 2차원 배열
		//배열의 대괄호는 배열명 앞, 뒤 모두 사용 가능하나 최근 언어들은 앞 사용이 가능하니 > 되도록 앞에 대괄호 붙이도록!!
		
		int[][] nums = new int[5][5];
		
		//데이터 입력 > 문제 (문제 요구사항에 따라 고쳐서 사용해야 하나)
		int n = 1;
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		//출력 > 수정없이 그대로 사용 (복붙해서 그대로 사용하면 됨)
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}//m5

	private static void m4() {

		String[] member = {"홍길동", "임꺽정", "성춘향", "강호동", "정형돈", "김국진", "노홍철", "하하", "유재석", "박명수"};
		
		//1. 배열 > 원하는 데이터 존재하는지 검색 > 있다 or 없다
		
		String name = "김연아";
		
		if (contains(member, name)) {
			System.out.println(name + "발견!!");
		} else {
			System.out.println(name + "없음;;");
		}
		
		//2. 배열 > 원하는 데이터 존재하는지 검색 > 몇번째 방에 있는지? > 방번호
		int index = indexOf(member, name);
		System.out.println(index);
		
		
		
		
	}//m4

	private static int indexOf(String[] member, String name) {

		for (int i=0; i<member.length; i++) {
			
			if (member[i].equals(name)) {
				
				return i; //발견 위치 == 방번호
			}
			
		}
		
		
		return -1;//서수는 0부터 시작하기때문에 인덱스 값은 음수부터 시작할 수가 없음 > 아! 음수는 못찾았다는 뜻이구나!!
		//보통 어떤 행위(검색)의 실패 혹은 잘못됨 혹은 못찾음의 의미로 '-1'을 많이 사용함!!!!!
	
	}//indexOf

	private static boolean contains(String[] member, String name) {
		
		//너 강호동이니? 물어보는 작업을 첫번째 사람부터 > 마지막 까지 >> 루프 생성(배열의 끝까지)
		for (int i=0; i<member.length; i++) {
			
			if (member[i].equals(name)) {
				//발견!!
				return true;
			}
			
		}
		
		
		return false;
		//못찾았어용 No
		
		
	}//contains

	private static void m3() {

		//1차원 > length
		int[] nums1 = {10, 20, 30};
		
		for (int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		System.out.println();
		
		//2차원 > 
		int[][] nums2 = {{10, 20, 30}, {40, 50, 60}};
		
		
//		for(int i=0; i<2; i++) { //좌측은 상수로 범위를 적어서, 만일 각 차원별 요소가 늘어났다고 가정하면 일일히 다 수정 필요.
//			for (int j=0; j<3; j++) {
//				System.out.println(nums2[i][j]);
//			}
//		}
		
		//변수로 바꿔보자!
		System.out.println(nums2.length); //값: 2 
		System.out.println(nums2[0].length); //찾아간 1차원 배열의 길이 > 값: 3 > 보통은 [0]을 사용
		
		
		for(int i=0; i<nums2.length; i++) { //좌측은 상수로 범위를 적어서, 만일 각 차원별 요소가 늘어났다고 가정하면 일일히 다 수정 필요.
			
			for (int j=0; j<nums2[0].length; j++) {
				System.out.println(nums2[i][j]);
			}
		}
		
	}

	private static void m2() {

		//다차원 초기화 리스트
		int[] nums1 = new int[] {10, 20, 30};//아래와 같이변수부터 만들고 필요에 따라 쓸 수가 있지만 > 잘 안씀
//		int[] nums1;
//		nums1 = new int[] {10, 20, 30}; 
		int[] nums2 = {10, 20, 30}; //선언하며 초기화까지 같이 해야만 사용 가능
		
		int [][] nums3 = new int[2][3];
		int [][] nums4 = new int[][] {{10, 20, 30}, {40, 50, 60}}; //순서대로 첫번째 층 방 3개, 두번째 층 방 3개
		// > 1차원을 두개 연달아 씀
		int [][] nums5 = {{10, 20, 30}, {40, 50, 60}};
		
		int[][][] nums6 = new int[2][2][3];
		int[][][] nums7 = new int[][][] {{{10, 20, 30}, {40, 50, 60}}, {{10, 20, 30}, {40, 50, 60}}};
		int[][][] nums8 = {{{10, 20, 30}, {40, 50, 60}}, {{10, 20, 30}, {40, 50, 60}}};
		int[][][] nums9 = 
		{
				{
					{10, 20, 30}, 
					{40, 50, 60}
				}, 
				{
					{10, 20, 30}, 
					{40, 50, 60}
				}
		};
		
		
	}//m2

	private static void m1() {

		//1차원 배열
		int[] nums1 = new int[3];
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		//배열 탐색 > 단일 for문
		for (int i=0; i<3; i++) {
			System.out.printf("nums1[%d] = %d\n", i, nums1[i]);
		}
		System.out.println();
		System.out.println();
		
		//2차원 배열
		int[][] nums2 = new int[2][3]; //2(2차원, 행), 3(1차원, 열)
		
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300; //1층 = 1행 완료
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600; //2층 = 2행 완료
		
		//2차원 배열 탐색 > 2중 for문으로 돈다. > 외부 루프 = 행, 내부 루프 = 열
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("nums2[%d][%d]\n", i, j, nums2[i][j]);
			}
		}
		System.out.println();
		System.out.println();
		
		//3차원 배열
		int[][][] nums3 = new int[2][2][3]; //2(3차원, 면(동)), 2(2차원, 행(층)), 3(1차원, 열(호수))
		
		nums3[0][0][0] = 100;
		nums3[0][0][1] = 200;
		nums3[0][0][2] = 300;
		
		nums3[0][1][0] = 400;
		nums3[0][1][1] = 500;
		nums3[0][1][2] = 600;
		
		nums3[1][0][0] = 700;
		nums3[1][0][1] = 800;
		nums3[1][0][2] = 900;
		
		nums3[1][1][0] = 1000;
		nums3[1][1][1] = 1100;
		nums3[1][1][2] = 1200;
		
		//3차원 배열 탐색 > 3중 for문
		for (int i=0; i<2; i++) { //동수 통제
			for (int j=0; j<2; j++) { //층 통제
				for (int k=0; k<3; k++) { //호수 통제
					
					System.out.printf("nums3[%d][%d][%d] = %d\n", i, j, k, nums3[i][j][k]);
					
				}
				System.out.println();
			}
		}
		
		
		
		
	}

}
