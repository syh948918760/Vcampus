package vCampus.server.dao;

import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.vo.Student;

/**
 * @author SongZixing
 *
 * @version 0.0
 * 
 */
public interface StudentDao {
	/**
	 * @param studentID
	 * @param studentPassword
	 * @return
	 * @throws RecordNotFoundException
	 * @throws WrongPasswordException
	 */
	Student findByNameAndPassword(String studentID,String studentPassword) throws RecordNotFoundException;
	Student findByName(String studentID) throws RecordNotFoundException;
}
