package i.poly.i.polymotphism.ex1;
public class Book {
	
	private String title;
	private String author;
	private String publisher;
	public Book() {
		super();
	}
	public Book(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
	}
	
	

}
