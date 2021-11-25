package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.Member_DTO;

public class DAO_hmember { // Data Base Access
	private Connection conn = null;

	public DAO_hmember() {
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
			// localhost(ip로도 사용가능: 127.0.0.1): 자신의 컴퓨터, 1521: 포트번호, orcl: 전역 데이터베이스 이름
			/**
			 Network
			 	1. 통신
			 	2. 통신을 어떻게 빠르게 할 것인가?
			 	   내 컴에서 어떻게 찾아 갈 것인가?
			 	   IP주소 > 사설IP: 공짜ip (같은 공유기 하나의 지역에서 사용하는 ip)
			 	   		  > 공인IP: 전 세계적으로 이미 할당.. 유일한 아이피
			 	   포트넘버 > ip는 컴퓨터 주소, 컴 전체의 주소, 컴퓨터는 통신프로그램이 여러개있는데 이런 프로그램을 구분하는 번호
			 	3. 정확하게 하면서 비용을 적게 할 것인가?
			 	4. 통신하는데 보안적인 어떻게 처리할 것인가?
			 	5. 실제 업무하는데 사용자가 사용하기 편하게 할 것인가?
			 programming - C#, C++, C
			 OS (각종서버)
			 */
			System.out.println("DB 접속 성공");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	}

	public void add(Member_DTO m) {
		try {
			getConnection();
			String sql = "insert into hmember values (?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getId());
			psmt.setString(2, m.getName());
			psmt.setString(3, m.getPwd());
			// psmt.executeUpdate();
			int k = psmt.executeUpdate();
			System.out.println(k+"건이 반영되었어요");
		} catch (SQLException e) {
			
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Member_DTO m) {
		try {
			getConnection();
			String sql = "update hmember set name=?, pwd=? where id=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getName());
			psmt.setString(2, m.getPwd());
			psmt.setString(3, m.getId());
			int k = psmt.executeUpdate();
			System.out.println(k+"건이 반영되었어요");
		} catch (SQLException e) {
			
		}
	}

	public void delete(Member_DTO m) {
		String sql = "delete from hmember where id=?";
		try {
			getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, m.getId());
			psmt.executeUpdate();
		} catch (SQLException e) {
			
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Member_DTO> selectAll() {
		String sql = "select * from hmember";
		Statement stat = null;
		ResultSet rs = null;
		ArrayList<Member_DTO> hmemberList = new ArrayList<>();
		try {
			getConnection();
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				Member_DTO m = new Member_DTO();
				m.setId(rs.getString("id"));
				m.setName(rs.getString("name"));
				m.setPwd(rs.getString("pwd")); 
				hmemberList.add(m);
			}
		} catch (SQLException e) {
			
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return hmemberList;
	}
}







