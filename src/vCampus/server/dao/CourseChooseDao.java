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

	ArrayList<CourseChoose> courseQueryByUserName(String userName)throws RecordNotFoundException;
	
	
}
