package com.inhatc.domain;

public class MemberVO {
	private String userID;
	private String userName;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "MemberVO [userID=" + userID + ", userName=" + userName + "]";
	}
	public MemberVO(String userID, String userName) {
		super();
		this.userID = userID;
		this.userName = userName;
	}
	
	

}
