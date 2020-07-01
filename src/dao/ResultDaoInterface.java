package dao;

import java.sql.SQLException;
import java.util.List;

import model.Result;

public interface ResultDaoInterface {

	void insertResult(Result rs) throws SQLException;

	List<Result> selectAll() throws SQLException;

	boolean deleteResult(String rollno) throws SQLException;

	boolean updateResult(String rollno);

}
