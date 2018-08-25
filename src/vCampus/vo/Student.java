package vCampus.vo;

import java.io.Serializable;
import vCampus.vo.User;

public class Student extends User implements Serializable {
    private String studentEcardNumber;
    private String studentID;
    private String major;
    private String classNumber;
    private String dormNumber;

    public void setStudentEcardNumber(String studentEcardNumber){
    	this.studentEcardNumber=studentEcardNumber;
    }
    public void setStudentID(String studentID) {
    	this.studentID=studentID;
    }
    public void setMajor(String major){
    	this.major=major;
    }
    public void setDormNumber(String dormNumber){
    	this.dormNumber=dormNumber;
    }
    public void setClassNumber(String classNumber){
    	this.classNumber=classNumber;
    }
    public String getStudentID() {
    	return studentID;
    }
    public String getStudentEcardNumber(){
    	return studentEcardNumber;
    }
    public String getMajor(){
    	return major;
    }
    public String getClassNumber(){
    	return classNumber;
    }
    public String getDormNumber(){
    	return dormNumber;
    }
}
