package com.als.jdbc.service;

import static com.als.common.JDBCTemplate.close;
import static com.als.common.JDBCTemplate.commit;
import static com.als.common.JDBCTemplate.getConnection;
import static com.als.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.als.jdbc.dao.InformationDao;
import com.als.jdbc.member.Member;
import com.als.jdbc.seat.Seat;


public class InformationService {
	
	//1) JDBC driver등록
	//2) Connection객체 생성
	//3) Connection객체 처리
	private InformationDao idao = new InformationDao();
	
	
	public ArrayList<Member> selectMemberAll(){
		Connection conn = getConnection();
		ArrayList<Member> list = new ArrayList();
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
		ArrayList<Seat> list = new ArrayList();
		
		Connection conn = getConnection();
		list = idao.movieSeat(conn);
		
		return list;
	}
	

}
