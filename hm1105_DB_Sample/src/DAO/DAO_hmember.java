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
			System.out.println("Ŭ���� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �ε� ����");
		}
	}

	private void getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "1111");
			// localhost(ip�ε� ��밡��: 127.0.0.1): �ڽ��� ��ǻ��, 1521: ��Ʈ��ȣ, orcl: ���� �����ͺ��̽� �̸�
			/**
			 Network
			 	1. ���
			 	2. ����� ��� ������ �� ���ΰ�?
			 	   �� �Ŀ��� ��� ã�� �� ���ΰ�?
			 	   IP�ּ� > �缳IP: ��¥ip (���� ������ �ϳ��� �������� ����ϴ� ip)
			 	   		  > ����IP: �� ���������� �̹� �Ҵ�.. ������ ������
			 	   ��Ʈ�ѹ� > ip�� ��ǻ�� �ּ�, �� ��ü�� �ּ�, ��ǻ�ʹ� ������α׷��� �������ִµ� �̷� ���α׷��� �����ϴ� ��ȣ
			 	3. ��Ȯ�ϰ� �ϸ鼭 ����� ���� �� ���ΰ�?
			 	4. ����ϴµ� �������� ��� ó���� ���ΰ�?
			 	5. ���� �����ϴµ� ����ڰ� ����ϱ� ���ϰ� �� ���ΰ�?
			 programming - C#, C++, C
			 OS (��������)
			 */
			System.out.println("DB ���� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
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
			System.out.println(k+"���� �ݿ��Ǿ����");
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
			System.out.println(k+"���� �ݿ��Ǿ����");
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







