package vCampus.vo;

import java.io.Serializable;

import java.sql.Timestamp;

public class ProductPurchase implements Serializable{
	private String productName;
	private int purchaseAmount;
	private String ecardNumber;
	private Timestamp purchaseTime;
	private double oneConsumption;
	private double currentAccount;
	
	public void setProductID(String productName){
		this.productName = productName;
	}
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public void setEcardNumber(String ecardNumber) {
		this.ecardNumber = ecardNumber;
	}
	public void setPurchaseTime(Timestamp purchaseTime) {
		this.purchaseTime = purchaseTime;
	}
	public void setOneConsumption(double consumption){
		this.oneConsumption=consumption;
	}
	public void setCurrentAccount(double currentAccount){
		this.currentAccount=currentAccount;
	}
	
	public String getProductName() {
		return productName;
	}
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
	public String getEcardNumber() {
		return ecardNumber;
	}
	public Timestamp getPurchaseTime() {
		return purchaseTime;
	}
	public double getOneConsumption(){
		return oneConsumption;
	}
	public double getCurrentAccount(){
		return currentAccount;
	}
}