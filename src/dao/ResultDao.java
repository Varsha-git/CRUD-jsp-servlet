package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Result;
import utility.ConnectionManager;

public class ResultDao implements ResultDaoInterface {

	@Override
	public void insertResult(Result rs) throws SQLException {
		String rollno = rs.getRollno();
		String name = rs.getName();
		String fname = rs.getFname();
		String dbms = rs.getDbms();
		String ds = rs.getData_structure();
		String maths = rs.getDescrete_maths();

		System.out.println("Enter details to insert ithe student result:");
		String sql = "INSERT INTO RESULTS(ROLLNO,NAME,FNAME,DBMS,DS,MATHS) VALUES (?,?,?,?,?,?)";
		// System.out.println("TABLE BLOG EXISTS");
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1, rollno);
		st.setString(2, name);
		st.setString(3, fname);
		st.setString(4, dbms);
		st.setString(5, ds);
		st.setString(6, maths);
		st.executeQuery();
		ConnectionManager.getConnection().close();
	}

	@Override
	public List<Result> selectAll() throws SQLException {
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * from RESULTS");
		List<Result> list = new ArrayList<Result>();

		while (rs.next()) {

			String rollno = rs.getString("rollno");
			String name = rs.getString("sname");
			String fname = rs.getString("fname");
			String dbms = rs.getString("dbms");
			String ds = rs.getString("ds");
			String maths = rs.getString("maths");

			Result result = new Result();
			result.setRollno(rollno);
			result.setName(name);
			result.setFname(fname);
			result.setDbms(dbms);
			result.setData_structure(ds);
			result.setDescrete_maths(maths);
			list.add(result);
			ConnectionManager.getConnection().close();
		}
		return list;
	}

	@Override
	public boolean deleteResult(String rollno) throws SQLException {

		int i = -1;
		Statement stmt = ConnectionManager.getConnection().createStatement();
		String sql = "DELETE FROM 	RESULTS WHERE ROLLNO = ?";
		i = stmt.executeUpdate(sql);
		if (i > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateResult(String rollno) {
		// TODO Auto-generated method stub
		return false;
	}

}
