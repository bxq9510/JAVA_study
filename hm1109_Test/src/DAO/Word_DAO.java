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
	// hword table CRUD�� ����� Ŭ���� ����
	// �۾����� : Ŭ�����ε�(1����) > connection > sql���� > ���� > ���ϰ� ó�� > connection �ڿ��ݳ�
	// sql ������ ����� ����� DAO���忡�� ������ ���� �ؾ��Ѵ�
	// ����� ���� : �α��� �� �ڽ��� ��������				DAO : select * from A where id = ?
	//				 �α����ϰ� �; id�� pwd �Է�		DAO : select * from A where id = ?
	//				 �̼������� ������ ���					DAO : select * from A where age < 20
	//				 �ֱ� ��ϵ� ��������Ʈ�� ���� �ʹ�		DAO : select * from (select * from A order by no desc) where rownum < 2
	private Connection conn = null;
	// ����� ����: �ܾ���		DAO: insert into hword values (?,?);
	// ����� ���忡�� �ܾ� ������ DTO��� ��ü�� �����Ͽ� ����(�Ű�����)
	
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
			System.out.println("Ŭ���� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �ε� ����");
		}
	}
	private void getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "1111");
			System.out.println("DB ���� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
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
			System.out.println(k+"���� �ݿ��Ǿ����");
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
	
	public Word_DTO selectOne(Word_DTO w) { // ����� ���忡���� �˻�, �ߺ��˻�� Ȱ�밡��
		String sql = "select * from hword where eword=?";
		ResultSet rs = null;
		Word_DTO returnDTO = new Word_DTO();
		try {
			getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, w.geteWord());
			rs = psmt.executeQuery(); // select���� ���� ������ �޾ƿ��ڴٴ� �ǹ�.. ���ϰ��� �� ó���ؾ� ���α׷��� �����޼��� ����
			// while(rs.next())  ->  ��������� ���� Ʃ���� ��� ��ȸ�� �ؾ��Ѵ�..
			// �׷��� �� ������ ���ܾ �⺻Ű�� ���� Ʃ��, �׷��Ƿ� selectOne �޼��带 ȣ���� ��ġ�� �����ϴ� ��
			if (rs.next()) {
				// rs�� ������ �޼��带 ȣ���� ��ġ�� �����ϱ� ���� ���� ���� ����� DTO��ü�� �����ϴ°�
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
