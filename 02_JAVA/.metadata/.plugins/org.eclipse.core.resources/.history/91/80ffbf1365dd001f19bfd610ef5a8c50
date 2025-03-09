package com.als.jdbc.service;

import static com.als.common.JDBCTemplate.close;
import static com.als.common.JDBCTemplate.commit;
import static com.als.common.JDBCTemplate.getConnection;
import static com.als.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.als.jdbc.dao.InformationDao;
import com.als.jdbc.member.Member;
import com.als.jdbc.movie.Movie;
import com.als.jdbc.seat.Seat;


public class InformationService {
	
	//1) JDBC driver등록
	//2) Connection객체 생성
	//3) Connection객체 처리
	private InformationDao idao = new InformationDao();
	
	
	public int insertMovie(Movie m) {//관리자메뉴 - 영화 추가하기
		int result= 0;
		Connection conn = getConnection();
		
		
		
		result = idao.insertMovie(m, conn);
		
		if(result> 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
		
	}
	
	public ArrayList<Movie> selectMovie(){
		Connection conn = getConnection();
		ArrayList<Movie> list = new ArrayList();
		
		list = idao.selectMovie(conn);
		
		return list;
	
		
	}
	
	public int updateMovie(Movie m) {//관리자메뉴 - 영화 목록 출력
		
		Connection conn = getConnection();
		int result= 0;
		
		result = idao.updateMovie(m, conn);
		
		if(result >0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
		
		
		
		
	}
	
	public int deleteMovie(String title) {
		Connection conn = getConnection();
		
		int result;
		
		result = idao.deleteMovie(title, conn);
		
		if(result > 0) {
			commit(conn);
			
		}else {
			rollback(conn);
		}
		
		return result;
		
	}
	
	public ArrayList<Movie> searchMovieTitle(String title) {
		ArrayList<Movie> list = new ArrayList();
		Connection conn = getConnection();
		
		list = idao.searchMovieTitle(title, conn);
		
		return list;
		
	}
	
	public int movieReservationTable(String title, String timeHH, String timeMM) {
		Connection conn = getConnection();
		int result = 0;
		
		result = idao.movieReservationTable(title, timeHH, timeMM, conn);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	
	public ArrayList<Member> selectMemberAll(){
		Connection conn = getConnection();
		ArrayList<Member> list = new ArrayList<>();
		list = idao.selectMemberAll(conn);
		
		return list;
		
	}
	public int insertMember(Member m) {
		
		Connection conn = getConnection();
		int result = idao.insertMember(m, conn);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
		}
	
	public ArrayList<Member> selectMember(String userid){
		ArrayList<Member> list = new ArrayList<>();
		Connection conn = getConnection();
		
		list = idao.selectMember(userid, conn);
		
		close(conn);
		return list;
		
	}
	
	public int updateMember(Member m) {
		int result=0;
		Connection conn = getConnection();
		result = idao.updateMember(m, conn);
		
		close(conn);
		
		if(result >0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
	}
	
	public int deleteMember(String userid) {
		int result;
		
		Connection conn = getConnection();
		
		result = idao.deleteMember(userid, conn);
		
		if(result >0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
	}

	public ArrayList<Seat> movieSeat(){
		ArrayList<Seat> list = new ArrayList<>();
		
		Connection conn = getConnection();
		list = idao.movieSeat(conn);
		
		return list;
	}
	
	public int movieReservation(String userid, String seatrow, int seatnumber) {
		Connection conn = getConnection();
		
		int result;
		
		result = idao.movieReservation(userid, seatrow, seatnumber, conn);
		
		if(result >0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		return result;
	}
	
	public ArrayList<Member> searchuserid(String seuserid) {
		ArrayList<Member> list = new ArrayList();
		Connection conn = getConnection();
		int result;
		
		list = idao.searchuserid(seuserid, conn);
		
		return list;
	}

}
