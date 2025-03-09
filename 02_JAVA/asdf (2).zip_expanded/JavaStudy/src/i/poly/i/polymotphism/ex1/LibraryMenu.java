package i.poly.i.polymotphism.ex1;
import java.util.Scanner;

public class LibraryMenu {

	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	
	public void mainMenu() {
		String name;
		int age;
		char gender;
		
		System.out.println("이름 :");
		name = sc.next();
		System.out.println("나이 :");
		age = sc.nextInt();
		System.out.println("성별 :");
		gender = sc.next().charAt(0);
		
		Member m = new Member(name, age, gender);
		lc.insertMember(m);
		lc.insertMember(m);
		
//		pc.insertStudent(name, age, height, weight, grade, major);
		
		while(true) {
			
		
			int choice;
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:
				lc.myInfo();
				break;
				
			case 2:
				selectAll();
				break;
				
			case 3:
				searchBook();
				break;
				
			case 4:
				rentBook();
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("잘못입력하였습니다.");
				break;
			}
		}
	
	}
	public void selectAll() {
		lc.selectAll();
	}
	public void searchBook() {
		String keyword;
		System.out.println("검색할 제목 키워드 : ");
		keyword = sc.next();
		lc.searchBook(keyword);
	}
	public void rentBook() {
		
	}
}
