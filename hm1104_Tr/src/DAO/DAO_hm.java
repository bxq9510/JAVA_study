package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.S;

public class DAO_hm {
	// 정의 : hm테이블에 CRUD를 작업하기 위한 객체를 정의한 클래스
	private Connection conn = null; // 오라클에 접속하기 위한 자원
	public DAO_hm() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("클래스 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로드 실패");
		}
	}
	public void getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","1111");
			System.out.println("DB 접속 성공");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	}
	
	public void insert(S s) {	// 매개변수 s라는 참조변수를 받는 겁니다. s 참조변수를 객체
		try {
			getConnection();
			String sql = "insert into hm values (?,?,?,?)"; // 미완성된 쿼리문 -> 물음표안에 뭐가 올지 모르니깐
			PreparedStatement psmt = conn.prepareStatement(sql);
			// 미완성된 쿼리문을 바인딩
			psmt.setString(1, s.getTitle());
			psmt.setString(2, s.getMemo());
			psmt.setString(3, s.getStat());
			psmt.setString(4, s.getManagerName());
			// 이렇게 되면 쿼리가 완성
			psmt.executeUpdate();
			System.out.println("삽입되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
