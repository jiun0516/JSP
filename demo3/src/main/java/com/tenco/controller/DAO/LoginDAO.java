package com.tenco.controller.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.controller.DTO.LoginDTO;
import com.tenco.controller.utils.DBHelper;

public class LoginDAO {

	private DBHelper dbHelper;
	private PreparedStatement pstmt;
	private Connection conn;
	
	public LoginDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	public int insert(LoginDTO loginDTO) {
		int resultRow = 0;
		String sql = " INSERT INTO login(email, password, hobby) "
				+ " VALUES (?, ?, ?) "; 
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginDTO.getEmail());
			pstmt.setString(2, loginDTO.getPassword());
			pstmt.setString(3, loginDTO.getHobby());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(" >> insert 에서 에러 발생 << ");
			e.printStackTrace();
		}
		return resultRow;
	}
}
