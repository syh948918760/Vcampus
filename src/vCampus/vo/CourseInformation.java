package vCampus.vo;

import java.io.Serializable;

public class CourseInformation implements Serializable {
	private String courseID;
	private String courseName;
	private String deptName;
	private String teacherEcardNumber;
	private String teacherName;
	private String courseHour;
	private int credit;
	private String startDate;
	private String examTime;
	private int personLimit;
	private int currentAmount;
	
	
	public void setDeptName(String deptName){
		this.deptName=deptName;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}	
	public void setCourseHour(String courseHour) {
		this.courseHour = courseHour;
	}	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}	
	public void setCredit(int credit) {
		this.credit = credit;
	}	
	public void setPersonLimit(int personLimit) {
		this.personLimit = personLimit;
	}	
	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}
	public void setCurrentAmount(int currentAmount){
		this.currentAmount=currentAmount;
	}
	public void setTeacherEcardNumber(String teacherEcardNumber){
		this.teacherEcardNumber=teacherEcardNumber;
	}
	public void setTeacherName(String teacherName){
		this.teacherName=teacherName;
	}
	
	public String getDeptName(){
		return deptName;
	}
	public String getCourseID() {
		return courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getCourseHour() {
		return courseHour;
	}
	public String getStartDate() {
		return startDate;
	}
	public int getCredit() {
		return credit;
	}
	public int getPersonLimit() {
		return personLimit;
	}
	public String getExamTime() {
		return examTime;
	}	
	public int getCurrentAmount(){
		return currentAmount;
	}
	public String getTeacherEcardNumber(){
		return teacherEcardNumber;
	}
	public String getTeacherName(){
		return teacherName;
	}
}
