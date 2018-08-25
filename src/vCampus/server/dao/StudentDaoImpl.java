package vCampus.server.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.util.Record2Student;
import vCampus.vo.Student;

/**
 * @author SongZixing
 *
 * @version 0.0
 * 
 */
public class StudentDaoImpl implements StudentDao{
	
	@Override
	public Student findByName(String studentID) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver").newInstance();
			String url = "jdbc:Access:///C:/Users/Administrator/eclipse-workspace/vCampus/Database.accdb";
			Connection con = DriverManager.getConnection(url);
			
			//create SQL string
			String sqlStr1 = "select * from tbl_student where studentId ="
					+ "'"
					+ studentID
					+"'"
					;
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sqlStr1);
			
			if(rs.next()==false)
			{ rs.close(); throw new RecordNotFoundException(); }
			
			rs = stmt.executeQuery(sqlStr1);
//			try {
//				Record2Student helper = new Record2Student(rs);
//				return helper.getStudent();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
			while (rs.next()) {
				Student student = new Student();
				student.setStudentName(rs.getString("studentName"));
				student.setStudentID(rs.getString("studentID"));
				return student;
			}
		}
		catch (RecordNotFoundException e) {
			// TODO: handle exception
			throw new RecordNotFoundException();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see vCampus.server.dao.StudentDao#findByNameAndPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public Student findByNameAndPassword(String studentID, String studentPassword) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver").newInstance();
			String url = "jdbc:Access:///C:/Users/Administrator/eclipse-workspace/vCampus/Database.accdb";
			Connection con = DriverManager.getConnection(url);
			
			//create SQL string
			String sqlStr1 = "select * from tbl_student where studentId ="
					+ "'"
					+ studentID
					+"'"
					+ " and password = '"
					+ studentPassword
					+"'";
					;
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sqlStr1);
			
			if(rs.next()==false)
			{ rs.close(); throw new RecordNotFoundException(); }
			
			rs = stmt.executeQuery(sqlStr1);
//			try {
//				Record2Student helper = new Record2Student(rs);
//				return helper.getStudent();
//			}
			while (rs.next()) {
				Student student = new Student();
				student.setStudentName(rs.getString("studentName"));
				student.setStudentID(rs.getString("studentID"));
				return student;
			}
		}
			
		
		catch (RecordNotFoundException e) {
			// TODO: handle exception
			throw new RecordNotFoundException();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
			
		
	
}
