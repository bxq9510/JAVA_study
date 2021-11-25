package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.Word_DTO;

public class Word_DAO {
	// hword table CRUD를 담당할 클래스 정의
	// 작업절차 : 클래스로드(1번만) > connection > sql쿼리 > 실행 > 리턴값 처리 > connection 자원반납
	// sql 쿼리는 사용자 입장과 DAO입장에서 생각을 같이 해야한다
	// 사용자 입장 : 로그인 후 자신의 정보보기				DAO : select * from A where id = ?
	//				 로그인하고 싶어서 id와 pwd 입력		DAO : select * from A where id = ?
	//				 미성년자의 정보를 출력					DAO : select * from A where age < 20
	//				 최근 등록된 정보리스트를 보고 싶다		DAO : select * from (select * from A order by no desc) where rownum < 2
	private Connection conn = null;
	// 사용자 입장: 단어등록		DAO: insert into hword values (?,?);
	// 사용자 입장에서 단어 정보를 DTO라는 객체에 저장하여 전송(매개변수)
	
	public static Word_DAO hword_dao = null;
	
	public static Word_DAO getInstance() {
		if (hword_dao == null) {
			hword_dao = new Word_DAO();
		}
		return hword_dao;
	}
	
	public Word_DAO() {
		init();
	}
	private void init() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("클래스 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로드 실패");
		}
	}
	private void getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "1111");
			System.out.println("DB 접속 성공");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	}
	public void add(Word_DTO w) {
		String sql = "insert into hword values (?,?)";
		try {
			getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, w.geteWord());
			psmt.setString(2, w.getkWord());
			int k = psmt.executeUpdate();
			System.out.println(k+"건이 반영되었어요");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Word_DTO selectOne(Word_DTO w) { // 사용자 입장에서는 검색, 중복검사등 활용가능
		String sql = "select * from hword where eword=?";
		ResultSet rs = null;
		Word_DTO returnDTO = new Word_DTO();
		try {
			getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, w.geteWord());
			rs = psmt.executeQuery(); // select문은 내가 정보를 받아오겠다는 의미.. 리턴값을 꼭 처리해야 프로그램의 목적달성이 가능
			// while(rs.next())  ->  쿼리결과가 다중 튜플일 경우 순회를 해야한다..
			// 그런데 본 쿼리는 영단어가 기본키로 단일 튜플, 그러므로 selectOne 메서드를 호출한 위치로 리턴하는 것
			if (rs.next()) {
				// rs의 내용을 메서드를 호출한 위치로 전달하기 위해 가장 좋은 방법은 DTO객체에 저장하는것
				returnDTO.seteWord(rs.getString("eWord"));
				returnDTO.setkWord(rs.getString("kWord"));
			}
			return returnDTO;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public ArrayList<Word_DTO> selectAll() {
		String sql = "select * from hword";
		ResultSet rs = null;
		Word_DTO returnDTO = null;
		ArrayList<Word_DTO> wlist = new ArrayList<>();
		try {
			getConnection();
			Statement p = conn.createStatement();
			rs = p.executeQuery(sql);
			while (rs.next()) {
				returnDTO = new Word_DTO();
				returnDTO.seteWord(rs.getString("eWord"));
				returnDTO.setkWord(rs.getString("kWord"));
				wlist.add(returnDTO);
			}
			return wlist;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
