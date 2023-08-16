package com.test.java.io;

import java.io.File;
import java.util.Calendar;

public class Ex64_File {

	//누적변수
	private static int count = 0; //파일 개수 세기 > 얘를 왜 static으로 만들어요? > m15는 static 메소드 > static변수이어야만 접근 가능
	private static int dcount = 0; //폴더 개수 세기
	private static long length = 0; //폴더 크기
	
	public static void main(String[] args) {
		
		/*
			1. 파일/디렉토리 조작
				- 윈도우 탐색기로 하는 모든 행동 > 자바로 구현
				- 파일 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기, 삭제하기 등
				- 폴더 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기, 삭제하기 등
				
			2. 파일 입출력
				- 파일 > 읽기/쓰기
				- 메모장 기능
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10(); //폴더 > 이름바꾸기
		//m11(); //폴더 > 이동하기
		//m12(); //폴더 > 삭제하기
		//m13(); //폴더의 내용 보기(자식폴더, 파일)
		
		//m14(); //오늘 수업중 14,15번이 가장 중요**********
		m15(); //위 14번 내용을 재귀메소드로 뺄 경우 간단!  >> 매우 중요 *****
		
	}//main

	private static void m15() {

		//TODO 이거 다시 해보기~~!!
		
		//특정 폴더 > 파일 개수 세기
		File dir = new File("C:\\class\\dev\\eclipse");
		
		//편의상 멤버변수 하나 만들기
		
		if (dir.exists()) {
			
			countFile(dir);
		}
		
		System.out.printf("총 파일 개수: %,d개\n", count);
		System.out.printf("총 폴더 개수: %,d개\n", dcount);
		System.out.printf("폴더 크기: %,dB\n", length);
		
	}

	private static void countFile(File dir) {
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 개수 세기
		for (File subfile : list) {
			if (subfile.isFile()) {
				count++;
				
				length += subfile.length(); //파일 크기를 누적
			}
		}
		
		//3. 자식 폴더를 대상으로 1-2번 반복 진행
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				
				dcount++;
				
				//1~2번 실행 > 3번 > 손자 폴더
				countFile(subdir); //자식 폴더 > 반복
				
				
			}
		}
	}


	private static void m14() {
		//재귀구조라 헷갈림~!
		
		//특정 폴더 > 파일 개수 세기
		File dir = new File("C:\\class\\dev\\eclipse");
		
		//개수 셀 누적 변수 선언
		int count = 0;
		
		if (dir.exists()) {
			
			File[] list = dir.listFiles(); //해당 폴더의 내용물 가져오기
			
			//eclipse 폴더 내의 파일 개수 세기
			for (File subfile : list) {
				
				if (subfile.isFile()) { 
					count++;
				}
			}
			
			//eclipse 폴더 내 자식 폴더로 들어가서 파일 개수 세기
			for (File subdir : list) {
				if (subdir.isDirectory()) {
					
					//자식 폴더 > 내용
					File[] sublist = subdir.listFiles();
					
					for (File subsubfile : sublist) {
						if (subsubfile.isFile()) {
							count++;
						}
					}
					
					//손자 폴더 내려가기
					for (File subsubdir : sublist) {
						if (subsubdir.isDirectory()) {
							
							//손자 폴더 > 내용
							File[] subsublist = subsubdir.listFiles();
							
							for (File subsubsubfile : subsublist) {
								if (subsubsubfile.isFile()) {
									count++;
								}
								
							}
						}
					}
					
					
					
					
				}
			}
			
			
			System.out.printf("총 파일 개수: %,d개\n", count);
			
			
		}
		
		
		
		
		
	}//m14

	private static void m13() {
		
		//폴더의 내용 보기(자식폴더, 파일)
		
		String path = "C:\\class\\dev\\eclipse";
		
		File dir = new File(path);
		
//		if (dir.exists()) {
//			
//			//둘다 목록을 가져오는 메소드이나 return값이 상이.
//			//dir.list();//문자열 파일명,폴더명을 돌려줌
//			//dir.listFiles(); //파일객체로 만들어서 돌려줌 > 추가작업하기 용이
//			
//			String[] list = dir.list(); //문자열 배열 반환 > 처리하기 귀찮은 아이!
//			
//			for (String f : list) {
//				//파일명, 폴더명 가져오기 > 파일인지 폴더인지 쉽게 구분 불가(파일은 확장자를 안 가질수도 있음!) > isFile, isDirectory 사용해야만 정확하게 확인 가능
//				//System.out.println(f); //문자열을 파일 오브젝트로 변환 필요
//				File file = new File(path + "\\" + f);
//				System.out.println(f + " > " + (file.isFile() ? "파일" : "폴더"));
//			}
//			
//		}
		
		//dir.listFiles() 이용해보기
		if (dir.exists()) {
			
//			File[] list = dir.listFiles(); //가장 많이 씀!!!!!
//			
//			for (File f : list) {
//				
//				System.out.printf("%s - %s\n", f.getName(), (f.isDirectory() ? "폴더" : "파일"));
//			}
			
			
			//탐색기 느낌으로 출력하기
			File[] list = dir.listFiles();
			//폴더 출력
			for (File d : list) {
				
				if (d.isDirectory()) {
					System.out.printf("[%s]\n", d.getName());
				}
			}
			
			//파일 출력
			for (File f : list) {
				
				if (f.isFile()) {
					System.out.println(f.getName());
				}
			}
			
			
		}//if
		
		
		
	}//m13

	private static void m12() {

		//폴더 > 삭제하기
		// - 빈폴더일때만 가능하다.
		// - 내용물(파일, 자식폴더)이 있으면 삭제가 불가능하다. > 꽤 많은 프로그램 언어들이 내용물이 있을 경우 삭제를 지원하지 않음.(위험하기 때문에)
		// - 직접 구현 필요
		
		File dir = new File("C:\\class\\code\\java\\move\\할일");
		
		if (dir.exists()) {
			System.out.println(dir.delete()); //성공하면 true, 실패하면 false값 반환
		}
		//지우면 완전 삭제!!(휴지통 이동이 아님!)
		
	}

	private static void m11() {

		//폴더 > 이동하기(file > move 폴더로 이동)
		File dir = new File("C:\\class\\code\\java\\file\\할일");
		File dir2 = new File("C:\\class\\code\\java\\move\\할일");
		
		if (dir.exists()) {
			
			System.out.println(dir.renameTo(dir2));
			
		}
	}

	private static void m10() {

		//폴더 > 이름 바꾸기
		File dir = new File("C:\\class\\code\\java\\file\\날짜");
		File dir2 = new File("C:\\class\\code\\java\\file\\할일");
		
		if (dir.exists()) {
			
			System.out.println(dir.renameTo(dir2));
			
		}
		
		
		
		
		
		
	}

	private static void m9() {

		//요구사항] 날짜별 폴더 > 2023-01-01 ~ 2023-12-31
		
		Calendar c = Calendar.getInstance(); //윤년등의 변수가 있으니 캘린더 클래스 객체 생성
		c.set(2023, 0, 1); //2023-01-01로 셋팅
		
		System.out.println(c.getActualMaximum(Calendar.MONTH)); //11 > 2023년 내에 가장 큰 월의 숫자가 언제냐? > 11월
		System.out.println(c.getActualMaximum(Calendar.DATE)); //11 > 2023년 1월이 최대 몇일까지 있는가? > 31일
		System.out.println(); //11 > 2023년의 최대 날짜가 몇일까지 있는가? 평년 > 365일
		
		int max = c.getActualMaximum(Calendar.DAY_OF_YEAR); //365
		
		for (int i=0; i<max; i++) { //1년이 365일인지, 366일인지(평년 vs 윤년) 모를 때 알아내는 방법이 있음!!
			
			//"2023-01-01"
			String name = String.format("%tF", c);
			System.out.println(name);
			
			File dir = new File("C:\\class\\code\\java\\file\\날짜\\" + name);
			dir.mkdirs();
			
			c.add(Calendar.DATE, 1);
		}
		
		
	}

	private static void m8() {

		//요구사항] 회원 > 회원명으로 개인 폴더 생성
		
		String[] member = {"홍길동", "아무개", "이순신", "권율", "유관순"};
		
		for (int i=0; i<member.length; i++) {
			
			String path = String.format("C:\\class\\code\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			
			File dir = new File(path);
			System.out.println(dir.mkdirs());
		}
		
		
	}

	private static void m7() {

		//폴더 > 만들기
		//File dir = new File("C:\\class\\code\\java\\aaa");
		File dir = new File("C:\\class\\code\\java\\bbb\\ccc"); // > false 최종 대상을 만들 때, 앞의 경로가 실존하지 않으면 동작 안 함. > mkdirs 사용하면 가능!!!!
		
		if (!dir.exists()) {
			
			//System.out.println(dir.mkdir()); //폴더 1개 만들기 > 파일 만들고 성공하면 true값 반환
			System.out.println(dir.mkdirs());  //연관된 폴더 모두 함께 만들기 > true 
		}
	
	
	
	}

	private static void m6() {

		//파일 > 삭제하기
		File file = new File("C:\\class\\code\\java\\move\\데이터.txt"); //주의...C드라이브 까지 경로 설정 후 delete 하면 윈도우 날려먹음!!!
		
		if (file.exists()) {
			
			//파일 이동 > 휴지통(O)
			//파일 삭제 > 휴지통(X)
			System.out.println(file.delete()); //삭제 성공 시 true 값 반환 **주의** 휴지통에 해당 파일 없음!!!!!
		}
		
		
		
	}//m6

	private static void m5() {

		//파일 > 이동하기
		// - C:\\class\\code\\java\\file\\data.txt
		//C:\\class\\code\\java\\move\data.txt
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		File file2 = new File("C:\\class\\code\\java\\move\\데이터.txt"); //경로나 이름을 한꺼번에 바꿀 수 있는 메소드
		
		if (file.exists()) {
			
			System.out.println(file.renameTo(file2)); 
		}
		
	}

	private static void m4() {

		//파일 > 파일명 바꾸기
		File file = new File("C:\\class\\code\\java\\file\\data.txt"); //수정 전
		File file2 = new File("C:\\class\\code\\java\\file\\데이터.txt"); //수정 후
		//파일명을 바꾸려면 먼저 object를 하나 더 만들어야 함!!!
		
		if (file.exists()) {
			
			System.out.println(file.renameTo(file2)); //true > 실행하면 true. 인자값이 또 다른 파일 객체  > 경로는 모두 동일
			//이미 똑같은 이름의 파일이 같은 폴더 내 존재할 경우 변경 불가로 'false'값 표출.
		}
		
		
		
		
	}//m4

	private static void m3() {

		//파일 > 생성하기
		File file = new File("C:\\class\\code\\java\\file\\hello.txt");
	
		//TODO 여기 file.createNewFile() 다시 해보기 에러창 뜨는거 보게!!
		if (!file.exists()) {
			try {
				System.out.println(file.createNewFile());
				
			} catch (Exception e) {
				e.printStackTrace();
			}	
				
		} else {
			System.out.println("이미 동일한 파일이 존재합니다.");
		}
	
	
	}//m3
	

	private static void m2() {
		
		//특정 폴더의 정보 확인하기
		// - 폴더(Folder), 디렉토리(Directory)
		// - C:\class\code\java\file
		
		//폴더 참조 객체
		// - 폴더는 파일이다. (그렇기에 file class 사용)
		File dir = new File("C:\\class\\code\\java\\file");
		
		if (dir.exists()) {
			System.out.println("폴더가 있습니다.");
			System.out.println(dir.getName()); //추후 파일 경로를 모를 때 어떤 파일인지 알기 위해 사용
			System.out.println(dir.isFile()); //
			System.out.println(dir.isDirectory()); //
			System.out.println(dir.length()); //0 > 문자열에서 length = 길이, 배열의 length = 방의 갯수, file의 length = 크기 > 36바이트
			System.out.println(dir.getAbsolutePath()); //C:\class\code\java\file\data.txt > 파일의 전체 경로
			//위 5개 매우 잘 사용되니 기억하시오!!
			
			System.out.println(dir.lastModified()); //1691379568927 > 마지막 수정 날짜(tick 값)
			System.out.println(dir.isHidden()); //false > 숨김파일 여부
			
			System.out.println(dir.getParent());
			
		} else {
			System.out.println("폴더가 없습니다.");
		}
		
		
		
		
	}

	private static void m1() {

		//특정 파일의 정보 확인하기
		// - C:\class\code\java\file > 폴더 생성
		// - C:\class\code\java\file\data.txt > 텍스트 파일 생성
		
		//이제 저 txt 파일에 접근을 해보자!!
		//자바 프로그램에서 외부의 파일을 접근
		//1. 외부 파일을 참조하는 참조 객체 생성 > 대리자, 위임자 (부동산 거래 할 때 복덕방 사장님을 참조 객체라고 생각하면 됨.)
		//2. 참조 객체 조작 > 행동 > 외부 파일에 적용 (행동의 결과가 외부 파일에 알아서 적용이 됨)
		
		//파일 참조 클래스 > 객체 > java.io.File(이 클래스가 복덕방 사장님)
		File file = new File("C:\\class\\code\\java\\file\\data.txt"); //이 안의 ""는 문자열
		System.out.println(file.exists()); //위 문자열의 경로가 확실하면 true, 아니라면 false > 파일이 존재하지 않으면 그와 관련된 작업을 할 수 없으므로, 항상 얘를 체크하여 파일이 있을경우 후작업 진행, 없을경우 미진행!
		System.out.println();
		
		
		if (file.exists()) {
			System.out.println("파일이 있습니다.");
			
			//업무
			System.out.println(file.getName()); //추후 파일 경로를 모를 때 어떤 파일인지 알기 위해 사용
			System.out.println(file.isFile()); //true > 파일이면 true
			System.out.println(file.isDirectory()); //false > 폴더면 true > 나중에 파일인지 폴더인지 모르는 상황 발생 시 사용
			System.out.println(file.length()); //36 > 문자열에서 length = 길이, 배열의 length = 방의 갯수, file의 length = 크기 > 36바이트
			System.out.println(file.getAbsolutePath()); //C:\class\code\java\file\data.txt > 파일의 전체 경로
			//위 5개 매우 잘 사용되니 기억하시오!!
			
			System.out.println(file.lastModified()); //1691379568927 > 마지막 수정 날짜(tick 값)
			System.out.println(file.isHidden()); //false > 숨김파일 여부
			//tick > 년월일시분초
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis());
			c1.setTimeInMillis(file.lastModified());
			
			System.out.printf("%tF %tT\n", c1, c1);
			
			
		} else {
			System.out.println("파일이 없습니다.");
		}
		
		
	}//m1
	
}//class
