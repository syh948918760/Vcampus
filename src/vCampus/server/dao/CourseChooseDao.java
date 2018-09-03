package vCampus.server.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.vo.CourseChoose;


public interface CourseChooseDao {
	/**
	 * @param username
	 * @param password
	 * @return
	 * @throws RecordNotFoundException
	 * @throws WrongPasswordException
	 */

	ArrayList<CourseChoose> courseQueryByStudent(String studentName)throws RecordNotFoundException,SQLException;
	ArrayList<CourseChoose> courseQueryByTeacher(String teacherName)throws RecordNotFoundException,SQLException;
	ArrayList<CourseChoose> courseQueryByCourse(String courseName)throws RecordNotFoundException,SQLException;
	boolean addCourseByStudent(String studentName,String courseID)throws SQLException;
	boolean deleteCourseByStudent(String studentName,String courseID)throws SQLException;
	boolean updateScoreByTeacher(ArrayList<CourseChoose> scoreList)throws SQLException;
	
}
