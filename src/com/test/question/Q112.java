package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {

	private static File file = new File("C:\\class\\code\\java\\file\\AAA\\test.txt");
	private static File file2 = new File("C:\\class\\code\\java\\file\\BBB\\test.txt");
	
	public static void main(String[] args) {
		
		/*
			요구사항]
			지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
			
			조건)
			- BBB폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
				> 덮어쓰기는 없음! 동일한 항목이 있을 경우, 기존 폴더에 있는 파일은 삭제 후 이동하기
				
				
			
			1. 조건에 해당하는 폴더 및 파일 만들고 rename 작업 > 파일 이동 문구 표출
			2. rename 작업값이 false일 경우, 덮어쓸지 여부 입력받고
			3. y 덮어쓰기 희망 시, BBB 폴더 내 파일 삭제 진행 후, 파일 이동
			4. n 입력 시 아무것도 안 함! > 알아서 작업 안 함.
		
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String answer = "";
		

		
		//file을 이동시킬 거니까 file이 존재하는지 먼저 확인 후, 이동 작업 진행!
		if (file.exists()) {
			
			System.out.println("파일 이동을 실행합니다.");
			
			//renameTo의 값이 true면 noting to do
			//false면 기존 파일 삭제 후 이동 진행.
			
			if (!file.renameTo(file2)) {
				System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
				answer = scan.nextLine();
				checkAnswer(answer);
				
			}
		}
		
		
		
		
		
	}

	//오!!!!!!!!!!!이건 구현해따!!!!!!!!!!ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
	private static void checkAnswer(String answer) {

		if (answer.equalsIgnoreCase("y")) {
			//BBB 폴더에서 파일 삭제 진행 하고
			file2.delete();
			
			//파일 이동하고
			file.renameTo(file2);
			
			//파일 덮어썼습니다 안내문 출력
			System.out.println("y. 파일을 덮어썼습니다.");
			
		} else if (answer.equalsIgnoreCase("n")) {
			System.out.println("n. 작업을 취소합니다.");
		}
		
		
		
	}
}
