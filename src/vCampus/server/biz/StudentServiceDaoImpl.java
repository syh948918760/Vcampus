package vCampus.server.biz;

import java.sql.SQLException;

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
	public Student login(String userName, String studentPassword) throws RecordNotFoundException, WrongPasswordException {
		// TODO Auto-generated method stub
		try {
			Student student1 = sd.findByName(userName);
			return student1;
		}
		
		catch (RecordNotFoundException e) {
			// TODO: handle exception
			throw new RecordNotFoundException();
		}
		

	}
	
	/* (non-Javadoc)
	 * @see vCampus.server.biz.StudentServiceDao#register(java.lang.String, java.lang.String)
	 */
	@Override
	public Student register(String userName, String studentPassword) throws SQLException, RecordNotFoundException {
		// TODO Auto-generated method stub
		if(sd.insertByUserNameAndPassword(userName, studentPassword)) {
			Student newStudent = sd.findByName(userName);
			return newStudent;
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see vCampus.server.biz.StudentServiceDao#updatePassword(java.lang.String, java.lang.String)
	 */
	@Override
	public Student updatePassword(String userName, String newStudentPassword)
			throws SQLException, RecordNotFoundException {
		// TODO Auto-generated method stub
		if(sd.insertByUserNameAndPassword(userName, newStudentPassword)) {
			Student updatedStudent = sd.findByName(userName);
			return updatedStudent;
		}
		return null;
	}
	
	@Override
		public Student updateStudentInfo(Student updatedStudent) throws SQLException, RecordNotFoundException {
			// TODO Auto-generated method stub
		if(sd.updateSelfInformation(updatedStudent)) {
			Student updatedStudent1 = sd.findByName(updatedStudent.getUserName());
			return updatedStudent1;
		}
			return null;
		}
}
