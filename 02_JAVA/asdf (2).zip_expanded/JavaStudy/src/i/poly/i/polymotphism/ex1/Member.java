package i.poly.i.polymotphism.ex1;
public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount;
	public Member() {
		super();
	}
	public Member(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}
	
	

}
