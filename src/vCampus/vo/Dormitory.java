package vCampus.vo;

import java.io.Serializable;

public class Dormitory implements Serializable {
    private String studentEcardNumber;
	private int month;
	private double dormBill;
	private double score;
	
	public void setStudentEcardNumber(String studentEcardNumber) {
		this.studentEcardNumber=studentEcardNumber;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setDormBill(double dormBill){
		this.dormBill=dormBill;
	}
	public void setMonth(double month){
		this.month=month;
	}

	public String getStudentEcardNumber() {
		return studentEcardNumber;
	}
	public int getMonth(){
		return month;
	}
	public double getDormBill(){
		return dormBill;
	}
	public double getScore(){
		return score;
	}
}
