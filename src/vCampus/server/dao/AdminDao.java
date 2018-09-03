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
<<<<<<< HEAD
	public Admin selectAdmin(String adminID);
	public boolean insertAdmin(String ID,String password);
	public boolean updatePassword(String adminID,String password);
	
=======
	public Admin selectAdmin(String adminID)throws SQLException;
	public boolean insertAdmin(String ID,String password)throws SQLException;
	public boolean updatePassword(String adminID,String password)throws SQLException;

>>>>>>> branch 'master' of https://github.com/AnthonySong98/Vcampus.git
}

