package com.test.question;


	public class NumberArray {
	    public static void main(String[] args) {
	        int[][] numberArray = new int[5][5];
	        int number = 1;

	        // 사각형 모양의 2차원 배열에 숫자들을 채웁니다.
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5 - i; j++) {
	                numberArray[i + j][j] = number++;
	            }
	        }

	        // 2차원 배열을 출력합니다.
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print(numberArray[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	
