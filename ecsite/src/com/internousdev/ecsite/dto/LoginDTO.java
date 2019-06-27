package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg=false;
	private boolean adminFlg;
	private String userFlg;

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId=loginId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg=loginFlg;
	}
	public boolean getAdminFlg(){
		return adminFlg;
	}
	public void setAdminFlg(boolean adminFlg){
		this.adminFlg=adminFlg;
	}
	public String getUserFlg(){
		return userFlg;
	}
	public void setUserFlg(String userFlg){
		this.userFlg=userFlg;
	}

}

//private boolean loginFlg;
//private String adminFlg;
//
//public boolean getLoginFlg() {
//	return this.loginFlg;
//}
//
//public String getAdminFlg() {
//	return adminFlg;
//}
//
//public void setAdminFlg(String adminFlg) {
//	this.adminFlg = adminFlg;
//}
