package vCampus.vo;

import java.io.Serializable;

public class CourseChoose implements Serializable {
	
	private String courseID;
	private String userName;
	private int grade;
	
	public void setCourseID(String courseID) {
		this.courseID=courseID;
	}
	public void setStudentEcardNumber(String userName) {
		this.userName = userName;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getCourseID() {
		return courseID;
	}
	public String getStudentEcardNumber() {
		return userName;
	}
	public int getGrade() {
		return grade;
	}
}
