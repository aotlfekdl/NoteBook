package i.poly.i.polymotphism.ex1;
public class AniBook extends Book{
	private int accessAge;

	public AniBook() {
		super();
	}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "Ani"+super.toString()+", "+"accessAge=" + accessAge + "]";
	}
	
	
	

}
