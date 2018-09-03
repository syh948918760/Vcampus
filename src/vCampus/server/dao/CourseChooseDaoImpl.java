package vCampus.server.dao;

import java.sql.PreparedStatement;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.sql.SQLException;

import vCampus.server.exception.RecordNotFoundException;
import vCampus.vo.CourseChoose;

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
				c.setCourseName(rs1.getString("courseName"));
				c.setStudentName(rs1.getString("studentName"));
				c.setTeacherName(rs1.getString("teacherName"));
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
    
	public ArrayList<CourseChoose> courseQueryByStudent(String studentName) throws RecordNotFoundException,SQLException {
		try {
			String sql="SELECT * FROM tbl_coursechoose WHERE studentName='"+studentName+"'";
			stmt=DBC.con.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()) {
				return ResultSetToArrayList(rs);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
			throw new RecordNotFoundException();
		}
		return null;
	}
	
	public ArrayList<CourseChoose> courseQueryByTeacher(String teacherName) throws RecordNotFoundException,SQLException {
		try {
			String sql="SELECT * FROM tbl_coursechoose WHERE teacherName='"+teacherName+"'";
			stmt=DBC.con.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()) {
				return ResultSetToArrayList(rs);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
			throw new RecordNotFoundException();
		}
		return null;
	}
}

