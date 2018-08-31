package vCampus.server.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import vCampus.server.exception.RecordNotFoundException;
import vCampus.vo.CourseChoose;
import vCampus.vo.Student;

public class CourseChooseDaoImpl implements CourseChooseDao{
	
	private DBConnection DBC=new DBConnection();
	private PreparedStatement stmt=null;
	private ResultSet rs=null;
    ResultSetMetaData resultSetMetaData;
    int iNumCols;
	
    public ArrayList<CourseChoose> ResultSetToArrayList(ResultSet rs1){
    	ArrayList<CourseChoose> list=new ArrayList<CourseChoose>();
		try {
			CourseChoose c;
			while(rs1.next()) {
				c=new CourseChoose();
				c.setCourseID(rs1.getString("courseID"));
				c.setUserName(rs1.getString("username"));
				c.setScore(rs1.getDouble("score"));
				list.add(c);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
            System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
    
	public ArrayList<CourseChoose> courseQueryByUserName(String userName) throws RecordNotFoundException {
		ArrayList<CourseChoose> list=null;
		ArrayList<String> courses;
		String sql="SELECT * FROM tbl_coursechoose WHERE userName='"+userName+"'";
		try {
			stmt=DBC.con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				
				
				
				
				
				
				
				
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		
		return null;
	}


}
