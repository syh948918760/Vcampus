package vCampus.server.dao;

import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.vo.Student;

public interface StudentDao {
	/**
	 * @param studentID
	 * @param studentPassword
	 * @return
	 * @throws RecordNotFoundException
	 * @throws WrongPasswordException
	 */
	Student findByNameAndPassword(String userName,String password) throws RecordNotFoundException;
	Student findByName(String userName) throws RecordNotFoundException;
}
