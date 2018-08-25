/**
 * 
 */
package vCampus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import vCampus.server.biz.StudentServiceDao;
import vCampus.server.biz.StudentServiceDaoImpl;
import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;
import vCampus.util.Record2Student;

/**
 * @author SongZixing
 *
 * @version 0.0
 * 
 */
public class TestStudentServiceDao {

	public static void main(String[] args) throws RecordNotFoundException, WrongPasswordException {
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver").newInstance();
			String url = "jdbc:Access:///C:/Users/Administrator/eclipse-workspace/vCampus/Database.accdb";
			Connection con = DriverManager.getConnection(url);
			
			//create SQL string
			String sqlStr1 = "select * from tbl_student where studentId ="
					+ "'"
					+ "213160821"
					+"'"
					+ " and password = '"
					+ "szx123"
					+"'";
					;
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sqlStr1);
			
			if(rs.next()==false)
			{ rs.close(); throw new RecordNotFoundException(); }
			
			rs = stmt.executeQuery(sqlStr1);
			try {
				while (rs.next())
				{
					System.out.println(rs.getString("studentID"));
					System.out.println(rs.getString("studentName"));
				}
				
			
		
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		catch (RecordNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		StudentServiceDao s = new StudentServiceDaoImpl();
		s.login("213160821", "szx123");
	
	}
}
