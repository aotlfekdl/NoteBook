package com.als.jdbc.controller;

import java.util.ArrayList;

import com.als.jdbc.dao.InformationDao;
import com.als.jdbc.member.Member;
import com.als.jdbc.movie.Movie;
import com.als.jdbc.seat.Seat;
import com.als.jdbc.service.InformationService;

public class InformationController {
	InformationService is = new InformationService();
	InformationDao idao = new InformationDao();
	
	
	
	public void insertmovie(String title, String age, String genre, String director, String company) {
		
		Movie m = new Movie(title, Integer.parseInt(age), genre, director, company);
		
		
		int result = idao.insertmovie(m);
		
		System.out.println(result);
		
		if(result > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}
	
	public void selectmovie(){
		ArrayList<Movie> list= new ArrayList<>();
		
		list = idao.selectmovie();
		
		
		
		System.out.println(list);
		
	}
	
	public void updatemovie(String title, String age, String genre, String director, String company) {
		
		Movie m = new Movie(title, Integer.parseInt(age), genre, director, company);
		
		int result =idao.updatemovie(m);
		
		if(result >0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}
	public void deletemovie(String title) {
		
		int result =0;
		result = idao.deletemovie(title);
		
		if(result > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}
	
	public void selectMemberAll() {
		ArrayList<Member> list = new ArrayList();
		
		list = is.selectMemberAll();
		
		System.out.println(list);
	}
	
	public void insertMember(String userid, String userpwd, String username, String gender, int age, String email, String phone) {
//		Member m = new Member(userid, userpwd, username, gender, Integer.parseInt(age), email, phone);

		Member m = new Member(userid, userpwd, username, gender, age, email, phone);
		int result = is.insertMember(m);
		
		
		System.out.println(result);
		
		if(result > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}	
	
	public void selectMember(String userid) {
		ArrayList<Member> list = new ArrayList();
		list = is.selectMember(userid);
		System.out.println(list);
	}
	
	public void updateMember(String userid, String userpwd, int age, String email, String phone) {
		ArrayList<Member> list = new ArrayList();
		Member m = new Member();
		
		m.setUserId(userid);
		m.setUserPwd(userpwd);
		m.setAge(age);
		m.setEmail(email);
		m.setPhone(phone);
		int result = is.updateMember(m);
		
		
		if(result >0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}
	
	public void deleteMember(String userid) {
		
		int result;
		
		result = is.deleteMember(userid);
		

		if(result >0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}
	
	public void movieSeat() {
		ArrayList<Seat> list = new ArrayList();
		list = is.movieSeat();
		System.out.println(list);
	}
	
	public void movieReservation(String userid, int ticket) {
		
		
		
	}
}
	
