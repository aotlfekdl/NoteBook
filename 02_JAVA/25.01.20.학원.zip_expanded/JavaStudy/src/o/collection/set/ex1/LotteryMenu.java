package o.collection.set.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("========== KH 추첨 프로그램 ==========");
			
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 :");
			
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			switch(choice) {
			case 1:
				this.insertObject();
				break;
				
			case 2:
				this.deleteObject();
				break;
				
			case 3:
				this.winObject();
				break;
				
			case 4:
				this.sortedWinObject();
				break;
			case 5:
				this.searchWinner();
				break;
				
			case 9:
				System.out.println("프로그램 종료.");
				return;
				
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				break;
			}
		}
	}
	public void insertObject() {
		
		List list = new ArrayList();
		int num;
		System.out.print("추가할 추첨 대상 수 : ");
		num = sc.nextInt();
		
		for(int i =0; i<num;i++) {
			String name;
			String phone;
			System.out.print("이름 :");
			name = sc.next();
			System.out.print("핸드폰 번호('-'빼고)");
			phone = sc.next();
			
			
			Lottery lottery = new Lottery(name, phone);
			lc.insertObject(lottery);
		}
		System.out.println("추가완료");
	}
	public void deleteObject() {
	}
	public void winObject() {
		System.out.println(lc.winObject());
	}
	public void sortedWinObject() {
	}
	public void searchWinner() {
	}
}
