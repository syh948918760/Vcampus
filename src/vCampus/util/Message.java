package vCampus.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import vCampus.vo.Student;

public class Message implements Serializable {
	private String userType;
	private String messageType;
	private Object data;
	private Student studentUser;
	private String stateCode;
	private String loginAccount;
	private String loginPassword;
	private long validationCode;
	private String exceptionCode;
	
	/**
	 * @return the studentUser
	 */
	public Student getStudentUser() {
		return studentUser;
	}
	/**
	 * @param studentUser the studentUser to set
	 */
	public void setStudentUser(Student studentUser) {
		this.studentUser = studentUser;
	}
	/**
	 * @return the loginAccount
	 */
	public String getLoginAccount() {
		return loginAccount;
	}
	/**
	 * @param loginAccount the loginAccount to set
	 */
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}
	/**
	 * @return the loginPassword
	 */
	public String getLoginPassword() {
		return loginPassword;
	}
	/**
	 * @param loginPassword the loginPassword to set
	 */
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}
	/**
	 * @return the messageType
	 */
	public String getMessageType() {
		return messageType;
	}
	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	
	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}
	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	/**
	 * @return the validationCode
	 */
	public long getValidationCode() {
		return validationCode;
	}
	/**
	 * @param validationCode the validationCode to set
	 */
	public void setValidationCode(long validationCode) {
		this.validationCode = validationCode;
	}
	
	boolean isValid(long supposedValidationCode) {
		return supposedValidationCode == validationCode;
	}
	/**
	 * @return the exceptionCode
	 */
	public String getExceptionCode() {
		return exceptionCode;
	}
	/**
	 * @param exceptionCode the exceptionCode to set
	 */
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	
	
	
	
	

}
