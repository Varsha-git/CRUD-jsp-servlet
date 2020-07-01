package dao;

import model.Admin;

public interface AdminDaoInterface {

	int signup(Admin admin);

	boolean loginAdmin(Admin admin);

}
