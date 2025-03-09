package i.poly.i.polymotphism.ex1;
public class LibraryController {
	Member mem = null;
	Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		}

	
	public void insertMember(Member mem){
		this.mem = mem;
		
	}
	public Member myInfo() {
		
	System.out.println(mem);
		
		return mem;
		
	}
	public Book[] selectAll() {
		int index= 0;
		for(int i =0; i <bList.length; i++) 
		{
			System.out.println(index+"번 도서 :"+bList[i]);
			index++;
		}
		
		
		return null;
	}
	
	public Book[] searchBook(String keyword) {
		
		 ArrayList[B
		           ook] matchedBooks = new ArrayList<>();
		Book[] bList1 = new Book[5];
		for(int i =0; i<bList.length; i++) {
			if == bList[i].contains(keyword));
		}
		for(Book b1 : bList) {
			if (bList.);
			
		}
			
		
		return null;
	}

	

	public int rentBook(int index) {
		return 0;
	}
}
