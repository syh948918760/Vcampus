package vCampus.server.dao;

import java.sql.SQLException;

import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.vo.Student;

public interface StudentDao {
	/**
	 * @param userName
	 * @param password
	 * @param Student
	 * @return
	 * @throws RecordNotFoundException
	 * @throws WrongPasswordException
	 */
	Student findByName(String userName) throws RecordNotFoundException;
	boolean insertByUserNameAndPassword(String userName,String password)throws SQLException;
	boolean updatePassword(String userName,String password)throws SQLException;
	boolean updateSelfInformation(Student std)throws SQLException;
}
