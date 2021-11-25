package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.Goods_DTO;

public class Goods_DAO {
	private Connection conn = null;

	public Goods_DAO() {
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
	
	public void add(Goods_DTO g) {
		String sql = "insert into hgoods values (seq_hgoods.nextval,?,?,?,default)";
		try {
			getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, g.getG_id());
			psmt.setString(2, g.getG_name());
			psmt.setInt(3, g.getG_cnt());
			// psmt.executeUpdate();
			int k = psmt.executeUpdate();
			System.out.println(k+"건 등록완료");
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

	public void edit(Goods_DTO g) {
		String sql = "update hgoods set g_name=?, g_cnt=? where g_id=?";
		try {
			getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, g.getG_name());
			psmt.setInt(2, g.getG_cnt());
			psmt.setString(3, g.getG_id());
			int k = psmt.executeUpdate();
			System.out.println(k+"건 수정완료");
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

	public void del(Goods_DTO g) {
		String sql = "delete from hgoods where g_id=?";
		try {
			getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, g.getG_id());
			int k = psmt.executeUpdate();
			System.out.println(k+"건 삭제완료");
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

	public ArrayList<Goods_DTO> selectAll() {
		String sql = "SELECT * FROM hgoods ORDER BY g_no";
		Statement stat = null;
		ResultSet rs = null;
		ArrayList<Goods_DTO> hgoodsList = new ArrayList<>();
		try {
			getConnection();
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				Goods_DTO g = new Goods_DTO();
				g.setG_no(rs.getString("g_no"));
				g.setG_id(rs.getString("g_id"));
				g.setG_name(rs.getString("g_name"));
				g.setG_cnt(rs.getInt("g_cnt")); 
				g.setG_date(rs.getString("g_date"));
				hgoodsList.add(g);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return hgoodsList;
	}
}
