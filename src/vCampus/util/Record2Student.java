/**
 * 
 */
package vCampus.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import vCampus.vo.Student;

/**
 * @author Administrator
 *
 * @version 0.0
 * 
 */
public class Record2Student {
	private Student student;
	
	/**
	 * @throws SQLException 
	 * 
	 */
	public Record2Student(ResultSet rs) throws SQLException {
		// TODO Auto-generated constructor stub
		while (rs.next())
		{
			student.setStudentID(rs.getString("studentID"));
			student.setStudentName(rs.getString("studentName"));
		}
		
		
		
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
