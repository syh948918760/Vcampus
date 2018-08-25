package vCampus.vo;

import java.io.Serializable;

public class CourseChoose extends CourseInformation implements Serializable {
	
	private String studentEcardNumber;
	private int grade;
	
	public void setStudentEcardNumber(String studentEcardNumber) {
		this.studentEcardNumber = studentEcardNumber;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getStudentEcardNumber() {
		return studentEcardNumber;
	}
	public int getGrade() {
		return grade;
	}
}
