package com.als.jdbc.member;

public class Member {
	private int userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private String Gender;
	private int Age;
	private String Email;
	private String Phone;
	public Member() {
		super();
	}
	public Member(int userNo, String userId, String userPwd, String userName, String gender, int age, String email,
			String phone) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.Gender = gender;
		this.Age = age;
		this.Email = email;
		this.Phone = phone;
	}
	public Member(String userId, String userPwd, String userName, String gender, int age, String email,
			String phone) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.Gender = gender;
		this.Age = age;
		this.Email = email;
		this.Phone = phone;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Member" + userNo + ", " + userId + "," + userPwd + "," + userName
				+ ", " + Gender + ", " + Age + ", " + Email + "," + Phone;
	}
	
	

}
