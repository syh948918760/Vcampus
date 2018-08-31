package vCampus.vo;

import java.io.Serializable;

public class CourseChoose implements Serializable {
	
	private String courseID;
	private String userName;
	private double score;
	
	public void setCourseID(String courseID) {
		this.courseID=courseID;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setScore(double score) {
		this.score= score;
	}
	
	public String getCourseID() {
		return courseID;
	}
	public String getUserName() {
		return userName;
	}
	public double getScore() {
		return score;
	}
}
