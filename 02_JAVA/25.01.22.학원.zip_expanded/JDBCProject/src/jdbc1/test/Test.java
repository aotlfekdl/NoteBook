package jdbc1.test;

import java.sql.Date;

public class Test {
	private int tno;
	private String tname;
	private Date tdate;
	public Test() {
		super();
	}
	public Test(int tno, String tname, Date tdate) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.tdate = tdate;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Date getTdate() {
		return tdate;
	}
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	@Override
	public String toString() {
		return "Test [tno=" + tno + ", tname=" + tname + ", tdate=" + tdate +"\n"+ "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
