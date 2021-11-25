package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.S;

public class DAO_hm {
	// ���� : hm���̺� CRUD�� �۾��ϱ� ���� ��ü�� ������ Ŭ����
	private Connection conn = null; // ����Ŭ�� �����ϱ� ���� �ڿ�
	public DAO_hm() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Ŭ���� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �ε� ����");
		}
	}
	public void getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","1111");
			System.out.println("DB ���� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
	}
	
	public void insert(S s) {	// �Ű����� s��� ���������� �޴� �̴ϴ�. s ���������� ��ü
		try {
			getConnection();
			String sql = "insert into hm values (?,?,?,?)"; // �̿ϼ��� ������ -> ����ǥ�ȿ� ���� ���� �𸣴ϱ�
			PreparedStatement psmt = conn.prepareStatement(sql);
			// �̿ϼ��� �������� ���ε�
			psmt.setString(1, s.getTitle());
			psmt.setString(2, s.getMemo());
			psmt.setString(3, s.getStat());
			psmt.setString(4, s.getManagerName());
			// �̷��� �Ǹ� ������ �ϼ�
			psmt.executeUpdate();
			System.out.println("���ԵǾ����ϴ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
