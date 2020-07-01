package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;
import utility.ConnectionManager;

public class AdminDao implements AdminDaoInterface {

	@Override
	public int signup(Admin admin) {
		String INSERT_USERS_SQL = "INSERT INTO ADMINLOGIN(email, password)VALUES(?,?)";
		int result = 0;
		Connection connection = null;
		try {
			connection = ConnectionManager.getConnection();

			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1, admin.getEmail());
			preparedStatement.setString(2, admin.getPassword());
			System.out.println(preparedStatement);

			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public boolean loginAdmin(Admin admin) {
		boolean status = false;
		try {
			Connection connection = null;
			connection = ConnectionManager.getConnection();

			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from adminlogin where email = ? and password = ? ");

			preparedStatement.setString(1, admin.getEmail());
			preparedStatement.setString(2, admin.getPassword());

			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			System.out.println(e);
		}
		return status;
	}

}
