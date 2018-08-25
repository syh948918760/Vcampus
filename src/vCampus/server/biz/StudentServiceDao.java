package vCampus.server.biz;

import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.vo.Student;

/**
 * @author SongZixing
 *
 * @version 0.0
 * 
 */
public interface StudentServiceDao {
	Student login(String studentID, String studentPassword) throws RecordNotFoundException, WrongPasswordException;
}
