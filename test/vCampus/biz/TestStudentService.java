package vCampus.biz;

import vCampus.client.biz.StudentService;
import vCampus.client.biz.StudentServiceImpl;

/**
 * @author SongZixing
 *
 * @version 0.0
 * 
 * Test the StudentService.java
 */
public class TestStudentService {
	//public StudentService studentService;
	
	public static void main(String[] args) {
		//StudentServiceImpl testStudentService = new StudentServiceImpl();
		StudentService studentService = new StudentServiceImpl();
		studentService.login("123", "123usf");
	}
}
