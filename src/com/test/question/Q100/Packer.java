package com.test.question.Q100;

public class Packer {

	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int RulerCount;
	
	public void packing(Pencil pencil) {
		
		System.out.printf("포장 전 검수 : %s입니다.\n", pencil.info());

		//연필 hardness 유효성 검사
		if (pencil.getHardness().equals("4B")
				|| pencil.getHardness().equals("3B")
				|| pencil.getHardness().equals("2B")
				|| pencil.getHardness().equals("B")
				|| pencil.getHardness().equals("HB")
				|| pencil.getHardness().equals("H")
				|| pencil.getHardness().equals("2H")
				|| pencil.getHardness().equals("3H")
				|| pencil.getHardness().equals("4H")) {
			
			System.out.println("포장을 완료했습니다.");
			pencilCount++;
		}
		
	}

	public void packing(Eraser eraser) {
		
		System.out.printf("포장 전 검수 : %s입니다.\n", eraser.info());
		
		if (eraser.getSize().equals("Large")
				|| eraser.getSize().equals("Medium")
				|| eraser.getSize().equals("Small")) {
			
			System.out.println("포장을 완료했습니다.");
			eraserCount++;
		}
		
	}
	
	public void packing(BallPointPen ballPointPen) {
		
		System.out.printf("포장 전 검수 : %s입니다.\n", ballPointPen.info());
		
		//아! 아래와 같이 말고 그냥 조건 자체를 (두께 || 두께 || 두께) && (색상 || 색상 || 색상) 이렇게 걸면 되는구나!
		if (ballPointPen.getThickness() != 0.3
				&& ballPointPen.getThickness() != 0.5
				&& ballPointPen.getThickness() != 0.7
				&& ballPointPen.getThickness() != 1
				&& ballPointPen.getThickness() != 1.5) {
			return;
		}
		
		if (!ballPointPen.getColor().equals("red")
				&& !ballPointPen.getColor().equals("blue")
				&& !ballPointPen.getColor().equals("green")
				&& !ballPointPen.getColor().equals("black")) {
			return;
		}
		System.out.println("포장을 완료했습니다.");
		ballPointPenCount++;
		
	}
	
	public void packing(Ruler ruler) {
		
		System.out.printf("포장 전 검수 : %s입니다.\n", ruler.info());
		
		if (ruler.getLength() != 30
				&& ruler.getLength() != 50
				&& ruler.getLength() != 100) {
			return;
		}
		
		if (!ruler.getShape().equals("줄자")
				&& ruler.getShape().equals("운형자")
				&& ruler.getShape().equals("삼각자")) {
			return;
		}
		
		System.out.println("포장을 완료했습니다.");
		RulerCount++;
	}
	
	
	public void countPacking(int type) {
		
		if (type == 0) {
			
			System.out.println("====================");
			System.out.println("포장 결과");
			System.out.println("====================");
			System.out.printf("연필 %d회\n", pencilCount);
			System.out.printf("지우개 %d회\n", eraserCount);
			System.out.printf("볼펜 %d회\n", ballPointPenCount);
			System.out.printf("자 %d회\n", RulerCount);
			System.out.println();

		} else if (type == 1) {
		
			System.out.println("====================");
			System.out.println("포장 결과");
			System.out.println("====================");
			System.out.printf("연필 %d회\n", pencilCount);
			System.out.println();
			
		} else if (type == 2) {
			
			System.out.println("====================");
			System.out.println("포장 결과");
			System.out.println("====================");
			System.out.printf("지우개 %d회\n", eraserCount);
			System.out.println();
			
		} else if (type == 3) {
			
			System.out.println("====================");
			System.out.println("포장 결과");
			System.out.println("====================");
			System.out.printf("볼펜 %d회\n", ballPointPenCount);
			System.out.println();
			
		} else if (type == 4) {
			
			System.out.println("====================");
			System.out.println("포장 결과");
			System.out.println("====================");
			System.out.printf("자 %d회\n", RulerCount);
			System.out.println();
		}
		
		
	}
	

}
