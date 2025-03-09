package o.collection.set.ex1.ex1;

public class Lottery {
	private String name;
	private String phone;
	public Lottery() {
		super();
	}
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Lottery [name=" + name + ", phone=" + phone + "]";
	}
	@Override
	public int hashCode() {
		return (""+ name + phone).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Lottery) {
			Lottery other = (Lottery)obj;
			if(this.name.equals(other.getName()) &&
					this.phone == other.getPhone()) {
				return true;
			}
		}
		return false;
	}
	
	

}
