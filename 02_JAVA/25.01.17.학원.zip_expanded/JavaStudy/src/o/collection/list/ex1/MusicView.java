package o.collection.list.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	
	public void mainMenu() {

		while(true) {
			int choice;
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("7. 곡 명 오름차순 정렬");
			System.out.println("8. 가수 명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 입력 :");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				addList();
				break;
				
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
				
			case 9:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void addList() {
		
		String title;
		String sigger;
		System.out.println("곡 명");
		title = sc.next();
		
		System.out.println("가수 명");
		sigger = sc.next();
		
		
		Music music = new Music(sc.next(), sc.next());
		
		mc.addList(music);
		
		
		
			
		
	
		
		
		
		
		
		
		
		
		
	
		 
		 
		
		
		
		
	}
	
	public void addAtZero() {
	}
	public void printAll() {
	}
	
	public void searchMusic() {
	}
	
	public void removeMusic() {
	}
	
	public void setMusic() {
	}
	
	public void ascTitle() {
	}
	
	public void descSinger() {
	}

}
