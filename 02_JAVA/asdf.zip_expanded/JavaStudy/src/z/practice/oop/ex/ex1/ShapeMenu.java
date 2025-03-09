package z.practice.oop.ex.ex1;

import java.util.Scanner;

public class ShapeMenu {

	Scanner sc = new Scanner(System.in);
	
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 :");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 3:
			this.triangleMenu();
			break;
		case 4:
			this.squareMenu();
			break;
			
			
			
		}
		
	
	}
	
	public void triangleMenu() {
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		
		if(choice == 9) {
			return;
		}else {
			this.inputSize(1, choice);
				
			}
			
		}

	public void squareMenu() {
		System.out.println("1. 사각형 면적");
		System.out.println("2. 사각형 색칠");
		System.out.println("3. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		if(choice == 9) {
			return;
		}else {
			this.inputSize(2, choice);
		}
		
		
		
	}
	public void inputSize(int type, int menuNum) {
		System.out.print("너비: ");
		double height = sc.nextDouble();
		
		System.out.print("높이: ");
		double width = sc.nextDouble();
		tc.calcArea(height, width);
		
		if(type == 1) {
			switch(menuNum) {
			case 1:
				System.out.print("너비: ");
				double height = sc.nextDouble();
				
				System.out.print("높이: ");
				double width = sc.nextDouble();
				double  calcArea = tc.
				
			
			case 1:
			
		}
		switch(type) {
		case 1:
			
		
		}
		
	}
	switch(type)
	public void printlnformatino(int type) {
		tc.calcArea(t)
		
		
	}
}
