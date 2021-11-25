package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("클래스 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로드 실패");
//			e.printStackTrace();
			// 방금 추가한 라이브러리 로딩
		}
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","1111");
			System.out.println("DB 접속 성공");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
//			e.printStackTrace();
			// 방금 추가한 라이브러리 로딩
		}
		// 샘플로 insert 연산
		// 1. 쿼리만들기 2. 쿼리 실행
		 // 미완성된 쿼리를 데이터 베이스에 전달할 준비 단계, 스프링은 안해도댐
		try {
			String sql = "insert into hm1105 values (?,?)"; // 미완성된 쿼리문 -> 물음표안에 뭐가 올지 모르니깐
			PreparedStatement psmt = conn.prepareStatement(sql);
			// 미완성된 쿼리문을 바인딩
			psmt.setInt(1, 10);
			psmt.setString(2, "kim");
			// 이렇게 되면 쿼리가 완성
			psmt.executeUpdate();
			System.out.println("삽입되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}