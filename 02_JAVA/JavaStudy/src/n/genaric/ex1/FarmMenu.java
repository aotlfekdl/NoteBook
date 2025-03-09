package n.genaric.ex1;

import java.util.Scanner;

public class FarmMenu {
	
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();
	Farm farm = new Farm();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		
		
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 직원메뉴");
		System.out.println("2. 손님 메뉴");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 :");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			this.adminMenu();
			break;
			
		case 2:
			this.customerMenu();
			break;
		
		case 9:
			System.out.println("프로그램 종료");
			return;
			
		default :
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}
	}
	
	public void adminMenu() {
		System.out.println("******* 직원 메뉴 *******");
		System.out.println("1. 새 농산물 추가");
		System.out.println("2. 종류 삭제");
		System.out.println("3. 수량 수정");
		System.out.println("4. 농산물 목록");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 선택 :");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			this.addNewKind();
			break;
		case 2:
			this.removeKind();
			break;
			
		case 3:
			this.changeAmount();
			break;
			
		case 4:
			this.printFarm();
			break;
			
	
		case 9:
			this.mainMenu();
			break;
			
		default :
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}
	}
	
	public void customerMenu() {
	}
	
	public void addNewKind() {
		System.out.println("1. 과일/ 2. 채소 / 3. 견과");
		System.out.print("추가할 종류 번호");
		int num = sc.nextInt();
		System.out.print("이름 :");
		String name = sc.next();
		
		System.out.print("수량 :");
		int amount= sc.nextInt();
		Farm farm = new Farm();
		String kind = null;
		
		
		
		switch(num) {
		case 1:
			
			kind = "과일";
			System.out.println("과일 이름 입력:");
			name = sc.next();
			
			farm = new Farm(kind);
			Fruit fruit = new Fruit(kind, name);
			
			break;
		case 2:
			kind = "채소";
			System.out.println("과일 이름 입력:");
			name = sc.next();
			
			farm = new Farm(kind);
			Vegetable vegetable = new Vegetable(kind, name);
			
			fc.addNewKind(vegetable, amount);
			
			break;
		case 3:
			kind = "견과류";
			System.out.println("과일 이름 입력:");
			name = sc.next();
			
			farm = new Farm(kind);
			
			Nut nut = new Nut(kind, name);

			fc.addNewKind(nut, amount);
			
			break;
		default :
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			break;
		}
		
	}
	
	public void removeKind() {
	}
	
	public void changeAmount() {
	}
	
	public void printFarm() {
	}
	
	public void buyFarm() {
	}
	
	public void removeFarm() {
	}
	
	public void printBuyFarm() {
	}
	
		
	
}
