package vCampus.vo;

import java.io.Serializable;

/**
 * @author SongZixing
 * 
 * @version 0.0
 * 
 * This is the entity for student.
 *
 */
public class Student implements Serializable{

	private String studentID;//the id for student
	private String studentName;// the name for student
	private String studentPassword;// the password for student to login in
	private int studentClassID;// the class id for student
	private int studentDormitoryID;// the dormitory for student
	private int studentBalance;// the balance for student
	
	public Student() {
		super();
	}
	
	// construction for class Student
	public Student(String studentID, String studentName, String studentPassword,
			int studentClassID, int studentDormitoryID, int studentBalance) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentPassword = studentPassword;
		this.studentClassID = studentClassID;
		this.studentDormitoryID = studentDormitoryID;
		this.studentBalance = studentBalance;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentPassword() {
		return studentPassword;
	}
	
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	
	public int getStudentClassID() {
		return studentClassID;
	}
	
	public void setStudentClassID(int studentClassID) {
		this.studentClassID = studentClassID;
	}
	
	public int getStudentDormitoryID() {
		return studentDormitoryID;
	}
	
	public void setStudentDormitoryID(int studentDormitoryID) {
		this.studentDormitoryID = studentDormitoryID;
	}
	
	public int getStudentBalance() {
		return studentBalance;
	}
	
	public void setStudentBalance(int studentBalance) {
		this.studentBalance = studentBalance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student{" + "studentId=" + studentID + ", studentName='" + studentName +
				'\'' + ", classId=" + studentClassID + ", dormitoryId=" + studentDormitoryID + 
				", balance=" + studentBalance + ",password='" + studentPassword + '\'' + '}';
	}
}
