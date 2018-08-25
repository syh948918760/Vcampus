package vCampus.server.biz;

import vCampus.server.dao.StudentDao;
import vCampus.server.dao.StudentDaoImpl;
import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.vo.Student;

/**
 * @author SongZixing
 *
 * @version 0.0
 * 
 */
public class StudentServiceDaoImpl implements StudentServiceDao{
	
	private StudentDao sd = new StudentDaoImpl();
	
	/* (non-Javadoc)
	 * @see vCampus.server.biz.StudentServiceDao#login(java.lang.String, java.lang.String)
	 */
	@Override
	public Student login(String studentID, String studentPassword) throws RecordNotFoundException, WrongPasswordException {
		// TODO Auto-generated method stub
		try {
			Student student1 = sd.findByName(studentID);
		}
		catch (RecordNotFoundException e) {
			// TODO: handle exception
			throw new RecordNotFoundException();
		}
		try {
			Student student2 = sd.findByNameAndPassword(studentID, studentPassword);
			return student2;
		} catch (RecordNotFoundException e) {
			// TODO: handle exception
			throw new WrongPasswordException();
		}
		
	}
}
