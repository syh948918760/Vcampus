package vCampus.server.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.util.Record2Student;
import vCampus.vo.Student;

/**
 * @author YangHangyuan, SongZixing
 *
 */
public class StudentDaoImpl implements StudentDao{
	
	private DBConnection DBC=new DBConnection();
	private PreparedStatement stmt=null;
	private ResultSet rs=null;
	
	@Override
	public Student findByName(String userName) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		try {
			//create SQL string
			String sql= "select * from tbl_student where userName ="+ "'"+ userName+"'";
			stmt=DBC.con.prepareStatement(sql);
			rs=stmt.executeQuery();
			
			if(rs.next()==false)
			{ rs.close(); throw new RecordNotFoundException(); }
			
			rs = stmt.executeQuery(sql);
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
				student.setUserName(rs.getString("userName"));
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
	
	
	@Override
	public Student findByNameAndPassword(String userName, String password) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			//create SQL string
			String sql= "select * from tbl_student where userName ="+ "'"+ userName+"'";
			stmt=DBC.con.prepareStatement(sql);
			rs=stmt.executeQuery();
			Class.forName("com.hxtt.sql.access.AccessDriver").newInstance();
			String url = "jdbc:Access:///C:/Users/Administrator/eclipse-workspace/vCampus/Database.accdb";
			Connection con = DriverManager.getConnection(url);
			
			//create SQL string
			String sql = "select * from tbl_student where userName ="
					+ "'"
					+ userName
					+"'"
					+ " and password = '"
					+ password
					+"'";
					;
			stmt=con.prepareStatement(sql);
			rs=stmt.executeQuery();
			
			if(rs.next()==false)
			{ rs.close(); throw new RecordNotFoundException(); }
			
			rs = stmt.executeQuery(sql);
//			try {
//				Record2Student helper = new Record2Student(rs);
//				return helper.getStudent();
//			}
			while (rs.next()) {
				Student student = new Student();
				student.setUserName(rs.getString("userName"));
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
