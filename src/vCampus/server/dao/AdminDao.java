package vCampus.server.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import vCampus.vo.Admin;
import java.sql.PreparedStatement;
import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;

public interface AdminDao {	
	/**
	 * @param adminID
	 * @param password
	 * @return
	 * @throws RecordNotFoundException
	 * @throws WrongPasswordException
	 */
	public Admin selectAdmin(String adminID);
	public void insertAdmin(String ID,String password);
	public void updatePassword(String password,String adminID);

}

