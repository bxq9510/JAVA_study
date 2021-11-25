package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Ŭ���� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �ε� ����");
//			e.printStackTrace();
			// ��� �߰��� ���̺귯�� �ε�
		}
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","1111");
			System.out.println("DB ���� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
//			e.printStackTrace();
			// ��� �߰��� ���̺귯�� �ε�
		}
		// ���÷� insert ����
		// 1. ��������� 2. ���� ����
		 // �̿ϼ��� ������ ������ ���̽��� ������ �غ� �ܰ�, �������� ���ص���
		try {
			String sql = "insert into hm1105 values (?,?)"; // �̿ϼ��� ������ -> ����ǥ�ȿ� ���� ���� �𸣴ϱ�
			PreparedStatement psmt = conn.prepareStatement(sql);
			// �̿ϼ��� �������� ���ε�
			psmt.setInt(1, 10);
			psmt.setString(2, "kim");
			// �̷��� �Ǹ� ������ �ϼ�
			psmt.executeUpdate();
			System.out.println("���ԵǾ����ϴ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}