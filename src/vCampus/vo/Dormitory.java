package vCampus.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class Dormitory implements Serializable {
    private String studentEcardNumber;
	private Timestamp monthtime;
	private double dormBill;
	private double score;
	
	public void setStudentEcardNumber(String studentEcardNumber) {
		this.studentEcardNumber=studentEcardNumber;
	}
	public void setScore(double score) {
		this.score=score;
	}
	public void setDormBill(double dormBill){
		this.dormBill=dormBill;
	}
	public void setMonthtime(Timestamp monthtime){
		this.monthtime=monthtime;
	}

	public String getStudentEcardNumber() {
		return studentEcardNumber;
	}
	public Timestamp getMonthtime(){
		return monthtime;
	}
	public double getDormBill(){
		return dormBill;
	}
	public double getScore(){
		return score;
	}
}
