package vCampus.vo;

import java.io.Serializable;

import java.sql.Timestamp;

/**
 * @author YangHangyuan
 *
 */
public class BookBorrow extends BookInformation implements Serializable {
	
	private String ecardNumber;
	private Timestamp borrowTime;
	private int borrowNumber;
	
	public void setEcardNumber(String ecardNumber){
		this.ecardNumber=ecardNumber;
	}
	public void setBorrowTime(Timestamp borrowTime){
		this.borrowTime=borrowTime;
	}
	public void setBorrowNumber(int borrowNumber){
		this.borrowNumber=borrowNumber;
	}
	public String getEcardNumber(){
		return ecardNumber;
	}
	public Timestamp getBorrowTime(){
		return borrowTime;
	}
	public int getBorrowNumber(){
		return borrowNumber;
	}
}