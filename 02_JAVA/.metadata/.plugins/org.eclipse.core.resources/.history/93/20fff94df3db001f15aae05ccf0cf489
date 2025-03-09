package com.als.jdbc.dao;

import static com.als.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.als.jdbc.member.Member;
import com.als.jdbc.movie.Movie;
import com.als.jdbc.seat.Seat;

public class InformationDao {
	
	public int insertmovie(Movie m) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql =  "INSERT INTO MOVIE VALUES(SEQ_TITLENO.NEXTVAL,?,?,?,?,?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##JDBCPROJECT", "JDBCPROJECT");
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  m.getTitle());
			pstmt.setInt(2,  m.getAge());
			pstmt.setString(3,  m.getGenre());
			pstmt.setString(4,  m.getDirector());
			pstmt.setString(5,  m.getCompany());
			
			
			result = pstmt.executeUpdate();
			System.out.println(result);
			
			if(result > 0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public ArrayList<Movie> selectmovie(){
		ArrayList<Movie> list = new ArrayList();
		Connection conn = null;
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM MOVIE";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##JDBCPROJECT", "JDBCPROJECT");
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			
			rset = pstmt.executeQuery();
			
			
			
			
			while(rset.next()) {
				Movie m = new Movie();
				m.setTitleno(rset.getInt("TITLENO"));
				m.setTitle(rset.getString("TITLE"));
				m.setAge(rset.getInt("AGE"));
				m.setGenre(rset.getString("GENRE"));
				m.setDirector(rset.getString("DIRECTOR"));
				m.setCompany(rset.getString("COMPANY"));
				list.add(m);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
		
		
	}
	
	public int updatemovie(Movie m) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		String sql = "UPDATE MOVIE SET AGE =?,"
				+ " GENRE = ?,"
				+ " DIRECTOR = ?,"
				+ " COMPANY = ?"
				+ "WHERE TITLE = ?";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##JDBCPROJECT", "JDBCPROJECT");
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, m.getAge());
			pstmt.setString(2, m.getGenre());
			pstmt.setString(3,  m.getDirector());
			pstmt.setString(4, m.getCompany());
			pstmt.setString(5, m.getTitle());
			
			
			result = pstmt.executeUpdate();
			System.out.println(result);
			
			if(result > 0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int deletemovie(String title) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Movie m = new Movie();
		
		String sql = "DELETE FROM MOVIE WHERE TITLE = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##JDBCPROJECT", "JDBCPROJECT");
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, title);
			
			result = pstmt.executeUpdate();
			
			if(result >0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public ArrayList<Member> selectMemberAll(Connection conn){
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		ArrayList<Member> list = new ArrayList();
		
		String sql = "SELECT * FROM MEMBER";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Member m = new Member();
				m.setUserNo(rset.getInt("USERNO"));
				m.setUserId(rset.getString("USERID"));
				m.setUserPwd(rset.getString("USERPWD"));
				m.setUserName(rset.getString("USERNAME"));
				m.setGender(rset.getString("GENDER"));
				m.setAge(rset.getInt("AGE"));
				m.setEmail(rset.getString("EMAIL"));
				m.setPhone(rset.getString("PHONE"));
				list.add(m);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
		
	}
	
	public int insertMember(Member m, Connection conn) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO MEMBER VALUES(SEQ_USERNO.NEXTVAL,?,?,?,?,?,?,?)";
	
		try {

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getUserId());
			pstmt.setString(2, m.getUserPwd());
			pstmt.setString(3, m.getUserName());
			pstmt.setString(4, m.getGender());
			pstmt.setInt(5, m.getAge());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getPhone());
			
			result = pstmt.executeUpdate();
			
		
			
			

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

	public ArrayList<Member> selectMember(String userid, Connection conn) {
		ArrayList<Member> list = new ArrayList();
		Member m = new Member();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM MEMBER WHERE USERID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  userid);
			rset = pstmt.executeQuery();
			
			
			while(rset.next()) {
				m.setUserNo(rset.getInt("USERNO"));
				m.setUserId(rset.getString("USERID"));
				m.setUserPwd(rset.getString("USERPWD"));
				m.setUserName(rset.getString("USERNAME"));
				m.setGender(rset.getString("GENDER"));
				m.setAge(rset.getInt("AGE"));
				m.setEmail(rset.getString("EMAIL"));
				m.setPhone(rset.getString("PHONE"));
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
		
	}
	
	public int updateMember(Member m, Connection conn) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE MEMBER SET USERPWD =?,"
				 				+ "GENDER = ?,"
				 				+ "EMAIL = ?, "
				 				+ "PHONE = ?"
				 				+"WHERE USERID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getUserPwd());
			pstmt.setString(2, m.getGender());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getPhone());
			pstmt.setString(5, m.getUserId());
			
			result =pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public int deleteMember(String userid, Connection conn) {
		int result =0;
		
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM MEMBER WHERE USERID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public ArrayList<Seat> movieSeat(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Seat seat = new Seat();
		ArrayList<Seat> list = new ArrayList();
		String sql = "SELECT * FROM SEAT";
		
		try {
			pstmt= conn.prepareStatement(sql);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				
				
				seat.setSeatNo(rset.getInt("SEATNO"));
				seat.setSeatRow(rset.getString("SEATRPW"));
				seat.setSeatNumber(rset.getInt("SEATNUMBER"));
				list.add(seat);
				
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return null;
		
		
	}
	
	
	
	

}
