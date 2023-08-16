package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex65_File {

	public static final String FILE = "C:\\class\\code\\java\\file\\list.txt";
	//오타가 나면 안 되는 파일명 같은 경우 이렇게 final 상수 처리해두는게 편함!
	
	
	public static void main(String[] args) {
		
		/*
			파일 입출력
			- 응용프로그램 <- (데이터) -> 저장장치(*.txt)
		
			저장장치
			- 데이터 1,0으로 저장(실제 1,0은 아니지만 1,0에 준하는 표현으로 저장함)
			- 데이터의 자료형 존재X > 모두 다 문자
			
			인코딩, Encoding
			- 문자 코드(자바 데이터)를 부호화(1,0) 시키는 작업
			- 자바 프로그램("홍길동") > 텍스트 파일(100100100110110)
			
			디코딩, Decoding
			- 부호화된 데이터를 문자 코드로 변환하는 작업
			- 텍스트 파일(100100100110110) > 자바 프로그램("홍길동")
			
			인코딩/디코딩 규칙
			1. ISO-8859-1
			2. EUC-KR
			3. ANSI
			4. MS949(CP949)
			5. UTF-8
			6. UTF-16
			7. ASCII
			
			ANSI(ISO-8859-1, EUC-KR, MS949)
			1. 영어(숫자, 특수문자, 서유럽 등): 1byte
			2. 한글(한자, 일본어 등): 2byte
			
			UTF-8(Unicode) ***** 무조건 이걸 사용 > 국제 표준
			1. 영어: 1byte
			2. 한글: 3byte
			
			UTF-16(Unicode)
			1. 영어: 2byte
			2. 한글: 2byte
			
			C:\class\code\java\file\encoding
			- [ANSI]영어.txt
			- [ANSI]한글.txt
			
			- [UTF-8]영어.txt
			- [UTF-8]한글.txt
			
			- [UTF-16]영어.txt
			- [UTF-16]한글.txt
			
			
		*/
		
		//m1(); //파일 쓰기
		//m2(); //파일 읽기
		//m3(); // 바뀐 도구로 쓰기 작업
		//m4(); //바뀐 도구로 읽기 작업
		//m5(); //마지막 도구(BufferedWriter)
		//m6(); //BufferedReader
		//m7(); //이것 저것 만들어보기 > 쓰기 작업
		m8(); //읽기 작업
		
		
		
		
	}//main

	private static void m8() {

		try {
			
			//java파일 읽어보기
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex32_Array.java"));
			
			String line = null;
			int n = 1; //line number 만들어주기 > 소스 느낌 내게!
			
			while ((line = reader.readLine()) != null) {

				System.out.printf("%3d: %s\n",n, line);
				n++;
			}
				
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m8");
			e.printStackTrace();
		}
		
		
		
		
	}

	private static void m7() {

		//메모장 쓰기
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			//파일명을 입력받아서
			System.out.print("저장할 파일명: ");
			String filename = scan.nextLine();
			
			//입력받은 파일명으로 파일을 생성하고
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\" + filename + ".txt"));
			
			boolean loop = true;
			
			while (loop) {
				
				System.out.print("입력: ");
				String line = scan.nextLine();
				
				//루프를 빠져나갈 예약어로 하나 정하쟝
				if (line.equals("exit")) {
					break;
				}
				
				//입력받은걸 writer로 적고
				writer.write(line); //한줄 입력(scan) > 한줄 쓰기(writer)
				writer.write("\r\n");
				
				
			}
			
			writer.close();
			
			System.out.println("파일 저장 완료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m7");
			e.printStackTrace();
		}
		
		
	}

	private static void m6() {

		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader reader2 = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\memo.txt"));
				
			// - reader2.read(); 하나씩 읽는 read라는 메소드
			// - reader2.readLine(); 한줄씩 읽는 메소드
			
//			String line = reader2.readLine();
//			System.out.println(line);
			
			//텍스트파일에 몇줄이 있는지 모르니까 루프로 만들기
			String line = null;
			
			while ((line = reader2.readLine()) != null) {
				//readLine()은 더이상 읽을게 없으면 null 반환
				System.out.println(line);
				
				
			}
			
			
			reader.close();
					
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m6");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m5() {

		//쓰기
		// - FileOutputStream > FileWriter > BufferedWriter
		
		//읽기
		// - FileInputStream > FileReader > BufferedReader(모든 입력버프안에있는것을 읽어주는 것)
		
		//쓰기 작업
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\memo.txt"));
			
			writer.write("하나");
			writer.write('A');
			writer.write("\r\n"); //줄내림
			writer.write("둘");
			writer.newLine(); //줄내림
			writer.write("셋");
			
			writer.close();
			
			System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m5");
			e.printStackTrace();
		}
		
		
	}

	private static void m4() {

		try {

			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\member.txt");
			
//			int code = reader.read();
//			System.out.println((char)code); //한글이 안 깨짐! > 한글 읽기 작업 지원 > 한글자씩만 읽어줌 ㅠ
			
			//한글자씩 읽어주니까 루프 돌려~~
			int code = -1;
			
			while((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m4");
			e.printStackTrace();
		}
		
		
	}

	private static void m3() {

		//쓰기
		// - FileOutputStream > FileWriter
		
		//읽기
		// - FileInputStream > FileReader
		
		try {
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt");
			
//			writer.write(65); //문자코드로 쓰기도 가능
//			writer.write("ABC"); //문자열로 쓰기도 가능
			writer.write("홍길동");
			
			writer.close();
			//혹시 실수로 stream을 닫아버렸다면 다시 열면 됨!! (아래 참고)
			//writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt");
			
			
			System.out.println("종료");
			
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m3");
			e.printStackTrace();
		}
		
		
		
		
	}

	private static void m2() {
		
		try {
			
			//파일 읽기
			// - FileOutputStream > 파일 쓰기
			// - FileInputStream > 파일 읽기
			
			//읽기 스트림 객체
			FileInputStream stream = new FileInputStream(Ex65_File.FILE);
			
			int code = -1;
			
			//아래 루프 많이 쓰이니 외우기!!!
			while ((code = stream.read()) != -1) {
				System.out.print((char)code);
				
			}
			System.out.println();
			
			stream.close();

//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m2");
			e.printStackTrace();
		}
		
		
	}//m2

	private static void m1() {

		//파일 쓰기
		// - 스트림 객체
		
		//쓰기 스트림 객체
		//1. 생성 모드, Create mode > 덮어쓰기 > 더 많이 사용!!
		// - 기본값
		//	a. 파일이 존재하지 않으면 자동으로 생성한다.
		//	b. 파일이 존재하면 항상 덮어쓰기를 한다.
		
		//2. 추가 모드, Append mode > 기존 내용 그대로 이어쓰기
		//	a. 파일이 존재하지 않으면 자동으로 생성한다.
		//	b. 파일이 존재하면 항상 이어쓰기를 한다.
		
		
		
		
		//자바는 외부 입출력은 예외처리를 요구함
		try {

			File file = new File("C:\\class\\code\\java\\file\\list.txt");

			//스트림 객체 생성 > 스트림 열기 (빨대를 꽂았습니다)
			// - 바이트 단위 쓰기(1byte) > 한글 쓰기, 읽기 불가. (할수는 있으나 요즘은 굳이..) > 다른 도구 이따 쓸때는 한글 가능
			FileOutputStream stream = new FileOutputStream(file, true); //뒤에 boolean값 없으면 생성모드가 기본

			//stream을 가지고 쓰기 작업을 하면 list.txt에 반영 됨.
			//파일이 없는데? 파일 생성까지 됩니당
			
//			stream.write('홍'); //A를 적고싶어 > 숫자가 요구된다 > 문자코드값 달라.
//			stream.write('길');
//			stream.write('동');
			
			String txt = "Hello~ Hong!!";
			
			//문장을 추가하는 방법
			for (int i=0; i<txt.length(); i++) {
				stream.write(txt.charAt(i));
			}
			
			
			//스트림 닫기 (스트림은 항상 사용 후 닫아야 함)
			// - 저장이 안된다.
			// - 잠긴 파일이 된다. > 파일 이동, 삭제등의 추가 작업 불가(파일을 열어놓고 안닫았을 때 변경이 불가한 상황과 동일)
			stream.close(); //데이터를 메모리에 쌓아뒀다가 클로즈하면 저장장치로 저장되기 때문에!
			
			System.out.println("종료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}//class
